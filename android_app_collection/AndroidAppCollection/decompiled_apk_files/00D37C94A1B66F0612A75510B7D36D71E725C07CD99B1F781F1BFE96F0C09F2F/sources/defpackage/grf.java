package defpackage;
/* compiled from: PG */
/* renamed from: grf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class grf implements Runnable {
    public final /* synthetic */ grk a;
    private final /* synthetic */ int b;

    public /* synthetic */ grf(grk grkVar, int i) {
        this.b = i;
        this.a = grkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (this.b == 0) {
            gri d = this.a.d();
            d.e();
            d.g(true);
            d.d();
            return;
        }
        grk grkVar = this.a;
        if (grkVar.u >= 1.0f) {
            i = grkVar.x;
            grkVar.x = i + 10;
        } else if (grkVar.t > 0.0f) {
            grkVar.x = grkVar.A;
            return;
        } else {
            int i2 = grkVar.x;
            grkVar.x = i2 + 10;
            i = -i2;
        }
        grv grvVar = grkVar.q;
        if (grvVar != null) {
            grvVar.ak(i, 0, grkVar.C);
        }
        if (!grkVar.y) {
            return;
        }
        grkVar.i.removeCallbacks(grkVar.B);
        grkVar.i.postDelayed(grkVar.B, 100L);
    }
}
