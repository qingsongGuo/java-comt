package com.example.hm.tool;

import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.List;

public interface ExcelService {
    List<UserInfo> importData();
}
