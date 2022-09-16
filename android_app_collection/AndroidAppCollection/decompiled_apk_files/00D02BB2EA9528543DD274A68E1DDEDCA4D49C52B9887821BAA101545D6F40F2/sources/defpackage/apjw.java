package defpackage;
/* compiled from: PG */
/* renamed from: apjw  reason: default package */
/* loaded from: classes.dex */
public final class apjw implements ania {
    private final btrm a;
    private final bvjj b;
    private final dxio<akfa> c;

    public apjw(btrm btrmVar, bvjj bvjjVar, dxio<akfa> dxioVar) {
        this.a = btrmVar;
        this.b = bvjjVar;
        this.c = dxioVar;
    }

    @Override // defpackage.ania
    public final boolean a() {
        return b(this.c.a().j());
    }

    @Override // defpackage.ania
    public final boolean b(@dzsi btlu btluVar) {
        return btluVar != null && btlu.i(btluVar) == btlt.GOOGLE && this.b.o(bvjk.gM, btluVar, false);
    }

    @Override // defpackage.ania
    public final boolean c(boolean z, int i) {
        btlu j = this.c.a().j();
        if (j == null || btlu.i(j) != btlt.GOOGLE || z == this.b.o(bvjk.gM, j, false)) {
            return false;
        }
        this.b.T(bvjk.gM, j, z);
        this.a.b(new anlb(z, i));
        return true;
    }
}
