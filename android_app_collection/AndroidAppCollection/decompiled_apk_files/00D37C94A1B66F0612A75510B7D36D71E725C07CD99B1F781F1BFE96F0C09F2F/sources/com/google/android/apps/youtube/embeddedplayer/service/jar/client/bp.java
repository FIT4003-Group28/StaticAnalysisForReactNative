package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bp {
    public static final /* synthetic */ int W = 0;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c A;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h B;
    public final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.c C;
    public final azpw D;
    public final aypg E;
    public boolean F;
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.l G;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b H;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e I;

    /* renamed from: J  reason: collision with root package name */
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b f155J;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b K;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b L;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b M;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e N;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b O;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b P;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b Q;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b R;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e S;
    public final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b T;
    public final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e U;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g V;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d X;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g Y;
    private final com.google.android.apps.youtube.embeddedplayer.service.jar.c Z;
    public Context a;
    private final rvx aa;
    public aafo b;
    public com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c d;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d e;
    public com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d f;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i g;
    public final alya h;
    public boolean j;
    public boolean k;
    public boolean l;
    public final Handler m;
    public final FrameLayout n;
    protected final aizi o;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al p;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n q;
    protected final xfr r;
    protected final ahzw s;
    protected final aiba t;
    protected final aibn u;
    protected final aicm v;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d w;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m x;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j y;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f z;
    public IApiPlayerService c = new DisconnectedApiPlayerService();
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;

    static {
        zep.k("YouTubeAndroidPlayerAPI");
    }

    public bp(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, com.google.android.apps.youtube.embeddedplayer.service.jar.l lVar, com.google.android.apps.youtube.embeddedplayer.service.jar.k kVar, com.google.android.apps.youtube.embeddedplayer.service.jar.e eVar, com.google.android.apps.youtube.embeddedplayer.service.jar.o oVar, com.google.android.apps.youtube.embeddedplayer.service.jar.k kVar2, final ayoi ayoiVar, alya alyaVar, byte[] bArr) {
        azpw Y = azpw.Y();
        this.D = Y;
        this.a = context;
        aVar.getClass();
        lVar.getClass();
        this.G = lVar;
        alyaVar.getClass();
        this.h = alyaVar;
        aizi aiziVar = new aizi(context);
        this.o = aiziVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.addView(aiziVar);
        Handler handler = new Handler(context.getMainLooper());
        this.m = handler;
        com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d dVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d(handler);
        this.X = dVar;
        this.U = new com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e(handler);
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g gVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g();
        this.Y = gVar;
        com.google.android.apps.youtube.embeddedplayer.service.jar.c cVar = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a;
        this.Z = cVar;
        this.E = cVar.b.ae(azpj.c()).X(aypa.a()).as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al alVar;
                bp bpVar = bp.this;
                aqtp aqtpVar = (aqtp) obj;
                if (aqtpVar == null || (alVar = bpVar.p) == null) {
                    return;
                }
                boolean z = aqtpVar.f;
                alVar.x = z;
                aifw aifwVar = alVar.w;
                if (aifwVar == null) {
                    return;
                }
                aifwVar.c(z);
            }
        });
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g gVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.g(1);
        this.V = gVar2;
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d dVar2 = new com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.d(aiziVar, new be(this));
        this.C = dVar2;
        com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h b = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.h.b(aiziVar, aVar, new bo(this), dVar2);
        this.B = b;
        b.p.d(gVar.a.B().as(new com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.e(b, 1)));
        final yzt yztVar = new yzt(aVar.d(), aVar.c(), aiziVar);
        com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c(context, aVar, new bn(this), yztVar);
        cVar2.b.e(cVar2);
        aiziVar.g(cVar2.b);
        this.A = cVar2;
        rvx rvxVar = new rvx();
        this.aa = rvxVar;
        this.N = com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.d(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al.a, handler, rvxVar);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m mVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m(context);
        mVar.f = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ae(azpj.c()).X(aypa.a()).as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.k
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final m mVar2 = m.this;
                ayoi ayoiVar2 = ayoiVar;
                mVar2.g = ((aqtp) obj).m;
                if (mVar2.d == null) {
                    mVar2.d = ayoiVar2.B().X(aypa.a()).as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.j
                        @Override // defpackage.ayqb
                        public final void a(Object obj2) {
                            m mVar3 = m.this;
                            mVar3.e = (com.google.android.apps.youtube.embeddedplayer.service.model.d) obj2;
                            mVar3.X();
                        }
                    });
                }
            }
        });
        this.x = mVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al A = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al.A(context, b, new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e(rvxVar, null), gVar2.a, Y, osz.e(context, handler, Y.k(), aiziVar));
        this.p = A;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bp bpVar = bp.this;
                bpVar.x.l();
                bpVar.p.ng();
            }
        };
        azpm azpmVar = gVar.a;
        azpm azpmVar2 = gVar2.a;
        final com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d(context, onClickListener);
        dVar3.l = MutedAutoplayState.a;
        dVar3.m = 0;
        dVar3.e = new Handler(new Handler.Callback() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.a
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                d dVar4 = d.this;
                if (message.what == 1) {
                    if (!dVar4.nI()) {
                        return true;
                    }
                    dVar4.a.setVisibility(8);
                    return true;
                }
                return false;
            }
        });
        dVar3.c.g(azpmVar.B().as(new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.c(dVar3, 1)), azpmVar2.B().as(new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.c(dVar3)));
        this.w = dVar3;
        com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j jVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.j(context);
        this.y = jVar;
        try {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n nVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded.n(context);
            this.q = nVar;
            nVar.g(Y);
            xfr xfrVar = new xfr(context);
            this.r = xfrVar;
            ahzw ahzwVar = new ahzw(context);
            this.s = ahzwVar;
            aiba aibaVar = new aiba(context);
            this.t = aibaVar;
            aibn aibnVar = new aibn(context);
            this.u = aibnVar;
            aicm aicmVar = new aicm(context);
            this.v = aicmVar;
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f fVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded.f(context);
            this.z = fVar;
            aiziVar.pM(aibnVar, aibaVar, aicmVar, xfrVar, ahzwVar);
            aiziVar.setFocusable(true);
            com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i i = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i.i(context, new bh(this));
            this.g = i;
            this.I = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e(i, context, handler);
            aiziVar.h(i);
            this.H = new com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b(new zdt() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ba
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    yzt yztVar2 = yzt.this;
                    Boolean bool = (Boolean) obj;
                    int i2 = bp.W;
                    if (bool != null) {
                        yztVar2.j(bool.booleanValue());
                    }
                }
            }, aiziVar, handler);
            this.f155J = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b(i, handler);
            this.K = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.b(nVar, handler);
            this.L = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b(xfrVar, handler);
            this.M = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b(A, A, A, A, A, A, A, A, A, A, handler);
            this.O = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.b(ahzwVar, handler);
            this.P = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b(aibaVar, handler);
            this.Q = new com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.b(aibnVar, handler);
            this.R = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.b(aicmVar, handler);
            this.S = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.e(fVar, handler);
            this.T = new com.google.android.apps.youtube.embeddedplayer.service.databus.shared.b(dVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.AD_EVENT_DATA, eVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.RELATED_VIDEOS_SCREEN, jVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.MUTED_AUTOPLAY_STATE, gVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.FRAGMENT_KEY_DATA, kVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYBACK_EVENT_DATA, oVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.ERROR_DATA, kVar2);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.HOT_CONFIG_DATA, cVar);
            dVar.c(com.google.android.apps.youtube.embeddedplayer.service.model.b.PLAYER_VIEW_MODE, gVar2);
            eVar.a = new bg(this);
            mVar.ns(new bc(this, 1));
            nVar.ns(new bc(this));
            dVar3.ns(new bc(this, 2));
            A.ns(new bc(this, 3));
            jVar.ns(new bc(this, 4));
            fVar.ns(new bc(this, 5));
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public final void a() {
        if (f()) {
            if (!f()) {
                pcu.i();
            } else if (!this.j) {
            } else {
                d();
                this.B.c();
            }
        }
    }

    public final void b() {
        if (!this.k) {
            this.l = true;
            return;
        }
        try {
            this.l = false;
            this.c.n();
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final void c(Tick tick) {
        try {
            com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b.e(tick, System.currentTimeMillis());
        } catch (RemoteException unused) {
            aqvb.l("Csi controller service is disconnected", new Object[0]);
        }
    }

    public final void d() {
        if (!f()) {
            pcu.i();
            return;
        }
        try {
            this.c.x();
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final void e(boolean z) {
        if (f()) {
            try {
                this.c.G(z);
                return;
            } catch (RemoteException e) {
                pcu.h(e);
                return;
            }
        }
        pcu.i();
    }

    public final boolean f() {
        return !(this.c instanceof DisconnectedApiPlayerService);
    }
}
