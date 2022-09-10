package defpackage;
/* compiled from: PG */
/* renamed from: blya  reason: default package */
/* loaded from: classes3.dex */
final class blya implements Runnable {
    final /* synthetic */ blyb a;

    public blya(blyb blybVar) {
        this.a = blybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.q = true;
        this.a.a.r = null;
    }
}
