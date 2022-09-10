package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzlg  reason: default package */
/* loaded from: classes6.dex */
public final class dzlg extends dzld implements Serializable, Cloneable, dzlf {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzlh.a;
    }

    @Override // defpackage.dzld
    public final Object clone() {
        return dzlh.a;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Set<Map.Entry<Long, Double>> entrySet() {
        return dzrx.a;
    }

    @Override // defpackage.dzld, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((Map) obj).isEmpty();
    }

    @Override // defpackage.dzlf
    public final dznf f() {
        return dznh.a;
    }

    @Override // defpackage.dzld, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.dzlf
    public final dzrv<dzkj> k() {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return dznh.a;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Long, ? extends Double> map) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzld
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Double> values() {
        return dzhq.a;
    }
}
