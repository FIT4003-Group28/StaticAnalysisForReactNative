package defpackage;
/* compiled from: PG */
/* renamed from: clxa  reason: default package */
/* loaded from: classes5.dex */
final class clxa {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final cmnk f;
    private final cmnk g;
    private int h;
    private int i;

    public clxa(cmnk cmnkVar, cmnk cmnkVar2, boolean z) {
        this.g = cmnkVar;
        this.f = cmnkVar2;
        this.e = z;
        cmnkVar2.f(12);
        this.a = cmnkVar2.v();
        cmnkVar.f(12);
        this.i = cmnkVar.v();
        cmmn.d(cmnkVar.r() != 1 ? false : true, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long p;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        if (this.e) {
            p = this.f.x();
        } else {
            p = this.f.p();
        }
        this.d = p;
        if (this.b == this.h) {
            this.c = this.g.v();
            this.g.h(4);
            int i2 = -1;
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i2 = (-1) + this.g.v();
            }
            this.h = i2;
        }
        return true;
    }
}
