package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uep  reason: default package */
/* loaded from: classes7.dex */
public final class uep implements ufd {
    private static final dcqe c = dcqe.c("uep");
    public final bnph a;
    public final gfw b;
    private final Executor d;
    private final uer e;

    public uep(Executor executor, bnph bnphVar, uer uerVar, gfw gfwVar) {
        this.d = executor;
        this.a = bnphVar;
        this.e = uerVar;
        this.b = gfwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(amsy amsyVar, uew uewVar) {
        if (amsyVar.i() == uewVar.f() && amsyVar.i() > 0) {
            int i = amsyVar.i() - 1;
            dpjn dpjnVar = amsyVar.h(i).b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            Iterator<dpca> it = dpjnVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int a = dpbz.a(it.next().b);
                if (a != 0 && a == 4) {
                    if (!uewVar.l(i) || !uewVar.a.get(i).c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ufd
    public final boolean a(amsy amsyVar) {
        return d(amsyVar, this.e.f());
    }

    @Override // defpackage.ufd
    public final void b(amsy amsyVar) {
        c(amsyVar, this.e.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(amsy amsyVar, final uew uewVar) {
        if (d(amsyVar, uewVar)) {
            dwaa dwaaVar = amsyVar.a.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            final String str = dwaaVar.d;
            final int i = amsyVar.i() - 1;
            dpjn dpjnVar = amsyVar.h(i).b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            final dpjn dpjnVar2 = dpjnVar;
            this.d.execute(new Runnable(this, uewVar, i, dpjnVar2, str) { // from class: ueo
                private final uep a;
                private final uew b;
                private final int c;
                private final dpjn d;
                private final String e;

                {
                    this.a = this;
                    this.b = uewVar;
                    this.c = i;
                    this.d = dpjnVar2;
                    this.e = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    uep uepVar = this.a;
                    uew uewVar2 = this.b;
                    int i2 = this.c;
                    dpjn dpjnVar3 = this.d;
                    String str2 = this.e;
                    if (uewVar2.l(i2)) {
                        uewVar2.a.get(i2).d();
                    }
                    uepVar.a.a(dbsg.i(Integer.valueOf(i2)), dpjnVar3, dpjnVar3.e, str2, uepVar.b);
                }
            });
            return;
        }
        bvoo.h("Attempted to offerWaypointRefinement when shouldOfferWaypointRefinement returns false", new Object[0]);
    }
}
