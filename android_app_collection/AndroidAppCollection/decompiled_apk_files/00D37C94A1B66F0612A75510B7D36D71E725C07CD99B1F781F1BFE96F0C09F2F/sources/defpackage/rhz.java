package defpackage;
/* compiled from: PG */
/* renamed from: rhz  reason: default package */
/* loaded from: classes4.dex */
public final class rhz extends rii {
    final /* synthetic */ rir a;
    final /* synthetic */ rhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhz(rir rirVar, rhi rhiVar) {
        super(rirVar);
        this.a = rirVar;
        this.b = rhiVar;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.a.f;
        qnm.b(rhgVar);
        rhgVar.getCurrentScreenName(this.b);
    }

    @Override // defpackage.rii
    protected final void b() {
        this.b.a(null);
    }
}
