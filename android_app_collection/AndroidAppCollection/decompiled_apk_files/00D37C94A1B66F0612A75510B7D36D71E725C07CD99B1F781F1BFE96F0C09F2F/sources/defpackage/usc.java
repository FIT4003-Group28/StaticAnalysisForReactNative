package defpackage;
/* compiled from: PG */
/* renamed from: usc  reason: default package */
/* loaded from: classes4.dex */
final class usc implements ankb {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ usd c;
    private final String d;

    public usc(usd usdVar, boolean z, long j) {
        this.c = usdVar;
        this.a = z;
        this.b = j;
        this.d = urq.b(usdVar.c);
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        String T = zgd.T(th);
        usd usdVar = this.c;
        usdVar.a.c(this.d, T, -1, usdVar.b, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, T, -1, this.c.b, this.a);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int min = Math.min(((amuk) obj).size(), 10);
        usd usdVar = this.c;
        usdVar.a.c(this.d, "OK", min, usdVar.b, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, "OK", min, this.c.b, this.a);
    }
}
