package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amtn  reason: default package */
/* loaded from: classes.dex */
final class amtn extends amtt {
    final /* synthetic */ amtu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtn(amtu amtuVar) {
        super(amtuVar);
        this.a = amtuVar;
    }

    @Override // defpackage.amtt
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amtl(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = this.a.c(key);
            if (c != -1 && akzj.f(value, this.a.b[c])) {
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
            int d = this.a.d(key, G);
            if (d == -1 || !akzj.f(value, this.a.b[d])) {
                return false;
            }
            this.a.j(d, G);
            return true;
        }
        return false;
    }
}
