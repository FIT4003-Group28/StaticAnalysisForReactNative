package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: andb  reason: default package */
/* loaded from: classes.dex */
public final class andb extends AbstractMap {
    public static final Comparator a = new ahdo(5);
    public final Object[] b;
    public final int[] c;
    public final Set d = new anda(this);
    private Integer e = null;
    private String f = null;

    public andb(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((ancy) it.next()).a;
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        int[] iArr = new int[1];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            ((ancy) it2.next()).a;
            throw null;
        }
        iArr[0] = 0;
        if (size > 16 && size * 9 > 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        this.b = objArr;
        this.c = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
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
