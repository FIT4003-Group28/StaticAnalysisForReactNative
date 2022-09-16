package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: azzg  reason: default package */
/* loaded from: classes3.dex */
public final class azzg extends azwh<azzh> {
    public dong a;

    public azzg(azzh azzhVar) {
        super(azzhVar);
        this.a = azzhVar.o();
    }

    public static void c(domz domzVar, dbrn<Iterable<dond>, Iterable<dond>> dbrnVar) {
        if (((done) domzVar.b).d.size() != 0) {
            Iterable<dond> a = dbrnVar.a(Collections.unmodifiableList(((done) domzVar.b).d));
            if (domzVar.c) {
                domzVar.bF();
                domzVar.c = false;
            }
            ((done) domzVar.b).d = done.ck();
            if (domzVar.c) {
                domzVar.bF();
                domzVar.c = false;
            }
            done doneVar = (done) domzVar.b;
            dsrj<dond> dsrjVar = doneVar.d;
            if (!dsrjVar.a()) {
                doneVar.d = dsqw.cl(dsrjVar);
            }
            dsod.bv(a, doneVar.d);
        }
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azzh b() {
        return new azzh(this);
    }

    public final void d(dbsz<doms> dbszVar) {
        donf donfVar = this.a.c;
        if (donfVar == null) {
            donfVar = donf.j;
        }
        doms ca = donf.j.ca(donfVar);
        dbszVar.NU(ca);
        domr ca2 = dong.d.ca(this.a);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dong dongVar = (dong) ca2.b;
        donf bK = ca.bK();
        bK.getClass();
        dongVar.c = bK;
        dongVar.a |= 2;
        this.a = ca2.bK();
    }

    public final void e(dbsz<domz> dbszVar) {
        dbrn dbrnVar = azyw.a;
        donf donfVar = this.a.c;
        if (donfVar == null) {
            donfVar = donf.j;
        }
        final domz ca = done.e.ca((done) dbrnVar.a(donfVar));
        dbszVar.NU(ca);
        d(new dbsz(ca) { // from class: azyv
            private final domz a;

            {
                this.a = ca;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                doms domsVar = (doms) obj;
                done bK = this.a.bK();
                if (domsVar.c) {
                    domsVar.bF();
                    domsVar.c = false;
                }
                donf donfVar2 = (donf) domsVar.b;
                donf donfVar3 = donf.j;
                bK.getClass();
                donfVar2.b = bK;
                donfVar2.a |= 1;
            }
        });
    }

    public azzg(dong dongVar) {
        super(azwm.h, azwm.i);
        this.a = dongVar;
        this.d = "User Parameters";
        this.g = "User Parameters";
    }
}
