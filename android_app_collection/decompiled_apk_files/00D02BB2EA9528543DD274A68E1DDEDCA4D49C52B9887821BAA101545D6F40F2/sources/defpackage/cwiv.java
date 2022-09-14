package defpackage;
/* compiled from: PG */
/* renamed from: cwiv  reason: default package */
/* loaded from: classes5.dex */
public final class cwiv<T> {
    private final cwjx<T> a;
    private final dtgb b;
    private final cvzg c;

    public cwiv(cwjx cwjxVar, dtgb dtgbVar, cvzg cvzgVar) {
        this.a = cwjxVar;
        this.b = dtgbVar;
        this.c = cvzgVar;
    }

    public final cwiv<T> a(dtgh dtghVar) {
        cwjx<T> cwjxVar = this.a;
        dtgb dtgbVar = this.b;
        dsqp dsqpVar = (dsqp) dtgbVar.cu(5);
        dsqpVar.bC(dtgbVar);
        dtga dtgaVar = (dtga) dsqpVar;
        if (dtgaVar.c) {
            dtgaVar.bF();
            dtgaVar.c = false;
        }
        dtgb dtgbVar2 = (dtgb) dtgaVar.b;
        dtgb dtgbVar3 = dtgb.g;
        dtgbVar2.c = dtghVar.u;
        dtgbVar2.a |= 2;
        return new cwiv<>(cwjxVar, dtgaVar.bK(), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        cwjx<T> cwjxVar = this.a;
        Object e = this.c.e();
        dtgb dtgbVar = this.b;
        dsqp dsqpVar = (dsqp) dtgbVar.cu(5);
        dsqpVar.bC(dtgbVar);
        dtga dtgaVar = (dtga) dsqpVar;
        if (dtgaVar.c) {
            dtgaVar.bF();
            dtgaVar.c = false;
        }
        dtgb dtgbVar2 = (dtgb) dtgaVar.b;
        dtgb dtgbVar3 = dtgb.g;
        dtgbVar2.b = i - 1;
        dtgbVar2.a |= 1;
        cwjxVar.a(e, dtgaVar.bK());
    }
}
