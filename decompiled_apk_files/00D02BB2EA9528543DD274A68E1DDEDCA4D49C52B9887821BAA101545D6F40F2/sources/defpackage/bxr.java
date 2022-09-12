package defpackage;

import defpackage.bxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bxr  reason: default package */
/* loaded from: classes.dex */
final class bxr<K extends bxy, V> {
    private final bxq<K, V> a = new bxq<>(null);
    private final Map<K, bxq<K, V>> b = new HashMap();

    private static <K, V> void d(bxq<K, V> bxqVar) {
        bxqVar.c.d = bxqVar;
        bxqVar.d.c = bxqVar;
    }

    private static <K, V> void e(bxq<K, V> bxqVar) {
        bxq<K, V> bxqVar2 = bxqVar.d;
        bxqVar2.c = bxqVar.c;
        bxqVar.c.d = bxqVar2;
    }

    public final void a(K k, V v) {
        bxq<K, V> bxqVar = this.b.get(k);
        if (bxqVar == null) {
            bxqVar = new bxq<>(k);
            e(bxqVar);
            bxq<K, V> bxqVar2 = this.a;
            bxqVar.d = bxqVar2.d;
            bxqVar.c = bxqVar2;
            d(bxqVar);
            this.b.put(k, bxqVar);
        } else {
            k.a();
        }
        if (bxqVar.b == null) {
            bxqVar.b = new ArrayList();
        }
        bxqVar.b.add(v);
    }

    public final V b(K k) {
        bxq<K, V> bxqVar = this.b.get(k);
        if (bxqVar == null) {
            bxqVar = new bxq<>(k);
            this.b.put(k, bxqVar);
        } else {
            k.a();
        }
        e(bxqVar);
        bxq<K, V> bxqVar2 = this.a;
        bxqVar.d = bxqVar2;
        bxqVar.c = bxqVar2.c;
        d(bxqVar);
        return bxqVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [bxy, K] */
    public final V c() {
        for (bxq bxqVar = this.a.d; !bxqVar.equals(this.a); bxqVar = bxqVar.d) {
            V v = (V) bxqVar.a();
            if (v != null) {
                return v;
            }
            e(bxqVar);
            this.b.remove(bxqVar.a);
            bxqVar.a.a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        bxq bxqVar = this.a.c;
        boolean z = false;
        while (!bxqVar.equals(this.a)) {
            sb.append('{');
            sb.append(bxqVar.a);
            sb.append(':');
            sb.append(bxqVar.b());
            sb.append("}, ");
            bxqVar = bxqVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
