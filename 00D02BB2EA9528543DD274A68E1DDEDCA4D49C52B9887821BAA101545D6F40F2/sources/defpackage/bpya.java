package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpya  reason: default package */
/* loaded from: classes4.dex */
final class bpya implements bpyc {
    private final bvrt<dnqe> a;
    @dzsi
    private final akqq b;
    private final int c;

    public bpya(dnqe dnqeVar, @dzsi akqq akqqVar, int i) {
        this.a = bvrt.b(dnqeVar);
        this.b = akqqVar;
        this.c = i;
    }

    @Override // defpackage.afds
    public final void Pn(gga ggaVar, boolean z) {
        bpyb.a(this, ggaVar, z);
    }

    @Override // defpackage.akee
    public final void a(gga ggaVar, boolean z) {
        if (z) {
            dnqe dnqeVar = (dnqe) bvrt.f(this.a, (dssr) dnqe.i.cu(7), dnqe.i);
            dbsk.s(dnqeVar);
            if (this.c - 1 != 1) {
                akqq akqqVar = this.b;
                Bundle bundle = new Bundle();
                bqhq bZ = bqhr.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqhr bqhrVar = (bqhr) bZ.b;
                bqhrVar.a = 1 | bqhrVar.a;
                bqhrVar.b = 0;
                bqam.g(bundle, new bqgw(bZ.bK(), dnqeVar), akqqVar);
                bqam bqamVar = new bqam();
                bvrs.k(bundle, "CLIENT_STATE_PROTO_KEY", dnqeVar);
                bqamVar.B(bundle);
                ggaVar.D(bqamVar);
                return;
            }
            akqq akqqVar2 = this.b;
            Bundle bundle2 = new Bundle();
            bqhq bZ2 = bqhr.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bqhr bqhrVar2 = (bqhr) bZ2.b;
            bqhrVar2.a = 1 | bqhrVar2.a;
            bqhrVar2.b = 0;
            bpyx.g(bundle2, new bqgw(bZ2.bK(), dnqeVar), akqqVar2);
            bpyx bpyxVar = new bpyx();
            bpyxVar.B(bundle2);
            ggaVar.D(bpyxVar);
        }
    }
}
