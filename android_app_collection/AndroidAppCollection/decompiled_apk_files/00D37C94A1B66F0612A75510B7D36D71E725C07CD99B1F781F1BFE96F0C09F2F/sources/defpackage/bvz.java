package defpackage;
/* compiled from: PG */
/* renamed from: bvz  reason: default package */
/* loaded from: classes2.dex */
public final class bvz implements Runnable {
    private final bwa a;
    private final String b;

    public bvz(bwa bwaVar, String str) {
        this.a = bwaVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (((bvz) this.a.b.remove(this.b)) == null) {
                bqf a = bqf.a();
                String.format("Timer with %s is already marked as complete.", this.b);
                a.d(new Throwable[0]);
            } else {
                bvy bvyVar = (bvy) this.a.c.remove(this.b);
                if (bvyVar != null) {
                    bvyVar.b(this.b);
                }
            }
        }
    }
}
