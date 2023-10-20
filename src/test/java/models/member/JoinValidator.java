package models.member;

import commons.BedRequestException;
import commons.Validator;

public class JoinValidator implements Validator<Member> {

    @Override
    public void check(Member member) {
            String userId = member.getUserId();
            if (userId == null || userId.isBlank()) {
                throw new BedRequestException("아이디를 입력하세요");
            }
    }
}
