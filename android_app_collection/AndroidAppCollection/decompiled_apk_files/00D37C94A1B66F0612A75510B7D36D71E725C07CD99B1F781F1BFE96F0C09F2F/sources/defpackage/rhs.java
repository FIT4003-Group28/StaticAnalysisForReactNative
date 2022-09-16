package defpackage;
/* compiled from: PG */
/* renamed from: rhs  reason: default package */
/* loaded from: classes4.dex */
public final class rhs extends rii {
    final /* synthetic */ Boolean a;
    final /* synthetic */ rir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhs(rir rirVar, Boolean bool) {
        super(rirVar);
        this.b = rirVar;
        this.a = bool;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.f;
        qnm.b(rhgVar);
        rhgVar.setMeasurementEnabled(this.a.booleanValue(), this.f);
    }
}
