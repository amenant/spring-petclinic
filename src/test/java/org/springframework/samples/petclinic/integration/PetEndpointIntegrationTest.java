package org.springframework.samples.petclinic.integration;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.util.PrepareDatabaseClassRule;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by han on 20/7/16.
 */
@Category(IntegrationTest.class)
public class PetEndpointIntegrationTest {

    @ClassRule
    public static PrepareDatabaseClassRule dbRule = new PrepareDatabaseClassRule();

    private static final String URL = "http://localhost:8080/api/pets";

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testFindAllPets() {
        ResponseEntity<List<Pet>> response = restTemplate.exchange(URL, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<Pet>>() {});
        assertThat(response).hasFieldOrPropertyWithValue("statusCode", HttpStatus.OK);
        assertThat(response.getBody()).hasSize(13);
    }

}
