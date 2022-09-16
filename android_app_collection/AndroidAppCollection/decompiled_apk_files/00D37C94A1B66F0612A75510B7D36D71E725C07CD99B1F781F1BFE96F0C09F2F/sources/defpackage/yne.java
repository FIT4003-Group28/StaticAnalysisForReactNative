package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: yne  reason: default package */
/* loaded from: classes4.dex */
public final class yne implements Iterable {
    public final Map a;

    public yne() {
        this.a = new TreeMap();
    }

    public final void a(Object obj, Object obj2) {
        LinkedList linkedList = (LinkedList) this.a.get(obj);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.a.put(obj, linkedList);
        }
        linkedList.addLast(obj2);
    }

    public final void b(Object obj) {
        amzs it = amvn.p(this.a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (linkedList.remove(obj)) {
                if (!linkedList.isEmpty()) {
                    return;
                }
                this.a.remove(entry.getKey());
                return;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ynd(this);
    }

    public yne(Comparator comparator) {
        this.a = new TreeMap(comparator);
    }
}
