package defpackage;
/* compiled from: PG */
/* renamed from: dmoa  reason: default package */
/* loaded from: classes6.dex */
public final class dmoa extends dsqp<dmob, dmoa> implements dssk {
    public dmoa() {
        super(dmob.g);
    }

    public final void a(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmob dmobVar = (dmob) this.b;
        dmob dmobVar2 = dmob.g;
        dmobVar.a |= 1;
        dmobVar.b = i;
    }

    public final void b() {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmob dmobVar = (dmob) this.b;
        dmob dmobVar2 = dmob.g;
        dmobVar.a |= 32;
        dmobVar.f = 24;
    }

    public final void c() {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmob dmobVar = (dmob) this.b;
        dmob dmobVar2 = dmob.g;
        dmobVar.a |= 4;
        dmobVar.d = 100;
    }

    public final void d() {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmob dmobVar = (dmob) this.b;
        dmob dmobVar2 = dmob.g;
        dmobVar.a |= 8;
        dmobVar.e = 0;
    }
}
