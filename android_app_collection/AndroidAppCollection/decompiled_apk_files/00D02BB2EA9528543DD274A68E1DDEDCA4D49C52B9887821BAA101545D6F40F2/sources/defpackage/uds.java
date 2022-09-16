package defpackage;
/* compiled from: PG */
/* renamed from: uds  reason: default package */
/* loaded from: classes7.dex */
final class uds implements degu<Boolean> {
    final /* synthetic */ udv a;

    public uds(udv udvVar) {
        this.a = udvVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.j = null;
        this.a.e();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (!bool.booleanValue()) {
            this.a.e();
        } else {
            udv udvVar = this.a;
            udvVar.h = udvVar.b.b();
        }
        this.a.j = null;
    }
}
