package com.example.pharmacy.api.service

import spock.lang.Specification

import java.nio.charset.StandardCharsets

class KakaoAddressSearchServiceTest extends Specification {

    private KakaoUriBuilderService kakaoUriBuilderService;

    // 메서드 시작 전 실행
    def setup() {
        kakaoUriBuilderService = new KakaoAddressSearchService();
    }

    def "buildUriByAddressSearch - 한글 파라미터의 경우 정상적으로 인코딩"() {
        given:
        String address = "서울 성북구"
        def charset = StandardCharsets.UTF_8
        when:
        def uri = kakaoUriBuilderService.buildUriByAddressSearch(address) // 인코딩
        def decodedResult = URLDecoder.decode(uri.toString(), charset) // 디코딩

        then:
        println uri
        println decodedResult
    }
}
