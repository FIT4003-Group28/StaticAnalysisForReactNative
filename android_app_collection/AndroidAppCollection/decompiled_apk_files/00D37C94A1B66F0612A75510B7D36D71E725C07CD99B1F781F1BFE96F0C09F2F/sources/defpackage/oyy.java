package defpackage;
/* compiled from: PG */
/* renamed from: oyy  reason: default package */
/* loaded from: classes4.dex */
final class oyy implements oyw {
    private final int a;
    private final int b;
    private final pct c;

    public oyy(oyt oytVar) {
        pct pctVar = oytVar.a;
        this.c = pctVar;
        pctVar.z(12);
        this.a = pctVar.j();
        this.b = pctVar.j();
    }

    @Override // defpackage.oyw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.oyw
    public final int b() {
        int i = this.a;
        return i == 0 ? this.c.j() : i;
    }

    @Override // defpackage.oyw
    public final boolean c() {
        return this.a != 0;
    }
}
