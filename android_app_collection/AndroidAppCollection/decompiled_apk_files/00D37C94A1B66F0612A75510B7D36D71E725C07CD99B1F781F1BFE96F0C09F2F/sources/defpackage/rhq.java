package defpackage;
/* compiled from: PG */
/* renamed from: rhq  reason: default package */
/* loaded from: classes4.dex */
public final class rhq extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ rir c;
    final /* synthetic */ rhi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhq(rir rirVar, String str, String str2, rhi rhiVar) {
        super(rirVar);
        this.c = rirVar;
        this.a = str;
        this.b = str2;
        this.d = rhiVar;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.c.f;
        qnm.b(rhgVar);
        rhgVar.getConditionalUserProperties(this.a, this.b, this.d);
    }

    @Override // defpackage.rii
    protected final void b() {
        this.d.a(null);
    }
}
