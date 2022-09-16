package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ric  reason: default package */
/* loaded from: classes4.dex */
public final class ric extends rii {
    final /* synthetic */ String a = "Error with data collection. Data lost.";
    final /* synthetic */ Object b;
    final /* synthetic */ rir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ric(rir rirVar, Object obj) {
        super(rirVar, false);
        this.c = rirVar;
        this.b = obj;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.c.f;
        qnm.b(rhgVar);
        rhgVar.logHealthData(5, this.a, rac.a(this.b), rac.a(null), rac.a(null));
    }
}
