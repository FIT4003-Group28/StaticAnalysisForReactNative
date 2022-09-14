package defpackage;
/* compiled from: PG */
/* renamed from: cjst  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjst {
    public abstract dccx<cjrz> a();

    public abstract dcdc<cjrz> b();

    public abstract cjsu c();

    public abstract void d(ddhn ddhnVar);

    public final cjsu e() {
        cjsu c = c();
        dbsk.m(!c.a().isEmpty(), "Must have at least one data element.");
        return c;
    }

    public final void f(cjrz cjrzVar) {
        a().g(cjrzVar);
    }
}
