package defpackage;
/* compiled from: PG */
/* renamed from: bwtg  reason: default package */
/* loaded from: classes4.dex */
final class bwtg implements dfqt {
    final /* synthetic */ bwtr a;

    public bwtg(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // defpackage.dfqt
    public final void a() {
        this.a.ai.b(new bwtc(this), bvrj.UI_THREAD);
    }

    @Override // defpackage.dfqt
    public final void b(dfuj<?> dfujVar, float f) {
        bxdn bxdnVar = this.a.e;
        if (bxdnVar != null) {
            cqkx.p(bxdnVar);
        }
    }

    @Override // defpackage.dfqt
    public final void c(int i, dhjz dhjzVar) {
        bwty bwtyVar = this.a.aB;
        if (bwtyVar != null) {
            bwtyVar.a(akqq.j(dhjzVar), false);
        }
        bxdn bxdnVar = this.a.e;
        if (bxdnVar != null) {
            bxdnVar.V(dhjzVar);
        }
    }
}
