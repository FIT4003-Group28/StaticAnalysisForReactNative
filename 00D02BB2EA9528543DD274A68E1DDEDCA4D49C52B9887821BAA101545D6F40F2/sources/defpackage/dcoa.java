package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcoa  reason: default package */
/* loaded from: classes5.dex */
final class dcoa extends dcjy {
    final /* synthetic */ dcoc a;

    public dcoa(dcoc dcocVar) {
        this.a = dcocVar;
    }

    @Override // defpackage.dcjy
    public final Set<Map.Entry> a() {
        return new dcnz(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.k(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (this.a.k(obj)) {
            return this.a.m(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Map) this.a.b.remove(obj);
    }
}
