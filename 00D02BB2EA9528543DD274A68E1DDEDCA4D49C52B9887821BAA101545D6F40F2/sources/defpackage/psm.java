package defpackage;
/* compiled from: PG */
/* renamed from: psm  reason: default package */
/* loaded from: classes7.dex */
public final class psm<T> extends btrh<T> {
    public psm(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        psk pskVar = (psk) this.a;
        srf srfVar = (srf) obj;
        qbn qbnVar = srfVar.a;
        qbm qbmVar = srfVar.b;
        if (qbnVar != pskVar.b) {
            return;
        }
        amte n = qbmVar.n();
        if (!qbmVar.o() || n == null) {
            if (qbmVar.b()) {
                return;
            }
            pskVar.e(false);
            return;
        }
        n.a.d();
        int i = pskVar.d;
        int i2 = pskVar.e;
        String str = pskVar.f;
        String str2 = pskVar.g;
        dnqh dnqhVar = pskVar.h;
        if (i < 0 || i2 < 0 || str == null || str2 == null) {
            pskVar.e(false);
            return;
        }
        pskVar.c(i, amsz.a(n, 0, i2), str, str2, dnqhVar);
        pskVar.e(true);
    }
}
