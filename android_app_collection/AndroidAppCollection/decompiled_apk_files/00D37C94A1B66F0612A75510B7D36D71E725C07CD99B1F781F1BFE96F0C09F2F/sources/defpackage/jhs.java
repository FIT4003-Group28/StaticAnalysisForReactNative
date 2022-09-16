package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: jhs  reason: default package */
/* loaded from: classes3.dex */
public final class jhs implements agry {
    private final aahf a;

    public jhs(aahf aahfVar) {
        this.a = aahfVar;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        return anlz.q(amuk.q());
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        agru agruVar;
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        if (aq - 1 == 2) {
            String str = atrfVar.d;
            aahe c = this.a.c();
            asyq asyqVar = (asyq) c.f(str).g(asyq.class).W();
            if (asyqVar == null) {
                agruVar = agru.a;
            } else {
                aahy c2 = ((aaik) c).c();
                aaji.b(c2, asyqVar);
                asyv asyvVar = (asyv) c.f(emn.d()).g(asyv.class).W();
                Iterator it = asyvVar.getItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    asyw asywVar = (asyw) it.next();
                    if ((asywVar.b == 1 ? (String) asywVar.c : "").equals(str)) {
                        asyt e = asyvVar.e();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(asywVar));
                        List<asyw> unmodifiableList = Collections.unmodifiableList(((asyx) e.a.instance).e);
                        aopa aopaVar = e.a;
                        aopaVar.copyOnWrite();
                        ((asyx) aopaVar.instance).e = asyx.emptyProtobufList();
                        for (asyw asywVar2 : unmodifiableList) {
                            if (!linkedHashSet.contains(asywVar2)) {
                                aopa aopaVar2 = e.a;
                                aopaVar2.copyOnWrite();
                                asyx asyxVar = (asyx) aopaVar2.instance;
                                asywVar2.getClass();
                                aopu aopuVar = asyxVar.e;
                                if (!aopuVar.c()) {
                                    asyxVar.e = aopi.mutableCopy(aopuVar);
                                }
                                asyxVar.e.add(asywVar2);
                            }
                        }
                        c2.j(e);
                    }
                }
                jjd.m(c2, "Error updating when delete a MainRecommendedDownloadVideoEntity.");
                agruVar = agru.a;
            }
            return anlz.q(agruVar);
        }
        Object[] objArr = new Object[2];
        int aq2 = akel.aq(atrfVar.c);
        if (aq2 == 0) {
            aq2 = 1;
        }
        objArr[0] = Integer.valueOf(aq2 - 1);
        objArr[1] = 137;
        zep.e("Could not handle action: %s for type %s", objArr);
        return anlz.q(agru.c);
    }
}
