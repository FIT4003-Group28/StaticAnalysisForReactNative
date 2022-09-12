package defpackage;
/* compiled from: PG */
/* renamed from: kyj  reason: default package */
/* loaded from: classes7.dex */
public final class kyj<T> extends btrh<T> {
    public kyj(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        kyh kyhVar = (kyh) this.a;
        alho alhoVar = (alho) obj;
        alaq alaqVar = alhoVar.a;
        if (alaqVar instanceof alap) {
            if (kyhVar.a.e.c == kdd.GUIDED_NAV) {
                return;
            }
            kyhVar.a.c.a(ldm.d((alap) alhoVar.a), false);
        } else if (!(alaqVar instanceof alav)) {
        } else {
            kyhVar.a.d.a((alav) alaqVar);
        }
    }
}
