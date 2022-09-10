package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ashv  reason: default package */
/* loaded from: classes2.dex */
public final class ashv implements degu<Boolean> {
    final /* synthetic */ ashy a;

    public ashv(ashy ashyVar) {
        this.a = ashyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        th.getMessage();
        this.a.l();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        this.a.b.e();
        ashy ashyVar = this.a;
        if (ashyVar.e != null && ashyVar.b.e()) {
            if (!bool2.booleanValue()) {
                this.a.l();
                return;
            }
            ashy ashyVar2 = this.a;
            ashyVar2.b.f(null);
            ashyVar2.n(false);
            if (!ashyVar2.d.a().getAssistantParameters().e) {
                return;
            }
            ashyVar2.a.getWindow().getDecorView().setSystemUiVisibility(ashyVar2.a.getWindow().getDecorView().getSystemUiVisibility() | 2);
        }
    }
}
