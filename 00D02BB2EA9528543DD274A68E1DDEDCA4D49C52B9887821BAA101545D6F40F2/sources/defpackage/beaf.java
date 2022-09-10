package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: beaf  reason: default package */
/* loaded from: classes3.dex */
class beaf implements bdzu {
    final /* synthetic */ dxio a;
    final /* synthetic */ Context b;
    final /* synthetic */ cjtd c;
    final /* synthetic */ beaq d;

    public beaf(beaq beaqVar, dxio dxioVar, Context context, cjtd cjtdVar) {
        this.d = beaqVar;
        this.a = dxioVar;
        this.b = context;
        this.c = cjtdVar;
    }

    @Override // defpackage.bdzu
    public String a() {
        dnxh dnxhVar = this.d.a.a;
        if (dnxhVar == null) {
            dnxhVar = dnxh.c;
        }
        return dnxhVar.a;
    }

    @Override // defpackage.bdzu
    public jic b() {
        dnxh dnxhVar = this.d.a.a;
        if (dnxhVar == null) {
            dnxhVar = dnxh.c;
        }
        dnwr dnwrVar = dnxhVar.b;
        if (dnwrVar == null) {
            dnwrVar = dnwr.c;
        }
        return new jic(dnwrVar.b, ckqc.FIFE, 0, 250);
    }

    @Override // defpackage.bdzu
    public cqkl c() {
        afha afhaVar = (afha) this.a.a();
        Context context = this.b;
        dqdk dqdkVar = this.d.a.b;
        if (dqdkVar == null) {
            dqdkVar = dqdk.e;
        }
        dqmk dqmkVar = dqdkVar.c;
        if (dqmkVar == null) {
            dqmkVar = dqmk.c;
        }
        afhaVar.k(context, dqmkVar.a, 1);
        return cqkl.a;
    }

    @Override // defpackage.bdzu
    @dzsi
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.bdzu
    public Boolean e() {
        return Boolean.valueOf(this.d.a());
    }
}
