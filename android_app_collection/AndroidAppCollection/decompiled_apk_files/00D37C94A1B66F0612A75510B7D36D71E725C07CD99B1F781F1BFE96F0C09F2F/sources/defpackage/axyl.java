package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: axyl  reason: default package */
/* loaded from: classes2.dex */
public final class axyl {
    public static final axyg a = new axyi();

    public static axye a(axye axyeVar, List list) {
        axyeVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axyeVar = new axyk(axyeVar, (axyh) it.next());
        }
        return axyeVar;
    }

    public static axye b(axye axyeVar, axyh... axyhVarArr) {
        return a(axyeVar, Arrays.asList(axyhVarArr));
    }
}
