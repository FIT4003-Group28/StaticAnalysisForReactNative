package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelBrowseFragmentControllerImpl implements f {
    public acvg a = new acvi();
    public BrowseResponseModel b;
    public guy c;
    private final aath d;
    private final Executor e;
    private final acth f;
    private final ezq g;
    private final acvh h;

    public ReelBrowseFragmentControllerImpl(aath aathVar, Executor executor, acth acthVar, ezq ezqVar, acvh acvhVar, guy guyVar) {
        this.d = aathVar;
        this.e = executor;
        this.c = guyVar;
        this.f = acthVar;
        this.g = ezqVar;
        this.h = acvhVar;
    }

    public final void g(apzg apzgVar) {
        guy guyVar = this.c;
        if (guyVar == null) {
            return;
        }
        ((guo) guyVar).ak.c();
        apnv apnvVar = (apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint);
        aatf f = this.d.f();
        f.t(apnvVar.c);
        f.v(apnvVar.d);
        f.j(apzgVar.c);
        acvg b = this.h.b(asny.LATENCY_ACTION_BROWSE);
        this.a = b;
        aopa createBuilder = asno.a.createBuilder();
        asny asnyVar = asny.LATENCY_ACTION_BROWSE;
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnoVar.d = asnyVar.bL;
        asnoVar.b |= 1;
        String str = apnvVar.c;
        createBuilder.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder.instance;
        str.getClass();
        asnoVar2.c |= 2;
        asnoVar2.q = str;
        b.a((asno) createBuilder.mo39build());
        this.a.c("br_s");
        ylx.k(this.d.h(f, this.e), this.e, new ylv() { // from class: gup
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = ReelBrowseFragmentControllerImpl.this;
                guy guyVar2 = reelBrowseFragmentControllerImpl.c;
                if (guyVar2 == null) {
                    return;
                }
                guo guoVar = (guo) guyVar2;
                guoVar.ak.b(guoVar.rh().getString(R.string.reel_generic_error_message), true);
                guoVar.af.h();
                reelBrowseFragmentControllerImpl.a.c("br_e");
            }
        }, new ylw() { // from class: guq
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = ReelBrowseFragmentControllerImpl.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (reelBrowseFragmentControllerImpl.c == null) {
                    return;
                }
                reelBrowseFragmentControllerImpl.b = browseResponseModel;
                reelBrowseFragmentControllerImpl.h(browseResponseModel);
                reelBrowseFragmentControllerImpl.a.c("br_r");
                if (browseResponseModel.f() != null) {
                    guy guyVar2 = reelBrowseFragmentControllerImpl.c;
                    aakw f2 = browseResponseModel.f();
                    guo guoVar = (guo) guyVar2;
                    ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = guoVar.ag;
                    Context context = guoVar.ai;
                    aopa createBuilder2 = avfk.a.createBuilder();
                    auqh auqhVar = f2.a;
                    createBuilder2.copyOnWrite();
                    avfk avfkVar = (avfk) createBuilder2.instance;
                    avfkVar.c = auqhVar;
                    avfkVar.b |= 1;
                    avfk avfkVar2 = (avfk) createBuilder2.mo39build();
                    aopa createBuilder3 = avfo.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    avfo avfoVar = (avfo) createBuilder3.instance;
                    avfkVar2.getClass();
                    avfoVar.k = avfkVar2;
                    avfoVar.b |= 8192;
                    reelBrowseFragmentFeedController.g(context, amuk.r(new aaky((avfo) createBuilder3.mo39build())), null);
                    guoVar.ak.a();
                } else if (browseResponseModel.g() != null) {
                    guo guoVar2 = (guo) reelBrowseFragmentControllerImpl.c;
                    guoVar2.ag.g(guoVar2.ai, browseResponseModel.g(), null);
                    guoVar2.ak.a();
                }
                reelBrowseFragmentControllerImpl.i(browseResponseModel);
                reelBrowseFragmentControllerImpl.j(browseResponseModel);
                reelBrowseFragmentControllerImpl.a.c("ol");
            }
        });
    }

    public final void h(BrowseResponseModel browseResponseModel) {
        this.g.a(this.f.oi(), browseResponseModel.a);
    }

    public final void i(BrowseResponseModel browseResponseModel) {
        arlt arltVar = browseResponseModel.a;
        if ((arltVar.b & 8) != 0) {
            guy guyVar = this.c;
            aunb aunbVar = arltVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            guw guwVar = ((guo) guyVar).ah;
            if (!aunbVar.qn(aqgv.a)) {
                return;
            }
            guwVar.a.f(guwVar.a.g((aqgu) aunbVar.qm(aqgv.a)), false);
        }
    }

    public final void j(BrowseResponseModel browseResponseModel) {
        aulh aulhVar;
        ausv ausvVar;
        ausv ausvVar2;
        int i;
        ImageView imageView;
        ReelBrowseFragmentToolbarController reelBrowseFragmentToolbarController = ((guo) this.c).af;
        arlo arloVar = browseResponseModel.a.d;
        if (arloVar == null) {
            arloVar = arlo.a;
        }
        int i2 = arloVar.b;
        if (i2 != 313670307) {
            if (i2 != 338099421) {
                if (i2 != 50236216) {
                    reelBrowseFragmentToolbarController.h();
                    return;
                }
                reelBrowseFragmentToolbarController.d.oK(new ajrs(), browseResponseModel);
                reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.d.a);
                reelBrowseFragmentToolbarController.d.a.findViewById(R.id.feed_tabbed_back).setOnClickListener(new gux(reelBrowseFragmentToolbarController, 3));
                return;
            }
            hir hirVar = reelBrowseFragmentToolbarController.c;
            ajrs ajrsVar = new ajrs();
            if (arloVar.b == 338099421) {
                aulhVar = (aulh) arloVar.c;
            } else {
                aulhVar = aulh.a;
            }
            hirVar.oK(ajrsVar, aulhVar);
            reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.c.a);
            reelBrowseFragmentToolbarController.c.a.findViewById(R.id.pivot_back).setOnClickListener(new gux(reelBrowseFragmentToolbarController, 2));
            return;
        }
        hit hitVar = reelBrowseFragmentToolbarController.b;
        ajrs ajrsVar2 = new ajrs();
        if (arloVar.b == 313670307) {
            ausvVar = (ausv) arloVar.c;
        } else {
            ausvVar = ausv.a;
        }
        hitVar.oK(ajrsVar2, ausvVar);
        reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.b.c);
        hit hitVar2 = reelBrowseFragmentToolbarController.b;
        if (arloVar.b == 313670307) {
            ausvVar2 = (ausv) arloVar.c;
        } else {
            ausvVar2 = ausv.a;
        }
        gux guxVar = new gux(reelBrowseFragmentToolbarController);
        ausu ausuVar = ausvVar2.f;
        if (ausuVar == null) {
            ausuVar = ausu.a;
        }
        if ((ausuVar.b & 1) != 0) {
            ajxz ajxzVar = hitVar2.b;
            arhs arhsVar = ausuVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i = ajxzVar.a(b);
        } else {
            i = 0;
        }
        int be = awwc.be(ausuVar.d);
        if (be == 0) {
            be = 1;
        }
        if (be - 1 != 1) {
            imageView = (ImageView) hitVar2.c.findViewById(R.id.music_picker_trailing_button);
        } else {
            imageView = (ImageView) hitVar2.c.findViewById(R.id.music_picker_leading_button);
        }
        imageView.setVisibility(0);
        if (i > 0) {
            imageView.setImageResource(i);
        }
        imageView.setOnClickListener(guxVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.c = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
