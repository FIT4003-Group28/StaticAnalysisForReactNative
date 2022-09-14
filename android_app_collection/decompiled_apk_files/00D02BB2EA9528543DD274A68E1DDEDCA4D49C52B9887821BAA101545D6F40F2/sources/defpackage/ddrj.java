package defpackage;
/* compiled from: PG */
/* renamed from: ddrj  reason: default package */
/* loaded from: classes6.dex */
public final class ddrj extends dsqp<ddrk, ddrj> implements dssk {
    public ddrj() {
        super(ddrk.i);
    }

    public final void a(float f) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddrk ddrkVar = (ddrk) this.b;
        ddrk ddrkVar2 = ddrk.i;
        dsre dsreVar = ddrkVar.f;
        if (!dsreVar.a()) {
            ddrkVar.f = dsqw.cj(dsreVar);
        }
        ddrkVar.f.g(f);
    }

    public final void b(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddrk ddrkVar = (ddrk) this.b;
        ddrk ddrkVar2 = ddrk.i;
        ddrkVar.a |= 16;
        ddrkVar.e = i;
    }

    public final void c(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddrk ddrkVar = (ddrk) this.b;
        ddrk ddrkVar2 = ddrk.i;
        ddrkVar.a |= 8;
        ddrkVar.d = i;
    }

    public final void d(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ddrk ddrkVar = (ddrk) this.b;
        ddrk ddrkVar2 = ddrk.i;
        ddrkVar.a |= 64;
        ddrkVar.h = i;
    }
}
