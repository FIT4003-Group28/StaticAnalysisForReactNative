package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wsp  reason: default package */
/* loaded from: classes7.dex */
public final class wsp {
    public final Set<qdi> a = new HashSet();
    public final Set<akqi> b = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(zef zefVar) {
        return this.a.contains(qdi.a(zefVar.e().c()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(akqi akqiVar, qdi qdiVar) {
        boolean add = this.a.add(qdiVar);
        if (add != this.b.add(akqiVar)) {
            return false;
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.a.clear();
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<akqi> e() {
        return dcep.K(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<qdi> f() {
        return dcep.K(this.a);
    }
}
