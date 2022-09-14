package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akwt  reason: default package */
/* loaded from: classes.dex */
public abstract class akwt {
    private static final List<Integer> a = dchl.a();

    public static akws j() {
        akwk akwkVar = new akwk();
        akwkVar.f(false);
        akwkVar.c(false);
        akwkVar.b(a);
        akwkVar.h(false);
        akwkVar.g(30);
        akwkVar.d(false);
        akwkVar.a(false);
        akwkVar.e("");
        akwkVar.i = false;
        return akwkVar;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract dcdc<Integer> c();

    public abstract boolean d();

    public abstract int e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract String h();

    public abstract boolean i();
}
