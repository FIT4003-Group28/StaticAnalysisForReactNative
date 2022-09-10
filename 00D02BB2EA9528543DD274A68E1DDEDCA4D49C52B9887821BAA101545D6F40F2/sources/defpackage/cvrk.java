package defpackage;
/* compiled from: PG */
/* renamed from: cvrk  reason: default package */
/* loaded from: classes5.dex */
final class cvrk extends cvrm {
    final /* synthetic */ cvrl a;
    final /* synthetic */ dbty b;

    public cvrk(cvrl cvrlVar, dbty dbtyVar) {
        this.a = cvrlVar;
        this.b = dbtyVar;
    }

    @Override // defpackage.cvrm
    protected final dsfk c(dsfz dsfzVar) {
        return this.a.a(dsfzVar);
    }

    @Override // defpackage.cvrm
    protected final dbsg<Float> d() {
        return (dbsg) this.b.a();
    }
}
