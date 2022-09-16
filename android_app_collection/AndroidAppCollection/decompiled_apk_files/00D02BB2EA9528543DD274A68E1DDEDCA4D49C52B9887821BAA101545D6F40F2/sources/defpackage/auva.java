package defpackage;
/* compiled from: PG */
/* renamed from: auva  reason: default package */
/* loaded from: classes.dex */
public final class auva extends aujb {
    private final bvjj c;
    private final dxio<asat> d;

    public auva(bvjj bvjjVar, dxio<asat> dxioVar) {
        super(aujd.d(dpyv.NAVIGATION_START_DRIVING_MODE.dm).a());
        this.c = bvjjVar;
        this.d = dxioVar;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        return false;
    }

    @Override // defpackage.aujb
    public final void i(btvo btvoVar, boolean z) {
        if (z) {
            this.d.a();
            this.c.P(bvjk.bd);
            return;
        }
        this.d.a();
    }
}
