package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vup  reason: default package */
/* loaded from: classes7.dex */
public class vup {
    public final EnumMap<vux, Integer> a;

    public vup(vup vupVar) {
        this.a = new EnumMap<>((Map<vux, ? extends Integer>) vupVar.a);
    }

    @dzsi
    public final Integer a(vux vuxVar) {
        return this.a.get(vuxVar);
    }

    public final void b(vux vuxVar, int i) {
        this.a.put((EnumMap<vux, Integer>) vuxVar, (vux) Integer.valueOf(i));
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof vup)) {
            return false;
        }
        return this.a.equals(((vup) obj).a);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public vup(EnumMap<vux, Integer> enumMap) {
        EnumMap<vux, Integer> k = dcjz.k(vux.class);
        this.a = k;
        k.putAll(enumMap);
    }
}
