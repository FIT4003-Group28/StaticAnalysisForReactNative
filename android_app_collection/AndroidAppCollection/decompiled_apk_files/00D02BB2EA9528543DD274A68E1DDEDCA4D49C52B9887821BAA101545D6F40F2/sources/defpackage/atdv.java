package defpackage;
/* compiled from: PG */
/* renamed from: atdv  reason: default package */
/* loaded from: classes2.dex */
final class atdv implements atdt {
    private boolean a = false;
    private int b = 0;

    @Override // defpackage.atdt
    public final void a(atlq atlqVar) {
        crqf crqfVar = atlqVar.m;
        dbsk.s(crqfVar);
        amub amubVar = crqfVar.g().a;
        boolean z = false;
        if (amubVar.j().n() && amubVar.l().n()) {
            z = true;
        }
        this.a = z;
    }

    @Override // defpackage.atdt
    public final void b(atlq atlqVar) {
        this.b++;
    }

    @Override // defpackage.atdt
    public final dvum c() {
        return dvum.AFTER_WALKING_NAV_END;
    }

    @Override // defpackage.atdt
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.atdt
    public final boolean e() {
        return this.a && this.b > 60;
    }
}
