package defpackage;
/* compiled from: PG */
/* renamed from: rib  reason: default package */
/* loaded from: classes4.dex */
public final class rib extends rii {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ rir d;
    final /* synthetic */ rhi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rib(rir rirVar, String str, String str2, boolean z, rhi rhiVar) {
        super(rirVar);
        this.d = rirVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = rhiVar;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.d.f;
        qnm.b(rhgVar);
        rhgVar.getUserProperties(this.a, this.b, this.c, this.e);
    }

    @Override // defpackage.rii
    protected final void b() {
        this.e.a(null);
    }
}
