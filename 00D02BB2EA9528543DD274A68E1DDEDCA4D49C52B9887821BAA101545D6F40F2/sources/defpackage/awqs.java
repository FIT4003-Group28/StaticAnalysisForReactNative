package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awqs  reason: default package */
/* loaded from: classes3.dex */
public final class awqs implements Runnable {
    final /* synthetic */ awqz a;

    public awqs(awqz awqzVar) {
        this.a = awqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        awtn awtnVar;
        if (!this.a.w()) {
            return;
        }
        awqe p = this.a.p();
        if (p != null && (awtnVar = p.ar) != null) {
            p.g(awtnVar);
        }
        this.a.g.d();
        this.a.o();
    }
}
