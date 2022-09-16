package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nrd  reason: default package */
/* loaded from: classes3.dex */
public final class nrd extends nra implements akai {
    public fhg d;
    public ajzq e;
    public nnl f;
    public nrb g;
    public SwipeRefreshLayout h;
    public RecyclerView i;
    private final Context j;
    private final acti k;
    private final azqb l;
    private final gew m;
    private final tdu n;
    private final aari o;
    private final fhh p;

    public nrd(Context context, acti actiVar, azqb azqbVar, gew gewVar, fhh fhhVar, tdu tduVar, aari aariVar) {
        this.j = context;
        this.k = actiVar;
        this.l = azqbVar;
        this.m = gewVar;
        this.p = fhhVar;
        this.n = tduVar;
        this.o = aariVar;
    }

    @Override // defpackage.nnc
    public final void d() {
        SwipeRefreshLayout swipeRefreshLayout = this.h;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.l(false);
            this.h.clearAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, ajsa] */
    public final View g() {
        SwipeRefreshLayout swipeRefreshLayout = this.h;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.j).inflate(R.layout.section_list, (ViewGroup) null, false);
        this.i = recyclerView;
        recyclerView.ag(LinearScrollToItemLayoutManager.q(this.j));
        zn znVar = (zn) recyclerView.E;
        if (znVar != null) {
            znVar.x();
        }
        SwipeRefreshLayout swipeRefreshLayout2 = new SwipeRefreshLayout(this.j);
        this.h = swipeRefreshLayout2;
        swipeRefreshLayout2.j(zhn.j(this.j, R.attr.ytTextPrimary).orElse(-16777216));
        swipeRefreshLayout2.k(zhn.j(this.j, R.attr.ytTextPrimaryInverse).orElse(-1));
        swipeRefreshLayout2.setBackgroundColor(zhn.j(this.j, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
        swipeRefreshLayout2.addView(recyclerView);
        fhg a = this.p.a(swipeRefreshLayout2);
        this.d = a;
        nnl nnlVar = this.f;
        if (nnlVar == null) {
            throw new IllegalStateException("engagementPanelSectionControllerFactory cannot be null");
        }
        gev b = this.m.b(recyclerView, this.o, nnlVar, this.k, ((ajyi) this.l.get()).get(), this, a, ajkb.ENGAGEMENT, this.n, this.j, noi.a());
        this.e = b;
        a.d(b);
        for (ajrt ajrtVar : this.a) {
            b.u(ajrtVar);
        }
        this.a.clear();
        b.x(new nrc(this));
        Object obj = this.b;
        if (obj != null) {
            b.K(new aakw((auqh) obj));
            b.N(this.c);
        }
        return swipeRefreshLayout2;
    }

    @Override // defpackage.nnc
    public final void h() {
        ajzq ajzqVar = this.e;
        if (ajzqVar != null) {
            ajzqVar.c();
        }
    }

    public final void i(auqh auqhVar, boolean z) {
        this.b = auqhVar;
        this.c = z;
        ajzq ajzqVar = this.e;
        if (ajzqVar == null) {
            return;
        }
        if (auqhVar != null) {
            ajzqVar.K(new aakw(auqhVar));
            this.e.N(z);
            return;
        }
        ajzqVar.h();
    }

    @Override // defpackage.akai
    public final void ll() {
        ajzq ajzqVar = this.e;
        if (ajzqVar != null) {
            ajzqVar.ll();
        }
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return false;
    }

    @Override // defpackage.ajzw
    public final boolean ln(String str, int i, Runnable runnable) {
        throw null;
    }

    @Override // defpackage.nnc
    public final void pc() {
    }

    @Override // defpackage.nnc
    public final void pd() {
        ajzq ajzqVar = this.e;
        if (ajzqVar != null) {
            ajzqVar.j();
        }
        fhg fhgVar = this.d;
        if (fhgVar != null) {
            fhgVar.b();
        }
    }
}
