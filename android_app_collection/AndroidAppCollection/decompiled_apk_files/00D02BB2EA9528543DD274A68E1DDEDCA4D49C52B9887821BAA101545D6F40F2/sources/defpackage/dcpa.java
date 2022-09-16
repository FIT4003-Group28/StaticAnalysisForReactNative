package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcpa  reason: default package */
/* loaded from: classes5.dex */
final class dcpa extends dcjs {
    final Iterable<Map.Entry> a;
    final /* synthetic */ dcpc b;

    public dcpa(dcpc dcpcVar, Iterable<dcpb> iterable) {
        this.b = dcpcVar;
        this.a = iterable;
    }

    @Override // defpackage.dcjs
    public final Iterator<Map.Entry> a() {
        return this.a.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof dclz) {
            dclz dclzVar = (dclz) obj;
            dcpb dcpbVar = (dcpb) this.b.a.get(dclzVar.b);
            if (dcpbVar != null && dcpbVar.a.equals(dclzVar)) {
                return dcpbVar.b;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.a.size();
    }
}
