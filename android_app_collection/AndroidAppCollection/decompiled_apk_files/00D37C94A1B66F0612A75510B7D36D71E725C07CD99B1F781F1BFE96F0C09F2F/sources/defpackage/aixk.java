package defpackage;

import java.util.Deque;
import java.util.TreeMap;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixk  reason: default package */
/* loaded from: classes.dex */
final class aixk extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixl a = aixn.a(deque, false);
        if (a == null) {
            return;
        }
        if (((aixc) a.a.e.get(Integer.valueOf(a.c))) != null) {
            TreeMap treeMap = a.b.c;
            Integer valueOf = Integer.valueOf(a.c);
            int i = a.c;
            attributes.getValue("media");
            treeMap.put(valueOf, new aixb(i));
        }
        a.c++;
    }
}
