package defpackage;
/* compiled from: PG */
/* renamed from: crnf  reason: default package */
/* loaded from: classes5.dex */
final class crnf<T> {
    private final dcdc<T> a;
    private final bvrb b;

    public crnf(dcdc<T> dcdcVar, bvrb bvrbVar) {
        this.a = dcdcVar;
        this.b = bvrbVar;
    }

    public final void a(bvqg<T> bvqgVar, String str, int i) {
        crne crneVar = new crne(this.a, bvqgVar);
        for (int i2 = 0; i2 < i; i2++) {
            this.b.b(crneVar, bvrj.BACKGROUND_THREADPOOL);
        }
        crneVar.run();
        deix.a(crneVar.a);
        Exception exc = crneVar.b.a.get();
        if (exc == null) {
            return;
        }
        throw new RuntimeException(exc);
    }
}
