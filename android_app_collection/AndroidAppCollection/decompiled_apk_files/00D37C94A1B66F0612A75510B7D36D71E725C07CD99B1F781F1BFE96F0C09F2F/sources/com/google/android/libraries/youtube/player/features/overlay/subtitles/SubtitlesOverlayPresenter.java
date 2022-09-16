package com.google.android.libraries.youtube.player.features.overlay.subtitles;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SubtitlesOverlayPresenter implements yiw, aiyq, airt, f, ynl {
    public final aiau a;
    public final Map b;
    public SubtitleTrack c;
    public String d;
    private final aiwj e;
    private final aiyx f;
    private final aiwb g;
    private final Executor h;
    private final Executor i;
    private aiwh j;
    private yiy k;
    private boolean l;
    private final aacz m;

    public SubtitlesOverlayPresenter(aiau aiauVar, aiwj aiwjVar, aiyx aiyxVar, aiwb aiwbVar, Executor executor, Executor executor2, aacz aaczVar) {
        aiauVar.getClass();
        this.a = aiauVar;
        aiwjVar.getClass();
        this.e = aiwjVar;
        aiyxVar.getClass();
        this.f = aiyxVar;
        aiwbVar.getClass();
        this.g = aiwbVar;
        this.h = executor;
        this.i = executor2;
        this.b = new HashMap();
        this.m = aaczVar;
        aiyxVar.e(this);
        aiauVar.i(aiyxVar.b());
        aiauVar.g(aiyxVar.a());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        aiwi aiwiVar = (aiwi) obj;
        zep.d("error retrieving subtitle", exc);
        if (!ylr.e()) {
            this.i.execute(new Runnable() { // from class: aiay
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitlesOverlayPresenter.this.h();
                }
            });
        } else {
            h();
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        aiwi aiwiVar = (aiwi) obj;
        final aixy aixyVar = (aixy) obj2;
        if (aixyVar == null) {
            h();
            return;
        }
        final ajbk ajbkVar = (ajbk) this.b.get(aiwiVar.a.i());
        if (ajbkVar == null) {
            return;
        }
        this.h.execute(new Runnable() { // from class: aiaz
            @Override // java.lang.Runnable
            public final void run() {
                SubtitlesOverlayPresenter subtitlesOverlayPresenter = SubtitlesOverlayPresenter.this;
                ajbk ajbkVar2 = ajbkVar;
                aixy aixyVar2 = aixyVar;
                aiav aiavVar = new aiav(subtitlesOverlayPresenter.a);
                ArrayList arrayList = new ArrayList();
                if (!aixyVar2.a.isEmpty()) {
                    int i = 0;
                    while (i < aixyVar2.a.size() - 1) {
                        int i2 = i + 1;
                        arrayList.add(new aixw(((Long) aixyVar2.a.get(i)).longValue(), ((Long) aixyVar2.a.get(i2)).longValue(), aixyVar2.b(((Long) aixyVar2.a.get(i)).longValue()), aiavVar));
                        i = i2;
                    }
                    arrayList.add(new aixw(((Long) arey.s(aixyVar2.a)).longValue(), Long.MAX_VALUE, new ArrayList(), aiavVar));
                }
                ajbkVar2.d(arrayList);
            }
        });
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        apgy apgyVar;
        atzt D = aiix.D(this.m);
        if (D != null) {
            apgyVar = D.p;
            if (apgyVar == null) {
                apgyVar = apgy.a;
            }
        } else {
            apgyVar = null;
        }
        return (apgyVar == null || !apgyVar.b) ? new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 1), aiax.a), airwVar.G().d.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this), aiax.a), airwVar.s().b.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(0)).aa(new aiaw(this, 5), aiax.a), airwVar.ae(ahja.j, ahja.l).h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 7), aiax.a), airwVar.G().l.Z(new aiaw(this, 3)), airwVar.ae(ahja.k, ahja.m).h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 2), aiax.a)} : new aypg[]{airwVar.G().c.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 6), aiax.a), airwVar.G().d.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this), aiax.a), airwVar.s().b.h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(0)).aa(new aiaw(this, 5), aiax.a), airwVar.ae(ahja.j, ahja.l).h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 7), aiax.a), airwVar.G().l.Z(new aiaw(this, 4)), airwVar.ae(ahja.k, ahja.m).h(aiwv.n(airwVar.aB(), 524288L)).h(aiwv.l(1)).aa(new aiaw(this, 2), aiax.a)};
    }

    public final void h() {
        this.a.a();
        this.a.f();
        aiwh aiwhVar = this.j;
        if (aiwhVar != null) {
            aiwhVar.b();
            this.j = null;
        }
        for (ajbk ajbkVar : this.b.values()) {
            ajbkVar.j(aixw.class);
        }
        this.c = null;
    }

    public final void i(ahgn ahgnVar) {
        this.l = ahgnVar.d() == aijs.REMOTE;
    }

    public final void j() {
        if (!this.l) {
            h();
            this.b.clear();
            yiy yiyVar = this.k;
            if (yiyVar == null) {
                return;
            }
            yiyVar.d();
            this.k = null;
        }
    }

    public final void k(ahhp ahhpVar) {
        if (!this.l) {
            q(ahhpVar.a());
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                i((ahgn) obj);
                return null;
            } else if (i == 1) {
                k((ahhp) obj);
                return null;
            } else if (i == 2) {
                l((ahhw) obj);
                return null;
            } else if (i == 3) {
                m((ahhx) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhp.class, ahhw.class, ahhx.class};
    }

    public final void l(ahhw ahhwVar) {
        if (ahhwVar.c() == aika.INTERSTITIAL_PLAYING || ahhwVar.c() == aika.INTERSTITIAL_REQUESTED) {
            this.d = ahhwVar.k();
        } else {
            this.d = ahhwVar.e();
        }
        if (ahhwVar.d() == null || ahhwVar.d().c() == null || ahhwVar.d().d() == null) {
            return;
        }
        this.b.put(ahhwVar.d().c().B(), ahhwVar.d().d());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
        if (r3.longValue() < r0.l.longValue()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
        if (r3.longValue() >= r0.l.longValue()) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.ahhx r15) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter.m(ahhx):void");
    }

    @Override // defpackage.aiyq
    public final void n(float f) {
        this.a.g(f);
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

    @Override // defpackage.aiyq
    public final void o(SubtitlesStyle subtitlesStyle) {
        this.a.i(subtitlesStyle);
    }

    public final void p() {
        aiwh aiwhVar = this.j;
        if (aiwhVar != null) {
            aiwhVar.b();
            this.j = null;
        }
        this.f.f(this);
    }

    public final void q(SubtitleTrack subtitleTrack) {
        FormatStreamModel formatStreamModel;
        Long valueOf;
        h();
        this.c = subtitleTrack;
        yiy yiyVar = this.k;
        aiwh aiwhVar = null;
        r1 = null;
        bame bameVar = null;
        aiwhVar = null;
        if (yiyVar != null) {
            yiyVar.d();
            this.k = null;
        }
        if (subtitleTrack == null || subtitleTrack.p()) {
            return;
        }
        if (subtitleTrack.a() == aalx.DASH_FMP4_TT_WEBVTT.bD || subtitleTrack.a() == aalx.DASH_FMP4_TT_FMT3.bD) {
            aiwb aiwbVar = this.g;
            String str = this.d;
            ajbk ajbkVar = (ajbk) this.b.get(subtitleTrack.i());
            aiav aiavVar = new aiav(this.a);
            PlayerResponseModel playerResponseModel = aiwbVar.q;
            if (playerResponseModel != null) {
                VideoStreamingData videoStreamingData = playerResponseModel.c;
                if (videoStreamingData != null) {
                    for (FormatStreamModel formatStreamModel2 : videoStreamingData.n) {
                        if (TextUtils.equals(formatStreamModel2.e, subtitleTrack.f())) {
                            formatStreamModel = formatStreamModel2;
                            break;
                        }
                    }
                }
                formatStreamModel = null;
                if (formatStreamModel != null) {
                    PlayerConfigModel c = aiwbVar.q.c();
                    Long S = c.S();
                    if (S != null) {
                        valueOf = c.R();
                    } else {
                        Long valueOf2 = Long.valueOf(formatStreamModel.T());
                        S = valueOf2.longValue() < 0 ? null : valueOf2;
                        valueOf = Long.valueOf(formatStreamModel.S());
                        if (valueOf.longValue() < 0) {
                            valueOf = null;
                        }
                    }
                    Pair pair = new Pair(S, valueOf);
                    PlayerResponseModel playerResponseModel2 = aiwbVar.q;
                    aigw aigwVar = (playerResponseModel2 == null || playerResponseModel2.c() == null || !aiwbVar.q.c().ai()) ? null : (aigw) aiwbVar.i.get();
                    ScheduledExecutorService scheduledExecutorService = aiwbVar.f;
                    String str2 = aiwbVar.g;
                    ajff ajffVar = aiwbVar.r;
                    if (ajffVar != null && ajffVar.Z().equals(str)) {
                        bameVar = aiwbVar.r.ab();
                    }
                    aiwhVar = new aiwh(str, scheduledExecutorService, formatStreamModel, str2, ajbkVar, aiavVar, aigwVar, bameVar, (Long) pair.first, (Long) pair.second);
                }
            }
            this.j = aiwhVar;
            return;
        }
        this.k = yiy.c(this);
        this.e.a(new aiwi(subtitleTrack), this.k);
    }
}
