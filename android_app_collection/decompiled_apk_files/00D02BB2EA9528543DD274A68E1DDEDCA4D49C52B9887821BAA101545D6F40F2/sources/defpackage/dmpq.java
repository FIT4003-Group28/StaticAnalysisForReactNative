package defpackage;
/* compiled from: PG */
/* renamed from: dmpq  reason: default package */
/* loaded from: classes6.dex */
public final class dmpq extends dsqp<dmpv, dmpq> implements dssk {
    public dmpq() {
        super(dmpv.s);
    }

    public final void a(dmog dmogVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmoh dmohVar = (dmoh) dmogVar.bK();
        dmpv dmpvVar2 = dmpv.s;
        dmohVar.getClass();
        dmpvVar.b();
        dmpvVar.d.add(dmohVar);
    }

    public final void b(dmoh dmohVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmpv dmpvVar2 = dmpv.s;
        dmohVar.getClass();
        dmpvVar.b();
        dmpvVar.d.add(dmohVar);
    }

    public final void c(dmoa dmoaVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmob bK = dmoaVar.bK();
        dmpv dmpvVar2 = dmpv.s;
        bK.getClass();
        dmpvVar.e = bK;
        dmpvVar.a |= 4;
    }

    public final void d(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmpv dmpvVar2 = dmpv.s;
        dmpvVar.a |= 1;
        dmpvVar.b = i;
    }

    public final void e(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmpv dmpvVar2 = dmpv.s;
        dmpvVar.a |= 2;
        dmpvVar.c = i;
    }

    public final void f() {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpv dmpvVar = (dmpv) this.b;
        dmpv dmpvVar2 = dmpv.s;
        dmpvVar.a |= 128;
        dmpvVar.j = true;
    }
}
