package defpackage;
/* compiled from: PG */
/* renamed from: aslm  reason: default package */
/* loaded from: classes2.dex */
public final class aslm extends aslf {
    public static final dcqe e = dcqe.c("aslm");
    public final dcdc<akra> f;
    public final boolean g;
    public final aslf h;
    public final int i;

    /* JADX INFO: Access modifiers changed from: protected */
    public aslm(asll<?> asllVar) {
        super(asllVar);
        dcdc<akra> dcdcVar = asllVar.f;
        dbsk.s(dcdcVar);
        this.f = dcdcVar;
        this.g = asllVar.g;
        aslf aslfVar = asllVar.e;
        dbsk.s(aslfVar);
        this.h = aslfVar;
        this.i = Math.min(Math.max(asllVar.h, 0), dcdcVar.size());
    }

    @Override // defpackage.aslf
    public final /* bridge */ /* synthetic */ asle b() {
        return new asll(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aslf
    public final dbsb c() {
        dbsb c = super.c();
        c.b("results", this.f);
        c.h("isManualRefresh", this.g);
        c.f("numTopResultsToFrame", this.i);
        c.b("previousCameraParameters", this.h);
        return c;
    }
}
