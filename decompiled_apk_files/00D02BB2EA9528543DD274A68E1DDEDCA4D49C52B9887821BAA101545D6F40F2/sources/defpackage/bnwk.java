package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnwk  reason: default package */
/* loaded from: classes3.dex */
public final class bnwk implements Runnable {
    final /* synthetic */ bnwd a;
    final /* synthetic */ bnwl b;

    public bnwk(bnwl bnwlVar, bnwd bnwdVar) {
        this.b = bnwlVar;
        this.a = bnwdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bnwl bnwlVar = this.b;
            bnwlVar.a.a(bnwlVar);
            synchronized (this.b) {
                this.b.b = true;
                this.b.notifyAll();
            }
        } finally {
            this.a.h(this.b);
        }
    }
}
