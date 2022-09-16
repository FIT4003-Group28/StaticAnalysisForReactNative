package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amtp  reason: default package */
/* loaded from: classes.dex */
final class amtp extends amtt {
    public amtp(amtu amtuVar) {
        super(amtuVar);
    }

    @Override // defpackage.amtt
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amtm(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int e = this.b.e(key);
            if (e != -1 && akzj.f(this.b.a[e], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int G = arey.G(key);
            int f = this.b.f(key, G);
            if (f == -1 || !akzj.f(this.b.a[f], value)) {
                return false;
            }
            this.b.k(f, G);
            return true;
        }
        return false;
    }
}
