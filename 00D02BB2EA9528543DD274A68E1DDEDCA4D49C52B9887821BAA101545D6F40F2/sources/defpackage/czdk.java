package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czdk  reason: default package */
/* loaded from: classes5.dex */
public final class czdk extends czdc {
    public czdk(AffinityContext affinityContext) {
        super(affinityContext);
    }

    private static List<czdi> b(List<cyvt> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (cyvt cyvtVar : list) {
            arrayList.add(new czdl(cyvtVar, cyvtVar.b()));
        }
        return arrayList;
    }

    @Override // defpackage.czdc
    public final LinkedList<cyvs> a(List<cyvt> list, List<cyvt> list2) {
        List<czdi> b = b(list);
        List<czdi> b2 = b(list2);
        if (!list2.isEmpty()) {
            dccg O = dccg.O();
            cyvw.a(dcft.o(b, czdf.a), O);
            HashMap d = dcjz.d();
            for (czdi czdiVar : b) {
                d.put(czdiVar.c(), czdiVar);
            }
            for (czdi czdiVar2 : b2) {
                for (cyvs cyvsVar : cyvw.b(czdiVar2.c(), O)) {
                    if (cyvsVar.n(czdiVar2.c()) != 1) {
                        czdi czdiVar3 = (czdi) d.get(cyvsVar);
                        czdiVar3.a(czdiVar2.b().c);
                        if (czdiVar2.a(czdiVar3.b().b.c().d())) {
                            czdiVar2.b().b = czdiVar3.b().b;
                        }
                    }
                }
            }
        }
        for (czdi czdiVar4 : b) {
            czdiVar4.d(new czdg());
        }
        for (czdi czdiVar5 : b2) {
            czdiVar5.d(new czdh());
        }
        return new czde(this.a).a(list, list2);
    }
}
