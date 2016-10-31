/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

/**
 *
 * @author mogens
 */
@WebService(serviceName = "HotelReservationWSDLService", portName = "HotelReservationWSDLPort", endpointInterface = "hotelreservation.ws.HotelReservationWSDLPortType", targetNamespace = "http://ws.hotelreservation", wsdlLocation = "WEB-INF/wsdl/HotelReservationService/HotelReservationWSDLWrapper.wsdl")
public class HotelReservationService {
    
    List<HotelReservation> hotels = new List<HotelReservation>

    public hotelreservation.ws.Hotelreservations getHotels(hotelreservation.ws.Reservationrequest input) {
        List<HotelReservation> hotelReservations = new List<HotelReservation>
        
        for (HotelReservation hotelReservation : hotels) {
            
            boolean cond1 = hotelReservation.city == input.getCity();
            boolean cond2 = hotelReservation.arrivalDate == input.getArrivaldate();
            boolean cond3 = hotelReservation.departureDate == input.getDeparturedate();
            
            if (cond1 && cond2 && cond3) {
                hotelReservations.add(hotelReservation);
            }
        }
        
        return hotelReservations;
        
    }

    /**
     * Web service operation
     */
    public String operation() {
        //TODO write your implementation code here:
        return null;
    }
    
}
