package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ctmr  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctmr implements Serializable {
    public static final ctmr a;
    public static final ctmr b;
    public static final ctmr c;

    static {
        ctmq f = f();
        f.c(0L);
        f.b(1.0d);
        f.e(0L);
        f.f(0);
        f.d(1);
        a = f.a();
        ctmq f2 = f();
        f2.c(1000L);
        f2.b(1.0d);
        f2.e(2000L);
        f2.f(1);
        f2.d(1000);
        b = f2.a();
        ctmq f3 = f();
        f3.c(1000L);
        f3.b(2.0d);
        f3.e(30000L);
        f3.f(3);
        f3.d(1000);
        c = f3.a();
    }

    public static ctmq f() {
        return new ctmj();
    }

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract double d();

    public abstract int e();
}
