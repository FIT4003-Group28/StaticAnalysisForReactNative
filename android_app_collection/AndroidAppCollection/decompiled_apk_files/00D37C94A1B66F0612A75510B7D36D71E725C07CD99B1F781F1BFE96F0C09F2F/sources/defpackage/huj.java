package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: huj  reason: default package */
/* loaded from: classes3.dex */
public final class huj extends hsf {
    public aath ae;
    public acti af;
    public nik ag;
    public akar ah;
    public ajsg ai;
    public yzj aj;
    public yni ak;
    public ajyi al;
    public Executor am;
    public Executor an;
    public gfu ao;
    public aadd ap;
    public aynx aq;
    public BrowseResponseModel ar;
    public CoordinatorLayout as;
    public nij at;
    public fsv au;
    public LoadingFrameLayout av;
    public ajyk aw;
    public final frv ax = new hui();

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, 2132083362);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        this.at.n();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper;
        if (this.ao.a() == gfs.DARK) {
            contextThemeWrapper = new ContextThemeWrapper(rb(), 2132083362);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(rb(), 2132083363);
        }
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.video_picker_fragment, (ViewGroup) null);
        this.as = (CoordinatorLayout) inflate.findViewById(R.id.video_picker_coordinator_layout);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.video_picker_loading_layout);
        this.av = loadingFrameLayout;
        loadingFrameLayout.c();
        this.at = this.ag.a(this.af, "");
        this.aw = this.ah.a(this.ae, this.af);
        this.au = new lqh(new hug(this, 1), new huf((AppTabsBar) this.as.findViewById(R.id.tabs_bar)), new hug(this), (RtlAwareViewPager) this.as.findViewById(R.id.view_pager));
        aatf f = this.ae.f();
        f.t("FEvideo_picker");
        f.k(aadi.b);
        f.q(3);
        ylx.k(this.ae.h(f, this.an), this.an, new ylv() { // from class: hud
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                huj.this.av.b(th.getLocalizedMessage(), true);
            }
        }, new ylw() { // from class: hue
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                final huj hujVar = huj.this;
                hujVar.ar = (BrowseResponseModel) obj;
                hujVar.am.execute(new Runnable() { // from class: huh
                    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, ajsa] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        amuk amukVar;
                        ViewGroup viewGroup2;
                        arlt arltVar;
                        avzy avzyVar;
                        final huj hujVar2 = huj.this;
                        ViewGroup viewGroup3 = null;
                        hujVar2.af.F(acuo.a(6827), acuc.DEFAULT, null);
                        hujVar2.af.n(new acte(actj.MOBILE_BACK_BUTTON));
                        ((acsx) hujVar2.af).D(new acte(hujVar2.ar.d()));
                        BrowseResponseModel browseResponseModel = hujVar2.ar;
                        if (browseResponseModel != null && (arltVar = browseResponseModel.a) != null) {
                            arlo arloVar = arltVar.d;
                            if (arloVar == null) {
                                arloVar = arlo.a;
                            }
                            if (arloVar.b == 156098381) {
                                arlo arloVar2 = hujVar2.ar.a.d;
                                if (arloVar2 == null) {
                                    arloVar2 = arlo.a;
                                }
                                if (arloVar2.b == 156098381) {
                                    avzyVar = (avzy) arloVar2.c;
                                } else {
                                    avzyVar = avzy.a;
                                }
                                TextView textView = (TextView) hujVar2.as.findViewById(R.id.video_picker_title);
                                arag aragVar = avzyVar.b;
                                if (aragVar == null) {
                                    aragVar = arag.a;
                                }
                                textView.setText(ajgl.b(aragVar));
                                hujVar2.as.findViewById(R.id.video_picker_exit).setOnClickListener(new View.OnClickListener() { // from class: huc
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        huj hujVar3 = huj.this;
                                        eo eoVar = hujVar3.z;
                                        if (eoVar == null) {
                                            return;
                                        }
                                        ex l = eoVar.l();
                                        l.m(hujVar3);
                                        l.a();
                                    }
                                });
                            }
                        }
                        amuk g = hujVar2.ar.g();
                        ArrayList arrayList = new ArrayList();
                        int size = g.size();
                        int i = 0;
                        while (i < size) {
                            aaky aakyVar = (aaky) g.get(i);
                            if (aakyVar.a() == null) {
                                amukVar = g;
                                viewGroup2 = viewGroup3;
                            } else {
                                avfo avfoVar = aakyVar.a;
                                View inflate2 = hujVar2.mM().inflate(R.layout.video_picker_recycler_view, viewGroup3);
                                RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(R.id.section_list_contents);
                                hujVar2.rb();
                                recyclerView.ag(new LinearLayoutManager(1));
                                amukVar = g;
                                ajzq ajzqVar = new ajzq(null, recyclerView, hujVar2.ai, new ajyx(), hujVar2.ae, hujVar2.ak, hujVar2.aw, hujVar2.aj, hujVar2.af, hujVar2.al.get(), akai.Ws, ajzs.d, hujVar2.ap, hujVar2.aq);
                                ajsm ajsmVar = new ajsm();
                                if ((avfoVar.b & 2048) != 0) {
                                    avfm avfmVar = avfoVar.i;
                                    if (avfmVar == null) {
                                        avfmVar = avfm.a;
                                    }
                                    ajsmVar.add(avfmVar);
                                }
                                ajzqVar.J(ajsmVar);
                                ajzqVar.T(aakyVar.a());
                                viewGroup2 = null;
                                arrayList.add(new nii(avfoVar, inflate2, ajzqVar, null));
                            }
                            i++;
                            viewGroup3 = viewGroup2;
                            g = amukVar;
                        }
                        hujVar2.at.m(hujVar2.au, arrayList, 0);
                        hujVar2.av.a();
                    }
                });
            }
        });
        return this.as;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CoordinatorLayout coordinatorLayout = this.as;
        if (coordinatorLayout != null && coordinatorLayout.getParent() != null) {
            ((ViewGroup) this.as.getParent()).removeView(this.as);
            this.as = null;
        }
        super.onDismiss(dialogInterface);
    }
}
