package defpackage;
/* compiled from: PG */
/* renamed from: aslp  reason: default package */
/* loaded from: classes2.dex */
public final class aslp extends aslf {
    public static final dcqe e = dcqe.c("aslp");
    public final dcdc<aslo> f;
    public final aslf g;

    /* JADX INFO: Access modifiers changed from: protected */
    public aslp(asln<?> aslnVar) {
        super(aslnVar);
        this.f = aslnVar.e.f();
        aslf aslfVar = aslnVar.f;
        dbsk.s(aslfVar);
        this.g = aslfVar;
    }

    @Override // defpackage.aslf
    public final /* bridge */ /* synthetic */ asle b() {
        return new asln(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aslf
    public final dbsb c() {
        dbsb c = super.c();
        c.b("routeIntervals", this.f);
        c.b("previousCameraParameters", this.g);
        return c;
    }
}
