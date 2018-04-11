package com.autobook;

import com.autobook.bean.AutoBookRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.sun.xml.internal.ws.util.Pool;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class XmlParserTest {

    @Test
    public void parserTest() throws IOException, JAXBException {
        AutoBookRequest request = null;

        JAXBContext context =  JAXBContext.newInstance(AutoBookRequest.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        request = (AutoBookRequest) unmarshaller.unmarshal(reader);

        Gson gson = new Gson();
        System.out.println(gson.toJson(request));
    }



    String xml = "<?xml version=\"1.0\"?><AutoBookRequest>\n" +
            "   <SN>e5d42ef3c2a8a69e</SN>\n" +
            "   <UID>13816552030</UID>\n" +
            "   <OrderId>6044514419</OrderId>\n" +
            "   <OrderIdCH>0</OrderIdCH>\n" +
            "   <OrderIdINF>0</OrderIdINF>\n" +
            "   <Channel>CS-WS</Channel>\n" +
            "   <AirLine>9C</AirLine>\n" +
            "   <TripType>OW</TripType>\n" +
            "   <AirSegments>\n" +
            "     <AirSegment>\n" +
            "       <TripSection>0</TripSection>\n" +
            "       <Dcity>SHA</Dcity>\n" +
            "       <Acity>MFM</Acity>\n" +
            "       <Dport>PVG</Dport>\n" +
            "       <Aport>MFM</Aport>\n" +
            "       <FlightNo>9C8875</FlightNo>\n" +
            "       <Effectdate>2018-04-15T00:00:00+08:00</Effectdate>\n" +
            "       <Cabin>R3</Cabin>\n" +
            "       <CabinCH />\n" +
            "       <CabinINF />\n" +
            "       <AvailCabins />\n" +
            "       <AgreementId />\n" +
            "       <Price>0</Price>\n" +
            "       <TakeoffTime>2018-04-15T12:10:00+08:00</TakeoffTime>\n" +
            "       <ArrivalTime>2018-04-15T14:55:00+08:00</ArrivalTime>\n" +
            "       <AirTax>0</AirTax>\n" +
            "       <AddFee>0</AddFee>\n" +
            "       <AdultFare>\n" +
            "         <DomesticFareInfo>\n" +
            "           <TicketPrice>0</TicketPrice>\n" +
            "           <AirportTax>0</AirportTax>\n" +
            "           <FuelTax>0</FuelTax>\n" +
            "           <TicketPriceMin>0</TicketPriceMin>\n" +
            "           <TicketPriceMax>0</TicketPriceMax>\n" +
            "         </DomesticFareInfo>\n" +
            "         <IntlFareInfo>\n" +
            "           <IntlFare>\n" +
            "             <Amount>430</Amount>\n" +
            "             <FareType>FarePrice</FareType>\n" +
            "           </IntlFare>\n" +
            "           <IntlFare>\n" +
            "             <Amount>0</Amount>\n" +
            "             <FareType>FuelFee</FareType>\n" +
            "           </IntlFare>\n" +
            "           <IntlFare>\n" +
            "             <Amount>160</Amount>\n" +
            "             <FareType>Tax</FareType>\n" +
            "           </IntlFare>\n" +
            "         </IntlFareInfo>\n" +
            "       </AdultFare>\n" +
            "       <ChildFare>\n" +
            "         <DomesticFareInfo>\n" +
            "           <TicketPrice>0</TicketPrice>\n" +
            "           <AirportTax>0</AirportTax>\n" +
            "           <FuelTax>0</FuelTax>\n" +
            "           <TicketPriceMin>0</TicketPriceMin>\n" +
            "           <TicketPriceMax>0</TicketPriceMax>\n" +
            "         </DomesticFareInfo>\n" +
            "         <IntlFareInfo />\n" +
            "       </ChildFare>\n" +
            "       <InfantFare>\n" +
            "         <DomesticFareInfo>\n" +
            "           <TicketPrice>0</TicketPrice>\n" +
            "           <AirportTax>0</AirportTax>\n" +
            "           <FuelTax>0</FuelTax>\n" +
            "           <TicketPriceMin>0</TicketPriceMin>\n" +
            "           <TicketPriceMax>0</TicketPriceMax>\n" +
            "         </DomesticFareInfo>\n" +
            "         <IntlFareInfo />\n" +
            "       </InfantFare>\n" +
            "       <InsuranceProductInfos />\n" +
            "       <IsRefreshCabin>false</IsRefreshCabin>\n" +
            "     </AirSegment>\n" +
            "   </AirSegments>\n" +
            "   <Passengers>\n" +
            "     <Passenger>\n" +
            "       <PassengerName>WANG/YAN</PassengerName>\n" +
            "       <Title>MS</Title>\n" +
            "       <PassengerType>0</PassengerType>\n" +
            "       <Nationality>CHN</Nationality>\n" +
            "       <Gender>F</Gender>\n" +
            "       <CredentialsType>港澳通行证</CredentialsType>\n" +
            "       <CredentialsNo>W83743407</CredentialsNo>\n" +
            "       <CredentialsIssuedBy>CHN</CredentialsIssuedBy>\n" +
            "       <CredentialsExpdate>2018-11-12</CredentialsExpdate>\n" +
            "       <Birthday>1976-1-30</Birthday>\n" +
            "       <XprodInfos />\n" +
            "       <ISChdAsAdu>0</ISChdAsAdu>\n" +
            "     </Passenger>\n" +
            "     <Passenger>\n" +
            "       <PassengerName>YANG/CIYI</PassengerName>\n" +
            "       <Title>MS</Title>\n" +
            "       <PassengerType>0</PassengerType>\n" +
            "       <Nationality>CHN</Nationality>\n" +
            "       <Gender>F</Gender>\n" +
            "       <CredentialsType>港澳通行证</CredentialsType>\n" +
            "       <CredentialsNo>C55804778</CredentialsNo>\n" +
            "       <CredentialsIssuedBy>CHN</CredentialsIssuedBy>\n" +
            "       <CredentialsExpdate>2027-2-26</CredentialsExpdate>\n" +
            "       <Birthday>1975-1-25</Birthday>\n" +
            "       <XprodInfos />\n" +
            "       <ISChdAsAdu>0</ISChdAsAdu>\n" +
            "     </Passenger>\n" +
            "     <Passenger>\n" +
            "       <PassengerName>WU/MEIJUN</PassengerName>\n" +
            "       <Title>MS</Title>\n" +
            "       <PassengerType>0</PassengerType>\n" +
            "       <Nationality>CHN</Nationality>\n" +
            "       <Gender>F</Gender>\n" +
            "       <CredentialsType>港澳通行证</CredentialsType>\n" +
            "       <CredentialsNo>C20375084</CredentialsNo>\n" +
            "       <CredentialsIssuedBy>CHN</CredentialsIssuedBy>\n" +
            "       <CredentialsExpdate>2025-6-9</CredentialsExpdate>\n" +
            "       <Birthday>1969-11-4</Birthday>\n" +
            "       <XprodInfos />\n" +
            "       <ISChdAsAdu>0</ISChdAsAdu>\n" +
            "     </Passenger>\n" +
            "   </Passengers>\n" +
            "   <ContactInfo>\n" +
            "     <ContactZip>200335</ContactZip>\n" +
            "     <ContactFoidType />\n" +
            "     <ContactFoid />\n" +
            "     <ContactName>朱国杰</ContactName>\n" +
            "     <ContactMobile>13774293883</ContactMobile>\n" +
            "     <ContactPhone>13816552030</ContactPhone>\n" +
            "     <ContactEmail>sunyan@ctrip.com</ContactEmail>\n" +
            "     <ContactAddress>金钟路999号</ContactAddress>\n" +
            "     <ContactPhoneID />\n" +
            "   </ContactInfo>\n" +
            "   <FareCheckType>2</FareCheckType>\n" +
            "   <ChildAsAdult>1</ChildAsAdult>\n" +
            "   <TotalAmount>1770</TotalAmount>\n" +
            "   <Source>Mobile</Source>\n" +
            "   <IsAsync>false</IsAsync>\n" +
            "   <IsRebook>false</IsRebook>\n" +
            "   <IssueBillID>0</IssueBillID>\n" +
            "   <PaymentChannel />\n" +
            "   <CouponInfos />\n" +
            "   <ExtOrderId />\n" +
            "   <IsNeedRetry>false</IsNeedRetry>\n" +
            "   <IsAddChd>0</IsAddChd>\n" +
            "   <CustomerId />\n" +
            "   <CustomerIp />\n" +
            "   <IsCallBack>false</IsCallBack>\n" +
            "   <DuplicateOrderID>0</DuplicateOrderID>\n" +
            "   <Company />\n" +
            " </AutoBookRequest>";
}
