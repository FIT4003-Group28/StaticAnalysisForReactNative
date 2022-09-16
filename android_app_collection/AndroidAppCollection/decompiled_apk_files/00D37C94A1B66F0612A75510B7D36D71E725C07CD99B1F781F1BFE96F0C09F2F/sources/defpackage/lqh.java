package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: lqh  reason: default package */
/* loaded from: classes3.dex */
public final class lqh implements fsv {
    public final axnm a;
    public final RtlAwareViewPager b;
    public final ArrayList c;
    public final List d;
    private final axnm e;
    private final axnm f;
    private final lqf g;
    private int h = -1;
    private final ArrayList i;
    private lqg j;

    public lqh(axnm axnmVar, axnm axnmVar2, axnm axnmVar3, RtlAwareViewPager rtlAwareViewPager) {
        this.f = axnmVar;
        rtlAwareViewPager.getClass();
        this.b = rtlAwareViewPager;
        this.a = axnmVar2;
        this.e = axnmVar3;
        this.i = new ArrayList(10);
        this.c = new ArrayList(10);
        ((ViewGroup) axnmVar3.get()).setVisibility(8);
        ((DefaultTabsBar) axnmVar2.get()).k = new lqd(this);
        lqf lqfVar = new lqf(this);
        this.g = lqfVar;
        rtlAwareViewPager.k(lqfVar);
        rtlAwareViewPager.k = new lqe(this);
        this.d = new ArrayList();
    }

    private final void m(fst fstVar) {
        ((ViewGroup) this.e.get()).setVisibility(((DefaultTabsBar) this.a.get()).j() > 1 ? 0 : 8);
        final lqg lqgVar = new lqg();
        for (frt frtVar : fstVar.b) {
            if (frtVar.d()) {
                lqgVar.a((RecyclerView) frtVar.a());
            } else {
                frtVar.b(new frs() { // from class: lqc
                    @Override // defpackage.frs
                    public final void a(View view) {
                        lqg.this.a((RecyclerView) view);
                    }
                });
            }
        }
        this.c.add(fstVar.a);
        this.i.add(lqgVar);
        this.g.m();
    }

    @Override // defpackage.fsv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.fsv
    public final View b(int i, boolean z, CharSequence charSequence, fst fstVar) {
        View f = ((DefaultTabsBar) this.a.get()).f(i, z, charSequence);
        m(fstVar);
        return f;
    }

    @Override // defpackage.fsv
    public final View c(CharSequence charSequence, CharSequence charSequence2, boolean z, fst fstVar) {
        View g = ((DefaultTabsBar) this.a.get()).g(charSequence, charSequence2, z);
        m(fstVar);
        return g;
    }

    @Override // defpackage.fsv
    public final View d(int i) {
        return ((DefaultTabsBar) this.a.get()).k(i);
    }

    @Override // defpackage.fsv
    public final void e(fsu fsuVar) {
        this.d.add(fsuVar);
    }

    @Override // defpackage.fsv
    public final void f() {
        this.c.clear();
        this.g.m();
        this.i.clear();
        this.j = null;
    }

    @Override // defpackage.fsv
    public final void g(fsu fsuVar) {
        this.d.remove(fsuVar);
    }

    @Override // defpackage.fsv
    public final void h() {
        lqg lqgVar = this.j;
        if (lqgVar != null) {
            for (RecyclerView recyclerView : lqgVar.a) {
                recyclerView.al(0);
            }
            ((frv) this.f.get()).n();
        }
    }

    @Override // defpackage.fsv
    public final boolean i() {
        lqg lqgVar = this.j;
        if (lqgVar != null) {
            for (RecyclerView recyclerView : lqgVar.a) {
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
        ((frv) this.f.get()).n();
    }

    @Override // defpackage.fsv
    public final void k(int i) {
        if (i < 0 || i >= ((DefaultTabsBar) this.a.get()).j()) {
            return;
        }
        if (i == this.b.a()) {
            l(i, true);
        }
        this.b.m(i, false);
    }

    public final void l(int i, boolean z) {
        int i2 = this.h;
        if (i2 != -1) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (!((fsu) it.next()).d(i2)) {
                    it.remove();
                }
            }
        }
        ((DefaultTabsBar) this.a.get()).m(i, false);
        this.h = i;
        this.j = (lqg) this.i.get(i);
        for (fsu fsuVar : this.d) {
            fsuVar.b(i, z);
        }
    }
}
