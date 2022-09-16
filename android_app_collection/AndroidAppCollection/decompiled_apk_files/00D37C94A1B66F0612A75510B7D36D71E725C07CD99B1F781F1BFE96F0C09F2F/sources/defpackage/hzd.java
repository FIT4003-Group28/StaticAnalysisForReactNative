package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hzd  reason: default package */
/* loaded from: classes3.dex */
public final class hzd implements akai, hys, hzm, akgj {
    public final LoadingFrameLayout a;
    public final gfm b;
    public final acth c;
    public final ntu d;
    public final yzj e;
    public final ajzq f;
    public InteractionLoggingScreen g;
    public xmd h;
    private final CoordinatorLayout i;
    private final aath j;
    private final Executor k;
    private final hzn l;
    private apzg m;

    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ajsa] */
    public hzd(Context context, yni yniVar, acth acthVar, yzj yzjVar, final aath aathVar, ajyi ajyiVar, final nle nleVar, final xmb xmbVar, ajsg ajsgVar, gfu gfuVar, final xyb xybVar, final xyd xydVar, final hzn hznVar, Executor executor, aadd aaddVar, aynx aynxVar) {
        int color;
        this.c = acthVar;
        this.j = aathVar;
        this.k = executor;
        this.l = hznVar;
        this.e = yzjVar;
        final acti oi = acthVar.oi();
        ajyk ajykVar = new ajyk() { // from class: hzc
            @Override // defpackage.ajyk
            public final ajyj a(Object obj, akam akamVar, akaf akafVar) {
                hzd hzdVar = hzd.this;
                xmb xmbVar2 = xmbVar;
                aath aathVar2 = aathVar;
                acti actiVar = oi;
                xyb xybVar2 = xybVar;
                xyd xydVar2 = xydVar;
                final hzn hznVar2 = hznVar;
                nle nleVar2 = nleVar;
                if (obj instanceof aqbw) {
                    xma a = xmbVar2.a((aqbw) obj, aathVar2, actiVar, xybVar2, xydVar2);
                    a.b = new xly() { // from class: hyz
                        @Override // defpackage.xly
                        public final void a() {
                            hzn.this.a();
                        }
                    };
                    a.i(hzdVar.h);
                    return a;
                } else if (!(obj instanceof aakq)) {
                    return null;
                } else {
                    nld a2 = nleVar2.a(aathVar2, actiVar);
                    a2.i((aakq) obj);
                    return a2;
                }
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_comment_view, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.reel_comment_coordinator_layout);
        this.i = coordinatorLayout;
        if (gfuVar.a() == gfs.DARK) {
            color = context.getResources().getColor(R.color.yt_black1);
        } else {
            color = context.getResources().getColor(R.color.yt_white1);
        }
        coordinatorLayout.setBackgroundColor(color);
        hznVar.e = LayoutInflater.from(hznVar.c).inflate(R.layout.reel_engagement_sheet_header, (ViewGroup) null, false);
        hznVar.f = (TextView) hznVar.e.findViewById(R.id.title);
        hznVar.e.findViewById(R.id.reel_engagement_sheet_close_button).setOnClickListener(new View.OnClickListener() { // from class: hzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hzn.this.a();
            }
        });
        hznVar.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hzk
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                hzn hznVar2 = hzn.this;
                if (hznVar2.l != null) {
                    int height = hznVar2.g - view.getHeight();
                    hznVar2.i = height;
                    zgd.t(((hzd) hznVar2.l).a, zgd.h(height), ViewGroup.LayoutParams.class);
                }
            }
        });
        hznVar.k = new CoordinatorLayout(hznVar.c);
        LinearLayout linearLayout = new LinearLayout(hznVar.c);
        linearLayout.setOrientation(1);
        linearLayout.addView(hznVar.e);
        linearLayout.addView(coordinatorLayout);
        hznVar.k.addView(linearLayout);
        hznVar.b.ae = this;
        hznVar.l = this;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.reel_comment_loading_preview);
        this.a = loadingFrameLayout;
        loadingFrameLayout.f(this);
        zgd.t(loadingFrameLayout, zgd.h(hznVar.i), ViewGroup.LayoutParams.class);
        zgd.t(loadingFrameLayout, zgd.r(hznVar.h), ViewGroup.LayoutParams.class);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_comments);
        OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
        overScrollLinearLayoutManager.ab(1);
        recyclerView.ag(overScrollLinearLayoutManager);
        ntu ntuVar = new ntu();
        this.d = ntuVar;
        ntuVar.A(acthVar.oi());
        ajzq ajzqVar = new ajzq(null, recyclerView, ajsgVar, new ajyx(), aathVar, yniVar, ajykVar, yzjVar, ntuVar, ajyiVar.get(), this, ajzs.d, aaddVar, aynxVar);
        this.b = new gfm((StickyHeaderContainer) inflate.findViewById(R.id.sticky_header_container), (xo) ajzqVar.f, new hyy(((ajwb) ajzqVar).e));
        this.f = ajzqVar;
    }

    public final void b(apzg apzgVar, xmd xmdVar, boolean z) {
        acup a;
        c();
        this.m = apzgVar;
        this.h = xmdVar;
        byte[] bl = eog.bl(apzgVar);
        aatf f = this.j.f();
        f.k(bl);
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = apzgVar != null ? (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apzgVar.qm(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand) : null;
        if (showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand != null) {
            f.t(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.c);
            f.v(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.e);
            hzn hznVar = this.l;
            arag aragVar = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            hznVar.j = b;
            TextView textView = hznVar.f;
            if (textView != null) {
                textView.setText(b);
                hznVar.f.setVisibility(b != null ? 0 : 8);
                String charSequence = hznVar.j.toString();
                View view = hznVar.e;
                if (view != null) {
                    view.setContentDescription(charSequence);
                }
            }
            final hzn hznVar2 = this.l;
            if (!hznVar2.b.ap() && hznVar2.d == null && hznVar2.k != null) {
                hznVar2.d = hznVar2.a.getSupportFragmentManager().l();
                hznVar2.d.v(new Runnable() { // from class: hzl
                    @Override // java.lang.Runnable
                    public final void run() {
                        hzn.this.d = null;
                    }
                });
                hznVar2.b.aH(hznVar2.d, hznVar2.k, "REEL_COMMENT_REPLIES_VIEW_TAG");
            }
            this.g = this.d.c();
            ntu ntuVar = this.d;
            if (apzgVar == null) {
                a = acuo.a(32276);
            } else {
                int i = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apzgVar.qm(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand)).h;
                if (i == 0) {
                    a = acuo.a(32276);
                } else {
                    a = acuo.a(i);
                }
            }
            ntuVar.F(a, acuc.OVERLAY, apzgVar);
            this.a.c();
            if (z || showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f) {
                f.q(2);
            }
        } else {
            zep.b("ReelCommentRepliesController: cannot load navigation endpoint.");
        }
        ylx.k(this.j.h(f, this.k), anjk.a, new ylv() { // from class: hza
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                hzd hzdVar = hzd.this;
                zdy a2 = hzdVar.e.a(th);
                hzdVar.a.b(a2.a, true);
                hzdVar.d.A(hzdVar.c.oi());
                ntu ntuVar2 = hzdVar.d;
                String str = a2.b;
                if (ntuVar2.c() != null) {
                    ntuVar2.c().c();
                    int i2 = ntuVar2.c().f;
                    aopa createBuilder = asjj.a.createBuilder();
                    aopa createBuilder2 = asjc.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    asjc asjcVar = (asjc) createBuilder2.instance;
                    str.getClass();
                    asjcVar.b = 1 | asjcVar.b;
                    asjcVar.c = str;
                    createBuilder2.copyOnWrite();
                    asjc asjcVar2 = (asjc) createBuilder2.instance;
                    asjcVar2.b |= 2;
                    asjcVar2.d = i2;
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    asjc asjcVar3 = (asjc) createBuilder2.mo39build();
                    asjcVar3.getClass();
                    asjjVar.l = asjcVar3;
                    asjjVar.b |= 16384;
                    awbs h = ntuVar2.h(new Object(), acuo.b(22811));
                    ntuVar2.D(acun.a(h));
                    ntuVar2.u(acun.a(h), (asjj) createBuilder.mo39build());
                }
            }
        }, new ylw() { // from class: hzb
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                hzd hzdVar = hzd.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (!browseResponseModel.j()) {
                    amuk g = browseResponseModel.g();
                    if (!g.isEmpty()) {
                        auqh auqhVar = ((aaky) g.get(0)).a().a;
                        hzdVar.d.A(hzdVar.c.oi());
                        hzdVar.f.h();
                        hzdVar.b.c();
                        hzdVar.f.K(new aakw(auqhVar));
                        hzdVar.a.a();
                    }
                }
                hzdVar.d.D(new acte(browseResponseModel.d()));
            }
        });
    }

    public final void c() {
        this.f.h();
        this.b.c();
        this.a.c();
    }

    @Override // defpackage.akai
    public final void ll() {
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return false;
    }

    @Override // defpackage.akgj
    public final void qX() {
        b(this.m, this.h, true);
    }
}
