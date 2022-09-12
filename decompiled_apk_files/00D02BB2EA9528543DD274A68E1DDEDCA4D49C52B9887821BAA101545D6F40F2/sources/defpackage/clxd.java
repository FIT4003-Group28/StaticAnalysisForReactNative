package defpackage;
/* compiled from: PG */
/* renamed from: clxd  reason: default package */
/* loaded from: classes5.dex */
final class clxd implements clxb {
    private final int a;
    private final int b;
    private final cmnk c;

    public clxd(clwy clwyVar) {
        cmnk cmnkVar = clwyVar.a;
        this.c = cmnkVar;
        cmnkVar.f(12);
        int v = cmnkVar.v();
        this.a = v == 0 ? -1 : v;
        this.b = cmnkVar.v();
    }

    @Override // defpackage.clxb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.clxb
    public final int b() {
        return this.a;
    }

    @Override // defpackage.clxb
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.v() : i;
    }
}
