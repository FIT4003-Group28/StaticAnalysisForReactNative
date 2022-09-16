package defpackage;
/* compiled from: PG */
/* renamed from: snr  reason: default package */
/* loaded from: classes7.dex */
final class snr implements gul {
    final /* synthetic */ Runnable a;

    public snr(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.gul
    public final void a(boolean z) {
        if (z) {
            this.a.run();
        }
    }
}
