package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    // find the owner by last name
    Owner findByLastName(String lastName);

   //return back an owner
   Owner findById(Long id);

   //save the Owner
   Owner save(Owner owner);

   // return back the list of all the owners
   Set<Owner> findAll();

}
