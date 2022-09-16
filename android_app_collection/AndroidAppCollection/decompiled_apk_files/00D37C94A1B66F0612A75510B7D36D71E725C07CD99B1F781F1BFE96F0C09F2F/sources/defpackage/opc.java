package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.a;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.g;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.i;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.m;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.apps.youtube.embeddedplayer.service.model.FragmentKeyData;
import com.google.android.apps.youtube.embeddedplayer.service.model.HotConfigData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerStateCache;
import com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.j;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.e;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: opc  reason: default package */
/* loaded from: classes3.dex */
public final class opc implements ynl {
    f A;
    i B;
    m C;
    yni D;
    ahjg E;
    adzz F;
    oog G;
    aadd H;
    c I;

    /* renamed from: J  reason: collision with root package name */
    a f239J;
    public zah K;
    com.google.android.apps.youtube.embeddedplayer.service.csi.service.a L;
    BandaidConnectionOpenerController M;
    yrj N;
    b O;
    wkt P;
    wwd Q;
    wvx R;
    acrp S;
    com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b T;
    public com.google.android.apps.youtube.embeddedplayer.service.prewarm.service.b U;
    public zey V;
    ajxz W;
    axxm X;
    aikh Y;
    aacz Z;
    public final ooh a;
    public com.google.android.apps.youtube.embeddedplayer.service.permissions.c aa;
    private final opb ab;
    private final afmu ac;
    private final ahyp ad;
    private final aiau ae;
    private final aypf af;
    private aafo ag;
    private xfm ah;
    private xgm ai;
    private j aj;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b ak;
    private aibi al;
    private aicj am;
    private aias an;
    private LiveOverlayPresenter ao;
    private d ap;
    private e aq;
    private aict ar;
    private aibm as;
    private SubtitlesOverlayPresenter at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a ax;
    public final alya b;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c c;
    public boolean d;
    public PlaybackStartDescriptor e;
    public int f;
    public int g;
    public airr i;
    aire j;
    airw k;
    aiwj l;
    aiyx m;
    ahkv n;
    ahze o;
    ajft p;
    ahxx q;
    wlg r;
    xgp s;
    xiw t;
    ajmy u;
    Executor v;
    ajdz w;
    snc x;
    ScheduledExecutorService y;
    aiwb z;
    private int ay = 1;
    private int az = 1;
    public final ApiPlayerStateCache h = new ApiPlayerStateCache();

    private opc(ooh oohVar, opb opbVar, alya alyaVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, afmu afmuVar, ahyp ahypVar, aiau aiauVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c cVar) {
        oohVar.getClass();
        this.a = oohVar;
        opbVar.getClass();
        this.ab = opbVar;
        alyaVar.getClass();
        this.b = alyaVar;
        aVar.getClass();
        this.ax = aVar;
        afmuVar.getClass();
        this.ac = afmuVar;
        ahypVar.getClass();
        this.ad = ahypVar;
        aiauVar.getClass();
        this.ae = aiauVar;
        cVar.getClass();
        this.c = cVar;
        this.af = new aypf();
        ((oon) oohVar).f.a().a(this);
    }

    public static opc M(Context context, opb opbVar, ooh oohVar, afmu afmuVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.i iVar, xge xgeVar, ahyp ahypVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b bVar4, h hVar, rvx rvxVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, aibg aibgVar, aich aichVar, aiaq aiaqVar, ahzm ahzmVar, aiau aiauVar, aibj aibjVar, aicn aicnVar, com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar, zdt zdtVar, alya alyaVar, com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.a aVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c cVar2) {
        Boolean bool;
        opc opcVar = new opc(oohVar, opbVar, alyaVar, aVar, afmuVar, ahypVar, aiauVar, cVar2);
        bVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        ahzmVar.getClass();
        aibjVar.getClass();
        aicnVar.getClass();
        final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.b bVar5 = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.b(opcVar.ax, opcVar.S, ((oon) opcVar.a).c.a, opcVar.H);
        bVar5.a.a.V(ona.c).X(azpj.c()).B().as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.a
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                b.this.c = ((aqtp) obj).e;
            }
        });
        opcVar.D.g(bVar5);
        com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f fVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f(opcVar.ax);
        opcVar.D.g(fVar);
        opcVar.D.g(new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.c(opcVar.N, opcVar.ax));
        final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.e eVar = new com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.e(opcVar.ax, opcVar.H);
        eVar.b.a.V(ona.d).X(azpj.c()).B().at(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.d
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                e eVar2 = e.this;
                eVar2.a.a(new HotConfigData((aqtp) obj));
            }
        }, ab.b);
        ooy ooyVar = new ooy(opcVar);
        opcVar.ag = new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.h(new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.f(context, new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.i(ooyVar), new g(ooyVar, fVar), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.c(new oor(opcVar.ab)), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.d(new oos(opcVar.ab)), new com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.b(aVar2), ((oon) opcVar.a).h), opcVar.A);
        xfm xfmVar = new xfm(iVar, acti.l, opcVar.ag, new xfj[0]);
        opcVar.ah = xfmVar;
        opcVar.s.m(xfmVar);
        aqxe aqxeVar = opcVar.X.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45354952L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354952L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354952L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            opcVar.M.j();
        }
        opcVar.ai = new xgm(ecp.m, opcVar.ag, xgeVar, opcVar.x, zdtVar, opcVar.t, opcVar.P, opcVar.Q, opcVar.R);
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b bVar6 = new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b(opcVar.ag, opcVar.a.h());
        bVar.B(bVar6);
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b a = opcVar.a.e().a(opcVar.ag);
        cVar.t(a);
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b a2 = opcVar.a.f().a(opcVar.ag);
        bVar2.v(a2);
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b a3 = opcVar.a.g().a(opcVar.ag);
        bVar3.D(a3);
        final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b bVar7 = new com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b(opcVar.A, rvxVar, context, null);
        bVar7.f.a(R.id.player_share_button, new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.a
            @Override // java.lang.Runnable
            public final void run() {
                b bVar8 = b.this;
                if (bVar8.e) {
                    return;
                }
                bVar8.s();
            }
        });
        opcVar.ak = bVar7;
        bVar4.pE(bVar7);
        opcVar.aj = new j(opcVar.i, opcVar.q, opcVar.ad, bVar, bVar6, cVar, a, bVar2, a2, bVar3, a3, opcVar.ak, opcVar.F, opcVar.y, opcVar.v, hVar, opcVar.ag, rvxVar, opcVar.A, opcVar.H, null);
        ahyp ahypVar2 = opcVar.ad;
        ahypVar2.i(opcVar.o.a(ahypVar2, aibgVar));
        opcVar.al = new aibi(opcVar.i, aibgVar);
        opcVar.am = new aicj(context.getResources(), opcVar.i, aichVar);
        opcVar.an = new aias(opcVar.i, opcVar.j, aiaqVar);
        opcVar.ao = new LiveOverlayPresenter(context, ahzmVar, opcVar.w, opcVar.v, opcVar.u, opcVar.y, opcVar.x, null, null);
        f fVar2 = opcVar.A;
        aafo aafoVar = opcVar.ag;
        d dVar2 = new d(context, fVar2, dVar, opcVar.ax);
        dVar2.c = new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.c(dVar2.a, aafoVar, new com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.a(dVar2));
        com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.c cVar3 = dVar2.c;
        cVar3.e = 0L;
        int b = dVar2.b.b(cVar3);
        cVar3.a = new SelectableItemKey(b, 1);
        cVar3.b = new SelectableItemKey(b, 2);
        cVar3.c = new SelectableItemKey(b, 3);
        opcVar.ap = dVar2;
        ayoi R = dVar2.i.R();
        e eVar2 = new e(opcVar.A, opcVar.ag, rvxVar, opcVar.O, dVar, opcVar.ax, null);
        eVar2.k.a(R.id.related_videos_screen_button, new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b(eVar2, 1));
        eVar2.k.a(R.id.related_videos_screen_button, new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.b(eVar2));
        eVar2.h.b = eVar2.f.b(eVar2.h);
        eVar2.i.b = eVar2.g.b(eVar2.i);
        eVar2.e.g(eVar2.d.B().as(new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a(eVar2)), eVar2.d.B().x(500L, TimeUnit.MILLISECONDS).as(new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a(eVar2, 2)), R.at(new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a(eVar2, 1), new com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service.a(eVar2, 3)));
        opcVar.aq = eVar2;
        opcVar.at = new SubtitlesOverlayPresenter(opcVar.ae, opcVar.l, opcVar.m, opcVar.z, opcVar.y, opcVar.v, opcVar.Z);
        opcVar.as = new aibm(aibjVar, opcVar.u);
        opcVar.ar = new aict(aicnVar, opcVar.ag, opcVar.W, ecp.n);
        opcVar.q();
        opcVar.N();
        opcVar.n.l();
        return opcVar;
    }

    private final void N() {
        if (!this.aw) {
            if (aiix.G(this.Z)) {
                this.af.g(this.n.g(this.k));
            } else {
                this.D.g(this.n);
            }
            if (aiix.I(this.Z)) {
                this.af.g(this.ao.g(this.k));
                this.af.g(this.E.g(this.k));
            } else {
                this.D.g(this.ao);
                this.D.g(this.E);
            }
            if (aiix.H(this.Z)) {
                this.af.g(this.as.g(this.k));
                SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.at;
                if (subtitlesOverlayPresenter != null) {
                    this.af.g(subtitlesOverlayPresenter.g(this.k));
                }
                this.af.g(this.al.g(this.k));
                this.af.g(this.am.g(this.k));
                this.af.g(this.an.g(this.k));
                aict aictVar = this.ar;
                if (aictVar != null) {
                    this.af.g(aictVar.a.g(this.k));
                }
                j jVar = this.aj;
                if (jVar != null) {
                    this.af.g(jVar.O.g(this.k));
                }
            } else {
                this.D.g(this.as);
                SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.at;
                if (subtitlesOverlayPresenter2 != null) {
                    this.D.g(subtitlesOverlayPresenter2);
                }
                this.D.g(this.al);
                this.D.g(this.am);
                this.D.g(this.an);
                aict aictVar2 = this.ar;
                if (aictVar2 != null) {
                    this.D.g(aictVar2.a);
                }
                j jVar2 = this.aj;
                if (jVar2 != null) {
                    this.D.g(jVar2.O);
                }
            }
            j jVar3 = this.aj;
            if (jVar3 != null) {
                this.af.g(jVar3.b.g(this.k));
            }
            xgm xgmVar = this.ai;
            if (xgmVar != null) {
                this.af.g(xgmVar.g(this.k));
            }
            this.D.g(this);
            this.D.g(this.Y);
            aict aictVar3 = this.ar;
            if (aictVar3 != null) {
                this.D.g(aictVar3.b);
            }
            j jVar4 = this.aj;
            if (jVar4 != null) {
                this.D.g(jVar4.P);
            }
            this.D.g(this.ak);
            this.D.g(this.aq);
            this.D.g(this.ap);
            this.D.g(this.p);
            this.D.g(this.A);
            this.aw = true;
        }
    }

    private final void O() {
        this.d = false;
    }

    private final void P(boolean z) {
        this.au = z;
        this.ab.b(z, a());
    }

    private final void Q(boolean z) {
        if (this.av != z) {
            this.av = z;
            this.ab.e(z);
        }
    }

    private final void R(PlayerResponseModel playerResponseModel, Optional optional) {
        int i = 1;
        if (playerResponseModel == null) {
            this.g = !I(optional);
            return;
        }
        asad asadVar = playerResponseModel.a.C;
        if (asadVar == null) {
            asadVar = asad.a;
        }
        atzx atzxVar = asadVar.c;
        if (atzxVar == null) {
            atzxVar = atzx.a;
        }
        if ((atzxVar.b & 16) != 0) {
            i = 2;
        }
        this.g = i;
    }

    private final boolean S() {
        aqtp h = pce.h(this.H);
        return h != null && h.i;
    }

    private static final boolean U(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!TextUtils.isEmpty((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A(int i) {
        if (!T() && this.ay == 3) {
            this.i.V(i);
        }
    }

    public final void B(boolean z) {
        this.i.E(z);
        if (this.ay == 4) {
            Q(z);
        }
    }

    public final void C(boolean z) {
        this.i.h.i.a = z;
    }

    public final void D(boolean z) {
        this.aj.s.nj(!z);
    }

    public final void E() {
        this.ad.pI();
    }

    public final void F() {
        if (!T() && this.ay == 3) {
            this.i.M();
        }
    }

    public final boolean G() {
        int i = this.ay;
        if (i == 3 || i == 2) {
            return this.j.i(aiqk.a);
        }
        return false;
    }

    public final boolean H() {
        int i = this.ay;
        if (i == 3 || i == 2) {
            return this.j.i(aiqk.b);
        }
        return false;
    }

    public final boolean I(Optional optional) {
        return S() ? optional.isPresent() && this.C.c((String) optional.get()) : this.B.a;
    }

    public final boolean J() {
        return this.i.T();
    }

    public final boolean K(int i, KeyEvent keyEvent) {
        return this.ad.onKeyDown(i, keyEvent);
    }

    public final boolean L(int i, KeyEvent keyEvent) {
        return this.ad.onKeyUp(i, keyEvent);
    }

    public final long a() {
        ajbf o = this.i.o();
        if (this.ay != 3 || o == null) {
            return 0L;
        }
        return o.b();
    }

    public final long b() {
        if (this.ay == 3) {
            return this.i.h();
        }
        return 0L;
    }

    public final PlaybackServiceState c() {
        return this.i.l(false);
    }

    public final void d() {
        int i = this.ay;
        if (i != 5 && i == 4) {
            this.at = new SubtitlesOverlayPresenter(this.ae, this.l, this.m, this.z, this.y, this.v, this.Z);
            q();
            N();
            this.s.m(this.ah);
            this.i.A();
            this.n.l();
            this.ay = this.az;
        }
    }

    public final void e(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            aqvb.l("No playlist ID provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor a = com.google.android.apps.youtube.embeddedplayer.service.util.a.a(str, i, i2);
        a.p(true);
        k(a, i3);
    }

    public final void g(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            aqvb.l("No video ID provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor b = com.google.android.apps.youtube.embeddedplayer.service.util.a.b(str, i);
        b.p(true);
        k(b, i2);
    }

    public final void h(List list, int i, int i2, int i3) {
        if (!U(list)) {
            aqvb.l("No video IDs provided.", new Object[0]);
            return;
        }
        PlaybackStartDescriptor c = com.google.android.apps.youtube.embeddedplayer.service.util.a.c(list, i, i2);
        c.p(true);
        k(c, i3);
    }

    public final void i(boolean z) {
        int i = this.ay;
        if (i == 5 || i == 4) {
            return;
        }
        O();
        this.ab.i(a());
        this.n.k();
        this.af.c();
        if (!aiix.G(this.Z)) {
            this.D.m(this.n);
        }
        if (!aiix.I(this.Z)) {
            this.D.m(this.ao);
            this.D.m(this.E);
        }
        if (!aiix.H(this.Z)) {
            SubtitlesOverlayPresenter subtitlesOverlayPresenter = this.at;
            if (subtitlesOverlayPresenter != null) {
                this.D.m(subtitlesOverlayPresenter);
            }
            this.D.m(this.as);
            this.D.m(this.al);
            this.D.m(this.am);
            this.D.m(this.an);
            aict aictVar = this.ar;
            if (aictVar != null) {
                this.D.m(aictVar.a);
            }
            j jVar = this.aj;
            if (jVar != null) {
                this.D.m(jVar.O);
            }
        }
        this.D.m(this);
        aict aictVar2 = this.ar;
        if (aictVar2 != null) {
            this.D.m(aictVar2.b);
        }
        j jVar2 = this.aj;
        if (jVar2 != null) {
            this.D.m(jVar2.P);
        }
        this.D.m(this.Y);
        this.D.m(this.ak);
        this.D.m(this.aq);
        this.D.m(this.ap);
        this.D.m(this.p);
        this.D.m(this.A);
        if (this.M != null && aiix.A(this.H)) {
            this.M.h();
        }
        this.aw = false;
        this.s.d();
        this.i.z(z);
        SubtitlesOverlayPresenter subtitlesOverlayPresenter2 = this.at;
        if (subtitlesOverlayPresenter2 != null) {
            subtitlesOverlayPresenter2.p();
            this.at = null;
        }
        this.aj.c();
        this.az = this.ay;
        this.ay = 4;
    }

    public final void j() {
        if (!T() && this.ay == 3) {
            this.i.b();
        }
    }

    public final void k(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        l(playbackStartDescriptor, false, i);
    }

    public final void l(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z, final int i) {
        if (!T()) {
            aqto i2 = pce.i(this.Z);
            if (i2 == null || !i2.b) {
                m(playbackStartDescriptor, z, i, Optional.empty());
            } else {
                ylx.k(this.T.a(), this.v, new ylv() { // from class: oou
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        final opc opcVar = opc.this;
                        final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                        final boolean z2 = z;
                        final int i3 = i;
                        opcVar.F();
                        if (((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e) th).a != 1) {
                            opcVar.c.m(false);
                            return;
                        }
                        opcVar.c.l(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b() { // from class: oot
                            @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b
                            public final void a() {
                                opc opcVar2 = opc.this;
                                PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                boolean z3 = z2;
                                int i4 = i3;
                                opcVar2.c.g();
                                opcVar2.l(playbackStartDescriptor3, z3, i4);
                            }
                        });
                        opcVar.c.m(true);
                    }
                }, new ylw() { // from class: oov
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        opc opcVar = opc.this;
                        PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                        boolean z2 = z;
                        int i3 = i;
                        opcVar.c.g();
                        opcVar.m(playbackStartDescriptor2, z2, i3, Optional.of(((com.google.android.apps.youtube.embeddedplayer.service.hostappverification.d) obj).a));
                    }
                });
            }
        }
    }

    public final void m(PlaybackStartDescriptor playbackStartDescriptor, boolean z, int i, Optional optional) {
        String str;
        com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar = this.ax;
        com.google.android.apps.youtube.embeddedplayer.service.model.e b = FragmentKeyData.b();
        b.b(playbackStartDescriptor.l());
        aVar.a(b.a());
        this.f = i;
        f fVar = this.A;
        fVar.b = i;
        fVar.o(i, com.google.android.apps.youtube.embeddedplayer.service.util.a.d(playbackStartDescriptor));
        boolean equals = TextUtils.equals("", playbackStartDescriptor.k());
        aopa mo52toBuilder = playbackStartDescriptor.a.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ory oryVar = (ory) mo52toBuilder.instance;
        oryVar.b |= 32768;
        oryVar.q = !equals;
        playbackStartDescriptor.a = (ory) mo52toBuilder.mo39build();
        String a = this.b.a(playbackStartDescriptor.l());
        this.f239J.a = a;
        if (optional.isPresent()) {
            this.f239J.b = (String) optional.get();
        }
        this.I.a = a;
        if (S()) {
            str = playbackStartDescriptor.h(this.V);
            this.C.b(str, z);
        } else {
            this.B.a = z;
            str = null;
        }
        R(null, Optional.ofNullable(str));
        this.e = playbackStartDescriptor;
        this.L.h(Tick.MAIN_APP_SENDS_PLAYER_REQUEST);
        this.j.e(playbackStartDescriptor, this.L.a());
    }

    public final void n(String str, int i, int i2, boolean z, int i3) {
        if (TextUtils.isEmpty(str)) {
            aqvb.l("No playlist ID provided.", new Object[0]);
            return;
        }
        aijl e = com.google.android.apps.youtube.embeddedplayer.service.util.a.a(str, i, i2).e();
        e.d = !z;
        k(e.a(), i3);
    }

    public final void o(String str, boolean z, int i, boolean z2, int i2) {
        if (TextUtils.isEmpty(str)) {
            aqvb.l("No video ID provided.", new Object[0]);
            return;
        }
        aijl e = com.google.android.apps.youtube.embeddedplayer.service.util.a.b(str, i).e();
        boolean z3 = !z2;
        e.d = z3;
        e.f = z3;
        l(e.a(), z, i2);
    }

    public final void p(List list, int i, int i2, boolean z, int i3) {
        if (!U(list)) {
            aqvb.l("No video IDs provided.", new Object[0]);
            return;
        }
        aijl e = com.google.android.apps.youtube.embeddedplayer.service.util.a.c(list, i, i2).e();
        e.d = !z;
        k(e.a(), i3);
    }

    public final void q() {
        if (this.M != null && aiix.A(this.H)) {
            this.M.i();
        }
        j jVar = this.aj;
        if (jVar != null) {
            jVar.b();
        }
        this.i.x(this.ac, new aijc(aijd.a, aijd.a, aijd.a, aijd.a, null));
    }

    public final void r() {
        if (T()) {
            return;
        }
        if (!G()) {
            aqvb.l("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            return;
        }
        this.ay = 2;
        this.D.f(aiik.NAVIGATION);
        this.j.a(aiqk.a);
    }

    public final void s(VisibilityChangeEventData visibilityChangeEventData) {
        xiw xiwVar = this.t;
        ylr.c();
        if (xiwVar.d != null) {
            xiwVar.d.m(visibilityChangeEventData);
        }
        this.r.m(visibilityChangeEventData);
    }

    public final void t(PlaybackServiceState playbackServiceState) {
        this.j.f(playbackServiceState);
    }

    public final void u() {
        if (T()) {
            return;
        }
        int i = this.ay;
        if (i != 3 && i != 2) {
            return;
        }
        this.i.a();
    }

    public final void v() {
        if (T()) {
            return;
        }
        int i = this.ay;
        if (i != 3 && i != 2) {
            return;
        }
        this.D.f(aiik.PLAYER_CONTROL);
        this.i.b();
    }

    public final void w() {
        if (T()) {
            return;
        }
        if (!H()) {
            aqvb.l("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            return;
        }
        this.ay = 2;
        this.D.f(aiik.NAVIGATION);
        this.j.a(aiqk.b);
    }

    public final void x(boolean z) {
        if (this.ay == 5) {
            return;
        }
        this.G.g();
        i(z);
        this.ac.D();
        j jVar = this.aj;
        jVar.c();
        jVar.N.a();
        this.ay = 5;
    }

    public final void y(apzg apzgVar) {
        aafo aafoVar = this.ag;
        if (aafoVar != null) {
            aafn.a(aafoVar, apzgVar);
        } else {
            aqvb.k("Unable to resolve command", new Object[0]);
        }
    }

    public final void z(int i) {
        if (!T() && this.ay == 3) {
            this.i.ac(i, auqn.SEEK_SOURCE_UNKNOWN);
        }
    }

    private final boolean T() {
        int i = this.ay;
        if (i != 0) {
            if (i == 5) {
                aqvb.l("This YouTubePlayer has been released - ignoring command.", new Object[0]);
                return true;
            } else if (i != 4) {
                return false;
            } else {
                aqvb.l("This YouTubePlayer has been paused - ignoring command.", new Object[0]);
                return true;
            }
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
        if (r2 == 3) goto L48;
     */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r24, java.lang.Object r25, int r26) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opc.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
