package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: airr  reason: default package */
/* loaded from: classes.dex */
public final class airr implements ahem, ajen, ajaz, aizl, ynl {
    private final aheq A;
    public final Context a;
    public final yni b;
    public final aeov c;
    public final airo d;
    public final ahez e;
    public final aijf f;
    public final aiwb g;
    public final ahen h;
    public final aiix i;
    public final ahei j;
    public airm k;
    public final aiis l;
    public final airp m;
    public final airq n = new airq(this);
    public final ailu o;
    public final aith p;
    public final aisx q;
    public final aisq r;
    public final aiso s;
    public final aikh t;
    private final Handler u;
    private final ajba v;
    private final ajad w;
    private final aadd x;
    private final bame y;
    private final Runnable z;

    public airr(Context context, yni yniVar, aeov aeovVar, final aiwb aiwbVar, ajba ajbaVar, ahez ahezVar, final aijf aijfVar, aikh aikhVar, final ajax ajaxVar, ahen ahenVar, ajad ajadVar, afst afstVar, aadd aaddVar, aiis aiisVar, final ailu ailuVar, aith aithVar, final aisx aisxVar, aisq aisqVar, aiqp aiqpVar, bame bameVar, bame bameVar2, final aisi aisiVar, aheq aheqVar, aiix aiixVar) {
        this.m = new airp(this, aisiVar);
        this.a = context;
        this.b = yniVar;
        this.c = aeovVar;
        this.e = ahezVar;
        this.f = aijfVar;
        this.t = aikhVar;
        this.w = ajadVar;
        this.x = aaddVar;
        this.h = ahenVar;
        this.A = aheqVar;
        this.y = bameVar2;
        this.i = aiixVar;
        afstVar.a = aeovVar.e;
        this.g = aiwbVar;
        this.v = ajbaVar;
        this.l = aiisVar;
        this.o = ailuVar;
        this.p = aithVar;
        this.q = aisxVar;
        this.r = aisqVar;
        this.s = new aiso(bameVar, aiqpVar, yniVar, aikhVar, aisqVar, ailuVar, aithVar, aisxVar, aiixVar);
        this.d = new airo(this);
        this.u = new Handler(context.getMainLooper());
        this.j = new ahei(context);
        this.k = new airm(this);
        this.z = new Runnable() { // from class: airk
            @Override // java.lang.Runnable
            public final void run() {
                airr airrVar = airr.this;
                aisx aisxVar2 = aisxVar;
                ajax ajaxVar2 = ajaxVar;
                aijf aijfVar2 = aijfVar;
                aisi aisiVar2 = aisiVar;
                ailu ailuVar2 = ailuVar;
                aiwb aiwbVar2 = aiwbVar;
                ajah ajahVar = aisxVar2.a;
                if (ajahVar == null) {
                    ajaxVar2.a.k(ajaxVar2.b, null);
                    ajaxVar2.a.m(ajaxVar2.c, null);
                } else {
                    ajahVar.L();
                }
                aijfVar2.i();
                aijfVar2.j();
                aiqb a = aisiVar2.a();
                if (a != null) {
                    ((aipv) a).a();
                    ailuVar2.c();
                    airrVar.r.a();
                }
                aiwbVar2.a.f(new ahhp(aiwbVar2.m));
                aiwbVar2.a.d(new ahhq(aiwbVar2.l));
            }
        };
    }

    private final PlaybackServiceState ad(int i) {
        airp airpVar = this.m;
        airr airrVar = airpVar.b;
        ajah ajahVar = airrVar.q.a;
        if (ajahVar == null) {
            return new PlaybackServiceState(null, airrVar.f.e(), null, null, airpVar.b.h.i);
        }
        aiqb a = airpVar.a.a();
        PlaybackStartDescriptor j = airpVar.b.j();
        OmegaSequencerState omegaSequencerState = null;
        PlaybackModalityState e = i == 0 ? null : airpVar.b.f.e();
        if (a != null) {
            aipv aipvVar = (aipv) a;
            PlayerResponseModel playerResponseModel = aipvVar.c.p;
            WatchNextResponseModel watchNextResponseModel = aipvVar.c.q;
            ailu ailuVar = aipvVar.c;
            omegaSequencerState = new OmegaSequencerState(playerResponseModel, watchNextResponseModel, ailuVar.n, ailuVar.o, ailuVar.r, aipvVar.b.d());
        }
        return new PlaybackServiceState(j, e, omegaSequencerState, ajahVar.v(i), airpVar.b.h.i);
    }

    private final void ae() {
        this.y.c(new ahgk(false));
    }

    private final void af(boolean z) {
        ylr.c();
        if (O()) {
            this.t.e(false);
            ajah ajahVar = this.q.a;
            if (ajahVar != null) {
                if (z) {
                    ajahVar.y();
                } else {
                    ajahVar.V();
                }
            }
            this.w.f(false);
        }
        airo airoVar = this.d;
        if (airoVar.a) {
            airoVar.b.a.unregisterReceiver(airoVar);
            airoVar.a = false;
        }
        ahek ahekVar = this.h.g;
        if (ahekVar.a) {
            try {
                ahekVar.b.a.unregisterReceiver(ahekVar);
            } catch (IllegalArgumentException unused) {
                zep.b("Trying to unregister AudioBecomingNoisy Receiver, but was already unregistered");
            }
            ahekVar.a = false;
        }
    }

    private final void ag(boolean z) {
        this.b.f(new ahgq());
        this.e.f();
        if (z) {
            s();
            return;
        }
        r();
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.W();
    }

    private static boolean ah(ajah ajahVar) {
        return ajahVar.r() == null;
    }

    public final void A() {
        this.u.post(this.z);
    }

    @Override // defpackage.aizl
    public final void B() {
        ylr.c();
        if (!O()) {
            return;
        }
        this.t.e(true);
        ajah ajahVar = this.q.a;
        if (ajahVar == null || !ah(ajahVar)) {
            return;
        }
        ajahVar.N();
    }

    public final void C(yiw yiwVar) {
        aiwb aiwbVar = this.g;
        String string = aiwbVar.b.getString(R.string.turn_off_subtitles);
        PlayerResponseModel playerResponseModel = aiwbVar.q;
        if (playerResponseModel == null || !aiwbVar.j()) {
            aixd aixdVar = aiwbVar.p;
            if (aixdVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(SubtitleTrack.o(string));
                arrayList.addAll(aixdVar.a());
                yiwVar.b(null, arrayList);
                return;
            }
            aiyi aiyiVar = aiwbVar.n;
            if (aiyiVar != null) {
                yiwVar.b(null, aiyiVar.f());
                return;
            } else {
                yiwVar.a(null, null);
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(SubtitleTrack.o(string));
        arrayList2.addAll(ajjh.B(playerResponseModel, aiwbVar.a()));
        yiwVar.b(null, arrayList2);
    }

    public final void D() {
        airp airpVar = this.m;
        ylr.c();
        aiqb a = airpVar.a.a();
        if (a == null) {
            return;
        }
        ajah ajahVar = airpVar.b.q.a;
        if (ajahVar != null) {
            ajahVar.M();
        }
        a.f();
        airpVar.b.p.b();
        airpVar.b.o.d();
        airpVar.b.p.e();
        airpVar.b.o.k();
        airpVar.b.q.a();
        airpVar.a.c();
        airpVar.b.K();
    }

    @Override // defpackage.aizl
    public final void E(boolean z) {
        aijf aijfVar = this.f;
        if (z != aijfVar.h) {
            aijfVar.h = z;
            aijfVar.i();
        }
    }

    @Override // defpackage.ajaz
    public final void F(float f) {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.P(f);
    }

    public final void G(boolean z) {
        aiqb a = this.m.a.a();
        if (a == null) {
            return;
        }
        aiql aiqlVar = ((aipv) a).b;
        if (!(aiqlVar instanceof aiqm)) {
            return;
        }
        ((aiqm) aiqlVar).m(z);
    }

    public final void H(SubtitleTrack subtitleTrack) {
        I(subtitleTrack, true);
    }

    public final void I(SubtitleTrack subtitleTrack, boolean z) {
        this.g.g(subtitleTrack, z);
    }

    public final void J(float f) {
        this.f.d = f;
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.Y();
    }

    public final void K() {
        af(false);
    }

    @Deprecated
    public final void L() {
        ahel ahelVar = this.h.e;
        int i = ahel.e;
        ahelVar.a = false;
        ahelVar.b = false;
    }

    @Override // defpackage.aizl
    public final void M() {
        ag(false);
    }

    public final boolean N(PlaybackStartDescriptor playbackStartDescriptor) {
        PlaybackStartDescriptor j = j();
        if (playbackStartDescriptor == null || j == null) {
            return false;
        }
        return aijn.c(j, playbackStartDescriptor);
    }

    public final boolean O() {
        return this.m.a.f();
    }

    public final boolean P() {
        return this.f.k;
    }

    @Deprecated
    public final boolean Q() {
        aijf aijfVar = this.f;
        return aijfVar.k || aijfVar.m;
    }

    public final boolean R() {
        ajah ajahVar = this.q.a;
        return ajahVar != null && ajahVar.af();
    }

    @Override // defpackage.aizl
    public final boolean S() {
        ajah ajahVar = this.q.a;
        return ajahVar != null && ajahVar.ag();
    }

    public final boolean T() {
        ajah ajahVar;
        if (!O()) {
            return false;
        }
        if (this.o.l.a(aijx.VIDEO_LOADING)) {
            return true;
        }
        if (this.o.l.a(aijx.VIDEO_PLAYBACK_LOADED, aijx.VIDEO_WATCH_LOADED) && (ajahVar = this.q.a) != null) {
            return ajahVar.ad();
        }
        return false;
    }

    public final boolean U() {
        airp airpVar = this.m;
        ylr.c();
        aiqb a = airpVar.a.a();
        if (a == null) {
            return false;
        }
        airr airrVar = airpVar.b;
        aisx aisxVar = airrVar.q;
        ajah ajahVar = aisxVar.a;
        if (ajahVar != null) {
            aisxVar.c(airrVar.o.o, aijp.a().a());
        }
        ((aipv) a).d(aiim.RETRY);
        airpVar.b.o.h(ajahVar != null ? ajahVar.w() : null, airpVar.b.s.c());
        return true;
    }

    @Override // defpackage.aizl
    public final boolean V(long j) {
        return W(j, auqn.SEEK_SOURCE_UNKNOWN);
    }

    @Override // defpackage.aizl
    public final boolean W(long j, auqn auqnVar) {
        ajah ajahVar = this.q.a;
        if (ajahVar == null || !ah(ajahVar)) {
            return false;
        }
        return ajahVar.aj(j, auqnVar);
    }

    public final void X(int i) {
        ahel ahelVar = this.h.e;
        int i2 = ahel.e;
        ahelVar.d = i;
        if (!ahelVar.b || !ahelVar.a()) {
            return;
        }
        ahelVar.b = false;
        if (ahelVar.c.h == null) {
            return;
        }
        aijb.a(aija.AUDIOMANAGER, "AudioFocus WindowFocusChanged, causing play", new Object[0]);
        ahelVar.c.h.b();
    }

    public final void Y() {
        if (this.t.j()) {
            this.t.e(false);
        }
    }

    @Override // defpackage.ajen
    @Deprecated
    public final void Z() {
        ajah ajahVar = this.q.a;
        if (ajahVar != null) {
            ajahVar.T(false);
        }
        U();
    }

    @Override // defpackage.ahem, defpackage.aizl
    public final void a() {
        ConditionVariable conditionVariable;
        ylr.c();
        if (!O()) {
            return;
        }
        this.t.e(false);
        this.b.d(new ahgq());
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        if (this.o.l == aijx.VIDEO_LOADING) {
            ajahVar.T(true);
        } else if (this.o.l.a(aijx.VIDEO_PLAYBACK_LOADED, aijx.VIDEO_WATCH_LOADED)) {
            ajahVar.G();
        }
        ailu ailuVar = this.o;
        aiml aimlVar = ailuVar.h;
        if (aimlVar != null) {
            aimlVar.a();
        }
        if (ailuVar.j == null || (conditionVariable = ailuVar.k) == null) {
            return;
        }
        conditionVariable.open();
    }

    public final void aa() {
        if (!O()) {
            return;
        }
        ajah ajahVar = this.q.a;
        this.o.t(ajahVar != null ? ajahVar.w() : null, this.s.c());
    }

    @Override // defpackage.aizl
    public final void ab() {
        PlaybackStartDescriptor playbackStartDescriptor;
        ylr.c();
        ajah ajahVar = this.q.a;
        if (ajahVar == null || !ajahVar.al(aika.READY)) {
            U();
            return;
        }
        ylr.c();
        ajah ajahVar2 = this.q.a;
        if (ajahVar2 != null) {
            ajff u = ajahVar2.u();
            if (u.c() != null && (playbackStartDescriptor = this.o.o) != null) {
                aijl e = playbackStartDescriptor.e();
                e.k = u.p().e;
                PlaybackStartDescriptor a = e.a();
                this.q.c(a, aijp.a().a());
                this.p.a(u.c(), a, new airl(), null);
                return;
            }
        }
        U();
    }

    @Override // defpackage.aizl
    public final void ac(long j, auqn auqnVar) {
        ajah ajahVar = this.q.a;
        if (ajahVar == null || !ah(ajahVar)) {
            return;
        }
        ajahVar.ap(j, auqnVar);
    }

    @Override // defpackage.ahem, defpackage.aizl
    public final void b() {
        ylr.c();
        if (!O()) {
            return;
        }
        this.t.e(true);
        this.w.e();
        ajah ajahVar = this.q.a;
        if (ajahVar == null || !ah(ajahVar)) {
            U();
            return;
        }
        if (this.o.l == aijx.VIDEO_LOADING) {
            ajahVar.T(false);
        }
        ajahVar.H();
    }

    @Override // defpackage.ahem
    public final void c(boolean z) {
        this.f.e = z;
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.Y();
    }

    @Override // defpackage.ahem
    public final boolean d() {
        ajah ajahVar = this.q.a;
        return ajahVar != null && ajahVar.ae();
    }

    @Override // defpackage.ahem
    public final void e() {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.ao();
    }

    public final int g() {
        ylr.c();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.a();
        }
        return -1;
    }

    public final long h() {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return 0L;
        }
        return ajahVar.o();
    }

    @Deprecated
    public final long i() {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return 0L;
        }
        return ajahVar.l();
    }

    public final PlaybackStartDescriptor j() {
        return this.o.o;
    }

    public final PlaybackServiceState k() {
        return ad(0);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhk ahhkVar = (ahhk) obj;
                Y();
                return null;
            } else if (i == 1) {
                u((aikd) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhk.class, aikd.class};
    }

    public final PlaybackServiceState l(boolean z) {
        int i = 1;
        if (true == z) {
            i = 2;
        }
        return ad(i);
    }

    public final SubtitleTrack m() {
        return this.g.m;
    }

    public final ajbf n() {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return null;
        }
        return ajahVar.s();
    }

    public final ajbf o() {
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return null;
        }
        return ajahVar.t();
    }

    public final String p() {
        ylr.c();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.k();
        }
        return null;
    }

    public final String q() {
        ylr.c();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.l();
        }
        return null;
    }

    public final void r() {
        af(true);
    }

    public final void s() {
        ylr.c();
        this.v.y();
        this.b.d(new ahgq());
        this.e.f();
        this.w.f(true);
        ae();
        D();
        this.j.b();
    }

    public final void t(boolean z) {
        ag(z);
        aijf aijfVar = this.e.c;
        aijfVar.j = true;
        aijfVar.k();
        if (!aiix.e(this.x).l) {
            this.w.f(false);
            ae();
        }
    }

    public final void u(aikd aikdVar) {
        if (!this.t.j() || !aiqa.d(aikdVar.i)) {
            return;
        }
        this.t.e(false);
    }

    public final void v(aisp aispVar, aynx aynxVar, final aisi aisiVar, aijh aijhVar) {
        aheq aheqVar;
        AudioDeviceCallback audioDeviceCallback;
        aypf aypfVar = new aypf();
        ahen ahenVar = this.h;
        ahenVar.h = this;
        aynx aynxVar2 = aispVar.a;
        ahenVar.getClass();
        aypfVar.d(aynxVar2.Z(new airg(ahenVar)));
        aynx aynxVar3 = aispVar.i;
        ahen ahenVar2 = this.h;
        ahenVar2.getClass();
        aypfVar.d(aynxVar3.Z(new airg(ahenVar2, 2)));
        azpa azpaVar = aijhVar.d;
        ahen ahenVar3 = this.h;
        ahenVar3.getClass();
        aypfVar.d(azpaVar.Z(new airg(ahenVar3, 1)));
        aynx aynxVar4 = aispVar.i;
        final ahez ahezVar = this.e;
        ahezVar.getClass();
        aypfVar.d(aynxVar4.Z(new ayqb() { // from class: airh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahez ahezVar2 = ahez.this;
                boolean f = ((ahia) obj).f();
                ahezVar2.m = f;
                if (f) {
                    ahezVar2.c();
                }
            }
        }));
        aypfVar.d(aynxVar.Z(new airi(this, 1)));
        aypfVar.d(aispVar.f.Z(new airi(this)));
        final aiwb aiwbVar = this.g;
        if (aiwbVar != null) {
            aypfVar.d(aispVar.a.Z(new ayqb() { // from class: airj
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
                    if (r12 != false) goto L58;
                 */
                @Override // defpackage.ayqb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r12) {
                    /*
                        Method dump skipped, instructions count: 484
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.airj.a(java.lang.Object):void");
                }
            }));
            aynx aynxVar5 = aispVar.k;
            aiwb aiwbVar2 = this.g;
            aiwbVar2.getClass();
            aypfVar.d(aynxVar5.Z(new aivy(aiwbVar2, 1)));
        }
        aujv aujvVar = aiix.d(this.x).f;
        if (aujvVar == null) {
            aujvVar = aujv.b;
        }
        apgr apgrVar = aujvVar.C;
        if (apgrVar == null) {
            apgrVar = apgr.a;
        }
        if (apgrVar.b && (audioDeviceCallback = (aheqVar = this.A).c) != null) {
            aheqVar.a.b(audioDeviceCallback);
        }
        ahez ahezVar2 = this.e;
        aisiVar.getClass();
        ahezVar2.f = new zgz() { // from class: airf
            @Override // defpackage.zgz
            public final Object a() {
                return aisi.this.a();
            }
        };
        this.e.o = this.k;
    }

    public final void w(aijp aijpVar) {
        if (aijpVar == null || !aijpVar.g) {
            this.w.e();
        }
    }

    public final void x(afmu afmuVar, aijc aijcVar) {
        ylr.c();
        ahez ahezVar = this.e;
        afmuVar.getClass();
        aijcVar.getClass();
        ahezVar.i(afmuVar, aijcVar);
        ajah ajahVar = this.q.a;
        if (ajahVar == null) {
            return;
        }
        aijp h = ajahVar.u().h();
        if (h == null || !h.g) {
            this.w.e();
            y();
            if (d() || !this.o.l.a(aijx.VIDEO_PLAYBACK_LOADED, aijx.VIDEO_WATCH_LOADED)) {
                return;
            }
            this.w.d(1);
            return;
        }
        y();
    }

    public final void y() {
        this.y.c(new ahgk(true));
    }

    public final void z(boolean z) {
        ylr.c();
        if (Q()) {
            return;
        }
        if (this.e.n != 3) {
            t(z);
            this.k = null;
            return;
        }
        airm airmVar = this.k;
        if (airmVar == null) {
            zep.l("In background pending state with no listener!");
            return;
        }
        airmVar.b = true;
        airmVar.a = z;
    }
}
