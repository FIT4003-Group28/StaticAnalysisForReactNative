package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: hyk  reason: default package */
/* loaded from: classes3.dex */
public final class hyk implements aafl {
    private final gts a;
    private final /* synthetic */ int b;

    public hyk(gts gtsVar) {
        this.a = gtsVar;
    }

    public hyk(gts gtsVar, int i) {
        this.b = i;
        this.a = gtsVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            aqxo.p(apzgVar.qn(auzu.b));
            auzu auzuVar = (auzu) apzgVar.qm(auzu.b);
            int i = auzuVar.c;
            boolean z = false;
            int i2 = 1;
            if ((i & 2) != 0 && (i & 1) != 0) {
                z = true;
            }
            aqxo.p(z);
            gts gtsVar = this.a;
            String str = auzuVar.e;
            int aN = awwc.aN(auzuVar.d);
            if (aN != 0) {
                i2 = aN;
            }
            synchronized (gtsVar.e) {
                try {
                    if (i2 != 2) {
                        if (i2 == 3 && gtsVar.e.contains(str)) {
                            gtsVar.e.remove(str);
                            gtsVar.c = null;
                        }
                    } else if (!gtsVar.e.contains(str)) {
                        gtsVar.e.add(str);
                        gtsVar.c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        aqxo.p(apzgVar.qn(auzp.b));
        aopu aopuVar = ((auzp) apzgVar.qm(auzp.b)).c;
        gts gtsVar2 = this.a;
        if (aopuVar.equals(gtsVar2.d)) {
            return;
        }
        synchronized (gtsVar2.a) {
            gtsVar2.a.clear();
        }
        gtsVar2.d = amuk.o(aopuVar);
        gtsVar2.c = null;
    }
}
