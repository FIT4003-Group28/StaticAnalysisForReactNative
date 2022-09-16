package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: lnq  reason: default package */
/* loaded from: classes3.dex */
final class lnq extends abc {
    final /* synthetic */ lnu a;
    private ajru b;
    private int c;
    private int d;

    public lnq(lnu lnuVar) {
        this.a = lnuVar;
    }

    @Override // defpackage.abc
    public final int d(RecyclerView recyclerView, yo yoVar) {
        if (!this.a.i(recyclerView) || !this.a.j(yoVar)) {
            return 0;
        }
        return n(3);
    }

    @Override // defpackage.abc
    public final boolean h(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        if (this.a.i(recyclerView) && this.a.k(yoVar, yoVar2)) {
            lnu lnuVar = this.a;
            ajrw ajrwVar = lnuVar.c.f;
            ajsm ajsmVar = (ajsm) lnuVar.b.get(lnu.b(yoVar));
            if (ajsmVar.contains(ajrwVar.getItem(yoVar.b())) && ajsmVar.contains(ajrwVar.getItem(yoVar2.b()))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abc
    public final boolean j() {
        return false;
    }

    @Override // defpackage.abc
    public final boolean k(RecyclerView recyclerView, yo yoVar, yo yoVar2) {
        ajsm ajsmVar;
        if (this.a.i(recyclerView) && this.a.k(yoVar, yoVar2)) {
            lnu lnuVar = this.a;
            ajrw ajrwVar = lnuVar.c.f;
            ajsm ajsmVar2 = (ajsm) lnuVar.b.get(lnu.b(yoVar));
            int a = lnu.a(yoVar, ajsmVar2, ajrwVar);
            int a2 = lnu.a(yoVar2, ajsmVar2, ajrwVar);
            if (a != -1 && a2 != -1) {
                this.d = a2;
                ylr.c();
                zdk.a(a, ajsmVar2.size() - 1);
                zdk.a(a2, ajsmVar2.size() - 1);
                if (a2 != a) {
                    ajsmVar2.b.add(a2, ajsmVar2.b.remove(a));
                    Iterator it = ajsmVar2.c.a.iterator();
                    while (it.hasNext()) {
                        ((ymy) it.next()).e(a, a2);
                    }
                }
                lnu lnuVar2 = this.a;
                ajru b = lnu.b(yoVar);
                if (lnuVar2.f == null || (ajsmVar = (ajsm) lnuVar2.b.get(b)) == null) {
                    return true;
                }
                for (lns lnsVar : lnuVar2.f) {
                    lnsVar.b(b, ajsmVar, a, a2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abc
    public final void m() {
    }

    @Override // defpackage.abc
    public final void p() {
    }

    @Override // defpackage.abc
    public final void g(yo yoVar, int i) {
        ajsm ajsmVar;
        ajsm ajsmVar2;
        ajru ajruVar = this.b;
        if (ajruVar != null) {
            lnu lnuVar = this.a;
            int i2 = this.c;
            int i3 = this.d;
            if (lnuVar.g != null && (ajsmVar2 = (ajsm) lnuVar.b.get(ajruVar)) != null) {
                for (lnr lnrVar : lnuVar.g) {
                    lnrVar.oM(ajruVar, ajsmVar2, i2, i3);
                }
            }
            this.b = null;
        }
        if (this.a.j(yoVar)) {
            ajru b = lnu.b(yoVar);
            this.b = b;
            if (b == null) {
                return;
            }
            int a = lnu.a(yoVar, (ajsm) this.a.b.get(b), this.a.c.f);
            this.c = a;
            this.d = a;
            lnu lnuVar2 = this.a;
            ajru ajruVar2 = this.b;
            if (lnuVar2.e == null || (ajsmVar = (ajsm) lnuVar2.b.get(ajruVar2)) == null) {
                return;
            }
            for (lnt lntVar : lnuVar2.e) {
                lntVar.c(ajruVar2, ajsmVar, a);
            }
        }
    }
}
