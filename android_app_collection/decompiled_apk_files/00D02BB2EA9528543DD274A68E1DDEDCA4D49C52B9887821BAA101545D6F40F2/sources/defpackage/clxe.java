package defpackage;
/* compiled from: PG */
/* renamed from: clxe  reason: default package */
/* loaded from: classes5.dex */
final class clxe implements clxb {
    private final cmnk a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public clxe(clwy clwyVar) {
        cmnk cmnkVar = clwyVar.a;
        this.a = cmnkVar;
        cmnkVar.f(12);
        this.c = cmnkVar.v() & 255;
        this.b = cmnkVar.v();
    }

    @Override // defpackage.clxb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.clxb
    public final int b() {
        return -1;
    }

    @Override // defpackage.clxb
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.l();
        }
        if (i == 16) {
            return this.a.m();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int l = this.a.l();
        this.e = l;
        return (l & 240) >> 4;
    }
}
