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
        Owner owner = new Owner();
        Owner responseOwner = unit.create(owner);

        assertThat(responseOwner).isNotNull();

        Mockito.verify(mockClinicService).saveOwner(owner);
    }

    @Test
    public void testCreateUsingWhitebox() throws Exception {
        mockClinicServiceWB = Mockito.mock(ClinicService.class);
        Whitebox.setInternalState(unit, "clinicService", mockClinicServiceWB);

        Owner owner = new Owner();
        Owner responseOwner = unit.create(owner);

        assertThat(responseOwner).isNotNull();

        ArgumentCaptor<Owner> ownerArgumentCaptor = ArgumentCaptor.forClass(Owner.class);

        Mockito.verify(mockClinicService, never()).saveOwner(owner);
        Mockito.verify(mockClinicServiceWB).saveOwner(ownerArgumentCaptor.capture());

        assertThat(ownerArgumentCaptor.getValue()).isEqualTo(owner);

    }

    @Test
    public void testFind() throws Exception {

    }

    @Test
    public void testFindByLastName() throws Exception {

    }
}