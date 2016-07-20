package org.springframework.samples.petclinic.rest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.service.ClinicService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;

/**
 * Created by han on 17/7/16.
 */
public class OwnerRestControllerTest {

    OwnerRestController unit;
    ClinicService mockClinicService;
    ClinicService mockClinicServiceWB;

    @Before
    public void setUp() throws Exception {
        mockClinicService = Mockito.mock(ClinicService.class);
        unit = new OwnerRestController(mockClinicService);
    }

    @Test
    public void testCreate() throws Exception {

    }

    @Test
    public void testCreateUsingWhitebox() throws Exception {
        // Create a new Mock ClinicService and use Whitebox
        // to inject it in

        // Show that the Whitebox injected ClinicService mock is different from the original
        // in @Before

        // Demo usage of ArgumentCaptor to capture parameters passed into mocks
    }

    @Test
    public void testFind() throws Exception {

    }

    @Test
    public void testFindByLastName() throws Exception {

    }
}