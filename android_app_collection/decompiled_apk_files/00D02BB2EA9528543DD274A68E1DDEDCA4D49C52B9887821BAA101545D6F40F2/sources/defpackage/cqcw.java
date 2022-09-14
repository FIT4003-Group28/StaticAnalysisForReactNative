package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqcw  reason: default package */
/* loaded from: classes5.dex */
public final class cqcw implements degu<dslz> {
    final /* synthetic */ cqda a;

    public cqcw(cqda cqdaVar) {
        this.a = cqdaVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcdn<dskf, dsnt> dcdnVar = cqda.a;
        th.getMessage();
        dbsk.t(this.a.e, "Invalid state of the GRPC channel for FPOP");
        this.a.e.f();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dslz dslzVar) {
        dcdn<dskf, dsnt> dcdnVar = cqda.a;
        dbsk.t(this.a.e, "Invalid state of the GRPC channel for FPOP");
        this.a.e.f();
    }
}
