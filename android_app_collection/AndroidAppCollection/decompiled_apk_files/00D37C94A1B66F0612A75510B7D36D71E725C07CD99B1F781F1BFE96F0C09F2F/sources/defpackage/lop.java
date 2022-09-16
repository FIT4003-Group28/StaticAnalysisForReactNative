package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lop  reason: default package */
/* loaded from: classes3.dex */
public final class lop extends lsv {
    public loo a;
    private View j;

    public lop(ViewGroup viewGroup, ajzq ajzqVar, ajsg ajsgVar, ajyi ajyiVar, aari aariVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(viewGroup, ajzqVar, ajsgVar, ajyiVar, aariVar, yniVar, yzjVar, actiVar);
    }

    @Override // defpackage.lsv
    protected final void c(ajsm ajsmVar, aupw aupwVar, boolean z) {
        if (!aupwVar.j) {
            boolean z2 = true;
            boolean z3 = false;
            for (aupy aupyVar : aupwVar.g) {
                if (aupyVar.b == 105604662) {
                    aupu aupuVar = (aupu) aupyVar.c;
                    if (!aupuVar.o) {
                        if (aupuVar.l) {
                            q(aupuVar, true);
                        }
                        z3 = true;
                    }
                }
            }
            if (ajsmVar.isEmpty() || !(ajsmVar.get(0) instanceof aupw)) {
                z2 = false;
            }
            if (!z3) {
                if (!z || !z2) {
                    return;
                }
                ajsmVar.remove(0);
            } else if (!z) {
                ajsmVar.add(aupwVar);
            } else if (z2) {
                ajsmVar.n(0, aupwVar);
            } else {
                ajsmVar.add(0, aupwVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lsv
    public final void d(ajrs ajrsVar, ajqm ajqmVar, int i) {
        super.d(ajrsVar, ajqmVar, i);
        ajrsVar.f("SECTION_LIST_DRAWER_COMPACT_MODE", true);
        ajrsVar.f("is_horizontal_drawer_context", true);
    }

    public final void f() {
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.lsv
    protected final void k() {
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.ag(new LinearLayoutManager(0));
        ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.drawer_shadow_stub);
        if (viewStub == null || this.j != null) {
            return;
        }
        this.j = viewStub.inflate();
    }

    @Override // defpackage.lsv
    protected final void l(ajsf ajsfVar) {
        ajsfVar.u(new lon(this, ajsfVar));
    }

    public final void m() {
        RecyclerView recyclerView = this.c.f60J;
        if (recyclerView.canScrollVertically(-1) || (recyclerView.getChildAt(0) != null && recyclerView.getChildAt(0).getTop() < 0)) {
            View view = this.j;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        f();
    }
}
