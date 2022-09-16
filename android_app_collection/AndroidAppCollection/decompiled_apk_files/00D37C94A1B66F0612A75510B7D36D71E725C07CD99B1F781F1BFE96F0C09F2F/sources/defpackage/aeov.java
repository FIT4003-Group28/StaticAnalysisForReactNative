package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeov  reason: default package */
/* loaded from: classes.dex */
public final class aeov extends aegq {
    public static final aeos c = new aeos(0);
    public final afgg d;
    public final aeou e;
    public volatile aehr f;
    final aegt g;
    public boolean h;
    private final aeor i;
    private final Handler j;
    private final afez k;
    private final adzz l;
    private final afje m;
    private final afjz n;

    public aeov(afgg afggVar, afez afezVar, afjz afjzVar, adzz adzzVar, aegt aegtVar, afje afjeVar) {
        aeor aeorVar = new aeor();
        this.i = aeorVar;
        this.j = new Handler(Looper.getMainLooper());
        this.e = new aeou();
        afms.a(afggVar);
        this.d = afggVar;
        afms.a(afezVar);
        this.k = afezVar;
        this.l = adzzVar;
        this.n = afjzVar;
        this.g = aegtVar;
        this.m = afjeVar;
        aeorVar.b = afjzVar.n().h;
        afms.f(afjzVar.aa());
        this.f = aehr.a;
    }

    private final boolean H(Runnable runnable) {
        aeor aeorVar = this.i;
        ylr.c();
        if (aeorVar.a.get() > 0) {
            afki afkiVar = afki.ABR;
            this.j.post(runnable);
            return false;
        }
        return true;
    }

    public static int e(aetv aetvVar) {
        return System.identityHashCode(aetvVar) % 100;
    }

    public static aess j(long j) {
        return new aess(j);
    }

    public static aess k(long j, long j2, long j3) {
        return new aess(j, j2, j3);
    }

    public final void A(final boolean z) {
        if (H(new Runnable() { // from class: aeop
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.A(z);
            }
        })) {
            this.d.N(z, 13);
        }
    }

    public final void B(float f) {
        float N = Float.isNaN(f) ? 1.0f : zgd.N(f, 0.25f, 2.0f);
        if (H(new aeog(this, N, 1))) {
            this.d.C(N);
        }
    }

    public final void C(final int i, final String str) {
        if (H(new Runnable() { // from class: aeoh
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.C(i, str);
            }
        })) {
            this.n.i.d(str, awan.VIDEO_QUALITY_SETTING_ADVANCED_MENU);
            this.g.b(i, i, h(), str);
            this.d.z();
        }
    }

    public final void D(final awan awanVar, final String str) {
        if (H(new Runnable() { // from class: aeom
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.D(awanVar, str);
            }
        })) {
            this.n.i.d(str, awanVar);
            this.g.b(-2, -2, h(), str);
            this.d.z();
        }
    }

    public final void E(float f) {
        float N = zgd.N(f, 0.0f, 1.0f);
        if (H(new aeog(this, N))) {
            this.d.D(N);
        }
    }

    public final void F() {
        if (H(new aeoq(this, 7))) {
            afkj.a(afki.MLPLAYER, "MedialibPlayer.stopVideo()");
            this.d.F(true);
            this.h = false;
        }
    }

    public final boolean G() {
        ylr.c();
        return this.d.I();
    }

    @Override // defpackage.aegq
    public final aegu a(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aegs aegsVar) {
        afgg afggVar = this.d;
        afms.a(videoStreamingData);
        afms.a(playerConfigModel);
        return afggVar.m(videoStreamingData, playerConfigModel, aegsVar.a(), aegsVar, Integer.MAX_VALUE);
    }

    @Override // defpackage.aegq
    public final aegu d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aegs aegsVar, int i) {
        afgg afggVar = this.d;
        afms.a(videoStreamingData);
        afms.a(playerConfigModel);
        return afggVar.m(videoStreamingData, playerConfigModel, z, aegsVar, i);
    }

    public final long f(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, long j, boolean z) {
        adzx adzxVar = null;
        adzx b = formatStreamModel != null ? this.l.b(formatStreamModel, TimeUnit.MILLISECONDS.toMicros(j)) : null;
        if (z) {
            if (b == null) {
                return -1L;
            }
            return TimeUnit.MICROSECONDS.toMillis(b.c);
        }
        if (formatStreamModel2 != null) {
            adzxVar = this.l.b(formatStreamModel2, TimeUnit.MILLISECONDS.toMicros(j));
        }
        if (formatStreamModel2 != null && formatStreamModel2.M()) {
            return TimeUnit.MICROSECONDS.toMillis(adzxVar.c);
        }
        if (b == null || adzxVar == null) {
            return -1L;
        }
        long min = Math.min(b.c, adzxVar.c);
        if (min > 0) {
            return TimeUnit.MICROSECONDS.toMillis(min);
        }
        return -1L;
    }

    public final FormatStreamModel g() {
        ylr.c();
        return this.d.k();
    }

    public final FormatStreamModel h() {
        ylr.c();
        return this.d.l();
    }

    public final aehr i() {
        ylr.c();
        this.f = aehr.a(this.d.g(), this.d.h(), this.d.i(), this.d.f(), this.d.d(), this.d.o());
        return this.f;
    }

    public final afte l() {
        return this.e.a;
    }

    public final String m() {
        ylr.c();
        if (this.h) {
            return this.d.o();
        }
        return null;
    }

    public final void n(final afmu afmuVar) {
        if (H(new Runnable() { // from class: aeol
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.n(afmuVar);
            }
        })) {
            afms.b(afmuVar instanceof afnh);
            afki afkiVar = afki.ABR;
            this.d.p((afnh) afmuVar);
        }
    }

    public final void o() {
        if (H(new aeoq(this, 1))) {
            afki afkiVar = afki.ABR;
            this.d.M();
            this.h = false;
        }
    }

    public final void p() {
        if (H(new aeoq(this))) {
            afki afkiVar = afki.ABR;
            this.d.q();
        }
    }

    public final void q() {
        if (H(new aeoq(this, 2))) {
            this.d.r();
        }
    }

    public final void r() {
        if (H(new aeoq(this, 3))) {
            afki afkiVar = afki.ABR;
            this.d.s();
        }
    }

    public final void s(aanr aanrVar, aeuo aeuoVar, aflm aflmVar) {
        afki afkiVar = afki.ABR;
        aeor aeorVar = new aeor();
        afms.a(aeuoVar);
        aeot aeotVar = new aeot(this, aeorVar, aeuoVar, this.k, this.e, aflmVar);
        aflmVar.G();
        afgg afggVar = this.d;
        afms.a(aanrVar);
        afggVar.t(aanrVar, aeotVar);
    }

    public final void t(final aeul aeulVar) {
        afms.f(this.n.aa());
        afmg.ba(aeulVar, true, -1L);
        if (H(new Runnable() { // from class: aeoj
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.t(aeulVar);
            }
        })) {
            aeuk aeukVar = (aeuk) aeulVar;
            final aeot aeotVar = new aeot(this, this.i, aeukVar.g, this.k, this.e, aeukVar.l);
            VideoStreamingData videoStreamingData = aeukVar.b;
            afki afkiVar = afki.MLPLAYER;
            amzz amzzVar = new amzz() { // from class: aeoo
                @Override // defpackage.amzz
                public final Object a() {
                    return Integer.valueOf(aeov.e(aetv.this));
                }
            };
            afkj.g(amzzVar);
            afkj.b(afkiVar, "MedialibPlayer.loadVideo(cpn=%s playWhenReady=%s positionMs=%s playerEvents=[%d] videoId=%s mediaView=%s volume=%s)", aeukVar.d, Boolean.valueOf(afmg.bb(aeulVar, 2)), Long.valueOf(aeukVar.c.a), amzzVar, "scrubbed", Objects.toString(aeukVar.f), Float.valueOf(aeukVar.i));
            aeub b = aetz.b(this.j, this.m.c(aeukVar.d), aeotVar);
            afgg afggVar = this.d;
            aetw aetwVar = new aetw(aeulVar);
            aetwVar.g = aeotVar;
            float f = aeukVar.i;
            if (Float.isNaN(f)) {
                aeukVar.g.g(new afkn("invalid.parameter", this.d.g(), String.format(Locale.US, "Volume: %f", Float.valueOf(f))));
            }
            float f2 = 1.0f;
            aetwVar.u(Float.valueOf(zgd.N(f, 0.0f, 1.0f)));
            aetwVar.a = b;
            float f3 = aeukVar.j;
            if (Float.isNaN(f3)) {
                aeukVar.g.g(new afkn("invalid.parameter", this.d.g(), String.format(Locale.US, "Playback rate: %f", Float.valueOf(f3))));
            } else {
                f2 = zgd.N(f3, 0.25f, 2.0f);
            }
            aetwVar.t(Float.valueOf(f2));
            aetwVar.b = videoStreamingData;
            afggVar.K(aetwVar);
            this.h = true;
        }
    }

    public final void u() {
        if (H(new aeoq(this, 4))) {
            afki afkiVar = afki.ABR;
            this.d.v();
        }
    }

    public final void v() {
        if (H(new aeoq(this, 5))) {
            afki afkiVar = afki.ABR;
            this.d.w();
        }
    }

    public final void w() {
        if (H(new aeoq(this, 6))) {
            afki afkiVar = afki.ABR;
            this.d.x();
        }
    }

    public final void x(final aeul aeulVar, final long j) {
        afmg.ba(aeulVar, false, j);
        if (H(new Runnable() { // from class: aeok
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.x(aeulVar, j);
            }
        })) {
            aeuk aeukVar = (aeuk) aeulVar;
            aeot aeotVar = new aeot(this, this.i, aeukVar.g, this.k, this.e, aeukVar.l);
            aeub b = aetz.b(this.j, this.m.c(aeukVar.d), aeotVar);
            aetw aetwVar = new aetw(aeulVar);
            aetwVar.g = aeotVar;
            aetwVar.a = b;
            afgf afgfVar = new afgf(aetwVar, j);
            afki afkiVar = afki.ABR;
            e(afgfVar.b.a());
            String str = aeukVar.b.c;
            this.d.J(afgfVar);
        }
    }

    public final void y(final long j, final auqn auqnVar) {
        if (H(new Runnable() { // from class: aeoi
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.y(j, auqnVar);
            }
        })) {
            afki afkiVar = afki.ABR;
            this.d.B(j, auqnVar);
        }
    }

    public final void z(final String str) {
        if (H(new Runnable() { // from class: aeon
            @Override // java.lang.Runnable
            public final void run() {
                aeov.this.z(str);
            }
        })) {
            this.g.a(str);
            this.d.z();
        }
    }
}
