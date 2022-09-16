package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adlb  reason: default package */
/* loaded from: classes.dex */
public final class adlb extends adog implements ajah, wlm, ynl {
    private static final String t = zep.a("MDX.player.director");
    private final ajfe A;
    private PlaybackStartDescriptor C;
    private int D;
    private aalv F;
    private final adld G;
    private adld H;
    private final Map I;

    /* renamed from: J  reason: collision with root package name */
    private amuk f33J;
    private final aikh K;
    public final yni a;
    public final aynx b;
    public final Handler f;
    public final adnt g;
    public final aizu h;
    public aika i;
    public adnm j;
    public final ajff k;
    public final adld l;
    public ajff m;
    public PlayerResponseModel n;
    public ajff o;
    public final wku p;
    public final airw q;
    public ahhx s;
    private final Context u;
    private final snc v;
    private final Executor w;
    private final aanz x;
    private final ajai y;
    private final zey z;
    final adla c = new adla(this);
    public final aypf e = new aypf();
    private final ajet B = new adkw();
    private long E = 0;
    public boolean r = false;

    public adlb(Context context, snc sncVar, Executor executor, yni yniVar, wkt wktVar, wvx wvxVar, aynx aynxVar, adnt adntVar, aikh aikhVar, aanz aanzVar, ajai ajaiVar, aizu aizuVar, wnb wnbVar, zey zeyVar, ajfe ajfeVar, aacz aaczVar, wmt wmtVar, airw airwVar) {
        this.u = context;
        sncVar.getClass();
        this.v = sncVar;
        this.w = executor;
        yniVar.getClass();
        this.a = yniVar;
        this.b = aynxVar;
        adntVar.getClass();
        this.g = adntVar;
        aikhVar.getClass();
        this.K = aikhVar;
        aanzVar.getClass();
        this.x = aanzVar;
        adld adldVar = new adld(this);
        this.l = adldVar;
        this.G = new adld(this);
        this.H = adldVar;
        this.y = ajaiVar;
        this.h = aizuVar;
        this.z = zeyVar;
        this.A = ajfeVar;
        this.q = airwVar;
        this.I = new HashMap();
        this.p = new wku(this, wktVar, wvxVar, wnbVar, aaczVar, wmtVar, yniVar);
        this.f = new adkv(this, context.getMainLooper());
        ajff as = as(zeyVar.a(), 0);
        this.k = as;
        X(as);
        ajaiVar.f(as);
        this.i = aika.NEW;
        this.D = 4;
        S(aika.PLAYBACK_PENDING, null);
        this.f33J = amuk.q();
        adntVar.z(this);
    }

    private final long aq() {
        if (this.g.e() != 0) {
            return this.g.e();
        }
        PlayerResponseModel playerResponseModel = this.l.a;
        if (playerResponseModel == null) {
            return 0L;
        }
        return playerResponseModel.a() * 1000;
    }

    private final adnk ar() {
        adnk c = adnl.c();
        c.f(this.l.a.B());
        if (this.C != null) {
            c.b(adll.a(this.l.a, this.s));
            c.b = this.C.i();
            c.c = this.C.j();
            c.d = this.C.y();
        }
        String c2 = this.K.c();
        if (c2 != null) {
            c.d(c2);
        }
        return c;
    }

    private final ajff as(String str, int i) {
        ajfe ajfeVar = this.A;
        ((dyl) ajfeVar).b(str);
        ajfeVar.h(i);
        ajfeVar.f(new adlk());
        ajfeVar.c(this.B);
        ajfeVar.d(false);
        ajff a = ajfeVar.a();
        this.y.h(a);
        if (i == 1) {
            this.I.put(str, a);
        }
        return a;
    }

    private final void at(int i) {
        FormatStreamModel formatStreamModel;
        aalv[] aalvVarArr = new aalv[this.f33J.size()];
        this.f33J.toArray(aalvVarArr);
        aalv aalvVar = this.F;
        if (aalvVar == null) {
            amuk amukVar = this.f33J;
            int size = amukVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aalvVar = null;
                    break;
                }
                aalv aalvVar2 = (aalv) amukVar.get(i2);
                i2++;
                if (aalvVar2.c) {
                    aalvVar = aalvVar2;
                    break;
                }
            }
        }
        if (aalvVar != null) {
            aopc aopcVar = (aopc) aqzx.b.createBuilder();
            Uri.Builder builder = new Uri.Builder();
            String str = aalvVar.a;
            String str2 = aalvVar.b;
            boolean z = aalvVar.c;
            aopa createBuilder = apip.a.createBuilder();
            createBuilder.copyOnWrite();
            apip apipVar = (apip) createBuilder.instance;
            str.getClass();
            apipVar.b |= 2;
            apipVar.d = str;
            createBuilder.copyOnWrite();
            apip apipVar2 = (apip) createBuilder.instance;
            str2.getClass();
            apipVar2.b |= 1;
            apipVar2.c = str2;
            createBuilder.copyOnWrite();
            apip apipVar3 = (apip) createBuilder.instance;
            apipVar3.b |= 4;
            apipVar3.e = z;
            aopcVar.copyOnWrite();
            aqzx aqzxVar = (aqzx) aopcVar.instance;
            apip apipVar4 = (apip) createBuilder.mo39build();
            apipVar4.getClass();
            aqzxVar.v = apipVar4;
            aqzxVar.c |= 262144;
            formatStreamModel = aaly.a(builder, null, 0L, aopcVar);
        } else {
            formatStreamModel = null;
        }
        aesr aesrVar = new aesr(null, formatStreamModel, null, aesr.a, aalvVarArr, 0);
        if (i == 0) {
            ajai ajaiVar = this.y;
            ajff ajffVar = this.o;
            for (ajfb ajfbVar : ajaiVar.b) {
                ajfbVar.h(aesrVar, ajffVar.Z());
            }
            ajffVar.ad().c(aesrVar);
            return;
        }
        this.y.n(aesrVar, this.o.Z());
    }

    private final void au(int i, RemoteVideoAd remoteVideoAd) {
        PlayerResponseModel playerResponseModel = this.l.a;
        boolean z = playerResponseModel != null && playerResponseModel.F();
        this.G.a = this.n;
        String str = null;
        if (remoteVideoAd != null && this.i.a(aika.INTERSTITIAL_PLAYING, aika.INTERSTITIAL_REQUESTED)) {
            String str2 = remoteVideoAd.l;
            ajff ajffVar = this.m;
            if (ajffVar == null || !TextUtils.equals(ajffVar.Z(), str2)) {
                ajff ajffVar2 = (ajff) this.I.get(str2);
                this.m = ajffVar2;
                if (ajffVar2 == null) {
                    ajff as = as(str2, 1);
                    this.m = as;
                    this.I.put(str2, as);
                }
            }
        } else if (remoteVideoAd == null && this.i.a(aika.INTERSTITIAL_PLAYING, aika.INTERSTITIAL_REQUESTED)) {
            String valueOf = String.valueOf(this.n);
            String valueOf2 = String.valueOf(this.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 132 + String.valueOf(valueOf2).length());
            sb.append("MdxDirector setVideoStage ad null when playing interstitial | broadcastType: ");
            sb.append(i);
            sb.append(" | adPlayerResponse: ");
            sb.append(valueOf);
            sb.append(" | lastMdxPlayerState: ");
            sb.append(valueOf2);
            afus.b(2, 21, sb.toString());
        } else if (remoteVideoAd != null) {
            String valueOf3 = String.valueOf(this.i);
            String valueOf4 = String.valueOf(this.j);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 134 + String.valueOf(valueOf4).length());
            sb2.append("MdxDirector setVideoStage ad should be null when videoStage is not an Ad state ");
            sb2.append(i);
            sb2.append(" | adPlayerResponse: ");
            sb2.append(valueOf3);
            sb2.append(" | lastMdxPlayerState: ");
            sb2.append(valueOf4);
            afus.b(2, 21, sb2.toString());
            remoteVideoAd = null;
        }
        aika aikaVar = this.i;
        PlayerResponseModel playerResponseModel2 = this.l.a;
        PlayerResponseModel playerResponseModel3 = this.G.a;
        adld adldVar = aikaVar.h() ? this.G : this.l;
        ajff ajffVar3 = this.k;
        ahhw ahhwVar = new ahhw(aikaVar, playerResponseModel2, playerResponseModel3, adldVar, ajffVar3 != null ? ((dyn) ajffVar3).a : null, remoteVideoAd == null ? null : remoteVideoAd.l, z);
        if (i == 0) {
            this.k.aD().c(ahhwVar);
        } else {
            this.y.p(ahhwVar);
        }
        if (!aikaVar.h() || remoteVideoAd == null) {
            return;
        }
        if (this.n != null || this.l.a != null) {
            xdq q = remoteVideoAd.q();
            PlayerResponseModel playerResponseModel4 = this.n;
            if (playerResponseModel4 != null) {
                q.k = playerResponseModel4;
            }
            PlayerResponseModel playerResponseModel5 = this.l.a;
            if (playerResponseModel5 != null) {
                q.h = playerResponseModel5.J();
            }
            remoteVideoAd = q.a();
        }
        wku wkuVar = this.p;
        ajff ajffVar4 = this.k;
        if (ajffVar4 != null) {
            str = ((dyn) ajffVar4).a;
        }
        PlayerResponseModel playerResponseModel6 = this.l.a;
        wkuVar.b(remoteVideoAd, str, playerResponseModel6, false);
        new wxs(wkuVar.a, remoteVideoAd, xdb.PRE_ROLL, playerResponseModel6, wkuVar, wzr.a).b(ahhwVar.c(), ahhwVar.e());
        if (!remoteVideoAd.a) {
            return;
        }
        z(0);
    }

    private final void av(ajff ajffVar, int i) {
        ahia ahiaVar = new ahia(this.D);
        if (i == 0) {
            this.y.m(ahiaVar, ajffVar);
        } else {
            this.y.r(ahiaVar);
        }
    }

    private final void aw() {
        for (ajff ajffVar : this.I.values()) {
            if (ajffVar != this.k) {
                this.y.i(ajffVar);
            }
        }
        this.I.clear();
    }

    private final void ax() {
        if (this.l.a == null) {
            zep.c(t, "Can not fling video, missing playerResponse.");
        } else {
            this.g.L(ar().a());
        }
    }

    private final void ay() {
        ajff ajffVar = this.m;
        if (ajffVar != null) {
            this.y.i(ajffVar);
            this.I.remove(this.m.Z());
            this.m = null;
        }
    }

    @Override // defpackage.ajah
    public final void A() {
    }

    final void B(adnm adnmVar) {
        String.valueOf(String.valueOf(adnmVar)).length();
        this.w.execute(new adku(this, adnmVar, this.g.h()));
    }

    @Override // defpackage.ajah
    public final void C(PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2) {
        E(playerResponseModel, null);
    }

    @Override // defpackage.ajah
    public final void D(PlayerResponseModel playerResponseModel, aikd aikdVar) {
    }

    @Override // defpackage.ajah
    public final void E(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor) {
        adlj adljVar;
        if (this.g.a() != 1) {
            return;
        }
        this.l.a = playerResponseModel;
        this.k.p().e(playerResponseModel);
        ajai.y(playerResponseModel, this.k);
        this.C = playbackStartDescriptor;
        boolean z = false;
        String.format(Locale.US, "Loading videoId %s\n playlistId %s\n playbackDescriptor %s\n", playerResponseModel.B(), this.K.c(), playbackStartDescriptor);
        PlayerResponseModel playerResponseModel2 = null;
        this.n = null;
        S(aika.PLAYBACK_LOADED, null);
        asaa t2 = playerResponseModel.t();
        boolean z2 = aijr.i(t2) || aijr.h(t2);
        aanz aanzVar = this.x;
        if (playerResponseModel.m(aanzVar) != null) {
            playerResponseModel2 = playerResponseModel.m(aanzVar).a;
        }
        if (playerResponseModel2 != null && aijr.i(playerResponseModel2.t())) {
            z = true;
        }
        if (z2 || z) {
            String B = playerResponseModel.B();
            adnt adntVar = this.g;
            if (!TextUtils.isEmpty(adntVar.x()) || !adntVar.v().equals(B)) {
                adljVar = adlj.PLAYING_VIDEO;
            } else {
                adljVar = adlj.SHOWING_TV_QUEUE;
            }
            String.valueOf(String.valueOf(adljVar)).length();
            this.a.d(adljVar);
            if (this.g.ah(playerResponseModel.B(), this.K.c())) {
                String valueOf = String.valueOf(playerResponseModel.B());
                if (valueOf.length() != 0) {
                    "MdxDirector: flinging video ".concat(valueOf);
                }
                ax();
                if (!ac()) {
                    return;
                }
                B(this.g.m());
                return;
            }
            String str = true != playerResponseModel.B().equals(this.g.x()) ? "Showing TV queue with first video id " : "Remote screen already playing ";
            String valueOf2 = String.valueOf(playerResponseModel.B());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            }
            B(this.g.m());
            return;
        }
        I();
    }

    @Override // defpackage.ajah
    public final void F(aikd aikdVar) {
    }

    @Override // defpackage.ajah
    public final void G() {
        if (ac()) {
            this.g.J();
        }
    }

    @Override // defpackage.ajah
    public final void H() {
        if (ac()) {
            this.g.K();
        } else {
            ax();
        }
    }

    public final void I() {
        aikd aikdVar = new aikd(3, adne.UNPLAYABLE.j, this.u.getString(adne.UNPLAYABLE.i));
        this.k.p().l = aikdVar;
        this.y.t(aikdVar, this.o, 4);
    }

    @Override // defpackage.ajah
    public final void J(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar, String str) {
    }

    @Override // defpackage.ajah
    public final void K(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
    }

    @Override // defpackage.ajah
    public final void L() {
        au(1, this.g.h());
        av(this.o, 1);
        z(1);
        at(1);
    }

    @Override // defpackage.ajah
    public final void M() {
        this.l.f();
        this.G.f();
        this.n = null;
        ay();
        this.k.p().e(null);
        this.k.p().l = null;
        ay();
        aw();
        this.l.a = null;
        this.G.a = null;
        this.n = null;
        this.C = null;
        this.E = 0L;
        this.F = null;
        this.f33J = amuk.q();
        S(aika.NEW, null);
        U(null, 4);
        this.f.removeMessages(1);
        this.e.c();
        this.a.m(this);
        this.g.N(this);
        S(aika.NEW, null);
        this.h.c(null);
        this.h.b(null);
        this.y.j();
        this.y.i(this.k);
        this.y.a();
        aw();
        this.r = true;
    }

    @Override // defpackage.ajah
    public final void N() {
        if (ac()) {
            this.g.K();
        } else if (!TextUtils.isEmpty(this.g.x())) {
        } else {
            ax();
        }
    }

    @Override // defpackage.ajah
    public final void O(String str) {
        if (ac()) {
            this.g.R(str);
        }
    }

    @Override // defpackage.ajah
    public final void P(float f) {
    }

    @Override // defpackage.ajah
    public final void Q(int i) {
    }

    @Override // defpackage.ajah
    public final void R(awan awanVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(aika aikaVar, RemoteVideoAd remoteVideoAd) {
        if (this.i == aikaVar) {
            return;
        }
        this.i = aikaVar;
        String.valueOf(String.valueOf(aikaVar)).length();
        if (af()) {
            this.H = this.G;
        } else {
            this.H = this.l;
        }
        au(0, remoteVideoAd);
    }

    @Override // defpackage.ajah
    public final void T(boolean z) {
    }

    public final void U(ajff ajffVar, int i) {
        this.D = i;
        av(ajffVar, 0);
    }

    @Override // defpackage.ajah
    public final void V() {
    }

    @Override // defpackage.ajah
    public final void W() {
        this.g.X();
    }

    public final void X(ajff ajffVar) {
        if (ajffVar == null) {
            String valueOf = String.valueOf(this.m);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
            sb.append("MdxDirector Null singleVideoComponent given to updateCurrentComponent | adComponent ");
            sb.append(valueOf);
            String str = "non-null";
            if (sb.toString() == null) {
                String valueOf2 = String.valueOf(this.k);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb2.append("null | contentComponent: ");
                sb2.append(valueOf2);
                if (sb2.toString() == null) {
                    str = "null";
                }
            }
            afus.b(2, 21, str);
            return;
        }
        boolean containsKey = this.I.containsKey(ajffVar.Z());
        if (!containsKey) {
            this.I.put(ajffVar.Z(), ajffVar);
        }
        if (this.o == ajffVar && containsKey) {
            return;
        }
        this.o = ajffVar;
        this.y.b(ajffVar);
    }

    @Override // defpackage.ajah
    public final void Y() {
    }

    @Override // defpackage.ajah
    public final boolean Z(PlaybackStartDescriptor playbackStartDescriptor, aijp aijpVar) {
        return false;
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void a() {
        RemoteVideoAd h = this.g.h();
        if (h != null && this.l.a != null) {
            xdq q = h.q();
            q.h = this.l.a.J();
            h = q.a();
        }
        if (h != null) {
            wku wkuVar = this.p;
            ajff ajffVar = this.k;
            wkuVar.b(h, ajffVar != null ? ((dyn) ajffVar).a : null, this.l.a, true);
            return;
        }
        this.p.c(wzq.VIDEO_ENDED);
    }

    @Override // defpackage.ajah
    public final boolean aa() {
        return true;
    }

    @Override // defpackage.ajah
    public final boolean ab() {
        return true;
    }

    public final boolean ac() {
        return akzj.f(x(), this.g.x());
    }

    @Override // defpackage.ajah
    public final boolean ad() {
        return !ak(aika.ENDED);
    }

    @Override // defpackage.ajah
    public final boolean ae() {
        return this.j == adnm.PLAYING || this.j == adnm.AD_PLAYING;
    }

    @Override // defpackage.ajah
    public final boolean af() {
        return ak(aika.INTERSTITIAL_PLAYING);
    }

    @Override // defpackage.ajah
    public final boolean ag() {
        return ak(aika.VIDEO_PLAYING);
    }

    @Override // defpackage.ajah
    public final boolean ah() {
        return this.g.a() == 2;
    }

    public final boolean ai(long j) {
        if (ac()) {
            this.g.P(Math.max(j, 0L));
            return true;
        } else if (this.l.a == null || !TextUtils.isEmpty(this.g.x())) {
            return false;
        } else {
            adnk ar = ar();
            ar.b(Math.max(j, 0L));
            this.g.L(ar.a());
            return true;
        }
    }

    @Override // defpackage.ajah
    public final boolean aj(long j, auqn auqnVar) {
        return ai(j);
    }

    @Override // defpackage.ajah
    public final boolean ak(aika aikaVar) {
        return this.i.a(aikaVar);
    }

    @Override // defpackage.ajah
    public final boolean al(aika aikaVar) {
        return this.i.c(aikaVar);
    }

    @Override // defpackage.ajah
    public final void am() {
    }

    @Override // defpackage.ajah
    public final ajfa an() {
        return null;
    }

    @Override // defpackage.ajah
    public final void ao() {
    }

    @Override // defpackage.ajah
    public final void ap(long j, auqn auqnVar) {
        ai(this.g.c() + j);
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void b(aalv aalvVar) {
        this.F = aalvVar;
        at(0);
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void c(List list) {
        this.f33J = amuk.o(list);
        at(0);
    }

    @Override // defpackage.wzu
    public final void d(int i, int i2) {
        this.g.W();
    }

    @Override // defpackage.wzu
    public final void e() {
    }

    @Override // defpackage.ajah
    public final float j() {
        return 1.0f;
    }

    @Override // defpackage.ajah
    public final long k() {
        return 0L;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wyt wytVar = (wyt) obj;
                d(-1, -1);
                return null;
            } else if (i == 1) {
                adnn adnnVar = (adnn) obj;
                if (!al(aika.PLAYBACK_LOADED)) {
                    return null;
                }
                if (!ac() && (!adnnVar.a().equals(adnm.ENDED) || !TextUtils.isEmpty(this.g.x()))) {
                    return null;
                }
                B(adnnVar.a());
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{wyt.class, adnn.class};
    }

    @Override // defpackage.ajah
    public final long l() {
        if (ac() && this.g.a() == 1) {
            this.E = this.g.c();
        }
        return this.E;
    }

    @Override // defpackage.ajah
    public final long n(long j) {
        return -1L;
    }

    @Override // defpackage.ajah
    public final long o() {
        if (!ac() || !al(aika.PLAYBACK_LOADED)) {
            return 0L;
        }
        return aq();
    }

    @Override // defpackage.ajah
    public final PlayerResponseModel p() {
        return this.l.a;
    }

    @Override // defpackage.ajah
    public final aeos q() {
        PlayerResponseModel playerResponseModel = this.l.a;
        return aeov.c;
    }

    @Override // defpackage.ajah
    public final aikd r() {
        return this.k.p().l;
    }

    @Override // defpackage.ajah
    public final ajbf s() {
        return this.l;
    }

    @Override // defpackage.ajah
    public final ajbf t() {
        return this.H;
    }

    @Override // defpackage.ajah
    public final ajff u() {
        return this.k;
    }

    @Override // defpackage.ajah
    public final DirectorSavedState v(int i) {
        return null;
    }

    @Override // defpackage.ajah
    public final String w() {
        ajff ajffVar = this.k;
        if (ajffVar != null) {
            return ((dyn) ajffVar).a;
        }
        return null;
    }

    @Override // defpackage.ajah
    public final String x() {
        PlayerResponseModel playerResponseModel = this.l.a;
        if (playerResponseModel == null) {
            return null;
        }
        return playerResponseModel.B();
    }

    @Override // defpackage.ajah
    public final void y() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(int r27) {
        /*
            r26 = this;
            r0 = r26
            adnt r1 = r0.g
            com.google.android.libraries.youtube.ads.model.RemoteVideoAd r1 = r1.h()
            if (r1 == 0) goto L15
            adnt r1 = r0.g
            com.google.android.libraries.youtube.ads.model.RemoteVideoAd r1 = r1.h()
            int r1 = r1.b
            int r1 = r1 * 1000
            goto L16
        L15:
            r1 = 0
        L16:
            long r2 = r26.aq()
            adnm r4 = defpackage.adnm.UNSTARTED
            aika r4 = defpackage.aika.NEW
            aika r4 = r0.i
            int r4 = r4.ordinal()
            r5 = 0
            r7 = -1
            if (r4 == 0) goto L78
            r9 = 1
            if (r4 == r9) goto L78
            r9 = 2
            if (r4 == r9) goto L65
            r5 = 5
            if (r4 == r5) goto L59
            r1 = 8
            if (r4 == r1) goto L44
            r1 = 9
            if (r4 != r1) goto L3e
            r0.E = r2
            goto L62
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L44:
            adnt r1 = r0.g
            long r4 = r1.c()
            r0.E = r4
            adnt r1 = r0.g
            long r7 = r1.g()
            adnt r1 = r0.g
            long r4 = r1.d()
            goto L73
        L59:
            long r2 = (long) r1
            adnt r1 = r0.g
            long r4 = r1.c()
            r0.E = r4
        L62:
            r16 = r2
            goto L7c
        L65:
            r0.E = r5
            adnt r1 = r0.g
            long r7 = r1.g()
            adnt r1 = r0.g
            long r4 = r1.d()
        L73:
            r16 = r2
            r12 = r4
            r14 = r7
            goto L7e
        L78:
            r0.E = r5
            r16 = r5
        L7c:
            r12 = r7
            r14 = r12
        L7e:
            ahhx r1 = new ahhx
            r9 = r1
            long r10 = r0.E
            r18 = 0
            r20 = -1
            snc r2 = r0.v
            long r22 = r2.d()
            r24 = 0
            ajff r2 = r0.o
            java.lang.String r25 = r2.Z()
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r24, r25)
            if (r27 != 0) goto La3
            ajai r2 = r0.y
            ajff r3 = r0.o
            r4 = 4
            r2.u(r3, r1, r4)
            return
        La3:
            ajai r2 = r0.y
            r2.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlb.z(int):void");
    }
}
