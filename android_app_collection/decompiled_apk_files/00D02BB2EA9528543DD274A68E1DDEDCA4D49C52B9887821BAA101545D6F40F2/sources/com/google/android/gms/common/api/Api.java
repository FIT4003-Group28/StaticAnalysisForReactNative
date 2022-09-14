package com.google.android.gms.common.api;

import defpackage.cnnx;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class Api<O extends cnnx> {
    private final cnnp<?, O> mClientBuilder;
    private final cnoa<?> mClientKey;
    private final String mName;

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends cnnz> Api(String str, cnnp<C, O> cnnpVar, cnoa<C> cnoaVar) {
        cnwc.n(cnnpVar, "Cannot construct an Api with a null ClientBuilder");
        cnwc.n(cnoaVar, "Cannot construct an Api with a null ClientKey");
        this.mName = str;
        this.mClientBuilder = cnnpVar;
        this.mClientKey = cnoaVar;
    }

    public cnny<?, O> getBaseClientBuilder() {
        return this.mClientBuilder;
    }

    public cnnp<?, O> getClientBuilder() {
        return this.mClientBuilder;
    }

    public cnnr<?> getClientKey() {
        return this.mClientKey;
    }

    public String getName() {
        return this.mName;
    }
}
