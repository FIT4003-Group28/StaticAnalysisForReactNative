package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czde  reason: default package */
/* loaded from: classes5.dex */
public final class czde extends czdc {
    public czde(AffinityContext affinityContext) {
        super(affinityContext);
    }

    @Override // defpackage.czdc
    public final LinkedList<cyvs> a(List<cyvt> list, List<cyvt> list2) {
        HashMap hashMap = new HashMap();
        for (cyvt cyvtVar : list) {
            for (cyvi cyviVar : cyvtVar.j) {
                if (!hashMap.containsKey(cyviVar.k())) {
                    hashMap.put(cyviVar.k(), new czdd());
                }
                czdd czddVar = (czdd) hashMap.get(cyviVar.k());
                czddVar.a.add(cyviVar);
                double d = cyviVar.b().h.c().d();
                if (d > czddVar.c) {
                    czddVar.c = d;
                    czddVar.e = cyviVar.b().h;
                }
            }
        }
        for (cyvt cyvtVar2 : list2) {
            for (cyvi cyviVar2 : cyvtVar2.j) {
                if (!hashMap.containsKey(cyviVar2.k())) {
                    hashMap.put(cyviVar2.k(), new czdd());
                }
                czdd czddVar2 = (czdd) hashMap.get(cyviVar2.k());
                czddVar2.b.add(cyviVar2);
                czddVar2.d = Math.max(czddVar2.d, cyviVar2.b().i);
            }
        }
        for (czdd czddVar3 : hashMap.values()) {
            for (cyvi cyviVar3 : czddVar3.a) {
                if (czddVar3.d > dcyn.a) {
                    cyviVar3.b().m(cygl.DEVICE);
                }
                cyviVar3.b().i = cyviVar3.b().h.c().d() + czddVar3.d;
            }
            for (cyvi cyviVar4 : czddVar3.b) {
                if (czddVar3.c > dcyn.a) {
                    cyviVar4.b().m(cygl.PAPI_TOPN);
                }
                cyviVar4.b().i += czddVar3.c;
                if (czddVar3.e != null) {
                    cyviVar4.b().h = czddVar3.e;
                }
            }
        }
        for (cyvt cyvtVar3 : list) {
            double d2 = 0.0d;
            for (cyvi cyviVar5 : cyvtVar3.j) {
                d2 = Math.max(d2, cyviVar5.b().i);
            }
            for (InAppNotificationTarget inAppNotificationTarget : cyvtVar3.g) {
                PersonFieldMetadata b = inAppNotificationTarget.b();
                b.i = (b.h.c().d() > dcyn.a || d2 <= dcyn.a) ? b.i + b.h.c().d() : 0.001d + d2;
            }
        }
        LinkedList<cyvs> linkedList = new LinkedList<>();
        for (cyvt cyvtVar4 : dcbg.d(list, list2)) {
            linkedList.add(cyvtVar4.b());
        }
        return linkedList;
    }
}
