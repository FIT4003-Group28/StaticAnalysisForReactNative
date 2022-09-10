package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abtj  reason: default package */
/* loaded from: classes2.dex */
public class abtj implements abqn {
    private final List<abql> a = new ArrayList();
    private final cjtd b;

    public abtj(dxio<acyr> dxioVar, abfc abfcVar, abuf abufVar, abvr abvrVar, abfa abfaVar, List<dqfq> list, ddho ddhoVar, @dzsi dxio<aeaa> dxioVar2, @dzsi acwt acwtVar, abse abseVar) {
        int size;
        absg b = absg.b(abseVar.b);
        ddho ddhoVar2 = (b == null ? absg.UNKNOWN_EXPLORE_SURFACE : b) == absg.AREA_EXPLORE ? dtxj.cT : dtxo.cM;
        absg b2 = absg.b(abseVar.b);
        ddho ddhoVar3 = (b2 == null ? absg.UNKNOWN_EXPLORE_SURFACE : b2) == absg.AREA_EXPLORE ? dtxj.cm : dtxq.c;
        if (!list.isEmpty()) {
            dsrj<dqfo> dsrjVar = list.get(0).f;
            int i = true != abfaVar.m() ? 3 : 7;
            if (abfcVar.b()) {
                size = Math.min(dsrjVar.size(), i);
            } else {
                size = dsrjVar.size();
            }
            int i2 = size;
            dkua dkuaVar = dxioVar.a().a().af;
            dxio<aeaa> dxioVar3 = true != (dkuaVar == null ? dkua.b : dkuaVar).a ? null : dxioVar2;
            for (int i3 = 0; i3 < i2; i3++) {
                this.a.add(abvrVar.a(dsrjVar.get(i3), ddhoVar2, dxioVar3, acwtVar, abseVar));
            }
        }
        if (!list.isEmpty()) {
            List<abql> list2 = this.a;
            Activity activity = (Activity) ((dxjd) abufVar.a).a;
            abuf.a(activity, 1);
            abuf.a(((dxjh) abufVar.b).a(), 2);
            dxio a = ((dxjh) abufVar.c).a();
            abuf.a(a, 3);
            abuf.a(ddhoVar3, 4);
            abuf.a(abseVar, 6);
            list2.add(new abue(activity, a, ddhoVar3, acwtVar, abseVar));
        }
        this.b = cjtd.a(ddhoVar);
    }

    @Override // defpackage.izf
    public List<abql> Pd() {
        return this.a;
    }

    @Override // defpackage.abqn
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.abqn
    public cjtd c() {
        return this.b;
    }
}
