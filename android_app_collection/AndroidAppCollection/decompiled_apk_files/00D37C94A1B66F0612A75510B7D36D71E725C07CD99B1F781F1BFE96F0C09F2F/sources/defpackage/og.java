package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: og  reason: default package */
/* loaded from: classes3.dex */
public final class og implements Runnable {
    final /* synthetic */ ot a;
    private final /* synthetic */ int b;

    public og(ot otVar) {
        this.a = otVar;
    }

    public og(ot otVar, int i) {
        this.b = i;
        this.a = otVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            ot otVar = this.a;
            if ((otVar.A & 1) != 0) {
                otVar.M(0);
            }
            ot otVar2 = this.a;
            if ((otVar2.A & 4096) != 0) {
                otVar2.M(108);
            }
            ot otVar3 = this.a;
            otVar3.z = false;
            otVar3.A = 0;
            return;
        }
        ot otVar4 = this.a;
        otVar4.l.showAtLocation(otVar4.k, 55, 0, 0);
        this.a.N();
        if (this.a.S()) {
            this.a.k.setAlpha(0.0f);
            ot otVar5 = this.a;
            ln q = lj.q(otVar5.k);
            q.c(1.0f);
            otVar5.n = q;
            this.a.n.f(new of(this));
            return;
        }
        this.a.k.setAlpha(1.0f);
        this.a.k.setVisibility(0);
    }
}
