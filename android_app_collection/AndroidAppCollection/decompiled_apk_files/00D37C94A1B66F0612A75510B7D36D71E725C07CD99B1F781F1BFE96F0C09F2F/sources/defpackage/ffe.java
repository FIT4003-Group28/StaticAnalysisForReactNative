package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffe  reason: default package */
/* loaded from: classes3.dex */
public final class ffe implements Runnable {
    final /* synthetic */ fff a;

    public ffe(fff fffVar) {
        this.a = fffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fff fffVar = this.a;
        fffVar.f.removeCallbacks(fffVar.e);
        if (this.a.b() == 0.0f) {
            this.a.g();
            return;
        }
        this.a.c();
        this.a.f.postInvalidate();
    }
}
