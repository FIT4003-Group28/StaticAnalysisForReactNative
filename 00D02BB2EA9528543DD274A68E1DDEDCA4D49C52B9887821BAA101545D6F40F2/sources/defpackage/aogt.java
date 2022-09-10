package defpackage;
/* compiled from: PG */
/* renamed from: aogt  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogt {
    public static aogt c(dcdc<akqq> dcdcVar, dbsg<dvay> dbsgVar) {
        dbsk.b(dcdcVar.size() >= 2, "path segment contains less than two points");
        return new aofy(dcdcVar, dbsgVar);
    }

    public abstract dcdc<akqq> a();

    public abstract dbsg<dvay> b();

    public final akqq d() {
        return a().get(0);
    }

    public final akqq e() {
        return (akqq) dcft.s(a());
    }
}
