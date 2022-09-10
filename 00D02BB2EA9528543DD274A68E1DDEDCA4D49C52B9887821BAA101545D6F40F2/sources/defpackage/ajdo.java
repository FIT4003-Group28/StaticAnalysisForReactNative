package defpackage;
/* compiled from: PG */
/* renamed from: ajdo  reason: default package */
/* loaded from: classes2.dex */
class ajdo implements ajbh {
    final /* synthetic */ ajdr a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ ajdu c;

    public ajdo(ajdu ajduVar, ajdr ajdrVar, dbsg dbsgVar) {
        this.c = ajduVar;
        this.a = ajdrVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.ajbh
    public cjtd n() {
        return this.c.e;
    }

    @Override // defpackage.ajbh
    public cqkl o() {
        ajcr ajcrVar = (ajcr) this.a;
        if (ajcrVar.f != null) {
            ajcrVar.aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.ajbh
    public cjtd p() {
        return this.c.d;
    }

    @Override // defpackage.ajbh
    public cqkl q() {
        ((ajcr) this.a).aU();
        return cqkl.a;
    }

    @Override // defpackage.ajbh
    public Boolean r() {
        return Boolean.valueOf(this.b.a());
    }
}
