package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyvd  reason: default package */
/* loaded from: classes6.dex */
public final class dyvd implements Runnable {
    final /* synthetic */ dyve a;
    final /* synthetic */ dyvf b;
    final /* synthetic */ Object c;
    final /* synthetic */ dyvg d;

    public dyvd(dyvg dyvgVar, dyve dyveVar, dyvf dyvfVar, Object obj) {
        this.d = dyvgVar;
        this.a = dyveVar;
        this.b = dyvfVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                this.b.a(this.c);
                this.d.a.remove(this.b);
                if (this.d.a.isEmpty()) {
                    this.d.b.shutdown();
                    this.d.b = null;
                }
            }
        }
    }
}
