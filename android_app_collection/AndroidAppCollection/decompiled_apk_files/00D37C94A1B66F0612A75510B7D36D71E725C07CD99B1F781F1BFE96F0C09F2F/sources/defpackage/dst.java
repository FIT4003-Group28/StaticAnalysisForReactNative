package defpackage;
/* compiled from: PG */
/* renamed from: dst  reason: default package */
/* loaded from: classes3.dex */
final class dst implements rco {
    final /* synthetic */ dsu a;

    public dst(dsu dsuVar) {
        this.a = dsuVar;
    }

    @Override // defpackage.rco
    public final void a(int i, long j) {
        this.a.b.d(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.rco
    public final void b(int i, long j, String str) {
        this.a.b.e(i, System.currentTimeMillis() - j, str);
    }
}
