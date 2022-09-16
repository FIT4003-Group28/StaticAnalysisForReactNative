package defpackage;
/* compiled from: PG */
/* renamed from: amtd  reason: default package */
/* loaded from: classes2.dex */
public final class amtd {
    @dzsi
    public amsy a;
    @dzsi
    public dqvj b;
    public amvh[] c;
    public amvf[] d;
    @dzsi
    public bvrt<dwao> e;
    @dzsi
    public bvrt<duqc> f;
    public long g;
    @dzsi
    public bvrt<dwaw> h;
    public int i;
    public boolean j;

    public amtd() {
        this.j = false;
    }

    public amtd(amte amteVar) {
        this.j = false;
        int i = amte.l;
        this.a = amteVar.a;
        this.b = amteVar.b;
        this.c = amteVar.c;
        this.d = amteVar.d;
        this.e = amteVar.e;
        this.f = amteVar.f;
        this.g = amteVar.g;
        this.h = amteVar.h;
        this.i = amteVar.i;
        this.j = amteVar.j;
        boolean z = amteVar.k;
    }

    public final amte a() {
        return new amte(this);
    }

    public final void b(duqc duqcVar) {
        this.f = bvrt.b(duqcVar);
    }

    public final void c(@dzsi dwaw dwawVar) {
        this.h = bvrt.a(dwawVar);
    }

    public final void d(dwao dwaoVar) {
        this.e = bvrt.b(dwaoVar);
    }

    public final void e(amvh... amvhVarArr) {
        amvj.k(amvhVarArr.length);
        this.c = amvhVarArr;
    }
}
