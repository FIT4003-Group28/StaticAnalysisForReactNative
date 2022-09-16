package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cvmr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvmr<I extends dssj, O extends dssj> {
    public static <I extends dssj, O extends dssj> cvmr<I, O> f(I i, cvty<O> cvtyVar) {
        cvmp g = g();
        g.a = i;
        g.b = cvtyVar.a();
        g.c = cvtyVar.b();
        g.b(cvtyVar.c());
        return g.a();
    }

    public static <I extends dssj, O extends dssj> cvmp g() {
        cvmp cvmpVar = new cvmp();
        cvmpVar.b(true);
        return cvmpVar;
    }

    @dzsi
    public abstract I a();

    @dzsi
    public abstract O b();

    @dzsi
    public abstract Throwable c();

    public abstract boolean d();

    public final boolean e() {
        return c() != null;
    }
}
