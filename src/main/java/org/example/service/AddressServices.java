package org.example.service;

import org.example.model.Address;
import org.example.repository.AddressRepository;

import java.util.List;

public class AddressServices {

    private static final AddressRepository ADDRESS_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return ADDRESS_REPO.retrieveAddresses();
    }
}