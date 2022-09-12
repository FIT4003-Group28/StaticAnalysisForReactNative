package defpackage;
/* compiled from: PG */
/* renamed from: cvxr  reason: default package */
/* loaded from: classes5.dex */
public final class cvxr<T> {
    public final cwjx<T> a;
    public final dtgb b;
    public final dtgb c;
    public final cwla d;
    public final cvxq<T> e;
    public final cvzg f;

    public cvxr(cvzg cvzgVar, cwjx cwjxVar, dtgb dtgbVar, cwla cwlaVar, cvxq cvxqVar) {
        this.f = cvzgVar;
        this.a = cwjxVar;
        dsqp dsqpVar = (dsqp) dtgbVar.cu(5);
        dsqpVar.bC(dtgbVar);
        dtga dtgaVar = (dtga) dsqpVar;
        if (dtgaVar.c) {
            dtgaVar.bF();
            dtgaVar.c = false;
        }
        dtgb dtgbVar2 = (dtgb) dtgaVar.b;
        dtgbVar2.b = 3;
        dtgbVar2.a |= 1;
        this.b = dtgaVar.bK();
        dsqp dsqpVar2 = (dsqp) dtgbVar.cu(5);
        dsqpVar2.bC(dtgbVar);
        dtga dtgaVar2 = (dtga) dsqpVar2;
        if (dtgaVar2.c) {
            dtgaVar2.bF();
            dtgaVar2.c = false;
        }
        dtgb dtgbVar3 = (dtgb) dtgaVar2.b;
        dtgbVar3.b = 4;
        dtgbVar3.a |= 1;
        this.c = dtgaVar2.bK();
        this.d = cwlaVar;
        this.e = cvxqVar;
    }
}
