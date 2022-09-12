package defpackage;
/* compiled from: PG */
/* renamed from: dani  reason: default package */
/* loaded from: classes5.dex */
final class dani<ResultT> extends danb<ResultT> {
    public final Object a = new Object();
    public final dand<ResultT> b = new dand<>();
    public boolean c;
    public ResultT d;
    public Exception e;

    private final void e() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            this.b.b(this);
        }
    }

    @Override // defpackage.danb
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.danb
    public final void b(btcv btcvVar) {
        this.b.a(new damz(danh.a, btcvVar));
        e();
    }

    @Override // defpackage.danb
    public final void c(btcu btcuVar) {
        this.b.a(new damx(danh.a, btcuVar));
        e();
    }

    public final void d() {
        dano.a(!this.c, "Task is already complete");
    }
}
