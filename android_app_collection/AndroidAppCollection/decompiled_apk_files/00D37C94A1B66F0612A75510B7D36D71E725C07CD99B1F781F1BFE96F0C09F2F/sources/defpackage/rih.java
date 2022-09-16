package defpackage;
/* compiled from: PG */
/* renamed from: rih  reason: default package */
/* loaded from: classes4.dex */
public final class rih extends rii {
    final /* synthetic */ String a = "fcm";
    final /* synthetic */ String b = "_ln";
    final /* synthetic */ Object c;
    final /* synthetic */ rir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rih(rir rirVar, Object obj) {
        super(rirVar);
        this.d = rirVar;
        this.c = obj;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.d.f;
        qnm.b(rhgVar);
        rhgVar.setUserProperty(this.a, this.b, rac.a(this.c), true, this.f);
    }
}
