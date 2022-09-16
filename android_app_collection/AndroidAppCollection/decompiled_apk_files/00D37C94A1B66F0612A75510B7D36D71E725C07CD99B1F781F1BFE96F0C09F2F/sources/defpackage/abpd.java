package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abpd  reason: default package */
/* loaded from: classes.dex */
public abstract class abpd implements abkq {
    private final View.OnLayoutChangeListener a;
    protected final Context b;
    protected final ajyi c;
    protected final ajsg d;
    protected final acti e;
    protected abkp f;
    protected ajqm g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    private final abpc l;
    private final abjy m;
    private ajqm n;
    private abpp o;
    private boolean p;
    private boolean q;
    private CharSequence s;
    private Runnable t;
    private ajzm u;
    private int r = 0;
    private final Runnable v = new Runnable() { // from class: abpa
        @Override // java.lang.Runnable
        public final void run() {
            abpd.this.i();
        }
    };
    private final ajql w = new abpb(this);

    public abpd(Context context, ajyi ajyiVar, ajsg ajsgVar, acti actiVar, abjy abjyVar) {
        context.getClass();
        this.b = context;
        ajyiVar.getClass();
        this.c = ajyiVar;
        ajyiVar.a(assn.class);
        this.d = ajsgVar;
        actiVar.getClass();
        this.e = actiVar;
        this.a = new View.OnLayoutChangeListener() { // from class: aboy
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                abpd abpdVar = abpd.this;
                if (i4 - i2 != i8 - i6) {
                    abpdVar.h();
                }
            }
        };
        this.l = new abpc(this);
        this.m = abjyVar;
    }

    private static void I(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != null) {
                ajru g = akel.g(childAt);
                if (g instanceof abrg) {
                    abrg abrgVar = (abrg) g;
                    if (i == 0) {
                        abrgVar.mW();
                    } else if (i == 1) {
                        abrgVar.mV();
                    } else if (i != 2) {
                        abrgVar.mX();
                    } else {
                        abrgVar.mU();
                    }
                }
            }
        }
    }

    @Override // defpackage.abkq
    public final void A() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            D(false);
            ((LoadingFrameLayout) parent).c();
        }
        this.r = 1;
        s();
    }

    @Override // defpackage.abkq
    public final void B() {
    }

    public abpp C() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(boolean z) {
        if (z == this.q) {
            return;
        }
        this.q = z;
        View d = d();
        if (d == null) {
            return;
        }
        if (z) {
            d.setImportantForAccessibility(1);
            d.animate().translationY(0.0f).setDuration(200L);
            return;
        }
        d.animate().translationY(this.b.getResources().getDimensionPixelOffset(R.dimen.live_chat_more_comments_button_horizontal_offset)).setDuration(200L);
        d.setImportantForAccessibility(2);
    }

    public final void E() {
        RecyclerView b = b();
        if (b != null) {
            b.postDelayed(this.v, 10000L);
        }
    }

    public final void F() {
        RecyclerView b = b();
        if (b != null) {
            b.removeCallbacks(this.v);
        }
    }

    public final boolean G() {
        int L = ((LinearLayoutManager) a().n).L();
        return L == -1 || L == this.g.a() + (-1);
    }

    public final boolean H() {
        RecyclerView b = b();
        return b != null && ((LinearLayoutManager) b.n).J() == 0;
    }

    public abstract RecyclerView a();

    public abstract RecyclerView b();

    public abstract View d();

    public abstract ajzn f();

    @Override // defpackage.abho
    public final void g(boolean z) {
        RecyclerView a = a();
        if (z) {
            if (a.E != null) {
                return;
            }
            a.af(new vq());
        } else if (a.E == null) {
        } else {
            a.af(null);
        }
    }

    @Override // defpackage.abho
    public final void h() {
        int a = this.g.a();
        if (a > 0) {
            RecyclerView a2 = a();
            int i = a - 10;
            if (((LinearLayoutManager) a2.n).L() < i) {
                a2.ab(i);
            }
            this.h = true;
            a2.al(a - 1);
        }
    }

    @Override // defpackage.abho
    public final void i() {
        ajqm ajqmVar;
        RecyclerView b = b();
        if (b == null || (ajqmVar = this.n) == null || ((ync) ajqmVar).size() <= 0) {
            return;
        }
        b.removeCallbacks(this.v);
        if (((LinearLayoutManager) b.n).J() > 10) {
            b.ab(10);
        }
        this.j = true;
        b.al(0);
    }

    @Override // defpackage.abho
    public final boolean j() {
        return this.h || G();
    }

    @Override // defpackage.abho
    public final boolean k() {
        return this.j || H();
    }

    @Override // defpackage.abho
    public final boolean l() {
        return this.i == 1;
    }

    @Override // defpackage.abho
    public final boolean m() {
        return this.k == 1;
    }

    @Override // defpackage.abrg
    public final void mU() {
        F();
        I(b(), 2);
    }

    @Override // defpackage.abrg
    public final void mV() {
        i();
        I(b(), 1);
    }

    @Override // defpackage.abrg
    public final void mW() {
        i();
        I(b(), 0);
    }

    @Override // defpackage.abrg
    public final void mX() {
        F();
        I(b(), 3);
    }

    @Override // defpackage.abkq
    public final int n() {
        return this.r;
    }

    @Override // defpackage.abkq
    public final CharSequence o() {
        return this.s;
    }

    @Override // defpackage.abkq
    public final Runnable p() {
        return this.t;
    }

    @Override // defpackage.abkq
    public final void q() {
        if (this.p) {
            return;
        }
        View d = d();
        if (d != null) {
            d.setOnClickListener(new View.OnClickListener() { // from class: abox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abkq abkqVar;
                    abkp abkpVar = abpd.this.f;
                    if (abkpVar == null || (abkqVar = ((abiq) abkpVar).e) == null) {
                        return;
                    }
                    abkqVar.h();
                }
            });
        }
        RecyclerView a = a();
        RecyclerView b = b();
        a.addOnLayoutChangeListener(this.a);
        a.aE(this.l);
        if (b != null) {
            b.aE(this.l);
        }
        this.p = true;
    }

    @Override // defpackage.abkq
    public final void r() {
        RecyclerView a = a();
        ajzm ajzmVar = this.u;
        if (ajzmVar != null) {
            ajzmVar.b(a);
            this.u = null;
        } else {
            a.ad(null);
        }
        a.ag(null);
        a.removeOnLayoutChangeListener(this.a);
        a.aG(this.l);
        this.p = false;
        this.g = null;
        this.n = null;
        this.i = 0;
        RecyclerView b = b();
        if (b != null) {
            F();
            b.ad(null);
            b.ag(null);
            b.aG(this.l);
        }
        this.k = 0;
    }

    @Override // defpackage.abkq
    public final void s() {
        abpp abppVar = this.o;
        if (abppVar != null) {
            abppVar.b = -1;
            abppVar.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ajsa] */
    @Override // defpackage.abkq
    public void t(ajqm ajqmVar, ajrt ajrtVar) {
        ajsf ajsfVar;
        if (this.g == ajqmVar) {
            return;
        }
        this.g = ajqmVar;
        ajsg ajsgVar = this.d;
        if (ajsgVar != 0) {
            ajsfVar = ajsgVar.a(this.c.get());
        } else {
            ajsfVar = new ajsf(this.c.get());
        }
        ajsfVar.h(ajqmVar);
        ajsfVar.rZ(new ajrc(this.e));
        if (ajrtVar != null) {
            ajsfVar.rZ(ajrtVar);
        }
        RecyclerView a = a();
        if (this.m.a.g && f() != null) {
            this.u = ((akdb) f()).a(a, ajsfVar);
        }
        ajzm ajzmVar = this.u;
        if (ajzmVar != null) {
            ajzmVar.a(a);
        } else {
            a.ad(ajsfVar);
        }
        a.ag(new WrappedLinearLayoutManager());
        a.af(null);
        abpp abppVar = this.o;
        if (abppVar != null) {
            a.aF(abppVar);
        }
        abpp C = C();
        this.o = C;
        if (C == null) {
            return;
        }
        a.aC(C);
    }

    @Override // defpackage.abkq
    public final void u(CharSequence charSequence, Runnable runnable) {
        this.s = charSequence;
        this.t = runnable;
    }

    @Override // defpackage.abkq
    public final void v(abkp abkpVar) {
        this.f = abkpVar;
    }

    @Override // defpackage.abkq
    public final void w(int i) {
        if (i == 0 || i == 1) {
            A();
        } else if (i != 2) {
            z(this.s, this.t);
        } else {
            y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ajsa] */
    @Override // defpackage.abkq
    public final void x(ajqm ajqmVar, ajrt ajrtVar) {
        ajqm ajqmVar2 = this.n;
        if (ajqmVar2 == ajqmVar) {
            return;
        }
        if (ajqmVar2 != null) {
            ajqmVar2.pl(this.w);
        }
        this.n = ajqmVar;
        if (ajqmVar != null) {
            ajqmVar.lT(this.w);
        }
        RecyclerView b = b();
        if (b == null) {
            return;
        }
        WrappedLinearLayoutManager wrappedLinearLayoutManager = new WrappedLinearLayoutManager();
        wrappedLinearLayoutManager.ab(0);
        b.ag(wrappedLinearLayoutManager);
        if (b.getTag(R.id.live_chat_ticker_view_decorator_added_tag) == null) {
            b.aC(new abqu(this.b.getResources().getDimensionPixelOffset(R.dimen.live_chat_ticker_header_width)));
            b.setTag(R.id.live_chat_ticker_view_decorator_added_tag, true);
        }
        ajsf a = this.d.a(this.c.get());
        a.h(ajqmVar);
        a.rZ(new ajrc(this.e));
        if (ajrtVar != null) {
            a.rZ(ajrtVar);
        }
        b.ad(a);
    }

    @Override // defpackage.abkq
    public final void y() {
        ViewParent parent = a().getParent();
        if (parent instanceof LoadingFrameLayout) {
            ((LoadingFrameLayout) parent).a();
        }
        this.r = 2;
    }

    @Override // defpackage.abkq
    public final void z(CharSequence charSequence, final Runnable runnable) {
        ViewParent parent = a().getParent();
        this.r = 3;
        this.s = charSequence;
        this.t = runnable;
        if (parent instanceof LoadingFrameLayout) {
            final LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) parent;
            boolean z = runnable != null;
            if (z) {
                loadingFrameLayout.f(new akgj() { // from class: aboz
                    @Override // defpackage.akgj
                    public final void qX() {
                        LoadingFrameLayout loadingFrameLayout2 = LoadingFrameLayout.this;
                        Runnable runnable2 = runnable;
                        if (loadingFrameLayout2 instanceof VerticalShimmerLoadingFrameLayout) {
                            loadingFrameLayout2.a();
                        }
                        loadingFrameLayout2.c();
                        runnable2.run();
                    }
                });
            }
            loadingFrameLayout.b(charSequence, z);
        }
        s();
    }
}
