package defpackage;
/* compiled from: PG */
/* renamed from: pbz  reason: default package */
/* loaded from: classes7.dex */
public final class pbz {
    public final long a;
    public final btrm b;
    public final bvjj c;
    public final bvrb d;
    public final dxio<dela> e;
    @dzsi
    public bvny f;
    public final Runnable g = new pby(this);

    public pbz(dxio<dela> dxioVar, long j, btrm btrmVar, bvjj bvjjVar, bvrb bvrbVar) {
        this.e = dxioVar;
        this.a = j;
        this.b = btrmVar;
        this.c = bvjjVar;
        this.d = bvrbVar;
    }

    public final void a() {
        String z = this.c.z(bvjk.gf, null);
        long w = this.c.w(bvjk.gg, Long.MIN_VALUE);
        if (z == null || this.a != w) {
            this.d.b(this.g, bvrj.BACKGROUND_THREADPOOL);
        } else {
            this.b.b(new pah(z));
        }
    }
}
