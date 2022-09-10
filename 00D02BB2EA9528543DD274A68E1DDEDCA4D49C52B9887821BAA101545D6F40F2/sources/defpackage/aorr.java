package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aorr  reason: default package */
/* loaded from: classes2.dex */
public final class aorr implements anqu {
    final /* synthetic */ aort a;

    public aorr(aort aortVar) {
        this.a = aortVar;
    }

    @Override // defpackage.anqu
    public final void a(dcdc<dvas> dcdcVar) {
        dvat dvatVar;
        aort aortVar = this.a;
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dvas dvasVar = dcdcVar.get(i);
            dvay l = aortVar.l();
            if (l.b == 7) {
                dvatVar = (dvat) l.c;
            } else {
                dvatVar = dvat.g;
            }
            Iterator<dvas> it = dvatVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dccxVar.g(dvasVar);
                    break;
                }
                dvas next = it.next();
                dvyw dvywVar = dvasVar.b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                String str = dvywVar.g;
                dvyw dvywVar2 = next.b;
                if (dvywVar2 == null) {
                    dvywVar2 = dvyw.bv;
                }
                if (str.equals(dvywVar2.g)) {
                    break;
                }
            }
        }
        aortVar.b = dccxVar.f();
        cqkx.p(this.a);
    }

    @Override // defpackage.anqu
    public final void b() {
        cqkx.p(this.a);
    }
}
