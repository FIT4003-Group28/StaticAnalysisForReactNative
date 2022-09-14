package com.facebook.c;

import com.facebook.common.d.i;
/* compiled from: SimpleDataSource.java */
/* loaded from: classes.dex */
public class h<T> extends a<T> {
    private h() {
    }

    public static <T> h<T> j() {
        return new h<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.c.a
    public boolean a(T t, boolean z) {
        return super.a((h<T>) i.a(t), z);
    }

    @Override // com.facebook.c.a
    public boolean a(Throwable th) {
        return super.a((Throwable) i.a(th));
    }

    @Override // com.facebook.c.a
    public boolean a(float f) {
        return super.a(f);
    }
}
