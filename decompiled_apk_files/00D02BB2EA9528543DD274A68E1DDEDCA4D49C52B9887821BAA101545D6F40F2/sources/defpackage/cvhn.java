package defpackage;
/* compiled from: PG */
/* renamed from: cvhn  reason: default package */
/* loaded from: classes5.dex */
final class cvhn implements Runnable {
    final /* synthetic */ cvhp a;

    public cvhn(cvhp cvhpVar) {
        this.a = cvhpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.cancel(true);
    }
}
