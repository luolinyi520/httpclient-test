package com.lly.httpclienttest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/httpClient")
    public String testHttpClient() {
        String json = "{\n" +
                "    \"Success\":true,\n" +
                "    \"Message\":null,\n" +
                "    \"ErrorCode\":0,\n" +
                "    \"ExceptionType\":0,\n" +
                "    \"CoNumber\":\"NC202103210000312916\",\n" +
                "    \"TaskIndex\":1,\n" +
                "    \"Log_Id\":0,\n" +
                "    \"Data\":{\n" +
                "        \"WaybillNumber\":\"YT2108021272068789\",\n" +
                "        \"TrackingNumber\":\"9261290289103857685122\",\n" +
                "        \"TrackDetails\":[\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-21T16:03:00\",\n" +
                "                \"ProcessContent\":\"shipping label created, usps awaiting item\",\n" +
                "                \"ProcessLocation\":\"\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"\",\n" +
                "                \"City\":\"\",\n" +
                "                \"ZipCode\":\"\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"GX\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-29T11:44:00\",\n" +
                "                \"ProcessContent\":\"arrived shipping partner facility, usps awaiting item\",\n" +
                "                \"ProcessLocation\":\"NORTH LAS VEGAS, NV, 89032\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"NV\",\n" +
                "                \"City\":\"NORTH LAS VEGAS\",\n" +
                "                \"ZipCode\":\"89032\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"81\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-29T14:35:00\",\n" +
                "                \"ProcessContent\":\"departed shipping partner facility, usps awaiting item\",\n" +
                "                \"ProcessLocation\":\"NORTH LAS VEGAS, NV, 89032\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"NV\",\n" +
                "                \"City\":\"NORTH LAS VEGAS\",\n" +
                "                \"ZipCode\":\"89032\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"82\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-30T14:39:00\",\n" +
                "                \"ProcessContent\":\"usps in possession of item\",\n" +
                "                \"ProcessLocation\":\"IRVING, TX, 75059\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"TX\",\n" +
                "                \"City\":\"IRVING\",\n" +
                "                \"ZipCode\":\"75059\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"U1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-30T14:57:00\",\n" +
                "                \"ProcessContent\":\"departed usps facility\",\n" +
                "                \"ProcessLocation\":\"IRVING, TX, 75059\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"TX\",\n" +
                "                \"City\":\"IRVING\",\n" +
                "                \"ZipCode\":\"75059\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"T1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-30T15:44:00\",\n" +
                "                \"ProcessContent\":\"arrived at usps regional facility\",\n" +
                "                \"ProcessLocation\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"\",\n" +
                "                \"City\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"ZipCode\":\"\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"A1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-30T16:05:00\",\n" +
                "                \"ProcessContent\":\"processed at usps regional destination facility\",\n" +
                "                \"ProcessLocation\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"\",\n" +
                "                \"City\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"ZipCode\":\"\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"OD\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-31T05:44:00\",\n" +
                "                \"ProcessContent\":\"departed usps regional facility\",\n" +
                "                \"ProcessLocation\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"\",\n" +
                "                \"City\":\"FORT WORTH TX DISTRIBUTION CENTER\",\n" +
                "                \"ZipCode\":\"\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"T1\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-31T08:29:00\",\n" +
                "                \"ProcessContent\":\"arrived at post office\",\n" +
                "                \"ProcessLocation\":\"VENUS, TX, 76084\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"TX\",\n" +
                "                \"City\":\"VENUS\",\n" +
                "                \"ZipCode\":\"76084\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"07\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-31T08:40:00\",\n" +
                "                \"ProcessContent\":\"out for delivery\",\n" +
                "                \"ProcessLocation\":\"VENUS, TX, 76084\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"TX\",\n" +
                "                \"City\":\"VENUS\",\n" +
                "                \"ZipCode\":\"76084\",\n" +
                "                \"ProcessStauts\":100,\n" +
                "                \"TrackingCode\":\"OF\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"ProcessDate\":\"2021-03-31T11:03:00\",\n" +
                "                \"ProcessContent\":\"delivered, in/at mailbox\",\n" +
                "                \"ProcessLocation\":\"VENUS, TX, 76084\",\n" +
                "                \"Country\":\"\",\n" +
                "                \"State\":\"TX\",\n" +
                "                \"City\":\"VENUS\",\n" +
                "                \"ZipCode\":\"76084\",\n" +
                "                \"ProcessStauts\":200,\n" +
                "                \"TrackingCode\":\"01\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"Info\":null\n" +
                "}";
        return json;
    }

//    public String testOkHttp() {
//        return "ok";
//    }

}
