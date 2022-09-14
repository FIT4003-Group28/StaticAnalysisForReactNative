package defpackage;
/* compiled from: PG */
/* renamed from: aslk  reason: default package */
/* loaded from: classes2.dex */
public final class aslk extends aslf {
    public static final dcqe e = dcqe.c("aslk");
    public final amub f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public aslk(aslj<?> asljVar) {
        super(asljVar);
        amub amubVar = asljVar.e;
        dbsk.s(amubVar);
        this.f = amubVar;
        this.g = asljVar.f;
        this.h = asljVar.g;
        this.i = asljVar.h;
        this.j = asljVar.i;
    }

    @Override // defpackage.aslf
    public final /* bridge */ /* synthetic */ asle b() {
        return new aslj(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aslf
    public final dbsb c() {
        dbsb c = super.c();
        c.b("route", this.f);
        c.e("metersFromStartToInspect", this.g);
        c.h("shouldAdjustBearing", this.h);
        c.h("shouldAdjustTarget", this.i);
        c.h("shouldAdjustZoom", this.j);
        return c;
    }
}
