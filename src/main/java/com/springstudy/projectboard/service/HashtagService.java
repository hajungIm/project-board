package com.springstudy.projectboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class HashtagService {
    public void deleteHashtagWithoutArticles(Long hashtagId) {

    }
}
