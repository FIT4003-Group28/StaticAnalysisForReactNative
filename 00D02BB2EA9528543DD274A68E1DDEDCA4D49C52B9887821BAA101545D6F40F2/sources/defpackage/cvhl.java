package defpackage;
/* compiled from: PG */
/* renamed from: cvhl  reason: default package */
/* loaded from: classes5.dex */
final class cvhl implements Runnable {
    final /* synthetic */ cvhp a;

    public cvhl(cvhp cvhpVar) {
        this.a = cvhpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.j(dspv.a);
        } catch (Exception e) {
            int i = cvhq.b;
            this.a.a.k(e);
        }
    }
}
