package ru.yandex.practicum.filmorate.service.user;

import org.springframework.web.bind.annotation.PathVariable;
import ru.yandex.practicum.filmorate.model.Film;
import ru.yandex.practicum.filmorate.model.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    //USERS

    User getById(long userId);

    void deleteById(long userId);

    Collection<User> getAll();

    User create(User user);

    User update(User user);

    //FRIENDS

    void addFriend(long userId1, long userId2);

    void deleteFriend(long userId1, long userId2);

    Collection<Long> getFriendsIds(long userId);

    Collection<User> getFriendsById(long userId);

    Collection<User> getCommonFriends(long userId1, long userId2);

    List<Film> recommendFilms(@PathVariable("id") long userId);

    List<Long> findAllFilmLikes(long userId);
}
