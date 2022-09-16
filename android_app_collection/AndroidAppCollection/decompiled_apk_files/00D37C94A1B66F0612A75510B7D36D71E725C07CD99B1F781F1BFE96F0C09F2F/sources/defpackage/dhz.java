package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dhz  reason: default package */
/* loaded from: classes3.dex */
public final class dhz extends dhj {
    @dfs(a = 10)
    cyr k;

    private dhz() {
        super("SingleComponentSection");
    }

    public static dhy j(dhk dhkVar) {
        dhy dhyVar = new dhy();
        dhz dhzVar = new dhz();
        dde ddeVar = dhkVar.g;
        dhyVar.m = dhzVar;
        dhyVar.o.clear();
        return dhyVar;
    }

    @Override // defpackage.dhj
    public final /* bridge */ /* synthetic */ dhj a(boolean z) {
        dhz dhzVar = (dhz) super.a(z);
        cyr cyrVar = dhzVar.k;
        dhzVar.k = cyrVar != null ? cyrVar.j() : null;
        return dhzVar;
    }

    @Override // defpackage.dhj
    public final boolean d(dhj dhjVar) {
        if (this == dhjVar) {
            return true;
        }
        if (dhjVar == null || getClass() != dhjVar.getClass()) {
            return false;
        }
        dhz dhzVar = (dhz) dhjVar;
        cyr cyrVar = this.k;
        return cyrVar == null ? dhzVar.k == null : cyrVar.f(dhzVar.k);
    }

    @Override // defpackage.dhj, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return d((dhj) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhl
    public final void g(dhk dhkVar, dhd dhdVar, dhj dhjVar, dhj dhjVar2) {
        boolean z;
        dhz dhzVar = (dhz) dhjVar;
        dhz dhzVar2 = (dhz) dhjVar2;
        dad dadVar = new dad(dhzVar == null ? null : dhzVar.k, dhzVar2 == null ? null : dhzVar2.k);
        dad dadVar2 = new dad(null, null);
        dad dadVar3 = new dad(null, null);
        dad dadVar4 = new dad(null, null);
        dad dadVar5 = new dad(null, null);
        dad dadVar6 = new dad(null, null);
        Object obj = dadVar6.a;
        Object obj2 = dadVar6.b;
        cyr cyrVar = (cyr) dadVar.a;
        cyr cyrVar2 = (cyr) dadVar.b;
        if (cyrVar == null && cyrVar2 == null) {
            return;
        }
        if (cyrVar == null || cyrVar2 != null) {
            Object obj3 = dadVar2.b;
            boolean booleanValue = obj3 != null ? ((Boolean) obj3).booleanValue() : false;
            Object obj4 = dadVar3.b;
            int intValue = obj4 != null ? ((Integer) obj4).intValue() : 1;
            Object obj5 = dadVar4.b;
            boolean booleanValue2 = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
            if (cyrVar != null) {
                Object obj6 = dadVar2.a;
                boolean booleanValue3 = obj6 != null ? ((Boolean) obj6).booleanValue() : false;
                Object obj7 = dadVar3.a;
                int intValue2 = obj7 != null ? ((Integer) obj7).intValue() : 1;
                Object obj8 = dadVar4.a;
                boolean booleanValue4 = obj8 != null ? ((Boolean) obj8).booleanValue() : false;
                Map map = (Map) dadVar5.a;
                Map map2 = (Map) dadVar5.b;
                if (map != map2) {
                    if (map != null && map2 != null && map.size() == map2.size()) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!hz.u(entry.getValue(), map2.get(entry.getKey()))) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        if (booleanValue3 != booleanValue && intValue2 == intValue && booleanValue4 == booleanValue2 && cyrVar.f(cyrVar2) && z) {
                            return;
                        }
                        div p = dix.p();
                        dnt.h(p, (Map) dadVar5.b);
                        p.b = cyrVar2;
                        p.c(booleanValue);
                        p.d(intValue);
                        p.b(booleanValue2);
                        dhdVar.f(dhb.d(2, new dmh(p.e(), dhkVar.n(), null), obj, obj2));
                        return;
                    }
                }
                z = true;
                if (booleanValue3 != booleanValue) {
                }
                div p2 = dix.p();
                dnt.h(p2, (Map) dadVar5.b);
                p2.b = cyrVar2;
                p2.c(booleanValue);
                p2.d(intValue);
                p2.b(booleanValue2);
                dhdVar.f(dhb.d(2, new dmh(p2.e(), dhkVar.n(), null), obj, obj2));
                return;
            }
            div p3 = dix.p();
            dnt.h(p3, (Map) dadVar5.b);
            p3.b = cyrVar2;
            p3.c(booleanValue);
            p3.d(intValue);
            p3.b(booleanValue2);
            dix e = p3.e();
            aflw n = dhkVar.n();
            dhj dhjVar3 = dhdVar.b;
            if (dhjVar3 != null) {
                String str = dhjVar3.i;
                if (e.a == null) {
                    e.a = DesugarCollections.synchronizedMap(new HashMap());
                }
                e.a.put("section_global_key", str);
            }
            dhdVar.f(dhb.d(1, new dmh(e, n, null), null, obj2));
            return;
        }
        dhdVar.f(dhb.e(obj));
    }

    @Override // defpackage.dhl
    public final boolean h() {
        return true;
    }
}
