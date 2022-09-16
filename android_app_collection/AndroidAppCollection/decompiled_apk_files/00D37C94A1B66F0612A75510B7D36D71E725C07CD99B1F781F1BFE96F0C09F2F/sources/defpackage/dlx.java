package defpackage;
/* compiled from: PG */
/* renamed from: dlx  reason: default package */
/* loaded from: classes3.dex */
public final class dlx extends cyp {
    public dlz a;
    cyv d;

    public static /* bridge */ /* synthetic */ void d(dlx dlxVar, cyv cyvVar, dlz dlzVar) {
        super.w(cyvVar, dlzVar);
        dlxVar.a = dlzVar;
        dlxVar.d = cyvVar;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (dlz) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final dlz a() {
        dlz dlzVar = this.a;
        int i = dlz.Q;
        String n = dlzVar.n();
        das dasVar = this.a.K;
        if (dasVar == null) {
            dasVar = dlz.an(this.d, n, 1008096338);
        }
        dlz dlzVar2 = this.a;
        dlzVar2.K = dasVar;
        das dasVar2 = dlzVar2.L;
        if (dasVar2 == null) {
            dasVar2 = dlz.an(this.d, n, -50354224);
        }
        dlz dlzVar3 = this.a;
        dlzVar3.L = dasVar2;
        das dasVar3 = dlzVar3.M;
        if (dasVar3 == null) {
            dasVar3 = dlz.an(this.d, n, -430503342);
        }
        dlz dlzVar4 = this.a;
        dlzVar4.M = dasVar3;
        das dasVar4 = dlzVar4.N;
        if (dasVar4 == null) {
            dasVar4 = dlz.an(this.d, n, 2092727750);
        }
        dlz dlzVar5 = this.a;
        dlzVar5.N = dasVar4;
        das dasVar5 = dlzVar5.O;
        if (dasVar5 == null) {
            dasVar5 = dlz.an(this.d, n, 663828400);
        }
        dlz dlzVar6 = this.a;
        dlzVar6.O = dasVar5;
        das dasVar6 = dlzVar6.P;
        if (dasVar6 == null) {
            dasVar6 = dlz.an(this.d, n, -537896591);
        }
        dlz dlzVar7 = this.a;
        dlzVar7.P = dasVar6;
        return dlzVar7;
    }

    public final void e(daq daqVar) {
        this.a.f178J = daqVar;
    }

    public final void f(int i) {
        this.a.c = i;
    }
}
