package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: easl  reason: default package */
/* loaded from: classes6.dex */
public final class easl extends earz implements easg, easj {
    static final easl a = new easl();

    protected easl() {
    }

    @Override // defpackage.earz, defpackage.easg
    public final long a(Object obj, eaok eaokVar) {
        return ((eapr) obj).Tf();
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok b(Object obj, eaou eaouVar) {
        eaok Tg = ((eapr) obj).Tg();
        if (Tg == null) {
            return earp.X(eaouVar);
        }
        if (Tg.a() == eaouVar) {
            return Tg;
        }
        eaok c = Tg.c(eaouVar);
        return c == null ? earp.X(eaouVar) : c;
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok e(Object obj) {
        return eaor.d(((eapr) obj).Tg());
    }

    @Override // defpackage.easb
    public final Class<?> f() {
        return eapr.class;
    }
}
