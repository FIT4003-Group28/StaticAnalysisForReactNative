package defpackage;
/* compiled from: PG */
/* renamed from: rie  reason: default package */
/* loaded from: classes4.dex */
public final class rie extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ rir b;
    final /* synthetic */ rhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rie(rir rirVar, String str, rhi rhiVar) {
        super(rirVar);
        this.b = rirVar;
        this.a = str;
        this.c = rhiVar;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.f;
        qnm.b(rhgVar);
        rhgVar.getMaxUserProperties(this.a, this.c);
    }

    @Override // defpackage.rii
    protected final void b() {
        this.c.a(null);
    }
}
