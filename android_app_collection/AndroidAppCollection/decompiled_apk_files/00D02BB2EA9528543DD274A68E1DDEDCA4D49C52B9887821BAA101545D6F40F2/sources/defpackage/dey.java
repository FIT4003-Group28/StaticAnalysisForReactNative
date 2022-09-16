package defpackage;
/* compiled from: PG */
/* renamed from: dey  reason: default package */
/* loaded from: classes6.dex */
final class dey implements degu<Boolean> {
    final /* synthetic */ czh a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ czi d;
    final /* synthetic */ dstv e;
    final /* synthetic */ dfa f;

    public dey(dfa dfaVar, czh czhVar, boolean z, String str, czi cziVar, dstv dstvVar) {
        this.f = dfaVar;
        this.a = czhVar;
        this.b = z;
        this.c = str;
        this.d = cziVar;
        this.e = dstvVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f.c(this.a, this.b, this.c);
        deha.q(this.d.b(this.e), new dex(), this.f.a);
    }
}
