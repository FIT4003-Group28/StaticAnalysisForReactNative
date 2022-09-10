package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjee  reason: default package */
/* loaded from: classes3.dex */
public final class bjee extends bjfi<bjel> {
    public gfq a;
    private cjtd ai;
    public bjep b;
    public bjgu c;
    private dcdc<dqcq> d;
    private List<dqcq> e;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bjef) btsx.b(bjef.class, this)).cQ(this);
    }

    @Override // defpackage.bjfi
    protected final cqiw<bjel> g() {
        dbsk.s(this.c);
        return new bjeh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bjfi
    public final /* bridge */ /* synthetic */ bjel i() {
        bjep bjepVar = this.b;
        dbsk.s(bjepVar);
        cjtd cjtdVar = this.ai;
        dbsk.s(cjtdVar);
        dcdc<dqcq> dcdcVar = this.d;
        dbsk.s(dcdcVar);
        List<dqcq> list = this.e;
        dbsk.s(list);
        bjec bjecVar = new bjec(this);
        cqhn a = bjepVar.a.a();
        bjep.a(a, 1);
        bkar a2 = bjepVar.b.a();
        bjep.a(a2, 2);
        bjek a3 = bjepVar.c.a();
        bjep.a(a3, 3);
        bjep.a(cjtdVar, 4);
        bjep.a(dcdcVar, 5);
        bjep.a(list, 6);
        bjep.a(bjecVar, 7);
        return new bjeo(a, a2, a3, cjtdVar, dcdcVar, list, bjecVar);
    }

    @Override // defpackage.bjfi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dcdc<dqcq> e;
        Bundle bundle2 = this.o;
        dbsk.s(bundle2);
        djai djaiVar = (djai) bvrs.e(bundle2, djai.class, (dssr) djai.g.cu(7));
        djao djaoVar = (djao) bvrs.e(bundle2, djao.class, (dssr) djao.i.cu(7));
        if (djaiVar != null) {
            e = dcdc.r(djaiVar.e);
        } else {
            e = dcdc.e();
        }
        this.d = e;
        this.e = djaoVar != null ? djaoVar.h : dcdc.e();
        this.ai = (cjtd) bundle2.getSerializable("placemarkLoggingParamsWithFprint");
        super.l(bundle);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxl.T;
    }
}
