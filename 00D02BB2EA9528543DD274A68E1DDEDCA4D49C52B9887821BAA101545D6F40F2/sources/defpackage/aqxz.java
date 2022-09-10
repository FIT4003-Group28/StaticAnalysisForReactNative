package defpackage;
/* compiled from: PG */
/* renamed from: aqxz  reason: default package */
/* loaded from: classes2.dex */
public final class aqxz<T> extends btrh<T> {
    public aqxz(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aqxy aqxyVar = (aqxy) this.a;
        ahlc ahlcVar = (ahlc) obj;
        if (ahlcVar.a <= aqxyVar.ak) {
            return;
        }
        aqxyVar.af.k(ahlcVar);
        int i = ahlcVar.a;
        aqxyVar.ak = i;
        if (i >= 3) {
            if (aqxyVar.q()) {
                return;
            }
            ckcw ckcwVar = aqxyVar.ah;
            if (ckcwVar != null) {
                ((ckco) ckcwVar.a(ckec.a)).a(ckeb.a(4));
            }
            aqxyVar.aj = eapd.a();
            aqxyVar.am = aqxyVar.ad.c(new ardw(), null);
            aqxyVar.b.setContentView(aqxyVar.am.c());
            aqxyVar.w(aqxy.a);
            return;
        }
        aqxyVar.al.a(i);
        cqhn cqhnVar = aqxyVar.ai;
        cqkx.p(aqxyVar.al);
    }
}
