package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: dxjd  reason: default package */
/* loaded from: classes.dex */
public final class dxjd<T> implements Factory<T>, dxio {
    public final T a;

    static {
        new dxjd(null);
    }

    private dxjd(T t) {
        this.a = t;
    }

    public static <T> Factory<T> b(T t) {
        dxjg.c(t, "instance cannot be null");
        return new dxjd(t);
    }

    @Override // defpackage.dzsj
    public final T a() {
        return this.a;
    }
}
