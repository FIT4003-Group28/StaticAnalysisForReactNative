package defpackage;
/* compiled from: PG */
/* renamed from: dmoo  reason: default package */
/* loaded from: classes.dex */
public final class dmoo extends dsqr<dmop, dmoo> implements dsqt {
    public dmoo() {
        super(dmop.h);
    }

    public final void a(dmpq dmpqVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmop dmopVar = (dmop) this.b;
        dmpv bK = dmpqVar.bK();
        dmop dmopVar2 = dmop.h;
        bK.getClass();
        dmopVar.d = bK;
        dmopVar.a |= 4;
    }

    public final void b(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmop dmopVar = (dmop) this.b;
        dmop dmopVar2 = dmop.h;
        dmopVar.a |= 1;
        dmopVar.b = i;
    }
}
