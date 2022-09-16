package defpackage;

import android.graphics.drawable.StateListDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;
import com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: okq  reason: default package */
/* loaded from: classes3.dex */
public final class okq implements okf, yyb, yyc, gbl {
    private final aafd B;
    private final ypf C;
    private final kva D;
    private final olc E;
    private final axnm F;
    private final axnm G;
    private final ise H;
    public final aafo a;
    public final gbq b;
    public final ezh c;
    public final azqb d;
    public final ith e;
    public final yzm f;
    public final ayoi g;
    public final ayor h;
    public final etr i;
    public final olb j;
    public final ayoi k;
    public final olr l;
    public final axnm m;
    public PivotBar q;
    public boolean r;
    public boolean s;
    public izj t;
    public boolean u;
    public final aacz v;
    private final ajxz w;
    private final agbz x;
    private final luf y;
    private final ajsk z;
    private final Set A = Collections.newSetFromMap(new WeakHashMap());
    public final Set n = new HashSet();
    public final amup o = amup.k("com.google.android.apps.youtube.app.endpoint.flags", 16);
    public amuk p = amuk.q();

    public okq(ajxz ajxzVar, aafo aafoVar, luf lufVar, agbz agbzVar, gbq gbqVar, ezh ezhVar, azqb azqbVar, ajsk ajskVar, aafd aafdVar, yzm yzmVar, ayoi ayoiVar, ith ithVar, ypf ypfVar, ayor ayorVar, aacz aaczVar, kva kvaVar, ise iseVar, etr etrVar, olb olbVar, ayoi ayoiVar2, olc olcVar, olr olrVar, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, byte[] bArr) {
        this.w = ajxzVar;
        this.a = aafoVar;
        this.x = agbzVar;
        this.y = lufVar;
        this.b = gbqVar;
        this.c = ezhVar;
        this.d = azqbVar;
        this.z = ajskVar;
        this.B = aafdVar;
        this.f = yzmVar;
        this.g = ayoiVar;
        this.e = ithVar;
        this.C = ypfVar;
        this.h = ayorVar;
        this.v = aaczVar;
        this.D = kvaVar;
        this.H = iseVar;
        this.i = etrVar;
        this.j = olbVar;
        this.k = ayoiVar2;
        this.E = olcVar;
        this.l = olrVar;
        this.G = axnmVar;
        this.F = axnmVar2;
        this.m = axnmVar3;
        agbzVar.c(this, 0L);
        asxj asxjVar = aaczVar.b().e;
        if (!(asxjVar == null ? asxj.a : asxjVar).cg) {
            axnmVar.get();
        }
    }

    private final void A(float f) {
        if (this.r) {
            z(false);
            this.q.setTranslationY(f * this.q.getHeight());
            return;
        }
        t();
    }

    private final boolean B(int i) {
        aafd aafdVar = this.B;
        PaneDescriptor c = this.b.c();
        return aafdVar.a(c != null ? c.e() : null, (apzg) q(i).flatMap(meg.r).orElse(apzg.a));
    }

    private final boolean C(PaneDescriptor paneDescriptor) {
        return paneDescriptor == null || this.H.b(paneDescriptor);
    }

    private final boolean D(int i) {
        Optional q = q(i);
        if (!q.isPresent()) {
            return false;
        }
        q.flatMap(meg.r).ifPresent(new okj(this, 2));
        return true;
    }

    private final Optional x(atxk atxkVar) {
        Optional empty;
        aunb aunbVar = atxkVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer)) {
            aunb aunbVar2 = atxkVar.l;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            empty = Optional.of((UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) aunbVar2.qm(UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer));
        } else {
            empty = Optional.empty();
        }
        return empty.map(new okl(this, 1));
    }

    private final Optional y(String str) {
        return this.l.d(str).map(meg.u);
    }

    private final void z(boolean z) {
        boolean y;
        nml nmlVar;
        if (z) {
            this.q.setTranslationY(0.0f);
        }
        asxj asxjVar = this.v.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.cg) {
            WeakReference weakReference = (WeakReference) ((nmv) this.F.get()).a.get();
            y = (weakReference == null || (nmlVar = (nml) weakReference.get()) == null) ? false : nmlVar.y();
        } else {
            y = ((nml) this.G.get()).y();
        }
        if (this.q.j() <= 0 || !this.s || y) {
            t();
        } else {
            this.q.setVisibility(0);
        }
    }

    @Override // defpackage.yyb
    public final void a(int i, int i2, boolean z) {
        int a;
        this.x.d((String) q(i2).flatMap(meg.s).orElse(""));
        final mes mesVar = (mes) this.d.get();
        if (z) {
            mesVar.e();
        }
        Optional y = y("FElibrary");
        for (final int i3 = 0; i3 < this.p.size(); i3++) {
            final meq meqVar = (meq) this.p.get(i3);
            if (meqVar.b.isPresent()) {
                if (!y.isPresent() || ((Integer) y.get()).intValue() != i3) {
                    mesVar.g(meqVar, this.q.k(i3), null);
                } else {
                    mesVar.d(new zdt() { // from class: okg
                        @Override // defpackage.zdt
                        public final void a(Object obj) {
                            okq okqVar = okq.this;
                            mes mesVar2 = mesVar;
                            meq meqVar2 = meqVar;
                            int i4 = i3;
                            Boolean bool = (Boolean) obj;
                            if (bool == null || !bool.booleanValue()) {
                                return;
                            }
                            mesVar2.g(meqVar2, okqVar.q.k(i4), mesVar2.a());
                        }
                    });
                }
            }
        }
        if (!z) {
            return;
        }
        if (i2 == i && this.b.B() && B(i2)) {
            for (oke okeVar : this.A) {
                okeVar.F();
            }
            this.b.n();
        } else if (i2 == i) {
            if (!this.b.B()) {
                this.b.D();
            }
            if (this.b.B() && B(i2)) {
                return;
            }
            D(i2);
        } else {
            if (i != -1 && i < this.p.size()) {
                Optional flatMap = q(i).flatMap(meg.s);
                if (flatMap.isPresent() && !((String) flatMap.get()).isEmpty() && (a = this.x.a((String) flatMap.get())) > 0) {
                    this.q.g(i, true, a);
                }
            }
            if (i == i2) {
                return;
            }
            r(i2).ifPresent(new okj(this, 3));
            if (C(this.b.c())) {
                D(i2);
            }
            this.q.g(i2, false, 0);
        }
    }

    @Override // defpackage.izb
    public final void b(float f) {
        A(f);
    }

    @Override // defpackage.izr
    public final void c(izj izjVar) {
        this.t = izjVar;
    }

    @Override // defpackage.oft
    public final void d(float f) {
        A(f);
    }

    @Override // defpackage.okf
    public final aawr e() {
        return (aawr) this.e.a().aw();
    }

    @Override // defpackage.okf
    public final void f(oke okeVar) {
        this.A.add(okeVar);
    }

    @Override // defpackage.okf
    public final void g(boolean z) {
        if (z) {
            t();
        } else {
            z(false);
        }
    }

    @Override // defpackage.okf
    public final void h(boolean z) {
        if (!z) {
            u();
        }
    }

    @Override // defpackage.okf
    public final void j(PivotBar pivotBar) {
        this.q = pivotBar;
        this.b.j(this);
        this.q.c = true;
        this.C.f(new oki(this, 1));
        this.C.f(new oki(this));
        this.C.f(new oki(this, 3));
        this.C.f(new oki(this, 4));
        this.C.f(new oki(this, 2));
        this.C.f(new oki(this, 5));
    }

    @Override // defpackage.okf
    public final boolean k(String str) {
        str.getClass();
        return y(str).isPresent();
    }

    @Override // defpackage.agby
    public final void l(String str) {
    }

    @Override // defpackage.okf
    public final boolean m() {
        return D(this.q.i);
    }

    @Override // defpackage.okf
    public final void n(final Runnable runnable) {
        this.y.g();
        agbz agbzVar = this.x;
        ylr.c();
        for (Map.Entry entry : agbzVar.a.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                agbzVar.d(((agbx) entry.getKey()).a);
            }
            agbzVar.f(((agbx) entry.getKey()).a, agcf.b());
        }
        agbzVar.a.clear();
        ayoc b = this.e.b();
        final aynr a = this.C.a();
        b.h(new ayog() { // from class: zhk
            @Override // defpackage.ayog
            public final ayof a(ayoc ayocVar) {
                return ayocVar.H(aynr.this.L().j(new Object()));
            }
        }).T(new ayqb() { // from class: okp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                okq okqVar = okq.this;
                Runnable runnable2 = runnable;
                aawr aawrVar = (aawr) obj;
                okqVar.b.m();
                runnable2.run();
            }
        });
    }

    @Override // defpackage.agby
    public final void o(String str, boolean z, int i) {
        if (TextUtils.isEmpty(str) || this.p.isEmpty()) {
            return;
        }
        Optional y = y(str);
        if (!y.isPresent() || ((Integer) y.get()).intValue() == this.q.i || ((Integer) y.get()).intValue() < 0 || ((Integer) y.get()).intValue() >= this.p.size()) {
            return;
        }
        this.q.g(((Integer) y.get()).intValue(), z, i);
    }

    @Override // defpackage.okf
    public final void p(PaneDescriptor paneDescriptor) {
        Optional a = this.E.a(paneDescriptor);
        final olr olrVar = this.l;
        olrVar.getClass();
        Optional flatMap = a.flatMap(new Function() { // from class: okm
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return olr.this.d((String) obj);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        }).map(meg.u).flatMap(new okl(this));
        if (flatMap.isPresent()) {
            this.b.A(((Integer) flatMap.get()).intValue(), 0);
        }
    }

    @Override // defpackage.gbl
    public final void pr(int i, int i2) {
        boolean z = false;
        if (i2 == 1 && C(this.b.c())) {
            z = true;
        }
        this.u = z;
    }

    public final Optional q(int i) {
        if (i < 0 || i >= this.p.size()) {
            return Optional.empty();
        }
        return Optional.of((meq) this.p.get(i));
    }

    public final Optional r(int i) {
        return this.l.b(new olk(i)).map(meg.t);
    }

    public final Optional s(int i) {
        return this.l.c(i).map(meg.u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        z(true);
    }

    public final void w(int i) {
        if (i < 0 || i >= this.q.j()) {
            return;
        }
        this.q.m(i, false);
    }

    @Override // defpackage.okf
    public final void i(boolean z) {
        boolean g;
        int a;
        if (!z) {
            for (int i = 0; i < this.p.size(); i++) {
                PivotBar pivotBar = this.q;
                if (i != pivotBar.i) {
                    pivotBar.g(i, false, 0);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            if (i2 != this.q.i) {
                String str = (String) q(i2).flatMap(meg.s).orElse("");
                if (str.equals("FEactivity")) {
                    g = true;
                    if (!this.x.g("FEshared") && !this.x.g("FEnotifications_inbox")) {
                        g = false;
                    }
                    a = this.x.a("FEactivity");
                } else {
                    g = this.x.g(str);
                    a = this.x.a(str);
                }
                this.q.g(i2, g, a);
            }
        }
    }

    public final void v(boolean z) {
        apzg e;
        Optional empty;
        View b;
        if (this.q == null) {
            return;
        }
        boolean z2 = false;
        if (z) {
            for (String str : this.n) {
                ((akfw) this.m.get()).g(str);
            }
            this.n.clear();
            this.q.lb();
            int i = 0;
            while (i < this.p.size()) {
                meq meqVar = (meq) this.p.get(i);
                aoqu aoquVar = meqVar.a;
                if (aoquVar instanceof atxk) {
                    boolean z3 = meqVar.f || this.x.g((String) meqVar.d.orElse(""));
                    atxk atxkVar = (atxk) meqVar.a;
                    atxl atxlVar = (atxl) meqVar.g.orElse(atxl.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN);
                    ajxz ajxzVar = this.w;
                    arag aragVar = null;
                    if (ajxzVar instanceof fzr) {
                        PivotBar pivotBar = this.q;
                        fzr fzrVar = (fzr) ajxzVar;
                        arhs arhsVar = atxkVar.g;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                        arhr b2 = arhr.b(arhsVar.c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        int b3 = fzrVar.b(b2, z2);
                        fzr fzrVar2 = (fzr) this.w;
                        arhs arhsVar2 = atxkVar.g;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        arhr b4 = arhr.b(arhsVar2.c);
                        if (b4 == null) {
                            b4 = arhr.UNKNOWN;
                        }
                        int b5 = fzrVar2.b(b4, true);
                        if ((atxkVar.b & 16) != 0 && (aragVar = atxkVar.f) == null) {
                            aragVar = arag.a;
                        }
                        Spanned b6 = ajgl.b(aragVar);
                        int a = this.x.a(atxkVar.c);
                        atxi atxiVar = atxkVar.i;
                        if (atxiVar == null) {
                            atxiVar = atxi.a;
                        }
                        Map unmodifiableMap = Collections.unmodifiableMap((atxiVar.b == 318370164 ? (avsp) atxiVar.c : avsp.a).b);
                        Optional x = x(atxkVar);
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        stateListDrawable.addState(new int[]{16843518}, akf.a(pivotBar.getContext(), b5));
                        stateListDrawable.addState(StateSet.WILD_CARD, akf.a(pivotBar.getContext(), b3));
                        b = pivotBar.b(stateListDrawable, b6, z3, a, unmodifiableMap, atxlVar, x);
                    } else {
                        PivotBar pivotBar2 = this.q;
                        arhs arhsVar3 = atxkVar.g;
                        if (arhsVar3 == null) {
                            arhsVar3 = arhs.a;
                        }
                        arhr b7 = arhr.b(arhsVar3.c);
                        if (b7 == null) {
                            b7 = arhr.UNKNOWN;
                        }
                        int a2 = ajxzVar.a(b7);
                        if ((atxkVar.b & 16) != 0 && (aragVar = atxkVar.f) == null) {
                            aragVar = arag.a;
                        }
                        Spanned b8 = ajgl.b(aragVar);
                        int a3 = this.x.a(atxkVar.c);
                        atxi atxiVar2 = atxkVar.i;
                        if (atxiVar2 == null) {
                            atxiVar2 = atxi.a;
                        }
                        b = pivotBar2.b(akf.a(pivotBar2.getContext(), a2), b8, z3, a3, Collections.unmodifiableMap((atxiVar2.b == 318370164 ? (avsp) atxiVar2.c : avsp.a).b), atxlVar, x(atxkVar));
                    }
                    empty = Optional.of(b);
                } else if (aoquVar instanceof atxh) {
                    atxh atxhVar = (atxh) aoquVar;
                    atxl atxlVar2 = (atxl) meqVar.g.orElse(atxl.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN);
                    PivotBar pivotBar3 = this.q;
                    ajxz ajxzVar2 = this.w;
                    arhs arhsVar4 = atxhVar.g;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b9 = arhr.b(arhsVar4.c);
                    if (b9 == null) {
                        b9 = arhr.UNKNOWN;
                    }
                    int a4 = ajxzVar2.a(b9);
                    aovs aovsVar = atxhVar.f;
                    if (aovsVar == null) {
                        aovsVar = aovs.a;
                    }
                    aovr aovrVar = aovsVar.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    empty = Optional.of(pivotBar3.c(new mee(pivotBar3, R.layout.image_only_tab, pivotBar3.h, akf.a(pivotBar3.getContext(), a4), aovrVar.c, new HashMap(), Optional.empty()), false, 0, atxlVar2));
                } else {
                    empty = Optional.empty();
                }
                if (empty.isPresent()) {
                    final View view = (View) empty.get();
                    meqVar.h.ifPresent(new Consumer() { // from class: okk
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            okq okqVar = okq.this;
                            View view2 = view;
                            String str2 = (String) obj;
                            okqVar.n.add(str2);
                            ((akfw) okqVar.m.get()).d(str2, view2);
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return consumer.getClass();
                        }
                    });
                    if (eog.ax(this.v)) {
                        akef.e(view);
                    }
                    this.z.a(meqVar, view);
                }
                i++;
                z2 = false;
            }
            PivotBar pivotBar4 = this.q;
            pivotBar4.k = this;
            pivotBar4.l = this;
            s(this.b.a()).ifPresent(new okj(this, 4));
        } else {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                if (i2 != this.q.i) {
                    String str2 = (String) ((meq) this.p.get(i2)).d.orElse("");
                    this.q.g(i2, this.x.g(str2), this.x.a(str2));
                }
            }
        }
        Optional map = this.l.c(this.b.a()).map(meg.u);
        if (map.isPresent()) {
            w(((Integer) map.get()).intValue());
        } else {
            this.q.m(-1, false);
        }
        PaneDescriptor c = this.b.c();
        if (c != null && (((e = c.e()) != null && (e.qn(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint) || e.qn(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint) || e.qn(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint) || !((auoy) e.qm(SearchEndpointOuterClass.searchEndpoint)).f.isEmpty())) || ((e != null && (e.qn(WatchEndpointOuterClass.watchEndpoint) || e.qn(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || e.qn(attg.a))) || ((e != null && ((apnv) e.qm(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEvideo_picker")) || this.D.b(c))))) {
            t();
        } else {
            u();
        }
    }
}
