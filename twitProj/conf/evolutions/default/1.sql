# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table twit (
  id                        bigint not null,
  label                     varchar(255),
  constraint pk_twit primary key (id))
;

create sequence twit_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists twit;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists twit_seq;

