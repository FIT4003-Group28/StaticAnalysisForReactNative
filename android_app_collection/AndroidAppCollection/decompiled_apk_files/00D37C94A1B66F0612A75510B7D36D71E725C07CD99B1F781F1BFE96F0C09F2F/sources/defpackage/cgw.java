package defpackage;
/* compiled from: PG */
/* renamed from: cgw  reason: default package */
/* loaded from: classes2.dex */
final class cgw implements Runnable {
    final /* synthetic */ ctg a;

    public cgw(ctg ctgVar) {
        this.a = ctgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
