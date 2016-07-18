package org.springframework.samples.petclinic;

import java.util.Collection;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(BootApplication.class)
@ActiveProfiles("test")
@Transactional
public class ClinicServiceSpringDataJpaTests {

	@Autowired
    protected ClinicService clinicService;
	
	@Test
    public void findOwners() {
        Collection<Owner> owners = this.clinicService.findOwnerByLastName("Davis");
        Assertions.assertThat(owners.size()).isEqualTo(2);
        
        owners = this.clinicService.findOwnerByLastName("Daviss");
        Assertions.assertThat(owners.size()).isEqualTo(0);
    }
	
	@Test
    public void deleteOwners() {
		this.clinicService.deleteOwner("Davis");
		Collection<Owner> owners = this.clinicService.findOwnerByLastName("Davis");
		Assertions.assertThat(owners.size()).isEqualTo(0);
	}
	
}
