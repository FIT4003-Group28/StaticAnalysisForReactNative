package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpyz  reason: default package */
/* loaded from: classes4.dex */
public final class bpyz implements Runnable {
    private final dcdc<akta> a;
    private final akzh b;
    private final akpq c;
    private float d = 2.0f;

    public bpyz(dcdc<akta> dcdcVar, akzh akzhVar, akpq akpqVar) {
        this.a = dcdcVar;
        this.b = akzhVar;
        this.c = akpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float j = ammd.j(this.b.p().k, true);
        if (Math.abs(j - this.d) > 1.0E-6f) {
            dcdc<akta> dcdcVar = this.a;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                akta aktaVar = dcdcVar.get(i);
                aksz d = aktaVar.d();
                d.c(j / 2.0f, aksy.PIXEL);
                aktaVar.c(d);
            }
            this.d = j;
        }
        this.c.b(this);
    }
}
