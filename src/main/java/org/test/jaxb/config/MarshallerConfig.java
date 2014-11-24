package org.test.jaxb.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.castor.CastorMarshaller;

@Configuration
public class MarshallerConfig
{
    @Bean(name="marshallingHttpMessageConverter")
    @Autowired
    public MarshallingHttpMessageConverter createMarshallingHttpMessageConverter(
        CastorMarshaller marshaller
    )
    {
        return new MarshallingHttpMessageConverter(
            marshaller
        );
    }

    @Bean(name="castorMarshaller")
    public CastorMarshaller createCastorMarshaller()
    {
        return new CastorMarshaller();
    }
}
