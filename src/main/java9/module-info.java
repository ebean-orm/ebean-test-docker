open module io.ebean.docker {

  requires transitive org.slf4j;
  requires transitive java.sql;

  exports io.ebean.docker.commands;
  exports io.ebean.docker.container;

}
