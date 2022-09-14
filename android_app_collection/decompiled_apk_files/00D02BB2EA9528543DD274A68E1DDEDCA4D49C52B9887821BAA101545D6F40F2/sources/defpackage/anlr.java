package defpackage;

import java.util.HashMap;
/* renamed from: anlr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anlr implements dbrn {
    static final dbrn a = new anlr();

    private anlr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = new HashMap();
        for (dmki dmkiVar : (Iterable) obj) {
            dbsg e = dmkiVar.e();
            if (e.a() && ((anmq) e.b()).e()) {
                dmjy.b((anmq) e.b(), hashMap);
            }
            for (anmq anmqVar : dmkiVar.f()) {
                if (anmqVar.e()) {
                    dmjy.b(anmqVar, hashMap);
                }
            }
        }
        return new dmjy(dcdn.r(hashMap));
    }
}
