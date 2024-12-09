package com.ncptest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "test_table1")
@Getter
@NoArgsConstructor
@Setter
public class TestTable1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "test_column1")
    private Integer testColumn1;

    @Column(name = "test_column2")
    private Integer testColumn2;

}
