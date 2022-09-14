package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqce  reason: default package */
/* loaded from: classes2.dex */
public final class aqce implements degu<dbsg<ctyy>> {
    final /* synthetic */ aqcg a;

    public aqce(aqcg aqcgVar) {
        this.a = aqcgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.f = true;
        this.a.PI();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dbsg<ctyy> dbsgVar) {
        dbsg<ctyy> dbsgVar2 = dbsgVar;
        this.a.f = true;
        if (dbsgVar2 == null || !dbsgVar2.a()) {
            this.a.h();
            return;
        }
        this.a.i(dbsgVar2.b());
        cqkx.p(this.a);
    }
}
