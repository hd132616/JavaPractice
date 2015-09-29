package org.dimigo.exception;

public class AgeCheckException extends Exception{
	AgeCheckException(){
		
	}
	
	AgeCheckException(Movie movie){
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가 입니다.");
	}
}
