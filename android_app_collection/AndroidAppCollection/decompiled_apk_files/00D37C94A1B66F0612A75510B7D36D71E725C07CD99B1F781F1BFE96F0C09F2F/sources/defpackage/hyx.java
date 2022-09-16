package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hyx  reason: default package */
/* loaded from: classes3.dex */
public final class hyx implements akai, vxo {
    public final dt a;
    public final CoordinatorLayout b;
    public final LoadingFrameLayout c;
    public final gfm d;
    public final acth e;
    public final ntu f;
    public final ajzq g;
    public final hyt h;
    public ex i;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ajsa] */
    public hyx(Context context, dt dtVar, yni yniVar, final acth acthVar, yzj yzjVar, final aath aathVar, ajyi ajyiVar, final xmm xmmVar, ajsg ajsgVar, gfu gfuVar, aadd aaddVar, aynx aynxVar) {
        int color;
        this.e = acthVar;
        this.a = dtVar;
        ajyk ajykVar = new ajyk() { // from class: hyv
            @Override // defpackage.ajyk
            public final ajyj a(Object obj, akam akamVar, akaf akafVar) {
                xmm xmmVar2 = xmm.this;
                aath aathVar2 = aathVar;
                acth acthVar2 = acthVar;
                if (obj instanceof aakq) {
                    xml a = xmmVar2.a(aathVar2, acthVar2.oi(), akamVar);
                    a.i((aakq) obj);
                    return a;
                }
                return null;
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_comment_view, (ViewGroup) null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        dtVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.75d);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.reel_comment_coordinator_layout);
        this.b = coordinatorLayout;
        if (gfuVar.a() == gfs.DARK) {
            color = dtVar.getResources().getColor(R.color.yt_black1);
        } else {
            color = dtVar.getResources().getColor(R.color.yt_white1);
        }
        coordinatorLayout.setBackgroundColor(color);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.reel_comment_loading_preview);
        this.c = loadingFrameLayout;
        zgd.t(loadingFrameLayout, zgd.h(i), ViewGroup.LayoutParams.class);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_comments);
        OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
        overScrollLinearLayoutManager.ab(1);
        recyclerView.ag(overScrollLinearLayoutManager);
        hyt aG = hyt.aG(i);
        ntu ntuVar = new ntu();
        this.f = ntuVar;
        ntuVar.A(acthVar.oi());
        ajzq ajzqVar = new ajzq(null, recyclerView, ajsgVar, new ajyx(), aathVar, yniVar, ajykVar, yzjVar, ntuVar, ajyiVar.get(), this, ajzs.d, aaddVar, aynxVar);
        this.d = new gfm((StickyHeaderContainer) inflate.findViewById(R.id.sticky_header_container), (xo) ajzqVar.f, new hyy(((ajwb) ajzqVar).e));
        this.g = ajzqVar;
        this.h = aG;
    }

    @Override // defpackage.vxo
    public final void b() {
        ll();
    }

    @Override // defpackage.vxo
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.vxo
    public final void d() {
        ll();
    }

    @Override // defpackage.akai
    public final void ll() {
        ajzq ajzqVar = this.g;
        if (ajzqVar != null) {
            ajzqVar.h();
            this.g.ad();
        }
        gfm gfmVar = this.d;
        if (gfmVar != null) {
            gfmVar.c();
        }
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return true;
    }

    @Override // defpackage.vxo
    public final void mB() {
    }
}
