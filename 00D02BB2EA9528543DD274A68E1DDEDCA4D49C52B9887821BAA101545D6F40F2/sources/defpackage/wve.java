package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wve  reason: default package */
/* loaded from: classes7.dex */
public final class wve implements qdx {
    private final List<btzc> a = new ArrayList();
    private final wvb b;
    private final burn c;

    public wve(burn burnVar, wvb wvbVar) {
        this.c = burnVar;
        this.b = wvbVar;
    }

    @Override // defpackage.qdx
    public final dehn<Map<qdv, dopk>> a(List<qdv> list) {
        return b(list, false);
    }

    @Override // defpackage.qdx
    public final dehn<Map<qdv, dopk>> b(List<qdv> list, boolean z) {
        int size = list.size();
        wvd wvdVar = new wvd(size);
        if (size <= 0) {
            wvdVar.k(new qdu());
        }
        for (qdv qdvVar : list) {
            dopk a = this.b.a(qdvVar);
            if (a != null) {
                wvdVar.b(qdvVar, a);
            } else {
                burn burnVar = this.c;
                dvyz bZ = dvzd.o.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvzd dvzdVar = (dvzd) bZ.b;
                dvzdVar.b = 4;
                int i = dvzdVar.a | 1;
                dvzdVar.a = i;
                dvzdVar.a = i | 32;
                dvzdVar.g = false;
                boolean d = qdvVar.d();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvzd dvzdVar2 = (dvzd) bZ.b;
                dvzdVar2.a |= 4096;
                dvzdVar2.n = d;
                dopp bZ2 = dops.g.bZ();
                int c = qdvVar.c();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dops dopsVar = (dops) bZ2.b;
                int i2 = dopsVar.a | 1;
                dopsVar.a = i2;
                dopsVar.b = c;
                dopsVar.a = i2 | 8;
                dopsVar.f = true;
                int e = qdvVar.e();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dops dopsVar2 = (dops) bZ2.b;
                int i3 = e - 1;
                if (e == 0) {
                    throw null;
                }
                dopsVar2.d = i3;
                dopsVar2.a |= 4;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvzd dvzdVar3 = (dvzd) bZ.b;
                dops bK = bZ2.bK();
                bK.getClass();
                dvzdVar3.j = bK;
                dvzdVar3.a |= 128;
                if (z) {
                    dopw bZ3 = doqa.f.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    doqa doqaVar = (doqa) bZ3.b;
                    doqaVar.b = 1;
                    doqaVar.a |= 1;
                    doqa.b(doqaVar);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvzd dvzdVar4 = (dvzd) bZ.b;
                    doqa bK2 = bZ3.bK();
                    bK2.getClass();
                    dvzdVar4.l = bK2;
                    dvzdVar4.a |= 1024;
                }
                for (String str : qdvVar.b()) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvzd dvzdVar5 = (dvzd) bZ.b;
                    str.getClass();
                    dvzdVar5.c();
                    dvzdVar5.h.add(str);
                }
                djyv bZ4 = djyy.f.bZ();
                akqi a2 = qdvVar.a();
                if (a2 != null) {
                    String o = a2.o();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    djyy djyyVar = (djyy) bZ4.b;
                    o.getClass();
                    djyyVar.a |= 1;
                    djyyVar.b = o;
                }
                djyw bZ5 = djyx.c.bZ();
                dqua bZ6 = dquf.c.bZ();
                bZ6.b(dquc.SVG);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djyx djyxVar = (djyx) bZ5.b;
                dquf bK3 = bZ6.bK();
                bK3.getClass();
                djyxVar.b = bK3;
                djyxVar.a = 1 | djyxVar.a;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djyy djyyVar2 = (djyy) bZ4.b;
                djyx bK4 = bZ5.bK();
                bK4.getClass();
                djyyVar2.d = bK4;
                djyyVar2.a = 4 | djyyVar2.a;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djyy djyyVar3 = (djyy) bZ4.b;
                dvzd bK5 = bZ.bK();
                bK5.getClass();
                djyyVar3.c = bK5;
                djyyVar3.a |= 2;
                btzc a3 = burnVar.a(bZ4.bK(), new wvc(qdvVar, wvdVar, this.b), bvrj.BACKGROUND_THREADPOOL);
                synchronized (this) {
                    this.a.add(a3);
                }
            }
        }
        return wvdVar;
    }

    @Override // defpackage.qdx
    public final synchronized void c() {
        for (btzc btzcVar : this.a) {
            btzcVar.a();
        }
        this.a.clear();
    }
}
