package ru.rsatu.account;

import io.quarkus.security.Authenticated;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.jboss.logging.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Authenticated
public class Student {

    private static final Logger LOG = Logger.getLogger(Student.class);

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(unit = MetricUnits.NONE,
            name = "test",
            absolute = true,
            displayName = "hello",
            description = "Monitor how many times hello method was called")
    public String hello() {
        LOG.info("start metod hello");
        return "user";
    }

}
