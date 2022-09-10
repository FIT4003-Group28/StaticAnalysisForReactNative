package defpackage;
/* compiled from: PG */
/* renamed from: cybk  reason: default package */
/* loaded from: classes5.dex */
final class cybk implements degu<czfm> {
    final /* synthetic */ cydw a;
    final /* synthetic */ cygo b;

    public cybk(cydw cydwVar, cygo cygoVar) {
        this.a = cydwVar;
        this.b = cygoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (String.valueOf(th.getMessage()).length() != 0) {
            return;
        }
        new String("Failed to get TopNPeopleCache: ");
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(czfm czfmVar) {
        czfm czfmVar2 = czfmVar;
        if (this.a.a()) {
            czfmVar2.h(this.b);
        } else {
            czfmVar2.g(this.b);
        }
    }
}
