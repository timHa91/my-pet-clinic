package tim.springframework.mypetclinic.services;

import tim.springframework.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
