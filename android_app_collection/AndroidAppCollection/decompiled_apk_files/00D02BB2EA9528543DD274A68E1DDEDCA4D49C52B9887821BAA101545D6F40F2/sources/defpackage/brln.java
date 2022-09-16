package defpackage;

import android.app.Application;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: brln  reason: default package */
/* loaded from: classes4.dex */
public class brln extends bttk<dwir, dwiv> implements bwro {
    private static final dcqe j = dcqe.c("brln");
    private static final dcep<dpvf> k = dcnm.a(dpvf.ICONIC_PLACES, new dpvf[0]);
    public iqy a;
    @dzsi
    public bvrt<dfpo> b;
    @dzsi
    public amsz c;
    @dzsi
    public amvq d;
    public brlu e;
    @dzsi
    public transient brlm f;
    public int g;
    private bvrt<dwir> l;

    public brln() {
        this(dwir.R, new iqy());
    }

    @Override // defpackage.bttu
    public final void a(@dzsi bttq bttqVar) {
        brlm brlmVar = this.f;
        if (brlmVar == null) {
            return;
        }
        if (bttqVar == null) {
            brlmVar.a(this);
        } else {
            brlmVar.b(this, bttqVar);
        }
    }

    public final dwir b() {
        return this.l.e((dssr) dwir.R.cu(7), dwir.R);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        boolean z = (b().b & 262144) != 0;
        if (!z || c()) {
            return z;
        }
        bvoo.h("parking search is not from directions.", new Object[0]);
        return true;
    }

    public final boolean e() {
        if (!this.a.n) {
            dcep<dpvf> dcepVar = k;
            dpvf b = dpvf.b(b().N);
            if (b == null) {
                b = dpvf.UNKNOWN_CATEGORY;
            }
            return dcepVar.contains(b);
        }
        return true;
    }

    @Override // defpackage.bwro
    public final void f(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.l);
        this.e.Y(objectOutputStream);
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.d);
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.b);
    }

    @Override // defpackage.bwro
    public final void g(ObjectInputStream objectInputStream) {
        try {
            this.l = (bvrt) objectInputStream.readObject();
            this.e = (brlu) objectInputStream.readObject();
            this.a = (iqy) objectInputStream.readObject();
            this.d = (amvq) objectInputStream.readObject();
            this.c = (amsz) objectInputStream.readObject();
            this.b = (bvrt) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException(e);
        }
    }

    public final void h(dwiv dwivVar, @dzsi Application application, @dzsi btvo btvoVar) {
        bvrt<dwir> bvrtVar = this.l;
        dbsk.s(bvrtVar);
        dwir e = bvrtVar.e((dssr) dwir.R.cu(7), dwir.R);
        iqy iqyVar = this.a;
        this.e.J(dwivVar, application, e.g, btvoVar, dbsj.e(iqyVar == null ? "" : iqyVar.a));
        if (e != null) {
            brlu brluVar = this.e;
            dwix dwixVar = e.w;
            if (dwixVar == null) {
                dwixVar = dwix.h;
            }
            brluVar.W(dwixVar);
            brlu brluVar2 = this.e;
            String str = e.c;
            brluVar2.b = str;
            brluVar2.u(str);
        }
    }

    @Override // defpackage.bttu
    public final synchronized void i() {
        super.i();
        brlm brlmVar = this.f;
        if (brlmVar != null) {
            brlmVar.c(this);
        }
    }

    public final String j() {
        iqy iqyVar = this.a;
        return (iqyVar == null || !iqyVar.i) ? (iqyVar == null || dbsj.d(iqyVar.l)) ? b().c : this.a.l : "";
    }

    @Override // defpackage.bttu
    protected final dbsb k() {
        dwir b = b();
        dbsb k2 = super.k();
        k2.b("params.getQuery", b == null ? "<NULL>" : b.c);
        return k2;
    }

    @dzsi
    public final dfpo l() {
        bvrt<dfpo> bvrtVar = this.b;
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e((dssr) dfpo.h.cu(7), dfpo.h);
    }

    public final boolean m() {
        return this.b != null;
    }

    public brln(dwir dwirVar, iqy iqyVar) {
        this(dwirVar, iqyVar, (amsz) null, (amvq) null);
    }

    public brln(dwir dwirVar, iqy iqyVar, @dzsi amsz amszVar, @dzsi amvq amvqVar) {
        dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
        bvrj bvrjVar = bvrj.CURRENT;
        this.e = new brlu();
        this.g = 1;
        if ((dwirVar.a & Integer.MIN_VALUE) != 0 && amvqVar == null) {
            bvoo.h("directionsStartPointLocation should not be null when searchRequest has a SearchAlongRouteContext set", new Object[0]);
        }
        dvzd dvzdVar = dwirVar.l;
        dvzdVar = dvzdVar == null ? dvzd.o : dvzdVar;
        dsqp dsqpVar = (dsqp) dvzdVar.cu(5);
        dsqpVar.bC(dvzdVar);
        dvyz dvyzVar = (dvyz) dsqpVar;
        if (dvyzVar.c) {
            dvyzVar.bF();
            dvyzVar.c = false;
        }
        dvzd dvzdVar2 = (dvzd) dvyzVar.b;
        dvzdVar2.a |= 2;
        dvzdVar2.c = true;
        dvzd bK = dvyzVar.bK();
        dsqp dsqpVar2 = (dsqp) dwirVar.cu(5);
        dsqpVar2.bC(dwirVar);
        dwim dwimVar = (dwim) dsqpVar2;
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar2 = (dwir) dwimVar.b;
        bK.getClass();
        dwirVar2.l = bK;
        dwirVar2.a |= 16384;
        this.l = bvrt.b(dwimVar.bK());
        this.a = iqyVar;
        this.c = amszVar;
        this.d = amvqVar;
    }

    public brln(dwir dwirVar, dwiv dwivVar, @dzsi iqy iqyVar, @dzsi btvo btvoVar) {
        this(dwirVar, iqyVar == null ? new iqy() : iqyVar);
        h(dwivVar, null, btvoVar);
    }
}
