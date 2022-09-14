package defpackage;
/* compiled from: PG */
/* renamed from: dmxg  reason: default package */
/* loaded from: classes6.dex */
public final class dmxg extends dsqr<dmxh, dmxg> implements dsqt {
    public dmxg() {
        super(dmxh.j);
    }

    public final dmwx a(int i) {
        return ((dmxh) this.b).c.get(i);
    }

    public final void b(dmyd dmydVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmxh dmxhVar = (dmxh) this.b;
        dmxh dmxhVar2 = dmxh.j;
        dmydVar.getClass();
        dmxhVar.b();
        dmxhVar.b.add(dmydVar);
    }

    public final void c(dmlk dmlkVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmxh dmxhVar = (dmxh) this.b;
        dmxh dmxhVar2 = dmxh.j;
        dmlkVar.getClass();
        dmlk dmlkVar2 = dmxhVar.i;
        if (dmlkVar2 != null && dmlkVar2 != dmlk.a) {
            dmlj dmljVar = (dmlj) dmlk.a.ca(dmxhVar.i);
            dmljVar.bC(dmlkVar);
            dmlkVar = dmljVar.bJ();
        }
        dmxhVar.i = dmlkVar;
        dmxhVar.a |= 2097152;
    }

    public final void d(int i, dmwu dmwuVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmxh dmxhVar = (dmxh) this.b;
        dmwx dmwxVar = (dmwx) dmwuVar.bK();
        dmxh dmxhVar2 = dmxh.j;
        dmwxVar.getClass();
        dmxhVar.c();
        dmxhVar.c.set(i, dmwxVar);
    }

    public final void e(int i, dmwx dmwxVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmxh dmxhVar = (dmxh) this.b;
        dmxh dmxhVar2 = dmxh.j;
        dmwxVar.getClass();
        dmxhVar.c();
        dmxhVar.c.set(i, dmwxVar);
    }
}
