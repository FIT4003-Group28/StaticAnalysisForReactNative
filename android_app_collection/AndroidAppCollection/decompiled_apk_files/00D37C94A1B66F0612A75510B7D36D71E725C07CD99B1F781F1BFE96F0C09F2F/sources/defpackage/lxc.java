package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import j$.util.Collection;
import j$.util.function.Consumer;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: lxc  reason: default package */
/* loaded from: classes3.dex */
public final class lxc implements lwm {
    private aopa A;
    private aopa B;
    private aopa C;
    public final ajsm a;
    public final aafo b;
    final lxk c;
    ampq d;
    public boolean e;
    public ampq f;
    final RecyclerView g;
    aakw h;
    public acti i;
    public ampq j;
    public azpq k;
    public akaf l;
    private final Context m;
    private final LinearLayoutManager n;
    private final ajsf o;
    private final fqx p;
    private final String q;
    private final LayerableFilterEntityController r;
    private final axnm s;
    private final ajhl t;
    private final boolean u;
    private final boolean v;
    private final LinearLayout w;
    private final LinearLayout x;
    private View y;
    private boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ajsa] */
    public lxc(Activity activity, LinearLayout linearLayout, ajyi ajyiVar, aafo aafoVar, ajsg ajsgVar, ajte ajteVar, String str, aacz aaczVar, axnm axnmVar, ajhl ajhlVar, LayerableFilterEntityController layerableFilterEntityController) {
        this.m = activity;
        boolean an = eog.an(aaczVar);
        this.u = an;
        boolean ao = eog.ao(aaczVar);
        this.v = ao;
        LinearLayout linearLayout2 = an ? (LinearLayout) linearLayout.findViewById(R.id.chip_bar_container) : linearLayout;
        this.w = linearLayout2;
        LinearLayout linearLayout3 = an ? (LinearLayout) linearLayout.findViewById(R.id.overlay_container) : null;
        this.x = linearLayout3;
        this.i = acti.l;
        this.f = amon.a;
        this.d = amon.a;
        this.b = aafoVar;
        this.q = str;
        this.s = axnmVar;
        this.t = ajhlVar;
        this.r = layerableFilterEntityController;
        RecyclerView recyclerView = new RecyclerView(activity);
        this.g = recyclerView;
        recyclerView.af(ajteVar);
        Resources resources = activity.getResources();
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.filter_bar_height)));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.filter_bar_start_end_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.filter_bar_top_bottom_padding);
        recyclerView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        recyclerView.setClipToPadding(false);
        recyclerView.setImportantForAccessibility(1);
        recyclerView.setFocusable(true);
        recyclerView.setContentDescription(resources.getString(R.string.accessibility_feed_filter_bar_content_description));
        linearLayout2.addView(recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.n = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        recyclerView.v(new zaa(recyclerView, true));
        ajsf b = ajsgVar.b(ajyiVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.o = b;
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        b.h(ajsmVar);
        this.p = new fqx(activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_chip_padding));
        this.z = false;
        this.e = false;
        this.c = (!ao || !lxh.e(str) || linearLayout3 == null) ? new lxi() : new lxd(recyclerView, linearLayout3, this.i);
    }

    private final void A(aopa aopaVar) {
        RecyclerView recyclerView = this.g;
        xo xoVar = recyclerView.m;
        ajsf ajsfVar = this.o;
        if (xoVar != ajsfVar) {
            recyclerView.ad(ajsfVar);
            this.g.aC(this.p);
            this.o.rZ(new ajrt() { // from class: lwv
                @Override // defpackage.ajrt
                public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                    final lxc lxcVar = lxc.this;
                    if (lxcVar.l == null) {
                        zep.b("Skipping present context decoration when sectionListController is not set.");
                        return;
                    }
                    ajrsVar.a(lxcVar.i);
                    ampq r = lxcVar.r(i);
                    if (!r.h()) {
                        return;
                    }
                    amuk amukVar = fkg.a;
                    apvi apviVar = ((apvg) r.c()).e;
                    if (apviVar == null) {
                        apviVar = apvi.a;
                    }
                    apvh b = apvh.b(apviVar.c);
                    if (b == null) {
                        b = apvh.STYLE_UNKNOWN;
                    }
                    if (amukVar.contains(b)) {
                        return;
                    }
                    if (lxcVar.v(i)) {
                        fkg.g(ajrsVar, new View.OnClickListener() { // from class: lwr
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                lxc lxcVar2 = lxc.this;
                                if (!lxcVar2.j.h()) {
                                    zep.l("Default chip handler shouldn't fire if default chip not present.");
                                } else if (!lxcVar2.f.h()) {
                                    zep.l("Default chip should always be selected when no current selection exists.");
                                } else if (((Integer) lxcVar2.f.c()).equals(lxcVar2.j.c())) {
                                    zep.l("Should not be possible for Default chip to be selected when already selected.");
                                } else {
                                    lxcVar2.g.al(0);
                                    lxcVar2.u(((Integer) lxcVar2.j.c()).intValue(), true);
                                    lxcVar2.u(((Integer) lxcVar2.f.c()).intValue(), false);
                                    int intValue = ((Integer) lxcVar2.f.c()).intValue();
                                    lxcVar2.f = amon.a;
                                    azpq azpqVar = lxcVar2.k;
                                    if (azpqVar != null) {
                                        ampq j = ampq.j(Integer.valueOf(intValue));
                                        amon amonVar = amon.a;
                                        ampq ampqVar = lxcVar2.d;
                                        azpqVar.c(lwl.e(j, amonVar, ampqVar, ampqVar));
                                    }
                                    if (lxcVar2.d.h() && lxcVar2.w(amon.a)) {
                                        return;
                                    }
                                    lxcVar2.t();
                                }
                            }
                        });
                    } else {
                        fkg.f(ajrsVar, new ajrm() { // from class: lwu
                            @Override // defpackage.ajrm
                            public final boolean h(View view) {
                                lxc lxcVar2 = lxc.this;
                                int c = lxcVar2.g.c(view);
                                boolean z = true;
                                if (c != -1) {
                                    lxcVar2.g.al(c);
                                    ampq ampqVar = lxcVar2.f;
                                    lxcVar2.f = ampq.j(Integer.valueOf(c));
                                    if (ampqVar.h() && ((Integer) ampqVar.c()).intValue() == c) {
                                        lxcVar2.f = amon.a;
                                    }
                                    if (lxcVar2.f.h()) {
                                        lxcVar2.u(((Integer) lxcVar2.f.c()).intValue(), true);
                                    }
                                    if (ampqVar.h()) {
                                        lxcVar2.u(((Integer) ampqVar.c()).intValue(), false);
                                    }
                                    if (!ampqVar.h() || ((Integer) ampqVar.c()).intValue() != c) {
                                        if (!ampqVar.h()) {
                                            lxcVar2.s();
                                        }
                                        if (!lxcVar2.d.h() || !lxcVar2.w(amon.a)) {
                                            z = false;
                                        }
                                    } else {
                                        lxcVar2.s();
                                        if (!lxcVar2.d.h() || !lxcVar2.w(amon.a)) {
                                            lxcVar2.t();
                                        }
                                    }
                                    azpq azpqVar = lxcVar2.k;
                                    if (azpqVar != null) {
                                        ampq ampqVar2 = lxcVar2.f;
                                        ampq ampqVar3 = lxcVar2.d;
                                        azpqVar.c(lwl.e(ampqVar, ampqVar2, ampqVar3, ampqVar3));
                                    }
                                }
                                return z;
                            }
                        });
                    }
                    ajrsVar.g(amup.k("sectionListController", lxcVar.l));
                }
            });
        }
        this.A = aopaVar;
        this.a.clear();
        this.j = amon.a;
        int i = 0;
        int i2 = 0;
        for (aunb aunbVar : Collections.unmodifiableList(((aqyd) aopaVar.instance).c)) {
            if (aunbVar.qn(ChipCloudRendererOuterClass.chipCloudChipRenderer)) {
                apvg apvgVar = (apvg) aunbVar.qm(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                int i3 = apvgVar.b;
                if ((i3 & 2) != 0) {
                    if ((i3 & 16) != 0) {
                        apzg apzgVar = apvgVar.g;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        if (apzgVar.equals(apzg.a)) {
                        }
                    }
                    ampq j = ampq.j(Integer.valueOf(i2));
                    this.j = j;
                    int intValue = ((Integer) j.c()).intValue();
                    aopc aopcVar = (aopc) aunb.a.createBuilder();
                    aopg aopgVar = ChipCloudRendererOuterClass.chipCloudChipRenderer;
                    aopa mo52toBuilder = apvgVar.mo52toBuilder();
                    apzg apzgVar2 = apzg.a;
                    mo52toBuilder.copyOnWrite();
                    apvg apvgVar2 = (apvg) mo52toBuilder.instance;
                    apzgVar2.getClass();
                    apvgVar2.g = apzgVar2;
                    apvgVar2.b |= 16;
                    aopcVar.e(aopgVar, (apvg) mo52toBuilder.mo39build());
                    aopaVar.ae(intValue, aopcVar);
                    break;
                }
                continue;
            }
            i2++;
        }
        for (aunb aunbVar2 : Collections.unmodifiableList(((aqyd) aopaVar.instance).c)) {
            if (aunbVar2.qn(ChipCloudRendererOuterClass.chipCloudChipRenderer)) {
                apvg apvgVar3 = (apvg) aunbVar2.qm(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                this.a.add(apvgVar3);
                if (apvgVar3.i && !v(i)) {
                    this.f = ampq.j(Integer.valueOf(i));
                }
            } else if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
                this.a.add(aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer));
            } else if (aunbVar2.qn(ChipCloudRendererOuterClass.chipDividerRenderer)) {
                this.a.add(aunbVar2.qm(ChipCloudRendererOuterClass.chipDividerRenderer));
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean B(defpackage.aopa r7) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxc.B(aopa):boolean");
    }

    private final void x() {
        this.B = null;
        this.h = null;
        this.f = amon.a;
        this.g.aF(this.p);
        this.g.ad(null);
        this.a.clear();
    }

    private final boolean y(aakw aakwVar) {
        aqyd aqydVar;
        atnk atnkVar;
        if (lxh.f(this.q)) {
            if (lxh.d(aakwVar)) {
                auqg auqgVar = aakwVar.a.g;
                if (auqgVar == null) {
                    auqgVar = auqg.a;
                }
                if (auqgVar.b == 256220752) {
                    atnkVar = (atnk) auqgVar.c;
                } else {
                    atnkVar = atnk.a;
                }
                aunb aunbVar = atnkVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aqydVar = (aqyd) aunbVar.qm(FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer);
            }
            aqydVar = null;
        } else {
            auqg auqgVar2 = aakwVar.a.g;
            if (auqgVar2 == null) {
                auqgVar2 = auqg.a;
            }
            if (auqgVar2.b == 213380311) {
                auqg auqgVar3 = aakwVar.a.g;
                if (auqgVar3 == null) {
                    auqgVar3 = auqg.a;
                }
                if (auqgVar3.b == 213380311) {
                    aqydVar = (aqyd) auqgVar3.c;
                } else {
                    aqydVar = aqyd.a;
                }
            }
            aqydVar = null;
        }
        if (aqydVar == null) {
            return false;
        }
        this.c.g(false);
        this.d = amon.a;
        this.e = false;
        boolean B = B(aqydVar.mo52toBuilder());
        if (m() || aqydVar.e) {
            this.h = null;
        } else {
            this.h = aakwVar;
        }
        return B;
    }

    private final aopa z() {
        LinearLayout linearLayout;
        if (this.v && (linearLayout = this.x) != null) {
            linearLayout.setVisibility(8);
        }
        aopa aopaVar = this.B;
        int i = 10;
        if (aopaVar != null) {
            i = Math.min(((aqyd) aopaVar.instance).c.size(), 10);
        }
        aopa aopaVar2 = this.C;
        if (aopaVar2 == null || ((aqyd) aopaVar2.instance).c.size() != i) {
            aopa createBuilder = aqyd.a.createBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                aopa createBuilder2 = apvg.a.createBuilder();
                aopa createBuilder3 = apvi.a.createBuilder();
                apvh apvhVar = apvh.STYLE_HOME_FILTER;
                createBuilder3.copyOnWrite();
                apvi apviVar = (apvi) createBuilder3.instance;
                apviVar.c = apvhVar.p;
                apviVar.b |= 1;
                createBuilder2.copyOnWrite();
                apvg apvgVar = (apvg) createBuilder2.instance;
                apvi apviVar2 = (apvi) createBuilder3.mo39build();
                apviVar2.getClass();
                apvgVar.e = apviVar2;
                apvgVar.b |= 1;
                createBuilder2.copyOnWrite();
                apvg apvgVar2 = (apvg) createBuilder2.instance;
                apvgVar2.b |= 256;
                apvgVar2.i = false;
                aopc aopcVar = (aopc) aunb.a.createBuilder();
                aopcVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, (apvg) createBuilder2.mo39build());
                createBuilder.ad(aopcVar);
            }
            return createBuilder;
        }
        return this.C;
    }

    @Override // defpackage.fsi
    public final void a() {
        aopa aopaVar = this.B;
        if (aopaVar != null) {
            this.i.u(new acte(((aqyd) aopaVar.instance).f), null);
            aopa aopaVar2 = this.B;
            if (aopaVar2 == null || this.e) {
                return;
            }
            aqyd aqydVar = (aqyd) aopaVar2.instance;
            if ((aqydVar.b & 512) == 0) {
                return;
            }
            aafo aafoVar = this.b;
            apzg apzgVar = aqydVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            this.e = true;
        }
    }

    @Override // defpackage.lwm
    public final akam b() {
        aopa aopaVar = this.B;
        ampq ampqVar = this.f;
        ampq ampqVar2 = this.d;
        ampq a = this.c.a();
        aakw aakwVar = this.h;
        LinearLayoutManager linearLayoutManager = this.n;
        boolean z = this.z;
        boolean z2 = this.e;
        aopa aopaVar2 = this.C;
        aopa aopaVar3 = this.A;
        boolean z3 = false;
        if (aopaVar3 != null && aopaVar3 == aopaVar2) {
            z3 = true;
        }
        return new lxb(aopaVar, ampqVar, ampqVar2, a, aakwVar, linearLayoutManager, z, z2, aopaVar2, z3, this.a);
    }

    @Override // defpackage.lwm
    public final amvn c() {
        ampq ampqVar;
        aopa aopaVar;
        final amvl i = amvn.i();
        Collection.EL.stream(this.a).filter(lws.a).map(jsa.r).filter(lws.c).map(jsa.q).forEach(new Consumer() { // from class: lwy
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                amvl.this.c((String) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        if (!this.u || this.v || (aopaVar = this.B) == null) {
            ampqVar = amon.a;
        } else {
            aunb aunbVar = ((aqyd) aopaVar.instance).g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aunbVar.getClass();
            if (!aunbVar.qn(FeedFilterChipBarRendererOuterClass.a)) {
                ampqVar = amon.a;
            } else {
                aqyc aqycVar = (aqyc) aunbVar.qm(FeedFilterChipBarRendererOuterClass.a);
                ampqVar = (aqycVar.b & 4) != 0 ? ampq.j(aqycVar.e) : amon.a;
            }
        }
        if (ampqVar.h()) {
            i.c((String) ampqVar.c());
        }
        return i.g();
    }

    @Override // defpackage.lwm
    public final ayoi d() {
        azpq azpqVar = this.k;
        if (azpqVar == null) {
            return ayoi.G();
        }
        return azpqVar.V(ktg.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    @Override // defpackage.lwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand r8) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxc.e(com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand):void");
    }

    @Override // defpackage.lwm
    public final void f(asoa asoaVar) {
        String str;
        ampq ampqVar;
        ampq ampqVar2;
        arly arlyVar;
        if ((asoaVar.c & 1) != 0) {
            String str2 = asoaVar.d;
            if (this.d.h()) {
                arln arlnVar = (arln) this.d.c();
                if (arlnVar.b == 347924010) {
                    arlyVar = (arly) arlnVar.c;
                } else {
                    arlyVar = arly.a;
                }
                str = (String) arlyVar.b.get(0);
            } else {
                str = "";
            }
            boolean z = !str2.equals(str);
            ampq ampqVar3 = this.d;
            if (z) {
                aopa createBuilder = arln.a.createBuilder();
                aopa createBuilder2 = arly.a.createBuilder();
                createBuilder2.copyOnWrite();
                arly arlyVar2 = (arly) createBuilder2.instance;
                str2.getClass();
                aopu aopuVar = arlyVar2.b;
                if (!aopuVar.c()) {
                    arlyVar2.b = aopi.mutableCopy(aopuVar);
                }
                arlyVar2.b.add(str2);
                arly arlyVar3 = (arly) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                arln arlnVar2 = (arln) createBuilder.instance;
                arlyVar3.getClass();
                arlnVar2.c = arlyVar3;
                arlnVar2.b = 347924010;
                ampqVar = ampq.j((arln) createBuilder.mo39build());
            } else {
                ampqVar = amon.a;
            }
            this.d = ampqVar;
            this.c.c(z);
            azpq azpqVar = this.k;
            if (azpqVar != null) {
                ampq ampqVar4 = this.f;
                azpqVar.c(lwl.e(ampqVar4, ampqVar4, ampqVar3, this.d));
            }
            if (this.d.h() || this.f.h()) {
                if (z) {
                    if ((asoaVar.c & 2) != 0) {
                        apzg apzgVar = asoaVar.e;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        ampqVar2 = ampq.j(apzgVar);
                    } else {
                        ampqVar2 = amon.a;
                    }
                } else if ((asoaVar.c & 4) != 0) {
                    apzg apzgVar2 = asoaVar.f;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    ampqVar2 = ampq.j(apzgVar2);
                } else {
                    ampqVar2 = amon.a;
                }
                w(ampqVar2);
                return;
            }
            if ((asoaVar.c & 4) != 0) {
                aafo aafoVar = this.b;
                apzg apzgVar3 = asoaVar.f;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar.a(apzgVar3);
            }
            t();
        }
    }

    @Override // defpackage.lwm
    public final void g() {
        azpq azpqVar = this.k;
        if (azpqVar != null) {
            azpqVar.sm();
        }
        x();
        this.z = false;
    }

    @Override // defpackage.lwm
    public final void h() {
        View view;
        azpq azpqVar = this.k;
        if (azpqVar != null) {
            azpqVar.sm();
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null && (view = this.y) != null) {
            linearLayout.removeView(view);
        }
        this.c.b();
        this.w.removeView(this.g);
        this.z = false;
        this.e = false;
        this.l = null;
    }

    @Override // defpackage.lwm
    public final void i() {
        if (this.z) {
            this.z = false;
            aopa aopaVar = this.B;
            if (aopaVar == null) {
                return;
            }
            A(aopaVar);
        }
    }

    @Override // defpackage.lwm
    public final void j() {
        this.z = true;
        aopa aopaVar = this.C;
        if (aopaVar != null) {
            A(aopaVar);
        }
    }

    @Override // defpackage.lwm
    public final boolean k(aakw aakwVar, akaf akafVar, acti actiVar) {
        this.i = actiVar;
        if (this.v) {
            this.c.e(actiVar);
        }
        this.k = azpq.e();
        this.l = akafVar;
        return y(aakwVar);
    }

    @Override // defpackage.lwm
    public final boolean l() {
        return this.z;
    }

    @Override // defpackage.lwm
    public final boolean m() {
        return this.f.h() || this.d.h();
    }

    @Override // defpackage.lwm
    public final boolean n() {
        return this.z || (this.B != null && !this.a.isEmpty());
    }

    @Override // defpackage.lwm
    public final boolean o() {
        if (!m() || this.z) {
            return false;
        }
        if (this.u && !this.f.h()) {
            return false;
        }
        ampq ampqVar = this.f;
        amon amonVar = amon.a;
        this.f = amonVar;
        azpq azpqVar = this.k;
        if (azpqVar != null) {
            ampq ampqVar2 = this.d;
            azpqVar.c(lwl.e(ampqVar, amonVar, ampqVar2, ampqVar2));
        }
        u(((Integer) ampqVar.c()).intValue(), false);
        s();
        t();
        return true;
    }

    @Override // defpackage.lwm
    public final boolean p(akam akamVar, akaf akafVar, acti actiVar) {
        this.i = actiVar;
        this.l = akafVar;
        if (!(akamVar instanceof lxb)) {
            return false;
        }
        lxb lxbVar = (lxb) akamVar;
        this.h = lxbVar.d;
        this.f = lxbVar.a;
        this.d = lxbVar.b;
        this.e = lxbVar.g;
        this.k = azpq.e();
        aopa aopaVar = lxbVar.h;
        boolean z = true;
        if (aopaVar != null && lxbVar.f) {
            this.B = aopaVar;
            this.C = lxbVar.i;
            this.C = z();
            j();
            this.n.Y(lxbVar.e);
        } else if (aopaVar == null) {
            return false;
        } else {
            this.c.g(true);
            z = B(lxbVar.h);
            if (lxbVar.c.h()) {
                this.c.d((lxj) lxbVar.c.c());
            }
            this.n.Y(lxbVar.e);
        }
        return z;
    }

    @Override // defpackage.lwm
    public final boolean q(aakw aakwVar) {
        if (this.z) {
            this.z = false;
            x();
            this.d = amon.a;
            azpq azpqVar = this.k;
            if (azpqVar != null) {
                azpqVar.c(lwl.e(amon.a, amon.a, amon.a, amon.a));
            }
            this.e = false;
            return y(aakwVar);
        }
        return false;
    }

    public final ampq r(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.size()) {
            z = true;
        }
        aqxo.s(z, "chip index %s not in adapter", i);
        return this.a.get(i) instanceof apvg ? ampq.j((apvg) this.a.get(i)) : amon.a;
    }

    public final void s() {
        if (this.j.h()) {
            u(((Integer) this.j.c()).intValue(), !this.f.h());
            if (this.f.h()) {
                return;
            }
            this.g.al(0);
        }
    }

    public final void t() {
        aopa aopaVar;
        akaf akafVar = this.l;
        if (akafVar == null || (aopaVar = this.B) == null) {
            return;
        }
        aakw aakwVar = this.h;
        if (aakwVar != null) {
            akafVar.K(aakwVar);
            return;
        }
        aqyd aqydVar = (aqyd) aopaVar.instance;
        if ((aqydVar.b & 1) == 0) {
            return;
        }
        aafo aafoVar = this.b;
        apzg apzgVar = aqydVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, amup.k("sectionListController", this.l));
    }

    public final void u(final int i, boolean z) {
        if (i < 0 || i >= this.a.size()) {
            return;
        }
        apvg apvgVar = (apvg) this.a.get(i);
        boolean z2 = apvgVar.i;
        aopa mo52toBuilder = apvgVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        apvg apvgVar2 = (apvg) mo52toBuilder.instance;
        apvgVar2.b |= 256;
        apvgVar2.i = z;
        apvg apvgVar3 = (apvg) mo52toBuilder.mo39build();
        this.a.n(i, apvgVar3);
        if (zdg.e(this.m) && z && !z2) {
            this.g.postDelayed(new Runnable() { // from class: lwx
                @Override // java.lang.Runnable
                public final void run() {
                    View S;
                    lxc lxcVar = lxc.this;
                    int i2 = i;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lxcVar.g.n;
                    if (linearLayoutManager == null || (S = linearLayoutManager.S(i2)) == null) {
                        return;
                    }
                    S.requestFocus();
                    S.sendAccessibilityEvent(8);
                }
            }, 200L);
        }
        aopa aopaVar = this.A;
        if (aopaVar == null) {
            return;
        }
        aopc aopcVar = (aopc) aunb.a.createBuilder();
        aopcVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, apvgVar3);
        aopaVar.ae(i, aopcVar);
    }

    public final boolean v(int i) {
        return this.j.h() && ((Integer) this.j.c()).intValue() == i;
    }

    public final boolean w(ampq ampqVar) {
        akaf akafVar;
        Object j;
        if (!this.u || (akafVar = this.l) == null) {
            return false;
        }
        lxa lxaVar = new lxa(this, ampqVar);
        ampq b = this.f.b(new ampg() { // from class: lww
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return lxc.this.r(((Integer) obj).intValue()).b(lhh.q).a(amon.a);
            }
        });
        aopa aopaVar = this.B;
        if (aopaVar == null) {
            j = amon.a;
        } else {
            apzg apzgVar = ((aqyd) aopaVar.instance).d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            j = ampq.j(apzgVar);
        }
        ampq ampqVar2 = (ampq) b.e(j);
        final arln arlnVar = (arln) this.d.f();
        if (!ampqVar2.h()) {
            return false;
        }
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint) ((apzg) ampqVar2.c()).qm(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
        apoa apoaVar = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (apoaVar == null) {
            apoaVar = apoa.a;
        }
        if ((apoaVar.b & 1) == 0) {
            return false;
        }
        apoa apoaVar2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (apoaVar2 == null) {
            apoaVar2 = apoa.a;
        }
        aumx aumxVar = apoaVar2.c;
        if (aumxVar == null) {
            aumxVar = aumx.a;
        }
        akafVar.li(aumxVar, new zdt() { // from class: lwt
            @Override // defpackage.zdt
            public final void a(Object obj) {
                arln arlnVar2 = arln.this;
                aapd aapdVar = (aapd) obj;
                if (!(aapdVar instanceof aatf) || arlnVar2 == null) {
                    return;
                }
                ((aatf) aapdVar).t = arlnVar2;
            }
        }, lxaVar, (apzg) ampqVar2.c());
        return true;
    }
}
