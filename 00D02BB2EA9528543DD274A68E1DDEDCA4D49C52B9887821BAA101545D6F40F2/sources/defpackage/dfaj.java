package defpackage;
/* compiled from: PG */
/* renamed from: dfaj  reason: default package */
/* loaded from: classes6.dex */
final class dfaj implements degu<dyex> {
    final /* synthetic */ dyew a;
    final /* synthetic */ dfak b;

    public dfaj(dfak dfakVar, dyew dyewVar) {
        this.b = dfakVar;
        this.a = dyewVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.d = true;
        this.a.b(dyjb.c(th), new dyhw());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dyex dyexVar) {
        dyex dyexVar2 = dyexVar;
        try {
            dfak dfakVar = this.b;
            dfakVar.b = dyexVar2;
            for (Runnable runnable : dfakVar.a) {
                runnable.run();
            }
        } catch (Throwable th) {
            a(th);
        }
    }
}
