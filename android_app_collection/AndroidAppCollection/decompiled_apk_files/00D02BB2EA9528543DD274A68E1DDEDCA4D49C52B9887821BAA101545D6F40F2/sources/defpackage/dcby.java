package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcby  reason: default package */
/* loaded from: classes5.dex */
final class dcby extends dcce {
    final /* synthetic */ dccf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcby(dccf dccfVar) {
        super(dccfVar);
        this.a = dccfVar;
    }

    @Override // defpackage.dcce
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new dcbw(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.a.b(key);
            if (b != -1 && dbsd.a(value, this.a.b[b])) {
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
            int b = dccj.b(key);
            int c = this.a.c(key, b);
            if (c == -1 || !dbsd.a(value, this.a.b[c])) {
                return false;
            }
            this.a.g(c, b);
            return true;
        }
        return false;
    }
}
