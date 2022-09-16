package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajao  reason: default package */
/* loaded from: classes.dex */
public final class ajao implements ajah, aitr, ajeo, ajet, ajbs, ajau {
    public static final ajam a = new ajam();
    private final axnm A;
    private final aiix B;
    private final afig C;
    private long D;
    private final Map E;
    private boolean F;
    private final aikh G;
    private final aacz H;
    private final aivp I;
    public final snc b;
    public final ajai c;
    public final aijf d;
    public final zey e;
    public final aadd f;
    public final ajbc h;
    public ajbe i;
    public ajfl j;
    public ajbe k;
    public ajfl l;
    public ajbe m;
    public boolean o;
    public int p;
    private final aeov q;
    private final aflx r;
    private final aflu s;
    private final aikf t;
    private final aant u;
    private final ajfm v;
    private final ajar w;
    private final boolean x;
    private final ajfe y;
    private final ajav z;
    public aika n = aika.NEW;
    public final ajfq g = new ajfq(this, new ampg() { // from class: ajaj
        @Override // defpackage.ampg
        public final Object apply(Object obj) {
            Void r2 = (Void) obj;
            ajao.this.aB(false);
            return null;
        }
    });

    public ajao(snc sncVar, aeov aeovVar, aflx aflxVar, aflu afluVar, aikf aikfVar, ajai ajaiVar, aijf aijfVar, aikh aikhVar, aant aantVar, zey zeyVar, ajfm ajfmVar, ajar ajarVar, aadd aaddVar, aacz aaczVar, ajfe ajfeVar, ajav ajavVar, axnm axnmVar, aivp aivpVar, aiix aiixVar, afig afigVar) {
        this.b = sncVar;
        this.q = aeovVar;
        this.r = aflxVar;
        this.s = afluVar;
        this.t = aikfVar;
        this.c = ajaiVar;
        this.d = aijfVar;
        this.G = aikhVar;
        this.u = aantVar;
        this.e = zeyVar;
        this.v = ajfmVar;
        this.w = ajarVar;
        this.f = aaddVar;
        this.H = aaczVar;
        this.z = ajavVar;
        this.A = axnmVar;
        this.I = aivpVar;
        this.B = aiixVar;
        this.C = afigVar;
        this.h = new ajbc(sncVar, aaddVar, new Handler(Looper.getMainLooper()), new azqb() { // from class: ajak
            @Override // defpackage.azqb
            public final Object get() {
                return ajao.this.m;
            }
        });
        this.x = aiix.b(aaddVar, ailf.b) > 15000;
        this.y = ajfeVar;
        this.E = new HashMap();
    }

    private final float aC(PlayerConfigModel playerConfigModel) {
        if (aiuf.u(playerConfigModel, this.d)) {
            return 0.0f;
        }
        float c = playerConfigModel == null ? 1.0f : playerConfigModel.c();
        if (playerConfigModel == null || !playerConfigModel.ag()) {
            return c * this.d.a();
        }
        return this.d.a();
    }

    private static float aD(ajbe ajbeVar) {
        return ajbeVar.a.p().d;
    }

    private final int aE(boolean z, boolean z2) {
        int i = this.d.r == orw.AUDIO_ROUTE_ALARM ? 1 : 0;
        if (z) {
            i |= 2;
        }
        if (z2) {
            i |= 4;
        }
        if (this.d.g() == aijs.INLINE_IN_FEED) {
            i |= 16;
        }
        return this.d.l ? i | 8 : i;
    }

    private final long aG() {
        if (!this.n.f() || at() || ajjh.y(this.m.a)) {
            if (ak(aika.ENDED)) {
                return o();
            }
            return ajjh.q(u());
        }
        return ajjh.r(this.q);
    }

    private final long aH() {
        ajbe ajbeVar = this.m;
        String A = ajbeVar.A();
        return this.g.d(A) != null ? this.g.a(A, ajjh.q(ajbeVar.a)) : this.D;
    }

    private final PlayerResponseModel aI() {
        return aO().c();
    }

    private final aflm aJ(acvg acvgVar) {
        aflm aflmVar = this.r;
        if (acvgVar != null && !(acvgVar instanceof acvi)) {
            atdy atdyVar = this.f.a().i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aqww aqwwVar = atdyVar.h;
            if (aqwwVar == null) {
                aqwwVar = aqww.b;
            }
            if (aqwwVar.B) {
                aflmVar = this.s.a(acvgVar);
            }
            aflmVar.D();
        }
        return aflmVar;
    }

    private final aflm aK(ajbe ajbeVar) {
        return aJ((acvg) ajbeVar.a.b().a());
    }

    private final afmu aL() {
        aijf aijfVar = this.d;
        if (aijfVar.l) {
            return null;
        }
        return aijfVar.f;
    }

    private final ajbe aM(String str, int i, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        aeov aeovVar = this.q;
        ajbc ajbcVar = this.h;
        ajai ajaiVar = this.c;
        aijf aijfVar = this.d;
        ajar ajarVar = this.w;
        aikf aikfVar = this.t;
        ajaq ajaqVar = new ajaq(this, this.B);
        snc sncVar = this.b;
        ajfe ajfeVar = this.y;
        ajfeVar.b(str);
        ajfeVar.h(i);
        ajfeVar.f(this.g);
        ajfeVar.c(this);
        ajfeVar.d(z);
        ajfeVar.e(aijpVar != null ? aijpVar.b : null);
        ajfeVar.g(this.C.b());
        ajbe ajbeVar = new ajbe(aeovVar, ajbcVar, ajaiVar, aijfVar, ajarVar, aikfVar, ajaqVar, sncVar, ajfeVar.a(), new ajal(this), this.B, this.H, this.f);
        ajbeVar.a.i().a.i = this;
        ajbeVar.a.p().a = playbackStartDescriptor;
        ajbeVar.a.p().b = aijpVar;
        this.c.h(ajbeVar.a);
        if (i != 0) {
            this.E.put(str, ajbeVar);
        }
        return ajbeVar;
    }

    private final ajbf aN(aika aikaVar) {
        ajbe ajbeVar = this.k;
        return (!aikaVar.h() || ajbeVar == null) ? this.i.b : ajbeVar.b;
    }

    private final ajff aO() {
        ajbe ajbeVar;
        if (!this.g.g()) {
            ajbeVar = this.i;
        } else {
            ajfp o = this.g.o();
            if (o == null) {
                ajbeVar = this.i;
            } else {
                ajbeVar = (ajbe) this.E.get(o.e);
                if (ajbeVar == null || (ajbeVar.a.a() != 3 && !this.B.z())) {
                    ajbeVar = this.i;
                }
            }
        }
        return ajbeVar.a;
    }

    private final void aP(boolean z, int i, ajff ajffVar, long j) {
        ajbe ajbeVar = this.k;
        ahhx ahhxVar = null;
        if (!this.n.h() || ajbeVar == null) {
            this.h.e = ajffVar.m().b(j, z);
            if (bd()) {
                ahhx ahhxVar2 = new ahhx(j, -1L, ajffVar.p().g, ajjh.p(ajffVar), ajjh.o(ajffVar), ajffVar.p().j, this.b.d(), false, ajffVar.Z());
                this.m.a.i().k(ahhxVar2);
                ahhxVar = ahhxVar2;
            }
        } else {
            long b = ajbeVar.a.m().b(j, z);
            PlayerResponseModel c = ajbeVar.a.c();
            if (c == null) {
                return;
            }
            int a2 = c.a();
            this.h.e = b;
            ahhx ahhxVar3 = new ahhx(j, -1L, -1L, TimeUnit.SECONDS.toMillis(a2), 0L, -1L, this.b.d(), false, ajffVar != null ? ajffVar.Z() : null);
            ajbeVar.a.i().k(ahhxVar3);
            ahhxVar = ahhxVar3;
        }
        if (ahhxVar != null) {
            bh(i, ajffVar, ahhxVar, 4);
        }
    }

    private final void aQ() {
        this.m.a.am().c(new ahgi());
    }

    private final void aR() {
        ahgs ahgsVar = new ahgs();
        ahgsVar.b(this.b.c());
        this.m.a.an().c(ahgsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aS(defpackage.ajbe r10, com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajao.aS(ajbe, com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor):void");
    }

    private final void aT() {
        afmu aL = aL();
        if (aL != null && this.x && (aL instanceof afnh)) {
            ((afnh) aL).rO(2);
        }
    }

    private final void aU(ajbe ajbeVar) {
        PlayerResponseModel playerResponseModel;
        ajao ajaoVar = this;
        PlayerResponseModel a2 = ajbeVar.a();
        if (ajaoVar.aF(a2) == 0) {
            ajaoVar.ai(aika.INTERSTITIAL_REQUESTED);
            az(aijw.VIDEO_REQUESTED, ajbeVar.a);
            PlayerResponseModel a3 = ajbeVar.a();
            if (a3 == null) {
                playerResponseModel = a2;
            } else {
                PlayerConfigModel c = a3.c();
                ajaoVar.h.g = false;
                ajaoVar.z(ajbeVar.a.a() != 1, 0, ajbeVar.a);
                ajaoVar.d.q(as(a3.c));
                ajai.z(new ahgz(c.at()), u());
                aeov aeovVar = ajaoVar.q;
                aeuk aeukVar = new aeuk();
                playerResponseModel = a2;
                aeukVar.q(a3.c, aeov.k(ajjh.q(ajbeVar.a), c.H(), c.G()), ajbeVar.A(), c, aL(), ajbeVar, aeun.b, ajaoVar.aC(c), aD(ajbeVar), ajaoVar.aE(true, ba(ajbeVar.b())), aK(ajbeVar), ajbeVar.a.d(), bi(ajbeVar));
                aeovVar.t(aeukVar);
                aq(ajbeVar);
                ajaoVar = this;
                ajaoVar.h.a();
                ajaoVar.z.a(ajaoVar);
            }
            ajbe ajbeVar2 = ajaoVar.k;
            PlayerResponseModel playerResponseModel2 = playerResponseModel;
            if (playerResponseModel2 == null || ajbeVar2 == null) {
                zep.b("Interstitial Video failed to load; Interstitial SingleVideoController was nulled during medialib load");
                return;
            } else {
                ajbeVar2.a.i().d(u().Z(), playerResponseModel2, ajbeVar.A(), 1);
                return;
            }
        }
        afus.b(1, 10, "Interstitial Video was unplayable");
    }

    private final void aV(String str) {
        ajbe ajbeVar = (ajbe) this.E.remove(str);
        if (ajbeVar != null) {
            ajbeVar.C();
            this.c.i(ajbeVar.a);
        }
    }

    private final void aW(List list, boolean z, boolean z2) {
        ajbe ajbeVar;
        aess j;
        Iterator it;
        this.q.p();
        if (!list.isEmpty()) {
            ajfo ajfoVar = (ajfo) list.remove(0);
            boolean z3 = !bb();
            String str = null;
            if (z || !this.m.a.Z().equals(ajfoVar.b()) || z3) {
                str = ajfoVar.b();
                ajbeVar = (ajbe) this.E.get(ajfoVar.b());
                if (ajbeVar == null && ajfoVar.b().equals(this.i.A())) {
                    ajbeVar = this.i;
                }
                PlayerResponseModel a2 = ajfoVar.a();
                if (ajbeVar != null && a2 != null) {
                    PlayerConfigModel c = a2.c();
                    this.d.q(as(a2.c));
                    ajai.z(new ahgz(c.at()), ajbeVar.a);
                    this.h.g = false;
                    aeun aeunVar = aeun.b;
                    if (c.ai()) {
                        aeunVar = (aeun) this.A.get();
                    }
                    aeun aeunVar2 = aeunVar;
                    aeov aeovVar = this.q;
                    aeuk aeukVar = new aeuk();
                    VideoStreamingData videoStreamingData = a2.c;
                    if (!z2) {
                        j = aeov.j(ajfoVar.a);
                    } else {
                        j = aeov.k(ajfoVar.a, c.H(), c.G());
                    }
                    aeukVar.q(videoStreamingData, j, ajfoVar.b(), c, aL(), ajfoVar.d, aeunVar2, aC(c), aD(this.i), aE(true, ba(this.i.b())), aK(this.i), this.i.a.d(), bi(this.i));
                    aeovVar.t(aeukVar);
                    this.h.a();
                    this.z.a(this);
                } else if (a2 == null) {
                    afus.b(2, 10, "LocalDirector loading a media segment with no PlayerResponse.");
                } else {
                    afus.b(2, 10, "LocalDirector loading a CPN which does not have a component.");
                }
                if (ajbeVar != null) {
                    aq(ajbeVar);
                    ajjh.u(ajbeVar.a, ajfoVar.a);
                }
            } else {
                ajbeVar = null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ajfo ajfoVar2 = (ajfo) it2.next();
                aeun aeunVar3 = aeun.b;
                PlayerResponseModel a3 = ajfoVar2.a();
                if (a3 != null) {
                    if (a3.c().ai()) {
                        aeunVar3 = (aeun) this.A.get();
                    }
                    aeun aeunVar4 = aeunVar3;
                    aeov aeovVar2 = this.q;
                    aeuk aeukVar2 = new aeuk();
                    it = it2;
                    aeukVar2.q(a3.c, aeov.j(ajfoVar2.a), ajfoVar2.b(), a3.c(), aL(), ajfoVar2.d, aeunVar4, aC(a3.c()), aD(this.i), aE(true, ba(ajfoVar2.d.b())), aK(this.i), this.i.a.d(), bi(this.i));
                    aeovVar2.x(aeukVar2, ajfoVar.c ? -1L : ajfoVar.b);
                } else {
                    it = it2;
                }
                it2 = it;
                ajfoVar = ajfoVar2;
            }
            if (ajbeVar == null || str == null) {
                return;
            }
            if (ajbeVar.a.a() != 1) {
                if (!this.n.f()) {
                    ai(aika.VIDEO_REQUESTED);
                }
            } else if (!this.n.h()) {
                ajbe h = h(str);
                ai(aika.INTERSTITIAL_REQUESTED);
                az(aijw.VIDEO_REQUESTED, h.a);
                PlayerResponseModel c2 = h.a.c();
                if (c2 != null) {
                    h.a.i().d(u().Z(), c2, h.a.Z(), h.a.a());
                }
            }
            if (ajjh.w(u())) {
                return;
            }
            z(ajbeVar.a.a() != 1, 0, ajbeVar.a);
        }
    }

    private final void aX() {
        boolean z;
        if (aiix.B(this.f)) {
            z = bc(this.m.a);
        } else {
            z = this.p != 1;
        }
        if (at() || this.n.a(aika.PLAYBACK_INTERRUPTED) || !z || ajjh.y(this.m.a)) {
            return;
        }
        this.m.a.p().e = ajjh.r(this.q);
    }

    private final void aY(boolean z) {
        aX();
        if (this.z.b(this)) {
            this.h.g = true;
            if (z) {
                this.q.o();
            } else {
                this.q.F();
            }
        }
        if (this.n == aika.VIDEO_REQUESTED) {
            ai(aika.READY);
        }
    }

    private final void aZ(long j, boolean z) {
        aW(ajfq.s(this.g, null, j, Long.MAX_VALUE), z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean as(VideoStreamingData videoStreamingData) {
        return videoStreamingData != null && videoStreamingData.x();
    }

    public static final void az(aijw aijwVar, ajff ajffVar) {
        String valueOf = String.valueOf(aijwVar);
        String Z = ajffVar.Z();
        String.valueOf(valueOf).length();
        String.valueOf(Z).length();
        ajffVar.av().c(new ahhj(aijwVar, ajffVar.e(), ajffVar.Z()));
    }

    private static boolean ba(aijp aijpVar) {
        if (aijpVar == null) {
            return false;
        }
        return aijpVar.f;
    }

    private final boolean bb() {
        if (aiix.B(this.f)) {
            return bc(this.m.a);
        }
        return this.p != 1;
    }

    private final boolean bc(ajff ajffVar) {
        return TextUtils.equals(this.q.m(), ajffVar.Z());
    }

    private final boolean bd() {
        PlayerResponseModel c = this.i.a.c();
        return c == null || c.c() == null || !c.c().aU() || !c.F() || !aiix.e(this.f).f || this.n.h() || !((ajjh.q(m()) == 0 && ajjh.p(m()) == 0) || m().p().f == -1);
    }

    private final boolean be() {
        return ad() || (!at() && this.n.a(aika.NEW, aika.PLAYBACK_LOADED, aika.INTERSTITIAL_REQUESTED, aika.PLAYBACK_PENDING, aika.READY));
    }

    private final void bf(ajff ajffVar, long j, long j2, long j3, long j4, boolean z, int i, int i2) {
        if (av(aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING, aika.VIDEO_REQUESTED, aika.VIDEO_PLAYING, aika.ENDED)) {
            if (!bd()) {
                return;
            }
            ahhx ahhxVar = new ahhx(j2, j, ajffVar.p().g, ajffVar.p().h, j3, j4, this.b.d(), z, ajffVar.Z());
            this.m.a.i().k(ahhxVar);
            bh(i2, ajffVar, ahhxVar, i);
            return;
        }
        String valueOf = String.valueOf(this.n.name());
        zep.b(valueOf.length() != 0 ? "Media progress reported outside media playback: ".concat(valueOf) : new String("Media progress reported outside media playback: "));
    }

    private final void bg(aikd aikdVar, int i, int i2) {
        if (aikdVar != null) {
            if (aikdVar != u().p().l) {
                aikf aikfVar = this.t;
                String A = this.m.A();
                String string = aikfVar.b.getString(R.string.cpn_msg_on_error);
                if (!TextUtils.equals(A, aikdVar.b)) {
                    aikdVar.b = A;
                    if (!TextUtils.isEmpty(A) && !TextUtils.isEmpty(string)) {
                        String str = aikdVar.d;
                        String format = String.format(string, A);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(format).length());
                        sb.append(str);
                        sb.append("\n");
                        sb.append(format);
                        aikdVar.d = sb.toString();
                    }
                }
            }
            if (i2 == 0) {
                this.c.t(aikdVar, this.m.a, i);
            } else {
                ajai ajaiVar = this.c;
                for (ajfb ajfbVar : ajaiVar.b) {
                    ajfbVar.r(aikdVar);
                }
                ajaiVar.a.d(aikdVar);
            }
        }
        if (aikdVar == null || aiqa.d(aikdVar.i)) {
            u().p().l = aikdVar;
        }
    }

    private final void bh(int i, ajff ajffVar, ahhx ahhxVar, int i2) {
        if (!av(aika.INTERSTITIAL_PLAYING, aika.INTERSTITIAL_REQUESTED) || !ajjh.w(u())) {
            if (u().a() == 0) {
                this.D = ahhxVar.g();
            }
            if (i == 0) {
                this.c.s(ajffVar, ahhxVar, i2);
            } else {
                this.c.o(ahhxVar);
            }
        } else {
            ahhx ahhxVar2 = new ahhx(ahhxVar, ahhxVar.j(), ajffVar.Z());
            ahhx ahhxVar3 = new ahhx(this.g.l(ahhxVar, ajffVar.Z()), ahhxVar.j(), this.i.a.Z());
            this.D = ahhxVar3.g();
            if (i == 0) {
                this.c.s(ajffVar, ahhxVar2, i2);
            } else {
                this.c.o(ahhxVar2);
            }
            ahhxVar = ahhxVar3;
        }
        if (i == 0) {
            this.c.u(ajffVar, ahhxVar, i2);
        } else {
            this.c.q(ahhxVar);
        }
    }

    private static final byte[] bi(ajbe ajbeVar) {
        PlaybackStartDescriptor g = ajbeVar.a.g();
        if (g != null) {
            return g.z();
        }
        return null;
    }

    private final ajfl bj(boolean z, boolean z2) {
        return aA(z, z2, false);
    }

    private static final void bk(ajff ajffVar, PlayerResponseModel playerResponseModel) {
        ajffVar.p().e(playerResponseModel);
    }

    private final void bl(ajff ajffVar, boolean z) {
        bm(ajffVar, ajffVar.p().e, z);
    }

    private final void bm(ajff ajffVar, long j, boolean z) {
        if (ajjh.A(m())) {
            long j2 = u().p().g;
            PlayerResponseModel p = p();
            if (j > j2 && p != null) {
                VideoStreamingData videoStreamingData = p.c;
                List list = videoStreamingData.q;
                List list2 = videoStreamingData.r;
                boolean z2 = this.d.l;
                if (list.size() != 1 || (!z2 && list2.size() != 1)) {
                    int size = list.size();
                    int size2 = list2.size();
                    StringBuilder sb = new StringBuilder(127);
                    sb.append("syncTimelineToVideoComponent: unexpected offline playback stream count: ");
                    sb.append(size);
                    sb.append(" audio streams and ");
                    sb.append(size2);
                    sb.append(" video streams");
                    afus.b(2, 10, sb.toString());
                } else {
                    if (this.q.f((FormatStreamModel) list.get(0), z2 ? null : (FormatStreamModel) list2.get(0), j2, z2) < j) {
                        j = j2;
                    }
                }
            }
        }
        aW(ajfq.s(this.g, ajffVar.Z(), j, Long.MAX_VALUE), z, true);
    }

    @Override // defpackage.ajah
    public final void A() {
        this.q.q();
    }

    public final void B(int i) {
        ajbe ajbeVar;
        ajbe ajbeVar2;
        aika aikaVar = this.n;
        ahhw ahhwVar = new ahhw(aikaVar, aikaVar.c(aika.PLAYBACK_LOADED) ? this.i.a.c() : null, (!aikaVar.h() || (ajbeVar2 = this.k) == null) ? null : ajbeVar2.a.c(), aN(aikaVar), al(aika.PLAYBACK_LOADED) ? this.i.a.Z() : null, (!this.n.h() || (ajbeVar = this.k) == null) ? null : ajbeVar.a.Z(), ajjh.x(u()));
        if (i == 0) {
            this.c.k(ahhwVar, this.i.a);
        } else {
            this.c.p(ahhwVar);
        }
    }

    @Override // defpackage.ajah
    public final void C(PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2) {
        if (!aa()) {
            throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
        }
        bk(this.i.a, playerResponseModel);
        ai(aika.PLAYBACK_LOADED);
        this.i.a.o().e(true);
        ajbe aM = aM(this.e.a(), 3, null, null, false);
        bk(aM.a, playerResponseModel2);
        aS(aM, null);
    }

    @Override // defpackage.ajah
    public final void D(PlayerResponseModel playerResponseModel, aikd aikdVar) {
        bk(this.i.a, playerResponseModel);
        F(aikdVar);
    }

    @Override // defpackage.ajah
    public final void E(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor) {
        if (!aa()) {
            throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
        }
        boolean z = true;
        if (!aijr.i(playerResponseModel.t()) && !aijr.h(playerResponseModel.t())) {
            z = false;
        }
        aqxo.y(z);
        bk(this.i.a, playerResponseModel);
        if (ajjh.w(this.i.a)) {
            this.i.a.q().j();
        }
        if (aijr.h(playerResponseModel.t())) {
            this.i.a.aa().c(new ahgw());
            ai(aika.PLAYBACK_LOADED);
            return;
        }
        aS(this.i, playbackStartDescriptor);
    }

    @Override // defpackage.ajah
    public final void F(aikd aikdVar) {
        if (this.f.a() != null) {
            atdy atdyVar = this.f.a().i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aujv aujvVar = atdyVar.f;
            if (aujvVar == null) {
                aujvVar = aujv.b;
            }
            if (aujvVar.e && aikdVar.i == 4) {
                ax(aikdVar, 4);
                this.c.i(this.i.a);
                aT();
                return;
            }
        }
        ax(aikdVar, 3);
    }

    @Override // defpackage.ajah
    public final void G() {
        if (bb()) {
            this.q.u();
            aX();
        }
    }

    @Override // defpackage.ajah
    public final void H() {
        PlayerResponseModel a2;
        PlayerResponseModel aI;
        if (!al(aika.INTERSTITIAL_REQUESTED)) {
            zep.l("play() called when the player wasn't loaded.");
        } else if (ajjh.z(this.d, aI())) {
            zep.l("play() blocked because Background Playability failed");
        } else if (!ar()) {
            this.h.g = false;
            u().p().l = null;
            ajbe ajbeVar = this.k;
            if (au()) {
                int ordinal = this.n.ordinal();
                if (ordinal != 6) {
                    if (ordinal == 9) {
                        ajjh.u(u(), 0L);
                    }
                    this.q.w();
                }
                this.m.a.m().m();
                ai(aika.VIDEO_PLAYING);
                this.q.w();
            } else if (this.j == null || ajbeVar == null || ajbeVar.a.c() == null) {
                if (this.g.g() || this.g.i()) {
                    if (this.o) {
                        aikd r = r();
                        if (r == null) {
                            afus.b(2, 10, "maybeRegenerateCpnAndStatsClient called unexpectedly, but no error.");
                        } else {
                            String valueOf = String.valueOf(r.d);
                            afus.c(2, 10, valueOf.length() != 0 ? "maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: ".concat(valueOf) : new String("maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: "), new Exception(r.f));
                        }
                        this.c.j();
                        String a3 = this.e.a();
                        PlayerResponseModel c = this.i.a.c();
                        PlaybackStartDescriptor g = this.i.a.g();
                        aijp h = this.i.a.h();
                        long j = this.i.a.p().e;
                        ajbe g2 = g(a3, g, h, true);
                        this.i = g2;
                        this.m = g2;
                        ajjh.u(g2.a, j);
                        bk(this.i.a, c);
                        for (String str : this.g.u()) {
                            aV(str);
                        }
                        PlayerResponseModel c2 = this.i.a.c();
                        if (c2 != null) {
                            ajfq ajfqVar = this.g;
                            ajfqVar.B(ajfqVar.m(c2, this.i.a.Z(), 0));
                        }
                        this.o = false;
                        for (ajfb ajfbVar : this.c.b) {
                            ajfbVar.t();
                        }
                    }
                    if (aF(aI()) != 0 || (a2 = this.i.a()) == null || (aI = aI()) == null) {
                        return;
                    }
                    this.i.a.o().e(true);
                    if (this.j != null) {
                        return;
                    }
                    auaf e = aiix.e(this.f);
                    if (e == null || !e.B) {
                        if (a2.F() && !a2.G()) {
                            ajjh.u(u(), 0L);
                        }
                    } else if (((ajfj) this.i.c()).j != -1) {
                        ajjh.u(u(), 0L);
                    }
                    if (ak(aika.ENDED)) {
                        ai(aika.VIDEO_REQUESTED);
                        bm(aO(), 0L, true);
                    } else {
                        if (!al(aika.VIDEO_REQUESTED)) {
                            ai(aika.VIDEO_REQUESTED);
                        }
                        if (aO().a() == 3 || this.B.z()) {
                            bl(aO(), true);
                        } else {
                            bl(this.m.a, true);
                        }
                    }
                    aO().i().e(aO().Z(), aI, aO().a());
                    return;
                }
                afus.b(2, 10, "Attempting to play with no data in PlaybackTimeline");
            } else {
                aU(ajbeVar);
            }
        }
    }

    public final void I() {
        for (ajfb ajfbVar : this.c.b) {
            ajfbVar.E(this);
        }
        this.q.q();
        this.q.F();
        this.p = 1;
        this.h.g = false;
        this.F = false;
        this.d.t(1);
        S();
        this.l = null;
        this.j = null;
    }

    @Override // defpackage.ajah
    public final void J(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, String str) {
        if (playbackStartDescriptor == null || aijpVar == null) {
            return;
        }
        aanr h = aanr.h(this.f, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aijpVar.h, playbackStartDescriptor.z());
        aeuo a2 = this.I.a(str);
        if (h == null || TextUtils.isEmpty(playbackStartDescriptor.l())) {
            return;
        }
        h.f(playbackStartDescriptor.l());
        this.q.s(h, a2, aJ(aijpVar.b));
    }

    @Override // defpackage.ajah
    public final void K(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        if (this.n.a(aika.NEW, aika.PLAYBACK_PENDING, aika.ENDED)) {
            afus.b(2, 10, "Attempting to queue video when video is not loaded and playing");
        }
        if (this.g.g()) {
            ajbe g = g(playbackStartDescriptor.g(this.e), playbackStartDescriptor, aijpVar, false);
            g.a.p().e(playerResponseModel);
            this.E.put(g.A(), g);
            ajfq ajfqVar = this.g;
            for (String str : ajfqVar.t(ajfqVar.d(this.i.A()))) {
                aV(str);
            }
            ajfq ajfqVar2 = this.g;
            ajfqVar2.B(ajfqVar2.m(playerResponseModel, g.a.Z(), 0));
            this.g.x();
        }
    }

    @Override // defpackage.ajah
    public final void L() {
        B(1);
        aw(this.m.a, 4, 1);
        if (at()) {
            z(false, 1, this.m.a);
        } else {
            ajff ajffVar = this.m.a;
            bf(ajffVar, ajffVar.p().f, this.m.a.p().e, this.m.a.p().i, this.m.a.p().j, false, 4, 1);
        }
        bg(u().p().l, 4, 1);
        PlayerResponseModel c = this.i.a.c();
        if (c == null) {
            return;
        }
        VideoStreamingData videoStreamingData = c.c;
        PlayerConfigModel c2 = c.c();
        if (videoStreamingData == null || c2 == null) {
            return;
        }
        try {
            aegu b = this.q.b(videoStreamingData, c2, this.d.l);
            aesr aesrVar = new aesr(null, null, null, b.d, b.e, b.f, 0);
            this.m.a.i().c(aesrVar);
            this.c.n(aesrVar, this.m.a.Z());
        } catch (aegw unused) {
        }
    }

    @Override // defpackage.ajah
    public final void M() {
        if (this.z.b(this)) {
            this.q.F();
        }
        this.h.g = true;
        aT();
        if (this.n != aika.NEW) {
            this.i.a.o().e(false);
            this.i.a.o().d();
            this.j = null;
            this.l = null;
            this.p = 1;
            if (this.z.b(this)) {
                this.q.q();
                this.q.p();
                this.q.F();
            }
            this.h.b();
            ai(aika.NEW);
            if (this.E.get(this.i.A()) == null) {
                this.i.C();
                this.c.i(this.i.a);
            }
            for (String str : this.g.u()) {
                aV(str);
            }
            S();
            ArrayList arrayList = new ArrayList(this.E.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aV(((ajbe) arrayList.get(i)).A());
            }
            this.c.j();
            atzt D = aiix.D(this.H);
            if (D == null || !D.i) {
                this.d.i();
            }
            this.c.a();
        }
    }

    @Override // defpackage.ajah
    public final void N() {
        H();
        for (ajfb ajfbVar : this.c.b) {
        }
    }

    @Override // defpackage.ajah
    public final void O(String str) {
        FormatStreamModel h = this.q.h();
        this.q.z(str);
        if (h == null || this.n.g() || this.u.get() == null || !this.u.get().ag()) {
            return;
        }
        Y();
    }

    @Override // defpackage.ajah
    public final void P(float f) {
        u().p().d = f;
        if (!this.n.h()) {
            this.q.B(f);
        }
    }

    @Override // defpackage.ajah
    public final void Q(int i) {
        FormatStreamModel h = this.q.h();
        this.q.C(i, w());
        if ((aiix.j(this.f) || h != null) && !this.n.g()) {
            this.c.d(new ahge(i), this.m.a);
        }
    }

    @Override // defpackage.ajah
    public final void R(awan awanVar) {
        FormatStreamModel h = this.q.h();
        this.q.D(awanVar, w());
        if ((aiix.j(this.f) || h != null) && !this.n.g()) {
            this.c.d(new ahge(awanVar, true), this.m.a);
        }
    }

    public final void S() {
        ajbe ajbeVar = this.k;
        if (ajbeVar != null) {
            aV(ajbeVar.a.Z());
            this.k = null;
            if (!this.n.a(aika.INTERSTITIAL_PLAYING, aika.INTERSTITIAL_REQUESTED) || this.i.a() == null) {
                return;
            }
            ai(aika.PLAYBACK_INTERRUPTED);
        }
    }

    @Override // defpackage.ajah
    public final void T(boolean z) {
        this.h.g = z;
    }

    public final void U() {
        ai(aika.ENDED);
    }

    @Override // defpackage.ajah
    public final void V() {
        aY(false);
    }

    @Override // defpackage.ajah
    public final void W() {
        ajbe ajbeVar = this.m;
        ajbe ajbeVar2 = this.i;
        if (ajbeVar != ajbeVar2) {
            this.c.l(new ahgl(ajbeVar.A()), this.m.a);
            this.i.B(true);
            return;
        }
        ajbeVar2.B(false);
    }

    public final void X(ajfl ajflVar, PlayerResponseModel playerResponseModel, long j, float f) {
        if (ajflVar == null) {
            zep.g("ContentVideoState is null but we're attempting to restore");
            return;
        }
        this.h.g = !ajflVar.a;
        this.F = ajflVar.b;
        this.i.a.p().e = ajflVar.d;
        this.i.a.p().d = f;
        ajbe ajbeVar = this.k;
        if (ajbeVar != null) {
            bk(ajbeVar.a, playerResponseModel);
            ajbeVar.a.p().e = j;
        }
        this.d.i();
        this.i.a.i().l();
        if (!ajflVar.c) {
            this.i.a.i().b(ajflVar.f);
        }
        PlaybackListenerStateRestorerState playbackListenerStateRestorerState = ajflVar.g;
        if (playbackListenerStateRestorerState == null) {
            return;
        }
        ajfm ajfmVar = this.v;
        ajbe ajbeVar2 = this.i;
        ajaq ajaqVar = ajbeVar2.b;
        boolean z = ajflVar.c;
        ajbeVar2.a.Z();
        ajfmVar.b(playbackListenerStateRestorerState, new anvz(z));
    }

    @Override // defpackage.ajah
    public final void Y() {
        this.q.E(aC(this.u.get()));
    }

    @Override // defpackage.ajah
    public final boolean Z(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        PlayerResponseModel a2;
        if (aijpVar != null && aijpVar.c && this.m != null && this.g.g() && this.E != null) {
            ajfp p = this.g.p(this.m.A(), ((ajfj) this.m.c()).e);
            ajbe ajbeVar = p != null ? (ajbe) this.E.get(p.e) : null;
            if (ajbeVar != null && (a2 = ajbeVar.a()) != null && playbackStartDescriptor.l().equals(a2.B())) {
                ajbeVar.a.p().a = playbackStartDescriptor;
                ajbeVar.a.p().b = aijpVar;
                zgz b = ajbeVar.a.b();
                if (b instanceof aiiy) {
                    ((aiiy) b).a = aijpVar.b;
                }
                this.q.v();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajet
    public final void a() {
        X(this.j, null, 0L, aD(this.i));
        this.h.b();
        this.j = null;
        ajbe ajbeVar = this.m;
        ajbe ajbeVar2 = this.i;
        if (ajbeVar != ajbeVar2) {
            aq(ajbeVar2);
        }
        S();
        ai(this.F ? aika.ENDED : aika.READY);
        if (!at()) {
            this.p = 1;
            H();
        } else if (!this.F) {
        } else {
            if (!this.g.g() || this.g.z(this.i.a.Z())) {
                PlayerResponseModel c = this.i.a.c();
                if (c == null) {
                    return;
                }
                aeov aeovVar = this.q;
                aeuk aeukVar = new aeuk();
                aeukVar.q(c.c, aeov.j(ajjh.q(u())), this.i.a.Z(), c.c(), aL(), this.i, aeun.b, aC(c.c()), aD(this.i), aE(false, ba(this.i.b())), aK(this.i), this.i.a.d(), bi(this.i));
                aeovVar.t(aeukVar);
                long p = ajjh.p(u());
                ay(u(), 4, -1L, p, p, -1L);
                return;
            }
            ajfp q = this.g.q(this.i.A());
            if (q == null) {
                return;
            }
            aW(ajfq.s(this.g, q.e, 0L, Long.MAX_VALUE), true, true);
        }
    }

    public final ajfl aA(boolean z, boolean z2, boolean z3) {
        ajfl ajflVar = this.j;
        if (ajflVar != null) {
            return new ajfl(false, ajflVar.b || z3, z, ajflVar.d, ajflVar.f, ajflVar.g, ajflVar.e);
        }
        return new ajfl(!z && !z2 && be(), this.n == aika.ENDED || z3, z, Math.max(aG(), 0L), this.i.a.i().a(), this.v.a(), this.i.a.Z());
    }

    public final void aB(boolean z) {
        if (ajjh.w(u())) {
            aZ(aH(), false);
            this.i.a.f().b();
        } else if (this.g.d(this.m.A()) != null) {
            bl(this.m.a, z);
        } else {
            bl(this.i.a, z);
        }
    }

    @Override // defpackage.ajah
    public final boolean aa() {
        aika aikaVar = this.n;
        return aikaVar != null && aikaVar.c(aika.PLAYBACK_PENDING);
    }

    @Override // defpackage.ajah
    public final boolean ab() {
        return false;
    }

    public final void ac(int i) {
        this.p = 1;
        ajai ajaiVar = this.c;
        aiio aiioVar = new aiio(i);
        ajff ajffVar = this.m.a;
        for (ajfb ajfbVar : ajaiVar.b) {
        }
        ajffVar.az().c(aiioVar);
    }

    @Override // defpackage.ajah
    public final boolean ad() {
        return this.n.b() || (this.n.d() && this.q.G());
    }

    @Override // defpackage.ajah
    public final boolean ae() {
        return this.q.G();
    }

    @Override // defpackage.ajah
    public final boolean af() {
        return this.n.h();
    }

    @Override // defpackage.ajah
    public final boolean ag() {
        return av(aika.VIDEO_REQUESTED, aika.VIDEO_PLAYING);
    }

    @Override // defpackage.ajah
    public final boolean ah() {
        return aiix.B(this.f) ? this.q.m() == null : this.p == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ai(aika aikaVar) {
        if (aikaVar != aika.PLAYBACK_PENDING) {
            aT();
        } else {
            afmu aL = aL();
            if (aL != null && this.x && (aL() instanceof afnh)) {
                ((afnh) aL).g(2);
            }
        }
        this.n = aikaVar;
        String valueOf = String.valueOf(aikaVar.toString());
        if (valueOf.length() != 0) {
            "VideoStage: ".concat(valueOf);
        }
        int ordinal = aikaVar.ordinal();
        if (ordinal == 2) {
            this.i.a.m().k();
        } else if (ordinal == 4) {
            ajbe ajbeVar = this.k;
            if (ajbeVar != null) {
                ajbeVar.a.m().k();
                ajbeVar.a.m().m();
            }
        } else if (ordinal == 7) {
            this.i.a.m().m();
        }
        B(0);
        switch (aikaVar.ordinal()) {
            case 1:
                az(aijw.PLAYBACK_PENDING, this.i.a);
                return;
            case 2:
                az(aijw.PLAYBACK_LOADED, this.i.a);
                return;
            case 3:
                az(aijw.PLAYBACK_INTERRUPTED, this.i.a);
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                az(aijw.READY, this.i.a);
                return;
            case 7:
                az(aijw.VIDEO_REQUESTED, this.i.a);
                return;
            case 8:
                az(aijw.VIDEO_PLAYING, this.i.a);
                return;
            case 9:
                az(aijw.ENDED, this.i.a);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f  */
    @Override // defpackage.ajah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aj(long r25, defpackage.auqn r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajao.aj(long, auqn):boolean");
    }

    @Override // defpackage.ajah
    public final boolean ak(aika aikaVar) {
        return this.n == aikaVar;
    }

    @Override // defpackage.ajah
    public final boolean al(aika aikaVar) {
        return this.n.c(aikaVar);
    }

    @Override // defpackage.ajah
    public final void am() {
        PlayerConfigModel playerConfigModel = this.u.get();
        if (playerConfigModel == null || !playerConfigModel.aN()) {
            this.d.t(3);
            Y();
            aitv i = this.m.a.i();
            aiuf aiufVar = i.b;
            if (aiufVar != null && i.f) {
                aiufVar.p();
            }
            aiul aiulVar = i.c;
            if (aiulVar == null) {
                return;
            }
            if (!aiulVar.i) {
                if (!aiulVar.j) {
                    return;
                }
                aiulVar.j = false;
                return;
            }
            aiulVar.b(false, aiulVar.d.d());
            aiulVar.j = false;
            aiulVar.h(aiulVar.d.d());
        }
    }

    @Override // defpackage.ajah
    public final ajfa an() {
        return this.i.a.o();
    }

    @Override // defpackage.ajah
    public final void ao() {
        this.d.t(2);
        Y();
        aitv i = this.m.a.i();
        aiuf aiufVar = i.b;
        if (aiufVar != null && i.f) {
            aiufVar.j();
        }
        aiul aiulVar = i.c;
        if (aiulVar != null) {
            if (!aiulVar.i) {
                if (aiulVar.j) {
                    return;
                }
                aiulVar.j = true;
                return;
            }
            aiulVar.b(false, aiulVar.d.d());
            aiulVar.j = true;
            aiulVar.h(aiulVar.d.d());
        }
    }

    @Override // defpackage.ajah
    public final void ap(long j, auqn auqnVar) {
        long aG;
        if (this.g.g()) {
            ajfq ajfqVar = this.g;
            if (ajfqVar.d) {
                aG = ajfqVar.a(this.m.A(), this.m.a.p().e);
                aj(aG + j, auqnVar);
            }
        }
        aG = aG();
        aj(aG + j, auqnVar);
    }

    public final void aq(ajbe ajbeVar) {
        ajbe ajbeVar2;
        boolean containsKey = this.E.containsKey(ajbeVar.A());
        if (!containsKey) {
            this.E.put(ajbeVar.A(), ajbeVar);
        }
        if (ajbeVar.a.a() == 0 && (ajbeVar2 = this.i) != ajbeVar) {
            this.i = ajbeVar;
            this.c.f(ajbeVar.a);
            for (String str : this.g.e(ajbeVar2.A())) {
                aV(str);
            }
            ai(aika.NEW);
            ai(aika.PLAYBACK_PENDING);
            ai(aika.PLAYBACK_LOADED);
            ai(aika.READY);
        }
        if (this.m != ajbeVar || !containsKey) {
            this.m = ajbeVar;
            this.c.b(ajbeVar.a);
            ajbe ajbeVar3 = this.i;
            ajff ajffVar = this.m.a;
            if (ajffVar.a() != 1) {
                return;
            }
            ajai ajaiVar = ajbeVar3.c;
            String A = ajbeVar3.A();
            String Z = ajffVar.Z();
            for (ajfb ajfbVar : ajaiVar.b) {
                ajfbVar.l(A, Z);
            }
            if (!aiix.E(ajbeVar3.e)) {
                return;
            }
            aivw aivwVar = ajbeVar3.d;
            String Z2 = ajffVar.Z();
            afiz afizVar = aivwVar.s;
            if (afizVar == null) {
                return;
            }
            afizVar.m(Z2);
        }
    }

    public final boolean ar() {
        PlayerResponseModel c = this.i.a.c();
        boolean b = aijr.b(this.i.a.c(), this.b);
        if (c != null && b) {
            VideoStreamingData videoStreamingData = c.c;
            long d = this.b.d();
            ac(!videoStreamingData.A(d) ? -1 : (int) TimeUnit.SECONDS.convert(d - videoStreamingData.e, TimeUnit.MILLISECONDS));
        }
        return b;
    }

    public final boolean at() {
        return this.h.g;
    }

    public final boolean au() {
        return bb() && this.n != aika.ENDED;
    }

    public final boolean av(aika... aikaVarArr) {
        return this.n.a(aikaVarArr);
    }

    public final void aw(ajff ajffVar, int i, int i2) {
        ahia ahiaVar = new ahia(ajjh.n(ajffVar), ajffVar != null ? ajffVar.Z() : null);
        if (i2 == 0) {
            this.c.v(ahiaVar, i, ajffVar);
        } else {
            this.c.r(ahiaVar);
        }
    }

    public final void ax(aikd aikdVar, int i) {
        if (aiqa.d(aikdVar.i)) {
            this.o = true;
        }
        if (al(aika.READY)) {
            ai(aika.READY);
        } else if (al(aika.INTERSTITIAL_REQUESTED)) {
            ai(aika.PLAYBACK_LOADED);
        }
        bg(aikdVar, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ay(ajff ajffVar, int i, long j, long j2, long j3, long j4) {
        if (j2 < 0) {
            return;
        }
        this.h.e = (!aiix.k(this.f) || !this.m.a.m().n()) ? ajffVar.m().a(j2) : Long.MAX_VALUE;
        if (bc(ajffVar) || (ajjh.p(ajffVar) > 0 && ajjh.p(ajffVar) == j2)) {
            ajffVar.p().f = j;
            ajjh.u(ajffVar, j2);
            ajffVar.p().i = j3;
            ajffVar.p().j = j4;
        }
        if (i == 1) {
            return;
        }
        bf(ajffVar, j, j2, j3, j4, true, i, 0);
    }

    @Override // defpackage.ajet
    public final void b(PlayerResponseModel playerResponseModel, String str) {
        this.j.getClass();
        this.i.a.i().l();
        this.p = 1;
        ajbe h = h(str);
        bk(h.a, playerResponseModel);
        ajjh.u(h.a, 0L);
        ajai.y(playerResponseModel, h.a);
        this.c.e(this.i.a.Z());
        aU(h);
    }

    @Override // defpackage.ajet
    public final void c() {
        if (this.n.h()) {
            V();
            ajbe ajbeVar = this.k;
            if (ajbeVar != null) {
                ajbeVar.a.i().g();
            }
            S();
            aq(this.i);
        }
    }

    @Override // defpackage.ajet
    public final void d() {
        this.j = bj(false, false);
        if (aiix.w(this.f)) {
            this.i.a.m().h();
        }
        G();
        this.h.b();
        ajfl ajflVar = this.l;
        if (ajflVar != null) {
            this.h.g = !ajflVar.a;
            this.F = ajflVar.b;
            if (!ajflVar.c) {
                ajbe h = h(ajflVar.e);
                h.a.i().b(ajflVar.f);
                ajjh.u(h.a, ajflVar.d);
            }
            PlaybackListenerStateRestorerState playbackListenerStateRestorerState = ajflVar.g;
            if (playbackListenerStateRestorerState != null) {
                ajfm ajfmVar = this.v;
                ajbe ajbeVar = this.i;
                ajaq ajaqVar = ajbeVar.b;
                boolean z = ajflVar.c;
                ajbeVar.a.Z();
                ajfmVar.b(playbackListenerStateRestorerState, new anvz(z));
            }
        }
        this.l = null;
        ai(aika.PLAYBACK_INTERRUPTED);
    }

    @Override // defpackage.aitr, defpackage.ajeo
    public final void e(aikd aikdVar) {
        String str;
        FormatStreamModel h = this.q.h();
        if (h == null) {
            h = this.q.g();
        }
        if (h == null || !h.J()) {
            aika aikaVar = aika.NEW;
            int i = aikdVar.i;
            int i2 = i - 1;
            String str2 = "net.retryexhausted";
            if (i2 == 6) {
                str2 = "servererror";
            } else if (i2 != 7) {
                if (i2 != 8) {
                    switch (i) {
                        case 1:
                            str = "UNKNOWN";
                            break;
                        case 2:
                            str = "VIDEO_ERROR";
                            break;
                        case 3:
                            str = "UNPLAYABLE";
                            break;
                        case 4:
                            str = "REQUEST_FAILED";
                            break;
                        case 5:
                            str = "USER_AGE_CHECK_FAILED";
                            break;
                        case 6:
                            str = "USER_CONTENT_CHECK_FAILED";
                            break;
                        case 7:
                            str = "LICENSE_SERVER_ERROR";
                            break;
                        case 8:
                            str = "LICENSE_SERVER_NET_ERROR";
                            break;
                        case 9:
                            str = "LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR";
                            break;
                        case 10:
                            str = "PLAYER_ERROR";
                            break;
                        case 11:
                            str = "NO_STREAMS";
                            break;
                        case 12:
                            str = "WATCH_NEXT_ERROR";
                            break;
                        case 13:
                            str = "UNPLAYABLE_IN_BACKGROUND";
                            break;
                        case 14:
                            str = "UNPLAYABLE_BY_APP_POLICY";
                            break;
                        default:
                            str = "PARTIAL_PLAYBACK_DATA_EXHAUSTED";
                            break;
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 31);
                    sb.append("Unexpected heartbeat response: ");
                    sb.append(str);
                    afus.b(2, 10, sb.toString());
                } else {
                    str2 = "stop";
                }
            }
            this.c.c(new afkn(afkl.HEARTBEAT, str2, this.q.i().b), this.m.a);
            V();
            ax(aikdVar, 4);
        }
    }

    final long f() {
        ajbe ajbeVar = this.k;
        ajff ajffVar = ajbeVar != null ? ajbeVar.a : null;
        if (!this.n.h() || ajffVar == null) {
            return 0L;
        }
        if (at()) {
            return ajjh.q(ajffVar);
        }
        return ajjh.r(this.q);
    }

    public final ajbe g(String str, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, boolean z) {
        return aM(str, 0, playbackStartDescriptor, aijpVar, z);
    }

    public final ajbe h(String str) {
        ajbe ajbeVar = this.k;
        if (ajbeVar == null || !TextUtils.equals(ajbeVar.A(), str)) {
            ajbeVar = (ajbe) this.E.get(str);
            if (ajbeVar == null) {
                ajbeVar = aM(str, 1, null, null, false);
            }
            this.k = ajbeVar;
        }
        return ajbeVar;
    }

    @Override // defpackage.ajbs
    public final ajbr i(String str, PlayerResponseModel playerResponseModel, int i) {
        if (!TextUtils.equals(str, w())) {
            ajbe ajbeVar = (ajbe) this.E.get(str);
            if (ajbeVar == null) {
                ajbeVar = aM(str, i, null, null, false);
            }
            ajbeVar.a.p().e(playerResponseModel);
            return ajbeVar;
        }
        return this.i;
    }

    @Override // defpackage.ajah
    public final float j() {
        aeov aeovVar = this.q;
        ylr.c();
        return aeovVar.d.a();
    }

    @Override // defpackage.ajah
    public final long k() {
        return ajjh.o(m());
    }

    @Override // defpackage.ajah
    public final long l() {
        if (ajjh.w(u())) {
            return aH();
        }
        if (this.n.h()) {
            return f();
        }
        return aG();
    }

    final ajff m() {
        return this.m.a;
    }

    @Override // defpackage.ajah
    public final long n(long j) {
        aeov aeovVar = this.q;
        ylr.c();
        return aeovVar.d.j(j);
    }

    @Override // defpackage.ajah
    public final long o() {
        return ajjh.p(u());
    }

    @Override // defpackage.ajah
    public final PlayerResponseModel p() {
        return this.i.a.c();
    }

    @Override // defpackage.ajah
    public final aeos q() {
        return ajjh.s(this.q, this.i.a.c());
    }

    @Override // defpackage.ajah
    public final aikd r() {
        return u().p().l;
    }

    @Override // defpackage.ajah
    public final ajbf s() {
        return this.i.b;
    }

    @Override // defpackage.ajah
    public final ajbf t() {
        return aN(this.n);
    }

    @Override // defpackage.ajah
    public final ajff u() {
        return this.i.a;
    }

    @Override // defpackage.ajah
    public final DirectorSavedState v(int i) {
        PlayerResponseModel playerResponseModel;
        String str;
        ajfl ajflVar;
        boolean z = i == 0;
        if (!z || !this.n.h()) {
            String Z = z ? null : this.i.a.Z();
            ajbe ajbeVar = this.k;
            if (z || this.j != null || ajbeVar == null) {
                playerResponseModel = null;
                str = null;
            } else {
                PlayerResponseModel c = ajbeVar.a.c();
                str = ajbeVar.a.Z();
                playerResponseModel = c;
            }
            boolean z2 = this.G.j() ? !this.G.k() : false;
            boolean z3 = i != 1;
            ajfl bj = bj(z, z3);
            ajbe ajbeVar2 = this.k;
            if (this.j == null || ajbeVar2 == null) {
                ajflVar = null;
            } else {
                ajflVar = new ajfl(!z3 && be(), false, z, f(), ajbeVar2.a.i().a(), this.v.a(), ajbeVar2.a.Z());
            }
            return new DirectorSavedState(bj, ajflVar, this.i.a.c(), this.i.a.g(), z2, playerResponseModel, str, f(), Z, aD(this.i), !z && this.o);
        }
        return null;
    }

    @Override // defpackage.ajah
    public final String w() {
        return this.i.a.Z();
    }

    @Override // defpackage.ajah
    public final String x() {
        PlayerResponseModel c = u().c();
        if (c != null) {
            return c.B();
        }
        return null;
    }

    @Override // defpackage.ajah
    public final void y() {
        aY(true);
        this.p = 1;
        ajjh.v(m(), 4);
    }

    public final void z(boolean z, int i, ajff ajffVar) {
        aP(z, i, ajffVar, ajjh.q(ajffVar));
    }

    private final int aF(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null || playerResponseModel.c != null) {
            return ajjh.z(this.d, playerResponseModel) ? 2 : 0;
        }
        afus.b(1, 10, "playVideo called on player response with no videoStreamingData.");
        return 1;
    }
}
