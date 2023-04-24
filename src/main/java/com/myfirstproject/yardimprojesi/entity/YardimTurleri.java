package com.myfirstproject.yardimprojesi.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Set;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "yardim_turleri")
public class YardimTurleri {
}
