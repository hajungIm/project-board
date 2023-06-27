
insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by)
values ('ihj', 'abcd1234', 'IHJ', 'ihj@email.com', 'i am hj.', now(), 'ihj', now(), 'ihj');

insert into article (user_account_id, title, content, hashtag, created_by, modified_by, created_at, modified_at)
values (1, 'abc', 'i am sue', '#purple', 'a', 'b', '2021-05-30 23:53:46', '2021-03-10 08:48:50');

insert into article_comment (article_id, user_account_id, content, created_at, created_by, modified_at, modified_by)
values (1, 1, 'abcd', '2021-05-30 23:53:46', 'im', '2021-03-10 08:48:50', 'im');
insert into article_comment (article_id, user_account_id, content, created_at, created_by, modified_at, modified_by)
values (1, 1, 'efgh', '2021-05-30 23:53:46', 'im', '2021-03-10 08:48:50', 'im');


