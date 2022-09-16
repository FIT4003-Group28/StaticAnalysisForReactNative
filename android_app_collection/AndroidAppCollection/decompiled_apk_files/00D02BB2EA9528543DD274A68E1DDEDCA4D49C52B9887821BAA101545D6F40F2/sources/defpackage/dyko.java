package defpackage;
/* compiled from: PG */
/* renamed from: dyko  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyko implements dykr, dysn {
    private boolean B;
    public dymg o;
    public final Object p = new Object();
    public final dyvr q;
    public final dysq r;
    public int s;
    public boolean t;

    /* JADX INFO: Access modifiers changed from: protected */
    public dyko(int i, dyvi dyviVar, dyvr dyvrVar) {
        dbsk.t(dyviVar, "statsTraceCtx");
        this.q = dyvrVar;
        dysq dysqVar = new dysq(this, dyfg.a, i, dyviVar, dyvrVar);
        this.r = dysqVar;
        this.o = dysqVar;
    }

    private final void b() {
        boolean z;
        synchronized (this.p) {
            synchronized (this.p) {
                z = false;
                if (this.B && this.s < 32768 && !this.t) {
                    z = true;
                }
            }
        }
        if (z) {
            k().f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        dbsk.l(k() != null);
        synchronized (this.p) {
            dbsk.m(!this.B, "Already allocated");
            this.B = true;
        }
        b();
    }

    protected abstract dyvl k();

    @Override // defpackage.dysn
    public final void l(dyvk dyvkVar) {
        k().c(dyvkVar);
    }

    public final void m(int i) {
        boolean z;
        synchronized (this.p) {
            dbsk.m(this.B, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.s;
            int i3 = i2 - i;
            this.s = i3;
            z = false;
            if (i2 >= 32768 && i3 < 32768) {
                z = true;
            }
        }
        if (z) {
            b();
        }
    }
}
