package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cbsh  reason: default package */
/* loaded from: classes4.dex */
public final class cbsh {
    public final crzo<cbto> a = new crzo<>();
    private final gga b;

    public cbsh(gga ggaVar) {
        this.b = ggaVar;
    }

    public final crzm<cbto> a() {
        return this.a.a;
    }

    public final void b(String str) {
        int i;
        cbto l = this.a.a.l();
        if (l == null) {
            return;
        }
        Iterator<cbtn> it = l.a.iterator();
        int i2 = 0;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            cbtn next = it.next();
            if (next.c.equals(str)) {
                int a = cbtm.a(next.d);
                if (a == 0 || a != 3) {
                    int a2 = cbtm.a(next.d);
                    if (a2 != 0 && a2 == 2) {
                        i = 3;
                    }
                }
            } else {
                i2++;
            }
        }
        i = 1;
        if (i2 == l.a.size()) {
            return;
        }
        crzo<cbto> crzoVar = this.a;
        dsqp dsqpVar = (dsqp) l.cu(5);
        dsqpVar.bC(l);
        cbtj cbtjVar = (cbtj) dsqpVar;
        cbtn cbtnVar = l.a.get(i2);
        dsqp dsqpVar2 = (dsqp) cbtnVar.cu(5);
        dsqpVar2.bC(cbtnVar);
        cbtk cbtkVar = (cbtk) dsqpVar2;
        if (cbtkVar.c) {
            cbtkVar.bF();
            cbtkVar.c = false;
        }
        cbtn cbtnVar2 = (cbtn) cbtkVar.b;
        cbtn cbtnVar3 = cbtn.e;
        cbtnVar2.d = i;
        cbtnVar2.a |= 4;
        cbtjVar.a(i2, cbtkVar);
        crzoVar.a(cbtjVar.bK());
    }

    public final void c() {
        cbto l = this.a.a.l();
        if (l == null) {
            return;
        }
        dsqp dsqpVar = (dsqp) l.cu(5);
        dsqpVar.bC(l);
        cbtj cbtjVar = (cbtj) dsqpVar;
        for (int i = 0; i < l.a.size(); i++) {
            cbtn cbtnVar = ((cbto) cbtjVar.b).a.get(i);
            dsqp dsqpVar2 = (dsqp) cbtnVar.cu(5);
            dsqpVar2.bC(cbtnVar);
            cbtk cbtkVar = (cbtk) dsqpVar2;
            if (cbtkVar.c) {
                cbtkVar.bF();
                cbtkVar.c = false;
            }
            cbtn cbtnVar2 = (cbtn) cbtkVar.b;
            cbtn cbtnVar3 = cbtn.e;
            cbtnVar2.d = 3;
            cbtnVar2.a |= 4;
            cbtjVar.a(i, cbtkVar);
        }
        this.a.a(cbtjVar.bK());
    }

    public final void d() {
        this.b.g().e();
    }
}
