package defpackage;
/* compiled from: PG */
/* renamed from: jtb  reason: default package */
/* loaded from: classes7.dex */
final class jtb implements kqm {
    final /* synthetic */ jtc a;

    public jtb(jtc jtcVar) {
        this.a = jtcVar;
    }

    @Override // defpackage.kqm
    public final void a() {
        bvrj.UI_THREAD.c();
        kwy kwyVar = (kwy) this.a.N;
        alaf a = alai.a();
        a.f = alah.LOCATION_ONLY;
        a.b = 15.0f;
        a.c = 0.0f;
        a.d = 0.0f;
        a.e = kwyVar.j().m();
        kwyVar.z.a().j(a.a(), false);
    }
}
