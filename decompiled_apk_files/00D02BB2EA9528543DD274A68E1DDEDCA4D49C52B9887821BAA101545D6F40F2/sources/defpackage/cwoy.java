package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cwoy  reason: default package */
/* loaded from: classes5.dex */
final class cwoy implements degu<Bitmap> {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ cwoz c;
    final /* synthetic */ int d;
    private final String e;
    private final String f;

    public cwoy(cwoz cwozVar, int i, boolean z, long j) {
        this.c = cwozVar;
        this.d = i;
        this.a = z;
        this.b = j;
        this.e = cwozVar.b.name();
        String str = i != 32 ? i != 48 ? i != 64 ? i != 120 ? "null" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
        if (i != 0) {
            this.f = str;
            return;
        }
        throw null;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        String a = cwik.a(th);
        cwoz cwozVar = this.c;
        cwozVar.a.d(this.e, this.f, a, cwozVar.c, this.a);
        this.c.a.f(System.currentTimeMillis() - this.b, this.e, this.f, a, this.c.c, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Bitmap bitmap) {
        String str = bitmap != null ? "OK" : "NULL";
        cwoz cwozVar = this.c;
        cwozVar.a.d(this.e, this.f, str, cwozVar.c, this.a);
        this.c.a.f(System.currentTimeMillis() - this.b, this.e, this.f, str, this.c.c, this.a);
    }
}
