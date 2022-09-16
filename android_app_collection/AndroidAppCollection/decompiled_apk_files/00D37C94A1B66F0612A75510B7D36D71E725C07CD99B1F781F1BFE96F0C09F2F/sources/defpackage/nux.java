package defpackage;
/* compiled from: PG */
/* renamed from: nux  reason: default package */
/* loaded from: classes3.dex */
public final class nux implements adny, oar, oak {
    static final nue a = new nue(4, 2.4f, 2.4f);
    private final adoa b;
    private final nun c;

    public nux(adoa adoaVar, nun nunVar) {
        this.b = adoaVar;
        this.c = nunVar;
    }

    private final void b() {
        if (!c()) {
            if (this.c.f(4) == null) {
                return;
            }
            this.c.g(0, false);
            return;
        }
        this.c.h(a);
    }

    private final boolean c() {
        return this.b.e() != null;
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
        boolean h = oas.h(i2);
        if (oas.h(i) != h) {
            if (h) {
                this.b.g(this);
                b();
                return;
            }
            this.b.i(this);
        }
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        b();
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        b();
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }

    @Override // defpackage.oak
    public final void pg(oan oanVar, oan oanVar2) {
        if (c()) {
            this.c.h(a);
        }
    }
}
