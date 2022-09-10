package defpackage;
/* compiled from: PG */
/* renamed from: bjfr  reason: default package */
/* loaded from: classes3.dex */
public final class bjfr extends dsqp<bjfs, bjfr> implements dssk {
    public bjfr() {
        super(bjfs.e);
    }

    public final void a(Iterable<? extends bjfo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bjfs bjfsVar = (bjfs) this.b;
        bjfs bjfsVar2 = bjfs.e;
        bjfsVar.b();
        dsod.bv(iterable, bjfsVar.c);
    }

    public final void b(bjfo bjfoVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bjfs bjfsVar = (bjfs) this.b;
        bjfs bjfsVar2 = bjfs.e;
        bjfoVar.getClass();
        bjfsVar.b();
        bjfsVar.c.add(bjfoVar);
    }

    public final void c(int i, bjfo bjfoVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bjfs bjfsVar = (bjfs) this.b;
        bjfs bjfsVar2 = bjfs.e;
        bjfoVar.getClass();
        bjfsVar.b();
        bjfsVar.c.set(i, bjfoVar);
    }
}
