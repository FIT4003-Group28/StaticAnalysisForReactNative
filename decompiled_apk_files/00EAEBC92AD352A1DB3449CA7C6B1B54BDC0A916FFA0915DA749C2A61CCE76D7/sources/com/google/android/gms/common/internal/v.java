package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public class v<T extends IInterface> extends h<T> {
    private final a.h<T> y;

    public a.h<T> A() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.c
    protected T a(IBinder iBinder) {
        return this.y.a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    protected void a(int i, T t) {
        this.y.a(i, t);
    }

    @Override // com.google.android.gms.common.internal.c
    protected String w() {
        return this.y.l();
    }

    @Override // com.google.android.gms.common.internal.c
    protected String x() {
        return this.y.m();
    }
}
