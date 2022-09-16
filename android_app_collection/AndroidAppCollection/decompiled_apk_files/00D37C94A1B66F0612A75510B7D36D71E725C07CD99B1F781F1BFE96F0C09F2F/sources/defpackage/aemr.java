package defpackage;
/* compiled from: PG */
/* renamed from: aemr  reason: default package */
/* loaded from: classes.dex */
public final class aemr {
    final /* synthetic */ aems a;
    private ajfx b = null;
    private long c = 0;

    public aemr(aems aemsVar) {
        this.a = aemsVar;
    }

    public final synchronized long a(String str) {
        ajfx ajfxVar = this.b;
        if (ajfxVar != null && ajfxVar.b.equals(str)) {
            aems aemsVar = this.a;
            aemg aemgVar = aemsVar.p;
            if (aemgVar.e) {
                return Math.max(aemgVar.g - (aemsVar.n.d() - this.c), 0L);
            }
        }
        return 0L;
    }

    public final synchronized ajfx b() {
        return this.b;
    }

    public final synchronized void c(ajfx ajfxVar) {
        this.b = ajfxVar;
        this.c = this.a.n.d();
    }

    public final synchronized void d() {
        this.b = null;
        this.c = 0L;
        notifyAll();
    }
}
