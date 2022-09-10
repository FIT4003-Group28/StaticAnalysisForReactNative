package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyrn  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyrn implements cyqf {
    private static dcdc<cyqg> k(List<cysl> list) {
        return dcdc.r(dchl.k(list, cyrm.a));
    }

    @Override // defpackage.cyqf
    public final dcdc<cyqg> a(Set<String> set, int i) {
        return k(j(set, i));
    }

    @Override // defpackage.cyqf
    public final dcdc<cyqg> b(Set<String> set, int i) {
        return k(i(set, i));
    }

    @Override // defpackage.cyqf
    public final dcdc<cyqg> c(dcdc<String> dcdcVar, Set<String> set, int i) {
        return k(h(cysk.a(dcdcVar), set, i));
    }

    @Override // defpackage.cyqf
    public final dcdc<cyqg> d(dcdc<String> dcdcVar, Set<String> set, int i) {
        return k(g(cysk.a(dcdcVar), set, i));
    }

    public abstract List<cysl> g(String str, Set<String> set, int i);

    public abstract List<cysl> h(String str, Set<String> set, int i);

    public abstract List<cysl> i(Set<String> set, int i);

    public abstract List<cysl> j(Set<String> set, int i);
}
