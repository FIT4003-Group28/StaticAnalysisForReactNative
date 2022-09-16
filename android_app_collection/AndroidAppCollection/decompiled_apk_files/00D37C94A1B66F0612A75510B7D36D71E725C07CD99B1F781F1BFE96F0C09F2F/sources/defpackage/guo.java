package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: guo  reason: default package */
/* loaded from: classes3.dex */
public final class guo extends guj implements guy, gtq {
    public gur ae;
    public ReelBrowseFragmentToolbarController af;
    public ReelBrowseFragmentFeedController ag;
    public guw ah;
    public Context ai;
    public acth aj;
    public LoadingFrameLayout ak;
    public aadd al;
    public ReelBrowseFragmentControllerImpl am;
    private Object an;

    public static guo aG(apzg apzgVar) {
        guo guoVar = new guo();
        Bundle bundle = new Bundle();
        bundle.putByteArray("ReelBrowseFragmentCommandKey", apzgVar.toByteArray());
        bundle.putInt("ReelBrowseFragmentBackgroundColor", R.attr.ytBrandBackgroundSolid);
        guoVar.ae(bundle);
        return guoVar;
    }

    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        BrowseResponseModel browseResponseModel;
        guu guuVar;
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            zep.b("No arguments set - these are required for ReelBrowseFragment.");
            return;
        }
        byte[] byteArray = bundle2.getByteArray("ReelBrowseFragmentCommandKey");
        if (byteArray == null) {
            zep.b("No browse command set in ReelBrowseFragment arguments. This is required.");
            return;
        }
        TypedValue typedValue = new TypedValue();
        this.ai.getTheme().resolveAttribute(bundle2.getInt("ReelBrowseFragmentBackgroundColor", R.attr.ytBrandBackgroundSolid), typedValue, true);
        view.findViewById(R.id.reel_pivot_root_view).setBackgroundColor(typedValue.data);
        final apzg c = aafr.c(byteArray);
        this.ak = (LoadingFrameLayout) view.findViewById(R.id.reel_browse_loading_frame_layout);
        gur gurVar = this.ae;
        aath aathVar = (aath) gurVar.a.get();
        aathVar.getClass();
        Executor executor = (Executor) gurVar.b.get();
        executor.getClass();
        acth acthVar = (acth) gurVar.c.get();
        acthVar.getClass();
        ezq ezqVar = (ezq) gurVar.d.get();
        ezqVar.getClass();
        acvh acvhVar = (acvh) gurVar.e.get();
        acvhVar.getClass();
        this.am = new ReelBrowseFragmentControllerImpl(aathVar, executor, acthVar, ezqVar, acvhVar, this);
        this.X.c(this.am);
        this.X.c(this.af);
        this.X.c(this.ag);
        Object obj = this.an;
        if (obj instanceof gun) {
            gun gunVar = (gun) obj;
            browseResponseModel = gunVar.a;
            guuVar = gunVar.b;
            if (gunVar.c.isPresent()) {
                auld auldVar = this.al.a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                if (auldVar.l) {
                    aopc aopcVar = (aopc) c.mo52toBuilder();
                    aopg aopgVar = atno.b;
                    aopa mo52toBuilder = ((atnp) c.qm(atno.b)).mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    atnp atnpVar = (atnp) mo52toBuilder.instance;
                    atnpVar.b |= 32;
                    atnpVar.f = (String) gunVar.c.get();
                    aopcVar.e(aopgVar, (atnp) mo52toBuilder.mo39build());
                    c = (apzg) aopcVar.mo39build();
                }
            }
        } else {
            browseResponseModel = null;
            guuVar = null;
        }
        this.af.a = (Toolbar) view.findViewById(R.id.toolbar);
        final ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = this.ag;
        reelBrowseFragmentFeedController.g = reelBrowseFragmentFeedController.c.a(reelBrowseFragmentFeedController.a.oi(), "");
        reelBrowseFragmentFeedController.b.h(reelBrowseFragmentFeedController, ReelBrowseFragmentFeedController.class);
        final ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.tabs_constraint_layout);
        reelBrowseFragmentFeedController.f = new lqh(new axnm() { // from class: gut
            @Override // defpackage.axnm
            public final Object get() {
                return ReelBrowseFragmentFeedController.this.e;
            }
        }, new huf((AppTabsBar) view.findViewById(R.id.tabs_bar), 1), new axnm() { // from class: gus
            @Override // defpackage.axnm
            public final Object get() {
                return ConstraintLayout.this;
            }
        }, (RtlAwareViewPager) view.findViewById(R.id.reel_browse_tabs_view_pager));
        guw guwVar = this.ah;
        guwVar.a.c((FrameLayout) view.findViewById(R.id.footer_container), akai.Ws, null, guwVar.b.oi());
        this.ak.f(new akgj() { // from class: gum
            @Override // defpackage.akgj
            public final void qX() {
                guo guoVar = guo.this;
                guoVar.am.g(c);
            }
        });
        this.aj.oi().e(acuo.a(6827), acuc.DEFAULT, c, acty.a(c, askh.b), acty.a(c, askh.a));
        this.aj.oi().n(new acte(actj.MOBILE_BACK_BUTTON));
        if (browseResponseModel == null) {
            this.am.g(c);
        } else {
            ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = this.am;
            if (reelBrowseFragmentControllerImpl.c != null) {
                reelBrowseFragmentControllerImpl.b = browseResponseModel;
                reelBrowseFragmentControllerImpl.h(browseResponseModel);
                reelBrowseFragmentControllerImpl.i(browseResponseModel);
                reelBrowseFragmentControllerImpl.j(browseResponseModel);
            }
            if (guuVar != null) {
                this.ag.g(this.ai, guuVar.b, guuVar);
            }
            this.ak.a();
        }
        hqs.a(view);
    }

    @Override // defpackage.guy
    public final void aH() {
        dt mJ = mJ();
        if (mJ == null) {
            return;
        }
        this.aj.oi().t();
        mJ.onBackPressed();
    }

    @Override // defpackage.gtq
    public final Object l() {
        gun gunVar = new gun();
        gunVar.a = this.am.b;
        ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = this.ag;
        guu guuVar = null;
        if (reelBrowseFragmentFeedController.g != null && reelBrowseFragmentFeedController.f != null) {
            amum h = amup.h();
            amuf f = amuk.f();
            for (nii niiVar : reelBrowseFragmentFeedController.g.i()) {
                guv guvVar = new guv();
                guvVar.a = niiVar.c.pn();
                guvVar.b = niiVar.c.f60J.n.P();
                aaky aakyVar = new aaky(niiVar.a);
                h.f(aakyVar, guvVar);
                f.h(aakyVar);
            }
            guu guuVar2 = new guu();
            guuVar2.a = h.b();
            guuVar2.b = f.g();
            guuVar2.c = reelBrowseFragmentFeedController.g.a();
            guuVar = guuVar2;
        }
        gunVar.b = guuVar;
        gunVar.c = Optional.ofNullable(this.aj.oi().k());
        return gunVar;
    }

    @Override // defpackage.gtq
    public final void m(Object obj) {
        this.an = obj;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(this.ai).inflate(R.layout.reel_browse_root_view, viewGroup, false);
    }
}
