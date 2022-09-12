package defpackage;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnx  reason: default package */
/* loaded from: classes5.dex */
public final class dcnx extends dcjs {
    final Object a;
    Map b;
    final /* synthetic */ dcoc c;

    public dcnx(dcoc dcocVar, Object obj) {
        this.c = dcocVar;
        dbsk.s(obj);
        this.a = obj;
    }

    @Override // defpackage.dcjs
    public final Iterator<Map.Entry> a() {
        Map b = b();
        if (b == null) {
            return dcgd.a;
        }
        return new dcnv(this, b.entrySet().iterator());
    }

    final Map b() {
        Map map = this.b;
        if (map == null || (map.isEmpty() && this.c.b.containsKey(this.a))) {
            Map map2 = (Map) this.c.b.get(this.a);
            this.b = map2;
            return map2;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (b() == null || !this.b.isEmpty()) {
            return;
        }
        this.c.b.remove(this.a);
        this.b = null;
    }

    @Override // defpackage.dcjs, java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map b = b();
        if (b != null) {
            b.clear();
        }
        c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b = b();
        return (obj == null || b == null || !dcjz.B(b, obj)) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b = b();
        if (obj == null || b == null) {
            return null;
        }
        return dcjz.A(b, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        dbsk.s(obj);
        dbsk.s(obj2);
        Map map = this.b;
        if (map == null || map.isEmpty()) {
            return this.c.e(this.a, obj, obj2);
        }
        return this.b.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b = b();
        if (b == null) {
            return null;
        }
        Object C = dcjz.C(b, obj);
        c();
        return C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b = b();
        if (b == null) {
            return 0;
        }
        return b.size();
    }
}
