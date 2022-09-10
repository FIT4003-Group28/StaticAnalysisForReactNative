package defpackage;
/* compiled from: PG */
/* renamed from: bzof  reason: default package */
/* loaded from: classes.dex */
public final class bzof extends dsqp<bzog, bzof> implements dssk {
    public bzof() {
        super(bzog.c);
    }

    public final void a(Iterable<? extends dspd> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        bzog bzogVar = (bzog) this.b;
        bzog bzogVar2 = bzog.c;
        bzogVar.b();
        dsod.bv(iterable, bzogVar.b);
    }
}
