package defpackage;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ltj  reason: default package */
/* loaded from: classes3.dex */
public final class ltj implements fsv {
    private final DefaultTabsBar a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final axnm d;
    private View e;
    private final List f;
    private lti g;

    public ltj(axnm axnmVar, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, ViewGroup viewGroup) {
        this.d = axnmVar;
        this.c = viewGroup;
        this.a = appTabsBar;
        this.b = constraintLayout;
        constraintLayout.setVisibility(8);
        this.f = new ArrayList();
    }

    private final void l(fst fstVar) {
        final lti ltiVar = new lti();
        for (frt frtVar : fstVar.b) {
            if (frtVar.d()) {
                ltiVar.a((RecyclerView) frtVar.a());
            } else {
                frtVar.b(new frs() { // from class: lth
                    @Override // defpackage.frs
                    public final void a(View view) {
                        lti.this.a((RecyclerView) view);
                    }
                });
            }
        }
        View view = fstVar.a;
        this.e = view;
        this.c.addView(view);
        this.g = ltiVar;
    }

    @Override // defpackage.fsv
    public final int a() {
        return 0;
    }

    @Override // defpackage.fsv
    public final View b(int i, boolean z, CharSequence charSequence, fst fstVar) {
        View f = this.a.f(i, z, charSequence);
        l(fstVar);
        return f;
    }

    @Override // defpackage.fsv
    public final View c(CharSequence charSequence, CharSequence charSequence2, boolean z, fst fstVar) {
        View g = this.a.g(charSequence, charSequence2, z);
        l(fstVar);
        return g;
    }

    @Override // defpackage.fsv
    public final View d(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.fsv
    public final void e(fsu fsuVar) {
        this.f.add(fsuVar);
    }

    @Override // defpackage.fsv
    public final void f() {
        this.e = null;
        this.g = null;
    }

    @Override // defpackage.fsv
    public final void g(fsu fsuVar) {
        this.f.remove(fsuVar);
    }

    @Override // defpackage.fsv
    public final void h() {
        lti ltiVar = this.g;
        if (ltiVar != null) {
            for (RecyclerView recyclerView : ltiVar.a) {
                recyclerView.al(0);
            }
            ((frv) this.d.get()).n();
        }
    }

    @Override // defpackage.fsv
    public final boolean i() {
        lti ltiVar = this.g;
        if (ltiVar != null) {
            for (RecyclerView recyclerView : ltiVar.a) {
                if (recyclerView.computeVerticalScrollOffset() > 0 && !recyclerView.n.bf()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.fsv
    public final void j() {
        ((frv) this.d.get()).n();
    }

    @Override // defpackage.fsv
    public final void k(int i) {
        for (fsu fsuVar : this.f) {
            fsuVar.b(i, true);
        }
    }
}
