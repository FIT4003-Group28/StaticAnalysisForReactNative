package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lxt  reason: default package */
/* loaded from: classes7.dex */
public final class lxt {
    public final Set<lxs> a = new HashSet();
    public final Executor b;
    private final btrm c;
    private final bvrj d;

    public lxt(btrm btrmVar, Executor executor, bvrj bvrjVar) {
        this.c = btrmVar;
        this.b = executor;
        this.d = bvrjVar;
    }

    public final void a(lxs lxsVar) {
        this.d.c();
        dbsk.l(!this.a.contains(lxsVar));
        boolean isEmpty = this.a.isEmpty();
        this.a.add(lxsVar);
        if (isEmpty) {
            btrm btrmVar = this.c;
            dceq a = dcet.a();
            a.b(jzs.class, new lxu(jzs.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a.a());
        }
    }

    public final void b(lxs lxsVar) {
        this.d.c();
        dbsk.l(this.a.remove(lxsVar));
        if (this.a.isEmpty()) {
            this.c.a(this);
        }
    }
}
