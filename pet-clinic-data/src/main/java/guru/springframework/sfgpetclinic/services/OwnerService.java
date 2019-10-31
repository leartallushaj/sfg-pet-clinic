package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    // find the owner by last name
    Owner findByLastName(String lastName);

                                                              }

