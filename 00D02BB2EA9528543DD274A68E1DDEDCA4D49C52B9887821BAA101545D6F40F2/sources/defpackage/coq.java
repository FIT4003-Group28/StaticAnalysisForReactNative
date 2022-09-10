package defpackage;
/* compiled from: PG */
/* renamed from: coq  reason: default package */
/* loaded from: classes5.dex */
final class coq implements Runnable {
    final /* synthetic */ cov a;

    public coq(cov covVar) {
        this.a = covVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPressed = this.a.d.a.isPressed();
        boolean isPressed2 = this.a.d.b.isPressed();
        if (isPressed) {
            if (isPressed2) {
                return;
            }
            isPressed2 = false;
        }
        if (isPressed) {
            this.a.a.a();
        } else if (!isPressed2) {
        } else {
            this.a.a.av();
        }
    }
}
