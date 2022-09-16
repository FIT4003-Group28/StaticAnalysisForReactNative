package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abhq  reason: default package */
/* loaded from: classes.dex */
public final class abhq {
    public final ArrayList a;

    public abhq(long j) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(Long.valueOf(j));
    }

    public abhq(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final yqp a() {
        return new yqp(this.a);
    }

    public final boolean b(String str) {
        for (int i = 0; i < this.a.size(); i++) {
            if (str.equalsIgnoreCase((String) ((Map.Entry) this.a.get(i)).getKey())) {
                return true;
            }
        }
        return false;
    }

    public final void c(Collection collection) {
        this.a.addAll(collection);
    }

    public final void d(String str, String str2) {
        this.a.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    public final long e() {
        if (this.a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.a.get(0)).longValue();
    }

    public abhq() {
        this.a = new ArrayList();
    }
}
