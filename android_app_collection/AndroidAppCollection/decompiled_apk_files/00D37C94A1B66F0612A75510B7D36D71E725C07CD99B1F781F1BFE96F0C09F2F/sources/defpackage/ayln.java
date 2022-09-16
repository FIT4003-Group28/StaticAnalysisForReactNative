package defpackage;
/* compiled from: PG */
/* renamed from: ayln  reason: default package */
/* loaded from: classes2.dex */
final class ayln implements Runnable {
    final /* synthetic */ aylr a;

    public ayln(aylr aylrVar, byte[] bArr) {
        this.a = aylrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayls aylsVar = this.a.a;
        this.a.a.b.t(aylsVar.b.p(aylsVar.a.d + 1, false));
    }
}
