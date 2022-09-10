package defpackage;
/* compiled from: PG */
/* renamed from: asli  reason: default package */
/* loaded from: classes2.dex */
public final class asli extends aslf {
    public static final dcqe e = dcqe.c("asli");
    public final akra f;
    public final aslf g;

    /* JADX INFO: Access modifiers changed from: protected */
    public asli(aslh<?> aslhVar) {
        super(aslhVar);
        akra akraVar = aslhVar.f;
        dbsk.s(akraVar);
        this.f = akraVar;
        aslf aslfVar = aslhVar.e;
        dbsk.s(aslfVar);
        this.g = aslfVar;
    }

    @Override // defpackage.aslf
    public final /* bridge */ /* synthetic */ asle b() {
        return new aslh(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aslf
    public final dbsb c() {
        dbsb c = super.c();
        c.b("target", this.f);
        c.b("previousCameraParameters", this.g);
        return c;
    }
}
