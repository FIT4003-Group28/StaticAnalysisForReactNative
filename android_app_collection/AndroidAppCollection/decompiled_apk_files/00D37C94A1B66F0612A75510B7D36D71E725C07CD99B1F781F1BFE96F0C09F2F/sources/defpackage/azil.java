package defpackage;
/* compiled from: PG */
/* renamed from: azil  reason: default package */
/* loaded from: classes2.dex */
final class azil implements Runnable {
    final /* synthetic */ azim a;
    private final azik b;

    public azil(azim azimVar, azik azikVar) {
        this.a = azimVar;
        this.b = azikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.az(this.b);
    }
}
