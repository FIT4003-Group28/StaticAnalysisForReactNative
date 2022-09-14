package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* loaded from: classes.dex */
public class Response<T extends Result> {
    private T zzdm;

    public Response() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Response(T t) {
        this.zzdm = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getResult() {
        return this.zzdm;
    }

    public void setResult(T t) {
        this.zzdm = t;
    }
}
