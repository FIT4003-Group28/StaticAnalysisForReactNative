package defpackage;
/* compiled from: PG */
/* renamed from: amuq  reason: default package */
/* loaded from: classes2.dex */
public final class amuq {
    public final dpdy a;
    public final int b;

    public amuq(dpdy dpdyVar, int i) {
        this.a = dpdyVar;
        this.b = i;
    }

    public final dpec a() {
        dpec dpecVar = this.a.c;
        return dpecVar == null ? dpec.o : dpecVar;
    }

    public final boolean b() {
        return (this.a.a & 2) != 0;
    }

    public final amuo c(int i, int i2) {
        boolean z = true;
        dbsk.a(i >= 0);
        if (i >= d()) {
            z = false;
        }
        dbsk.a(z);
        amun h = amux.h(this.a.d.get(i), null, null);
        h.g = i2;
        h.x = this;
        return h.a();
    }

    public final int d() {
        return this.a.d.size();
    }

    public final dpdq e(int i) {
        return this.a.d.get(i);
    }

    public final boolean f() {
        return (this.a.a & 8) != 0;
    }

    public final dphe g() {
        dphe dpheVar = this.a.e;
        return dpheVar == null ? dphe.x : dpheVar;
    }

    public final dpdx h() {
        dpdx dpdxVar = this.a.g;
        return dpdxVar == null ? dpdx.d : dpdxVar;
    }

    public final dowh i() {
        dowh dowhVar = this.a.k;
        return dowhVar == null ? dowh.i : dowhVar;
    }

    public final dowf j() {
        dowf dowfVar = this.a.l;
        return dowfVar == null ? dowf.i : dowfVar;
    }

    public final boolean k() {
        return (this.a.a & 1024) != 0;
    }

    public final boolean l() {
        return (this.a.a & 128) != 0;
    }

    public final boolean m() {
        return (this.a.a & 256) != 0;
    }

    public final dpax n() {
        dpax dpaxVar = this.a.i;
        return dpaxVar == null ? dpax.p : dpaxVar;
    }

    public final dpah o() {
        dpah dpahVar = this.a.j;
        return dpahVar == null ? dpah.g : dpahVar;
    }
}
