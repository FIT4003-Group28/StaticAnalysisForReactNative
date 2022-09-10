package defpackage;
/* compiled from: PG */
/* renamed from: cryn  reason: default package */
/* loaded from: classes5.dex */
public abstract class cryn {
    public abstract cryo a();

    public abstract void b(dbsg<Long> dbsgVar);

    public abstract void c(dcdc<crym> dcdcVar);

    public final cryo d() {
        cryo a = a();
        dbsk.s(a.a());
        boolean z = true;
        if (a.b().a() && a.b().b().longValue() < 0) {
            z = false;
        }
        dbsk.l(z);
        return a;
    }
}
