package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kqt  reason: default package */
/* loaded from: classes7.dex */
public final class kqt implements kcz<dcdc<bxmh>> {
    final /* synthetic */ krc a;

    public kqt(krc krcVar) {
        this.a = krcVar;
    }

    @Override // defpackage.kcz
    public final void a(@dzsi bttq bttqVar) {
        this.a.q.h(false);
        this.a.q.i(false);
        this.a.i.b(new ncw(), dcdc.f(new nug(R.string.CAR_UNABLE_TO_RETRIEVE_SUGGESTIONS)));
        cqkx.p(this.a.q);
    }

    @Override // defpackage.kcz
    public final void b() {
    }

    @Override // defpackage.kcz
    public final /* bridge */ /* synthetic */ void c(dcdc<bxmh> dcdcVar, int i) {
        ntc ntcVar;
        cqiw ndcVar;
        Object obj;
        this.a.q.h(i == 1);
        dcdc<bxmh> dcdcVar2 = dcdcVar;
        if (dcdcVar2.isEmpty()) {
            this.a.q.i(false);
            if (i == 3) {
                ntcVar = this.a.i;
                ndcVar = new ncw();
                obj = new nug(R.string.CAR_NO_SUGGESTIONS_FOUND);
            } else if (i == 2) {
                ntcVar = this.a.i;
                ndcVar = new ndc();
                obj = this.a.s;
            }
            ntcVar.b(ndcVar, dcdc.f(obj));
        } else {
            this.a.q.i(true);
            dccx F = dcdc.F();
            int i2 = 0;
            while (i2 < dcdcVar2.size()) {
                bxmh bxmhVar = dcdcVar2.get(i2);
                dwjj dwjjVar = bxmhVar.b;
                if (dwjjVar == null) {
                    dwjjVar = dwjj.k;
                }
                dxbp dxbpVar = dwjjVar.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                dvzj dvzjVar = dwjjVar.g;
                if (dvzjVar == null) {
                    dvzjVar = dvzj.y;
                }
                akqi f = akqi.f(dvzjVar.b);
                String str = dxbpVar.c;
                String str2 = dxbpVar.d;
                String l = this.a.q.l();
                String str3 = dxbpVar.b;
                dspd dspdVar = dwjjVar.d;
                krc krcVar = this.a;
                dndr dndrVar = krcVar.p;
                boolean z = dndrVar == null;
                ndx ndxVar = dndrVar != null ? krcVar.t : krcVar.u;
                ndy ndyVar = krcVar.v;
                boolean z2 = !z;
                dcdc<bxmh> dcdcVar3 = dcdcVar2;
                boolean z3 = i2 == dcdcVar2.size() + (-1);
                boolean h = this.a.b.h();
                String str4 = dxbpVar.p;
                dxbp dxbpVar2 = dwjjVar.b;
                if (dxbpVar2 == null) {
                    dxbpVar2 = dxbp.x;
                }
                int a = dxbi.a(dxbpVar2.f);
                boolean z4 = a != 0 && a == 3;
                bxmg b = bxmg.b(bxmhVar.e);
                if (b == null) {
                    b = bxmg.UNKNOWN;
                }
                int i3 = i2;
                F.g(new ndz(f, str, str2, l, str3, dspdVar, ndxVar, ndyVar, i3, z2, z3, h, str4, z4, b));
                i2 = i3 + 1;
                dcdcVar2 = dcdcVar3;
            }
            dcdc f2 = F.f();
            if (i == 2) {
                this.a.i.y(new ndt(), f2, new ndc(), this.a.s);
            } else {
                this.a.i.b(new ndt(), f2);
            }
            if (this.a.q.b().booleanValue()) {
                this.a.i.A(new krp(), new kqs());
            }
        }
        cqkx.p(this.a.q);
        cov k = this.a.k();
        k.b.g = false;
        k.a(0);
    }
}
