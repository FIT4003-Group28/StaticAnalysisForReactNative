package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EngagementPanelTitleHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
/* compiled from: PG */
/* renamed from: nqe  reason: default package */
/* loaded from: classes3.dex */
public final class nqe extends nkg implements ydp {
    public final Context d;
    public final yzj e;
    public final ajsg f;
    public final aari g;
    public final yni h;
    public final akar i;
    public final azqb j;
    public final ydq k;
    public final aadd l;
    public final aynx m;
    public nnu n;
    public final ajrs o;
    public nly p;
    private final azqb q;
    private final abem r;
    private final dt s;
    private final akge t;
    private LoadingFrameLayout u;

    public nqe(Context context, azqb azqbVar, acth acthVar, yzj yzjVar, abem abemVar, ajsg ajsgVar, iue iueVar, yni yniVar, akar akarVar, azqb azqbVar2, ydq ydqVar, dt dtVar, aadd aaddVar, aynx aynxVar, akge akgeVar) {
        super(acthVar.oi(), aaddVar);
        this.d = context;
        this.q = azqbVar;
        this.e = yzjVar;
        this.r = abemVar;
        this.f = ajsgVar;
        this.g = iueVar;
        this.h = yniVar;
        this.i = akarVar;
        this.j = azqbVar2;
        this.k = ydqVar;
        this.s = dtVar;
        this.l = aaddVar;
        this.m = aynxVar;
        this.t = akgeVar;
        this.o = new ajrs();
    }

    private final nnu e() {
        nnu nnuVar = this.n;
        if (nnuVar == null) {
            nnu nnuVar2 = (nnu) this.q.get();
            this.n = nnuVar2;
            nnuVar2.h = this.a;
            return nnuVar2;
        }
        return nnuVar;
    }

    private static auya f(apzg apzgVar) {
        if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            auvd auvdVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (auvdVar == null) {
                auvdVar = auvd.a;
            }
            if (auvdVar.b != 1) {
                return null;
            }
            auvd auvdVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (auvdVar2 == null) {
                auvdVar2 = auvd.a;
            }
            if (auvdVar2.b == 1) {
                return (auya) auvdVar2.c;
            }
            return auya.a;
        }
        return null;
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        this.k.d(this);
        this.t.f();
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    @Override // defpackage.nmc
    public final nlx b() {
        return e();
    }

    public final LoadingFrameLayout c() {
        if (this.u == null) {
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) LayoutInflater.from(this.d).inflate(R.layout.sponsorships_engagement_panel, (ViewGroup) null, false).findViewById(R.id.loading_layout);
            this.u = loadingFrameLayout;
            loadingFrameLayout.c();
        }
        return this.u;
    }

    public final void d() {
        nly nlyVar = this.p;
        if (nlyVar != null) {
            nlyVar.a();
        }
    }

    @Override // defpackage.ydp
    public final void h() {
        d();
    }

    @Override // defpackage.ydp
    public final void mE() {
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        if (ashnVar != null && yce.a(ashnVar) != null) {
            yln.d(ashnVar).qv(this.s.getSupportFragmentManager(), "sponsorships_dialog");
        }
        d();
    }

    @Override // defpackage.nmc
    public final void n() {
        this.u.post(new Runnable() { // from class: nqc
            @Override // java.lang.Runnable
            public final void run() {
                nqe nqeVar = nqe.this;
                nqeVar.k.e(nqeVar);
            }
        });
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        auya f;
        aunb aunbVar;
        auya f2;
        if (apzgVar == null) {
            return;
        }
        if (!apzgVar.qn(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            if (!apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                return;
            }
            auvd auvdVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).l;
            if (auvdVar == null) {
                auvdVar = auvd.a;
            }
            if (auvdVar.b != 1) {
                return;
            }
        }
        apzg apzgVar2 = null;
        if (apzgVar.qn(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) apzgVar.qm(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
            if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.b & 2) != 0) {
                aunbVar = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            }
            aunbVar = null;
        } else {
            if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) && (f = f(apzgVar)) != null && (1 & f.b) != 0) {
                aunbVar = f.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            }
            aunbVar = null;
        }
        if (aunbVar != null) {
            e().p((aqvs) aunbVar.qm(EngagementPanelTitleHeaderRendererOuterClass.engagementPanelTitleRenderer));
            e().b();
        }
        if (apzgVar.qn(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2 = (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) apzgVar.qm(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
            if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2.b & 4) != 0 && (apzgVar2 = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2.e) == null) {
                apzgVar2 = apzg.a;
            }
        } else if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) && (f2 = f(apzgVar)) != null && (f2.b & 2) != 0 && (apzgVar2 = f2.d) == null) {
            apzgVar2 = apzg.a;
        }
        if (apzgVar2 == null || !apzgVar2.qn(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            return;
        }
        abel a = this.r.a();
        a.t((YpcOffersEndpoint$YPCOffersEndpoint) apzgVar2.qm(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
        a.k(eog.bl(apzgVar2));
        c().c();
        this.r.b(a, new nqd(this));
    }

    @Override // defpackage.nmc
    public final View oX() {
        return c();
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
    }

    @Override // defpackage.nmc
    public final void y() {
    }

    @Override // defpackage.nmc
    public final void z() {
    }
}
