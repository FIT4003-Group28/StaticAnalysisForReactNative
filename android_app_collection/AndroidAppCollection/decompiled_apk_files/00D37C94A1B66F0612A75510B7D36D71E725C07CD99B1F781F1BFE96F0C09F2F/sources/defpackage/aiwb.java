package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiwb  reason: default package */
/* loaded from: classes.dex */
public final class aiwb {
    private static final String t = zep.a("subtitles");
    public final yni a;
    public final Context b;
    public final aitm c;
    public final aiwy d;
    public final ahfm e;
    public final ScheduledExecutorService f;
    public final String g;
    public final aiix h;
    public final axnm i;
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public CaptioningManager k;
    public boolean l;
    public SubtitleTrack m;
    public aiyi n;
    public yiy o;
    public aixd p;
    public PlayerResponseModel q;
    public ajff r;
    public boolean s;

    public aiwb(yni yniVar, Context context, aitm aitmVar, aiwy aiwyVar, ahfm ahfmVar, ScheduledExecutorService scheduledExecutorService, String str, ankt anktVar, axnm axnmVar, aiix aiixVar) {
        yniVar.getClass();
        this.a = yniVar;
        aitmVar.getClass();
        this.c = aitmVar;
        aiwyVar.getClass();
        this.d = aiwyVar;
        ahfmVar.getClass();
        this.e = ahfmVar;
        context.getClass();
        this.b = context;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService;
        str.getClass();
        this.g = str;
        this.i = axnmVar;
        aiixVar.getClass();
        this.h = aiixVar;
        anktVar.getClass();
        if (aiixVar.u()) {
            ylx.i(anktVar, new ylw() { // from class: aivx
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    aiwb aiwbVar = aiwb.this;
                    ampq ampqVar = (ampq) obj;
                    if (ampqVar.h()) {
                        aiwbVar.k = (CaptioningManager) ampqVar.c();
                    }
                }
            });
        }
    }

    public static boolean k(aitm aitmVar, CaptioningManager captioningManager) {
        if (((Boolean) ylx.g(aitmVar.c(), 1L, TimeUnit.SECONDS, false)).booleanValue()) {
            return ((Boolean) ylx.g(aitmVar.b(), 1L, TimeUnit.SECONDS, false)).booleanValue();
        }
        return captioningManager != null && captioningManager.isEnabled();
    }

    public final int a() {
        return aalx.DASH_FMP4_TT_FMT3.bD;
    }

    public final void b(aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aiix aiixVar) {
        aypf aypfVar = new aypf();
        aypfVar.d(aynxVar.n().Z(new aivy(this, 2)));
        aypfVar.d(aynxVar2.n().Z(new aivy(this, 3)));
        if (aiixVar.u()) {
            aypfVar.d(aynxVar3.n().Z(new aivy(this)));
        }
    }

    public final void c() {
        yiy yiyVar = this.o;
        if (yiyVar != null) {
            yiyVar.d();
            this.o = null;
        }
    }

    public final void f() {
        this.n = null;
        i(false);
        h(null, false);
        this.p = null;
        c();
        this.q = null;
    }

    public final void g(SubtitleTrack subtitleTrack, boolean z) {
        String c;
        boolean z2 = false;
        if (subtitleTrack != null) {
            zep.j(t, String.format("setSubtitleTrack name:%s languageCode:%s languageName:%s format:%d trackName:%s vssid:%s videoid:%s", subtitleTrack, subtitleTrack.c(), subtitleTrack.d(), Integer.valueOf(subtitleTrack.a()), subtitleTrack.g(), subtitleTrack.j(), subtitleTrack.i()), new Throwable());
        } else {
            zep.h(t, "subtitleTrack is null");
        }
        if (subtitleTrack != null) {
            if (subtitleTrack.p()) {
                c = "";
            } else {
                c = subtitleTrack.c();
                z2 = true;
            }
            aitl a = this.c.a();
            a.b(Boolean.valueOf(z2));
            a.b = c;
            ylx.m(a.a(), aiuv.d);
            this.s = true;
        }
        h(subtitleTrack, z);
    }

    public final void h(SubtitleTrack subtitleTrack, boolean z) {
        aiyi aiyiVar;
        int i;
        this.m = subtitleTrack;
        SubtitleTrack subtitleTrack2 = null;
        if (subtitleTrack != null && subtitleTrack.p()) {
            this.m = null;
        }
        if (this.m == null && (aiyiVar = this.n) != null) {
            atzq atzqVar = aiyiVar.b;
            if (atzqVar != null && atzqVar.h && (i = atzqVar.g) >= 0 && i < aiyiVar.a.b.size()) {
                aiyg a = aiyiVar.a((atzr) aiyiVar.a.b.get(atzqVar.g));
                a.d(true);
                subtitleTrack2 = a.a();
            }
            this.m = subtitleTrack2;
        }
        ahhp ahhpVar = new ahhp(this.m, z);
        ajff ajffVar = this.r;
        if (ajffVar != null) {
            ajffVar.aA().c(ahhpVar);
        } else {
            this.a.f(ahhpVar);
        }
    }

    public final void i(boolean z) {
        this.l = z;
        ajff ajffVar = this.r;
        if (ajffVar != null) {
            ajffVar.aB().c(new ahhq(this.l));
        } else {
            this.a.d(new ahhq(z));
        }
    }

    public final boolean j() {
        VideoStreamingData videoStreamingData;
        PlayerResponseModel playerResponseModel = this.q;
        return playerResponseModel != null && (videoStreamingData = playerResponseModel.c) != null && videoStreamingData.C() && !ajjh.B(playerResponseModel, a()).isEmpty();
    }
}
