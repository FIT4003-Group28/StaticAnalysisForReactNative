package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xez  reason: default package */
/* loaded from: classes7.dex */
public final class xez implements xfd {
    private final bvjj a;

    public xez(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    private static Set<String> e(List<amve> list) {
        return dcbg.b(list).t(xex.a).s(xey.a).B();
    }

    private final Set<String> f() {
        return dcep.K(this.a.C(bvjk.cN, new HashSet()));
    }

    private final Set<String> g() {
        return dcep.K(this.a.C(bvjk.cM, new HashSet()));
    }

    @Override // defpackage.xfd
    public final void a(String str) {
        HashSet hashSet = new HashSet(g());
        hashSet.add(str);
        this.a.af(bvjk.cM, hashSet);
    }

    @Override // defpackage.xfd
    public final boolean b(String str) {
        return g().contains(str);
    }

    @Override // defpackage.xfd
    public final void c(List<amve> list) {
        HashSet hashSet = new HashSet(f());
        hashSet.addAll(e(list));
        this.a.af(bvjk.cN, hashSet);
    }

    @Override // defpackage.xfd
    public final boolean d(List<amve> list) {
        return new HashSet(e(list)).removeAll(f());
    }
}
