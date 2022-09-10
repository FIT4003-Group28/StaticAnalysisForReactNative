package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bzwf  reason: default package */
/* loaded from: classes4.dex */
public final class bzwf<T extends Serializable> implements dbty<T> {
    private final bzwh<T> a;
    private final T b;
    @dzsi
    private T c = null;

    public bzwf(bzwh<T> bzwhVar, T t) {
        this.a = bzwhVar;
        this.b = t;
    }

    @Override // defpackage.dbty
    /* renamed from: b */
    public final synchronized T a() {
        if (this.c == null) {
            this.c = (T) dbsc.a(this.a.a(), this.b);
        }
        return this.c;
    }

    public final synchronized void c() {
        T t = this.c;
        if (t != null) {
            this.a.b(t);
        }
    }
}
