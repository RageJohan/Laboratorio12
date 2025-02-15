package com.tecsup.petclinic.mapper;

import com.tecsup.petclinic.domain.OwnerTO;
import com.tecsup.petclinic.entities.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface OwnerMapper {

    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    // Mapear OwnerTO a Owner
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "telephone", target = "telephone")
    Owner toOwner(OwnerTO ownerTO);

    // Mapear Owner a OwnerTO
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "telephone", target = "telephone")
    OwnerTO toOwnerTO(Owner owner);

    // Listas de Owners a listas de OwnerTOs
    List<OwnerTO> toOwnerTOList(List<Owner> ownerList);

    // Listas de OwnerTOs a listas de Owners
    List<Owner> toOwnerList(List<OwnerTO> ownerTOList);
}

