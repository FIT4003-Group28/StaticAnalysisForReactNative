package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cgal  reason: default package */
/* loaded from: classes4.dex */
public final class cgal<T> extends btrh<T> {
    public cgal(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dwmk bK;
        cgak cgakVar = (cgak) this.a;
        bqje bqjeVar = (bqje) obj;
        ilo c = bqjeVar.a.c();
        if (c == null) {
            return;
        }
        final String o = c.ai().o();
        int i = bqjeVar.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            cgakVar.b(o);
        } else if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
        } else {
            List<dwmk> f = cgakVar.f();
            dwmk dwmkVar = (dwmk) dcbg.b(f).r(new dbsl(o) { // from class: cgaj
                private final String a;

                {
                    this.a = o;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    return cgak.g((dwmk) obj2).equals(this.a);
                }
            }).f();
            if (dwmkVar == null) {
                return;
            }
            if (!c.br()) {
                dsqp dsqpVar = (dsqp) dwmkVar.cu(5);
                dsqpVar.bC(dwmkVar);
                dwlb dwlbVar = (dwlb) dsqpVar;
                if (dwlbVar.c) {
                    dwlbVar.bF();
                    dwlbVar.c = false;
                }
                dwmk dwmkVar2 = (dwmk) dwlbVar.b;
                dwmkVar2.a &= -65;
                dwmkVar2.i = dwmk.r.i;
                if (dwlbVar.c) {
                    dwlbVar.bF();
                    dwlbVar.c = false;
                }
                dwmk dwmkVar3 = (dwmk) dwlbVar.b;
                dwmkVar3.a &= -17;
                dwmkVar3.g = 0;
                bK = dwlbVar.bK();
                cgakVar.b.remove(o);
            } else {
                docg bs = c.bs();
                dsqp dsqpVar2 = (dsqp) dwmkVar.cu(5);
                dsqpVar2.bC(dwmkVar);
                dwlb dwlbVar2 = (dwlb) dsqpVar2;
                String str = bs.r;
                if (dwlbVar2.c) {
                    dwlbVar2.bF();
                    dwlbVar2.c = false;
                }
                dwmk dwmkVar4 = (dwmk) dwlbVar2.b;
                str.getClass();
                int i3 = dwmkVar4.a | 64;
                dwmkVar4.a = i3;
                dwmkVar4.i = str;
                int i4 = bs.q;
                dwmkVar4.a = i3 | 16;
                dwmkVar4.g = i4;
                bK = dwlbVar2.bK();
                cgakVar.b.put(o, bs);
            }
            int indexOf = f.indexOf(dwmkVar);
            z<List<dwmk>> zVar = cgakVar.a;
            dccx dccxVar = new dccx();
            dccxVar.i(f.subList(0, indexOf));
            dccxVar.g(bK);
            dccxVar.i(f.subList(indexOf + 1, f.size()));
            zVar.g(dccxVar.f());
        }
    }
}
