package defpackage;
/* compiled from: PG */
/* renamed from: cryp  reason: default package */
/* loaded from: classes5.dex */
public abstract class cryp<T> {
    public abstract cryq<T> a();

    public abstract void b(dcdc<T> dcdcVar);

    public final cryq<T> c() {
        cryq<T> a = a();
        dbsk.s(a.a());
        boolean z = true;
        if (a.b().a() && a.b().b().longValue() < 0) {
            z = false;
        }
        dbsk.l(z);
        return a;
    }
}
