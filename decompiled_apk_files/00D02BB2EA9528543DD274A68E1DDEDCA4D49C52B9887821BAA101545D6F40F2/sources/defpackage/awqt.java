package defpackage;
/* compiled from: PG */
/* renamed from: awqt  reason: default package */
/* loaded from: classes3.dex */
final class awqt implements Runnable {
    final /* synthetic */ awqz a;

    public awqt(awqz awqzVar) {
        this.a = awqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        awtn f = this.a.h.f();
        this.a.g.c(f);
        if (f != null) {
            this.a.n(f);
        }
    }
}
