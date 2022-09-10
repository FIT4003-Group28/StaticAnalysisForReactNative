package defpackage;
/* compiled from: PG */
/* renamed from: kak  reason: default package */
/* loaded from: classes.dex */
public final class kak<T> extends btrh<T> {
    public kak(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        kaj kajVar = (kaj) this.a;
        crhq crhqVar = (crhq) obj;
        if (crhqVar.a() != arym.GUIDED_NAV || !crhqVar.d()) {
            return;
        }
        kajVar.d = dbsg.i(new eapd(kajVar.b.b()));
        dbsg<eapd> dbsgVar = kajVar.d;
        kajVar.c.Z(bvjk.kk, kajVar.d.b().a);
    }
}
