package defpackage;
/* compiled from: PG */
/* renamed from: dsj  reason: default package */
/* loaded from: classes3.dex */
final class dsj implements rco {
    final /* synthetic */ rcd a;

    public dsj(rcd rcdVar) {
        this.a = rcdVar;
    }

    @Override // defpackage.rco
    public final void a(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.rco
    public final void b(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }
}
