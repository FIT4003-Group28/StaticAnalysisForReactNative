package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcoc  reason: default package */
/* loaded from: classes5.dex */
public class dcoc<R, C, V> extends dbyu<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Map<R, Map<C, V>> b;
    private transient Map<R, Map<C, V>> c;

    public dcoc(Map<R, Map<C, V>> map) {
        this.b = map;
    }

    @Override // defpackage.dbyu, defpackage.dcou
    public final boolean a(Object obj, Object obj2) {
        Map map;
        return (obj == null || obj2 == null || (map = (Map) dcjz.A(p(), obj)) == null || !dcjz.B(map, obj2)) ? false : true;
    }

    @Override // defpackage.dbyu, defpackage.dcou
    public final V b(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.b(obj, obj2);
    }

    @Override // defpackage.dbyu
    public final void d() {
        this.b.clear();
    }

    @Override // defpackage.dbyu, defpackage.dcou
    public final V e(R r, C c, V v) {
        dbsk.s(r);
        dbsk.s(c);
        dbsk.s(v);
        Map<C, V> map = this.b.get(r);
        if (map == null) {
            map = dcbu.b();
            this.b.put(r, map);
        }
        return map.put(c, v);
    }

    @Override // defpackage.dbyu
    public final Iterator<dcot<R, C, V>> h() {
        return new dcnu(this);
    }

    public final boolean k(Object obj) {
        return obj != null && dcjz.B(this.b, obj);
    }

    @Override // defpackage.dcou
    public final int l() {
        int i = 0;
        for (Map<C, V> map : this.b.values()) {
            i += map.size();
        }
        return i;
    }

    public final Map<C, V> m(R r) {
        return new dcnx(this, r);
    }

    @Override // defpackage.dcou
    public final Map<R, Map<C, V>> p() {
        Map<R, Map<C, V>> map = this.c;
        if (map == null) {
            dcoa dcoaVar = new dcoa(this);
            this.c = dcoaVar;
            return dcoaVar;
        }
        return map;
    }
}
