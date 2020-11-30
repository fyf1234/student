package com.fyf.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author fuyufan
 * @date 2020/11/27 15:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageModel<T> {

    /**
     * 总条数
     */
    private long totalSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 当前页数据
     */
    private List<T> items;


    public PageModel(Page<T> p) {
        this.totalSize = p.getTotalElements();
        this.totalPage = p.getTotalPages();
        this.items = p.getContent();
    }
}
