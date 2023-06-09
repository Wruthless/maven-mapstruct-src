package org.wruthless.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.wruthless.domain.User;
import org.wruthless.model.UserCommand;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
