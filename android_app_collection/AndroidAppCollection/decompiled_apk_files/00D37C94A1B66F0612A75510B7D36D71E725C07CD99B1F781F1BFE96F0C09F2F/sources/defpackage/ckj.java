package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckj  reason: default package */
/* loaded from: classes2.dex */
public final class ckj implements Runnable {
    final /* synthetic */ ckm a;
    private final ctn b;
    private final /* synthetic */ int c;

    public ckj(ckm ckmVar, ctn ctnVar) {
        this.a = ckmVar;
        this.b = ctnVar;
    }

    public ckj(ckm ckmVar, ctn ctnVar, int i) {
        this.c = i;
        this.a = ckmVar;
        this.b = ctnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            synchronized (this.b.a()) {
                synchronized (this.a) {
                    if (this.a.a.d(this.b)) {
                        this.a.i.d();
                        ckm ckmVar = this.a;
                        this.b.e(ckmVar.i, ckmVar.k);
                        this.a.f(this.b);
                    }
                    this.a.c();
                }
            }
            return;
        }
        synchronized (this.b.a()) {
            synchronized (this.a) {
                if (this.a.a.d(this.b)) {
                    ckm ckmVar2 = this.a;
                    this.b.d(ckmVar2.g);
                }
                this.a.c();
            }
        }
    }
}
