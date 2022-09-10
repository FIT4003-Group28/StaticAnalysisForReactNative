package defpackage;
/* compiled from: PG */
/* renamed from: drym  reason: default package */
/* loaded from: classes6.dex */
public final class drym extends dsqp<dryn, drym> implements dssk {
    public drym() {
        super(dryn.e);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dryn drynVar = (dryn) this.b;
        dryn drynVar2 = dryn.e;
        dsrj<String> dsrjVar = drynVar.c;
        if (!dsrjVar.a()) {
            drynVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, drynVar.c);
    }
}
