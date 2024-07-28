package com.swsa.service;
import com.swsa.model.Address;
import com.swsa.repository.AddressRepository;

import java.util.List;
public class AddressService {
    private static final AddressRepository ADDRESS_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return ADDRESS_REPO.retrieveAddresses();
    }
}