package com.example.bookapp.service;


import com.example.bookapp.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final MemberService memberService;
    private final BookService bookService;

    public ReservationService(ReservationRepository reservationRepository, MemberService memberService, BookService bookService) {
        this.reservationRepository = reservationRepository;
        this.memberService = memberService;
        this.bookService = bookService;
    }
}