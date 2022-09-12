package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dctu  reason: default package */
/* loaded from: classes.dex */
public final class dctu extends AbstractMap<String, Set<Object>> {
    public static final Comparator<Object> a = new dctr();
    public final Object[] b;
    public final int[] c;
    public final Set<Map.Entry<String, Set<Object>>> d = new dctt(this, -1);
    private Integer e = null;
    private String f = null;

    public dctu(List<dctq> list) {
        Iterator<dctq> it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator<dctq> it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().a;
                throw null;
            }
            iArr[0] = 0;
            if (size > 16 && size * 9 > 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            this.b = objArr;
            this.c = iArr;
            return;
        }
        it.next().a;
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Set<Object>>> entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }
}
