package com.autobook.bean;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Fare")
public class Fare {

    // 国内运价信息
    @XmlElement(name = "DomesticFareInfo")
    private DomesticFare domesticFareInfo = new DomesticFare();

    // 国际运价信息

    private List<IntlFare> intlFareInfo = new ArrayList<IntlFare>();
}
