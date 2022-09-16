package defpackage;
/* compiled from: PG */
/* renamed from: rhv  reason: default package */
/* loaded from: classes4.dex */
public final class rhv extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ rir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhv(rir rirVar, String str) {
        super(rirVar);
        this.b = rirVar;
        this.a = str;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.f;
        qnm.b(rhgVar);
        rhgVar.endAdUnitExposure(this.a, this.g);
    }
}
