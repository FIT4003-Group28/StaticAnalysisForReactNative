package defpackage;
/* compiled from: PG */
/* renamed from: oyv  reason: default package */
/* loaded from: classes4.dex */
final class oyv {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final pct f;
    private final pct g;
    private int h;
    private int i;

    public oyv(pct pctVar, pct pctVar2, boolean z) {
        this.g = pctVar;
        this.f = pctVar2;
        this.e = z;
        pctVar2.z(12);
        this.a = pctVar2.j();
        pctVar.z(12);
        this.i = pctVar.j();
        pce.e(pctVar.c() != 1 ? false : true, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long n;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        if (this.e) {
            n = this.f.o();
        } else {
            n = this.f.n();
        }
        this.d = n;
        if (this.b == this.h) {
            this.c = this.g.j();
            this.g.A(4);
            int i2 = -1;
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i2 = (-1) + this.g.j();
            }
            this.h = i2;
        }
        return true;
    }
}
