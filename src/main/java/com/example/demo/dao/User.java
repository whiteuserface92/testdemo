package com.example.demo.dao;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Data
@Getter
@Setter
public class User {

   int id;
   String userId;
   LocalDateTime inputDate;

}
