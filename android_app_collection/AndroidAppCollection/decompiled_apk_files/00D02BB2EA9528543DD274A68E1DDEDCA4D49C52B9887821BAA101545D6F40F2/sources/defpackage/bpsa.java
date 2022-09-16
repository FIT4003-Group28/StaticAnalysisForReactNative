package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bpsa  reason: default package */
/* loaded from: classes4.dex */
public final class bpsa implements btzi<dhkj, dhkl> {
    final /* synthetic */ deig a;

    public bpsa(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhkj> btzrVar, btzy btzyVar) {
        String str = btzyVar.q;
        this.a.k(new bpsb(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhkj> btzrVar, dhkl dhklVar) {
        boolean z;
        Iterator<dqnf> it = dhklVar.b.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            dqnr dqnrVar = it.next().b;
            if (dqnrVar == null) {
                dqnrVar = dqnr.d;
            }
            dqnn dqnnVar = dqnrVar.c;
            if (dqnnVar == null) {
                dqnnVar = dqnn.e;
            }
            int a = dqnh.a(dqnnVar.d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        this.a.j(Boolean.valueOf(z));
    }
}
