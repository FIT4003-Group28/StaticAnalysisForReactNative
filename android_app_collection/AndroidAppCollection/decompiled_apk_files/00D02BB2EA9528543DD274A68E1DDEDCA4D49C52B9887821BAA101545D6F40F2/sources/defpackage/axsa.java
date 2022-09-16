package defpackage;
/* compiled from: PG */
/* renamed from: axsa  reason: default package */
/* loaded from: classes.dex */
public final class axsa implements axwg {
    private final acyp a;
    private final btvo b;

    public axsa(acyp acypVar, btvo btvoVar) {
        this.a = acypVar;
        this.b = btvoVar;
    }

    @Override // defpackage.axwg
    public final boolean a() {
        return !this.b.getSocialPlanningShortlistingParameters().a;
    }

    @Override // defpackage.axwg
    public final boolean b() {
        return false;
    }

    @Override // defpackage.axwg
    public final boolean c() {
        return this.b.getPlaceListsParameters().f;
    }

    @Override // defpackage.axwg
    public final boolean d() {
        return this.b.getPlaceListsParameters().g;
    }

    @Override // defpackage.axwg
    public final boolean e() {
        return !this.b.getPlaceListsParameters().e;
    }

    @Override // defpackage.axwg
    public final boolean f() {
        return this.b.getPlaceListsParameters().h || this.a.a.a().l;
    }

    @Override // defpackage.axwg
    public final boolean g() {
        return f() && this.b.getPlaceListsParameters().j;
    }

    @Override // defpackage.axwg
    public final int h() {
        return this.b.getPlaceListsParameters().k;
    }

    @Override // defpackage.axwg
    public final boolean i() {
        return f() && this.b.getPlaceListsParameters().l;
    }

    @Override // defpackage.axwg
    public final long j() {
        return this.b.getPlaceListsParameters().m;
    }

    @Override // defpackage.axwg
    public final boolean k() {
        return f() && this.b.getPlaceListsParameters().i;
    }

    @Override // defpackage.axwg
    public final boolean l() {
        return f() && this.b.getPlaceListsParameters().n;
    }
}
