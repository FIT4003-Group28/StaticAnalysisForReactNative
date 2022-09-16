package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajvh  reason: default package */
/* loaded from: classes.dex */
public final class ajvh {
    public avhn a;
    public arhr b = arhr.UNKNOWN;
    public String c;
    public Integer d;

    public static List a(List list) {
        return b(list, null);
    }

    public static List b(List list, Map map) {
        arhs arhsVar;
        ArrayList arrayList = new ArrayList(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            asqe asqeVar = (asqe) it.next();
            if (asqeVar.b == 128538449) {
                asqd asqdVar = (asqd) asqeVar.c;
                int i = asqdVar.b;
                if (i == 2) {
                    avhn avhnVar = (avhn) asqdVar.c;
                    ajvh ajvhVar = new ajvh();
                    ajvhVar.a = avhnVar;
                    ajvhVar.b = arhr.UNKNOWN;
                    ajvhVar.c = ajvo.c(avhnVar);
                    arrayList.add(ajvhVar);
                } else if (i == 1) {
                    arhr b = arhr.b(((arhs) asqdVar.c).c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    if (b != arhr.UNKNOWN) {
                        if (asqdVar.b == 1) {
                            arhsVar = (arhs) asqdVar.c;
                        } else {
                            arhsVar = arhs.a;
                        }
                        arhr b2 = arhr.b(arhsVar.c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        Integer num = (map == null || !map.containsKey(b2)) ? null : (Integer) map.get(b2);
                        aovs aovsVar = asqdVar.d;
                        if (aovsVar == null) {
                            aovsVar = aovs.a;
                        }
                        ajvh ajvhVar2 = new ajvh();
                        ajvhVar2.a = null;
                        ajvhVar2.b = b2;
                        if (aovsVar != null && (aovsVar.b & 1) != 0) {
                            aovr aovrVar = aovsVar.c;
                            if (aovrVar == null) {
                                aovrVar = aovr.a;
                            }
                            if ((aovrVar.b & 2) != 0) {
                                aovr aovrVar2 = aovsVar.c;
                                if (aovrVar2 == null) {
                                    aovrVar2 = aovr.a;
                                }
                                ajvhVar2.c = aovrVar2.c;
                            }
                        }
                        ajvhVar2.d = num;
                        arrayList.add(ajvhVar2);
                    }
                }
            }
        }
        return arrayList;
    }
}
