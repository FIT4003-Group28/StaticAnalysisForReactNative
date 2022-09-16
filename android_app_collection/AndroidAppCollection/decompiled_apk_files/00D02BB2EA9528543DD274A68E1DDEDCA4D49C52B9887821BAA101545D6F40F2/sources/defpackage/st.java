package defpackage;
/* compiled from: PG */
/* renamed from: st  reason: default package */
/* loaded from: classes.dex */
final class st implements Runnable {
    final /* synthetic */ sw a;

    public st(sw swVar) {
        this.a = swVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(true);
        this.a.invalidateSelf();
    }
}
