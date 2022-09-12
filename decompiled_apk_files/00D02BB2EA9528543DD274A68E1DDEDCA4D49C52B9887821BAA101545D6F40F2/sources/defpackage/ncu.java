package defpackage;
/* compiled from: PG */
/* renamed from: ncu  reason: default package */
/* loaded from: classes7.dex */
public final class ncu<T> extends btrh<T> {
    public ncu(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        kcz<dcdc<bxmh>> kczVar;
        ncs ncsVar = (ncs) this.a;
        bxev bxevVar = (bxev) obj;
        if (!bxevVar.b.equals(ncsVar.a.b) || (kczVar = ncsVar.a.c) == null) {
            return;
        }
        dcdc<bxmh> dcdcVar = bxevVar.c;
        int i = 1;
        if (!bxevVar.e) {
            if (dcdcVar.isEmpty()) {
                if (ncsVar.a.a.i()) {
                    i = 3;
                    break;
                }
                i = 2;
            } else {
                int size = dcdcVar.size();
                int i2 = 0;
                while (i2 < size) {
                    dwjj dwjjVar = dcdcVar.get(i2).b;
                    if (dwjjVar == null) {
                        dwjjVar = dwjj.k;
                    }
                    dxbp dxbpVar = dwjjVar.b;
                    if (dxbpVar == null) {
                        dxbpVar = dxbp.x;
                    }
                    int a = dxbi.a(dxbpVar.f);
                    if (a == 0) {
                        a = 1;
                    }
                    i2++;
                    if (a != 3) {
                        i = 3;
                        break;
                    }
                }
                i = 2;
            }
            nct nctVar = ncsVar.a;
            nctVar.b = null;
            nctVar.c = null;
        }
        kczVar.c(bxevVar.c, i);
    }
}
