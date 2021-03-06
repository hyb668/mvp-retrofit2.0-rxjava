package com.laulee.retrofit2.base;

/**
 * Created by laulee on 16/12/25.
 */

public class BasePrestener<T extends BaseView> implements IBasePrestener<T> {

    protected T mView;

    @Override
    public void attach( T view ) {
        this.mView = view;
    }

    @Override
    public void destoryView() {
        this.mView = null;
    }
}
