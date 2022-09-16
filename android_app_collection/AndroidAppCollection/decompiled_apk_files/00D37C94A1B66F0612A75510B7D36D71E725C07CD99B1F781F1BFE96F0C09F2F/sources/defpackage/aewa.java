package defpackage;

import android.media.MediaCodec;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aewa  reason: default package */
/* loaded from: classes.dex */
public final class aewa implements ava {
    public int a;
    public pms b;
    private final aevz g;
    private final aevy h;
    private final afgz i;
    private int j;
    private final aflp d = new aflp();
    private final afgu e = new afgu();
    private final pks f = new pks();
    public final Queue c = new ArrayDeque();

    public aewa(aevz aevzVar, aevy aevyVar, afgz afgzVar) {
        this.g = aevzVar;
        this.h = aevyVar;
        this.i = afgzVar;
    }

    private final aetv as(auz auzVar) {
        afbi at = at(auzVar);
        return at != null ? at.b : this.h.b();
    }

    private final afbi at(auz auzVar) {
        afbi au = au(auzVar, auzVar.c);
        return au != null ? au : this.h.n;
    }

    private final afbi au(auz auzVar, int i) {
        if (auzVar.b.z() || i >= auzVar.b.q()) {
            return null;
        }
        auzVar.b.y(i, this.f);
        Object obj = this.f.c;
        if (obj instanceof afbi) {
            return (afbi) obj;
        }
        if (!(obj instanceof aexy)) {
            return null;
        }
        Object obj2 = ((aexy) obj).a;
        if (!(obj2 instanceof afbi)) {
            return null;
        }
        return (afbi) obj2;
    }

    @Override // defpackage.ava
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void C() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void G() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void J() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void K() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void M() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void N() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void O() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void S() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void T() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void U() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.ava
    public final void a(auz auzVar, String str, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = auzVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 91);
            sb.append("onDecoderInitialized.trackType=1.decoderName=");
            sb.append(str);
            sb.append(".initializationDurationMs=");
            sb.append(j2);
            queue.add(new aeue(j3, sb.toString()));
        }
        afbi at = at(auzVar);
        if (at == null) {
            return;
        }
        at.b.a().b(j, j2);
    }

    @Override // defpackage.ava
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ae() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ah() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.ava
    public final void an(auz auzVar, pmw pmwVar) {
        String format;
        String sb;
        if (!this.h.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_REPORT_CODEC_DISCARD_REASON)) {
            return;
        }
        aetv as = as(auzVar);
        if (pmwVar == null) {
            return;
        }
        if (pmwVar.d != 0) {
            format = String.format(Locale.US, "reused.%d", Integer.valueOf(pmwVar.d));
        } else {
            int i = pmwVar.e;
            if (i == 0) {
                sb = "0";
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < 32; i2++) {
                    if (((1 << i2) & i) > 0) {
                        sb2.append(i2);
                        sb2.append(".");
                    }
                }
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                sb = sb2.toString();
            }
            format = String.format(Locale.US, "reused.%d;reason.%s", Integer.valueOf(pmwVar.d), sb);
        }
        as.i("ecir", new aeue(auzVar.a, format));
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.ava
    public final void aq(auz auzVar, int i, int i2, float f) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(130);
            sb.append("onVideoSizeChanged.width=");
            sb.append(i);
            sb.append(".height=");
            sb.append(i2);
            sb.append(".unappliedRotationDegrees=0.pixelWidthHeightRatio=");
            sb.append(f);
            queue.add(new aeue(j, sb.toString()));
        }
        aexp aexpVar = ((aewx) this.g).w;
        aexpVar.i = i;
        aexpVar.j = i2;
        if (aexpVar.n && aexpVar.l() && (aexpVar.k != aexpVar.i || aexpVar.l != aexpVar.j)) {
            aexpVar.g();
        }
        aexpVar.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ar() {
        pms pmsVar = this.b;
        return pmsVar != null ? this.j + pmsVar.g : this.j;
    }

    @Override // defpackage.ava
    public final void b(auz auzVar, long j) {
        as(auzVar).s(j);
    }

    @Override // defpackage.ava
    public final void c(auz auzVar, int i, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = auzVar.a;
            StringBuilder sb = new StringBuilder(116);
            sb.append("onAudioUnderrun.bufferSize=");
            sb.append(i);
            sb.append(".bufferSizeMs=");
            sb.append(j);
            sb.append(".elapsedSinceLastFeedMs=");
            sb.append(j2);
            queue.add(new aeue(j3, sb.toString()));
        }
        aevz aevzVar = this.g;
        aetv as = as(auzVar);
        afkl afklVar = afkl.DEFAULT;
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("b.");
        sb2.append(j);
        sb2.append(";e.");
        sb2.append(j2);
        aevzVar.A(as, afklVar, "underrun", sb2.toString());
    }

    @Override // defpackage.ava
    public final void d(auz auzVar, int i, pms pmsVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(39);
            sb.append("onDecoderDisabled.trackType=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        if (i == 2) {
            this.j += pmsVar.g;
            this.a += pmsVar.e;
            this.b = null;
            return;
        }
        as(auzVar).b(0);
    }

    @Override // defpackage.ava
    public final void e(auz auzVar, int i, pms pmsVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(38);
            sb.append("onDecoderEnabled.trackType=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        if (i == 2) {
            this.b = pmsVar;
        }
    }

    @Override // defpackage.ava
    public final void f(auz auzVar, int i, Format format) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(49);
            sb.append("onDecoderInputFormatChanged.trackType=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        if (i == 2) {
            afnh afnhVar = this.h.m;
            if (format != null && afnhVar != null) {
                afnn a = this.e.a(format.v);
                if (a != null) {
                    a.d = format.w;
                }
                afnhVar.u(a);
            }
        }
        if (i != 1 || format == null) {
            return;
        }
        aevy aevyVar = this.h;
        int i2 = format.B;
        boolean z = false;
        if ((i2 > 0 || format.C > 0) && i2 != -1 && format.C != -1) {
            z = true;
        }
        aevyVar.q = z;
        aevyVar.r = true;
    }

    @Override // defpackage.ava
    public final void g(auz auzVar, ppw ppwVar) {
        String str;
        if (this.h.s.ae()) {
            this.c.add(new aeue(auzVar.a, "onDownstreamFormatChanged."));
        }
        afms.d(ppwVar.d instanceof afbl);
        Object obj = ppwVar.d;
        Format format = ppwVar.b;
        if (format == null || (str = format.a) == null || obj == null) {
            return;
        }
        afbl afblVar = (afbl) obj;
        afblVar.a.m(str, this.h.g(), afblVar, ppwVar.c);
    }

    @Override // defpackage.ava
    public final void h(auz auzVar, Exception exc) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            String valueOf = String.valueOf(exc.getMessage());
            queue.add(new aeue(j, valueOf.length() != 0 ? "onDrmSessionManagerError.exception=".concat(valueOf) : new String("onDrmSessionManagerError.exception=")));
        }
        aewx aewxVar = (aewx) this.g;
        aewxVar.u(as(auzVar), afgz.a(exc, aewxVar.g(), afkl.DRM, "keyerror", null, false));
    }

    @Override // defpackage.ava
    public final void i(auz auzVar, int i, long j) {
        afjz afjzVar = this.h.s;
        if (afjzVar.ae()) {
            Queue queue = this.c;
            long j2 = auzVar.a;
            StringBuilder sb = new StringBuilder(77);
            sb.append("onDroppedVideoFrames.droppedFrames=");
            sb.append(i);
            sb.append(".elapsedMs=");
            sb.append(j);
            queue.add(new aeue(j2, sb.toString()));
        }
        afbi at = at(auzVar);
        if (at == null) {
            return;
        }
        int ar = ar();
        at.K.c(ar, false);
        PlayerConfigModel a = at.a();
        VideoStreamingData b = at.b();
        FormatStreamModel formatStreamModel = at.x;
        if (formatStreamModel == null || !formatStreamModel.H() || b.D() || a.i() <= 0 || this.h.c.a) {
            return;
        }
        afki afkiVar = afki.ABR;
        this.d.c(auzVar.a, ar);
        if (!this.d.e(a.i())) {
            return;
        }
        double a2 = this.d.a();
        String b2 = this.d.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 23);
        sb2.append("droprate.");
        sb2.append((int) a2);
        sb2.append(".d.");
        sb2.append(b2);
        String sb3 = sb2.toString();
        this.d.d();
        aetv as = as(auzVar);
        aevz aevzVar = this.g;
        String str = at.a;
        if (afjzVar.ak()) {
            if (str != null && str.equals(((aewx) aevzVar).i.s.at())) {
                return;
            }
            afjzVar.aD(formatStreamModel);
            aewx aewxVar = (aewx) aevzVar;
            afkk afkkVar = new afkk("android.hfrdroppedframes.seamless", aewxVar.g());
            afkkVar.a = afkl.DEFAULT;
            afkkVar.b = sb3;
            aewxVar.u(as, afkkVar.a());
            aewxVar.i.s.aC(str);
            aewxVar.s.d(aewxVar.g, null, 10004);
            aewxVar.ag(true, false);
            return;
        }
        afjzVar.aD(formatStreamModel);
        aewx aewxVar2 = (aewx) aevzVar;
        afkk afkkVar2 = new afkk("android.hfrdroppedframes", aewxVar2.g());
        afkkVar2.a = afkl.DEFAULT;
        afkkVar2.b = sb3;
        afkkVar2.d = formatStreamModel;
        aewxVar2.u(as, afkkVar2.a());
    }

    @Override // defpackage.ava
    public final void j(auz auzVar, ppr pprVar, ppw ppwVar, IOException iOException, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            String message = iOException.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
            sb.append("onLoadError.wasCancelled=");
            sb.append(z);
            sb.append(".exception=");
            sb.append(message);
            queue.add(new aeue(j, sb.toString()));
        }
        if (iOException.getCause() instanceof aene) {
            as(auzVar).i("empe", new aest("incompatible-stream-load-error"));
        }
        long g = this.g.g();
        long f = this.g.f();
        if (iOException.getCause() instanceof aene) {
            return;
        }
        if ((iOException instanceof afkp) && g + 1000 < f) {
            return;
        }
        if ((iOException instanceof afko) && g + 1000 < f) {
            return;
        }
        afbi afbiVar = this.h.n;
        this.g.u(as(auzVar), this.i.c(afkl.DEFAULT, iOException, pprVar, ppwVar, afbiVar != null ? afbiVar.b() : null, this.g.g(), afbiVar != null && afbiVar.x(), false));
    }

    @Override // defpackage.ava
    public final void k(auz auzVar, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(32);
            sb.append("onLoadingChanged.isLoading=");
            sb.append(z);
            queue.add(new aeue(j, sb.toString()));
        }
    }

    @Override // defpackage.ava
    public final void l(auz auzVar, pjt pjtVar) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            float f = pjtVar.b;
            StringBuilder sb = new StringBuilder(49);
            sb.append("onPlaybackParametersChanged.speed=");
            sb.append(f);
            queue.add(new aeue(j, sb.toString()));
        }
        as(auzVar).p(pjtVar.b);
    }

    @Override // defpackage.ava
    public final void m(auz auzVar, pjr pjrVar) {
        afbi afbiVar;
        aetv aetvVar;
        phr phrVar;
        afkn afknVar;
        pjr pjrVar2 = pjrVar;
        if (!(pjrVar2 instanceof phr)) {
            String valueOf = String.valueOf(pjrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unexpected PlaybackException: ");
            sb.append(valueOf);
            pjrVar2 = new phr(3, null, sb.toString(), 1001, null, -1, null, 4, false);
        }
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            phr phrVar2 = (phr) pjrVar2;
            int i = phrVar2.a;
            long j2 = phrVar2.i;
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("onPlayerError.exceptionType=");
            sb2.append(i);
            sb2.append(".exceptionTime=");
            sb2.append(j2);
            queue.add(new aeue(j, sb2.toString()));
        }
        afbi at = at(auzVar);
        if (at == null) {
            return;
        }
        aetv as = as(auzVar);
        int i2 = at.h().c;
        VideoStreamingData b = at.b();
        afgz afgzVar = this.i;
        long g = this.g.g();
        Surface surface = ((aewx) this.g).w.r;
        FormatStreamModel formatStreamModel = at.x;
        boolean x = at.x();
        phr phrVar3 = (phr) pjrVar2;
        Throwable cause = phrVar3.getCause();
        if (cause == null) {
            afknVar = new afkn("player.exception", g, pjrVar2);
            afbiVar = at;
            aetvVar = as;
            phrVar = phrVar3;
        } else if (cause instanceof IOException) {
            afbiVar = at;
            aetvVar = as;
            phrVar = phrVar3;
            afknVar = afgzVar.c(afkl.DEFAULT, (IOException) cause, null, null, b, g, x, true);
        } else if (cause instanceof MediaCodec.CryptoException) {
            MediaCodec.CryptoException cryptoException = (MediaCodec.CryptoException) cause;
            int errorCode = cryptoException.getErrorCode();
            String f = afjt.f(cryptoException, true, 2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(f).length() + 17);
            sb3.append("info.");
            sb3.append(errorCode);
            sb3.append(";");
            sb3.append(f);
            afknVar = new afkn(afkl.DRM, "keyerror", g, sb3.toString());
            afbiVar = at;
            aetvVar = as;
            phrVar = phrVar3;
        } else {
            afbiVar = at;
            aetvVar = as;
            phrVar = phrVar3;
            String str = null;
            if (!(cause instanceof awa)) {
                if (cause instanceof plk) {
                    int i3 = ((plk) cause).a;
                    StringBuilder sb4 = new StringBuilder(25);
                    sb4.append("src.init;info.");
                    sb4.append(i3);
                    afknVar = new afkn("android.audiotrack", g, sb4.toString());
                } else if (cause instanceof pln) {
                    int i4 = ((pln) cause).a;
                    StringBuilder sb5 = new StringBuilder(26);
                    sb5.append("src.write;info.");
                    sb5.append(i4);
                    afknVar = new afkn("android.audiotrack", g, sb5.toString());
                } else if (cause instanceof aegw) {
                    afknVar = afgz.d(afkl.DEFAULT, (aegw) cause, b, g);
                } else if (cause instanceof atz) {
                    afknVar = new afkn(afkl.LIBVPX, "fmt.decode", g, cause);
                } else if (cause instanceof OutOfMemoryError) {
                    if (i2 == 4) {
                        afknVar = new afkn(afkl.LIBVPX, "player.outofmemory", g, cause);
                    } else {
                        afknVar = new afkn(afkl.DEFAULT, "player.outofmemory", g, cause);
                    }
                } else if (cause instanceof avy) {
                    avy avyVar = (avy) cause;
                    avz avzVar = avyVar.a;
                    String str2 = avzVar == null ? null : avzVar.a;
                    String a = afjt.a(avyVar.getCause());
                    StringBuilder sb6 = new StringBuilder(String.valueOf(a).length() + 12);
                    sb6.append("src.decfail;");
                    sb6.append(a);
                    String valueOf2 = String.valueOf(sb6.toString());
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf2).length() + 6 + String.valueOf(str2).length());
                    sb7.append(valueOf2);
                    sb7.append(";name.");
                    sb7.append(str2);
                    String sb8 = sb7.toString();
                    if (avyVar instanceof pxn) {
                        pxn pxnVar = (pxn) avyVar;
                        String valueOf3 = String.valueOf(sb8);
                        int i5 = pxnVar.b;
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                        sb9.append(valueOf3);
                        sb9.append(";surhash.");
                        sb9.append(i5);
                        String valueOf4 = String.valueOf(sb9.toString());
                        String aZ = afmg.aZ(surface);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf4).length() + 5 + aZ.length());
                        sb10.append(valueOf4);
                        sb10.append(";sur.");
                        sb10.append(aZ);
                        String valueOf5 = String.valueOf(sb10.toString());
                        String str3 = true != pxnVar.c ? "invalid" : "valid";
                        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf5).length() + 6 + str3.length());
                        sb11.append(valueOf5);
                        sb11.append(";esur.");
                        sb11.append(str3);
                        sb8 = sb11.toString();
                    }
                    afkk afkkVar = new afkk("fmt.decode", g);
                    afkkVar.b = sb8;
                    afkkVar.d = new afju(str2, null);
                    afknVar = afkkVar.a();
                } else if (!(cause instanceof pgl)) {
                    if (cause instanceof IllegalStateException) {
                        StackTraceElement[] stackTrace = cause.getStackTrace();
                        if ((cause instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"))) {
                            IllegalStateException illegalStateException = (IllegalStateException) cause;
                            if (illegalStateException instanceof MediaCodec.CodecException) {
                                afknVar = new afkn(afkl.DEFAULT, "fmt.decode", g, "src.decfail;d." + afmg.aY((MediaCodec.CodecException) illegalStateException) + ";sur." + afmg.aZ(surface), illegalStateException, null);
                            } else {
                                String aZ2 = afmg.aZ(surface);
                                afknVar = new afkn(afkl.DEFAULT, "fmt.decode", g, aZ2.length() != 0 ? "src.decfail;sur.".concat(aZ2) : new String("src.decfail;sur."), illegalStateException, null);
                            }
                        }
                    }
                    if (cause instanceof pir) {
                        afkl afklVar = afkl.DEFAULT;
                        int i6 = ((pir) cause).a;
                        StringBuilder sb12 = new StringBuilder(13);
                        sb12.append("c.");
                        sb12.append(i6);
                        afknVar = new afkn(afklVar, "player.timeout", g, sb12.toString(), pjrVar2, null);
                    } else if (cause instanceof RuntimeException) {
                        afknVar = new afkn("player.fatalexception", g, cause);
                    } else {
                        afknVar = new afkn("player.exception", g, cause);
                    }
                } else {
                    pgl pglVar = (pgl) cause;
                    StringBuilder sb13 = new StringBuilder("src.decfail");
                    sb13.append(";");
                    sb13.append(afjt.f(pglVar, false, 3));
                    Throwable cause2 = pglVar.getCause();
                    if (cause2 instanceof MediaCodec.CodecException) {
                        sb13.append(";d.");
                        afms.a(cause2);
                        sb13.append(afmg.aY((MediaCodec.CodecException) cause2));
                    }
                    sb13.append(";");
                    sb13.append(afjt.d(pglVar.getMessage()));
                    afknVar = new afkn("fmt.decode", g, sb13.toString());
                }
            } else if (!(cause.getCause() instanceof IOException) || !(cause.getCause().getCause() instanceof TimeoutException)) {
                awa awaVar = (awa) cause;
                avz avzVar2 = awaVar.c;
                String str4 = avzVar2 != null ? avzVar2.a : null;
                StringBuilder sb14 = new StringBuilder();
                sb14.append("src.decinit");
                Throwable cause3 = awaVar.getCause();
                if ((cause3 instanceof IllegalArgumentException) && "The surface has been released".equals(cause3.getMessage())) {
                    sb14.append(";c.sur.released");
                }
                sb14.append(";name.");
                avz avzVar3 = awaVar.c;
                if (avzVar3 != null) {
                    str = avzVar3.a;
                }
                sb14.append(str);
                sb14.append(";info.");
                if (awaVar.d != null || awaVar.getCause() == null) {
                    sb14.append(awaVar.d);
                } else {
                    sb14.append(afjt.a(awaVar.getCause()));
                }
                sb14.append(";mime.");
                sb14.append(awaVar.a);
                sb14.append(";sur.");
                sb14.append(afmg.aZ(surface));
                String sb15 = sb14.toString();
                afkk afkkVar2 = new afkk("fmt.decode", g);
                afkkVar2.b = sb15;
                afkkVar2.d = new afju(str4, formatStreamModel);
                afknVar = afkkVar2.a();
            } else {
                afknVar = new afkn(afkl.DEFAULT, "player.timeout", g, "c.codec_init", cause.getCause().getCause(), null);
            }
        }
        this.g.E(aetvVar, afknVar, afbiVar, phrVar);
    }

    @Override // defpackage.ava
    public final void n(auz auzVar, boolean z, int i) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(66);
            sb.append("onPlayerStateChanged.playWhenReady=");
            sb.append(z);
            sb.append(".playbackState=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        afbi at = at(auzVar);
        if (at != null) {
            if (i == 3) {
                at.b.a().an();
                i = 3;
            }
            at.c.c(auzVar, z, i);
        }
    }

    @Override // defpackage.ava
    public final void o(auz auzVar, pjy pjyVar, pjy pjyVar2, int i) {
        afbi at;
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(42);
            sb.append("onPositionDiscontinuity.reason=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        afbi afbiVar = this.h.n;
        afbi au = au(auzVar, pjyVar.b);
        if (this.h.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION)) {
            at = au(auzVar, pjyVar2.b);
        } else {
            at = at(auzVar);
        }
        if (at == null) {
            return;
        }
        if (this.h.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_IGNORE_LEFTOVER_TRANSITION) && !this.h.s.ac() && (au == null || afbiVar == null || !akzj.f(afbiVar.z, at))) {
            if (afbiVar == null) {
                return;
            }
            aetv aetvVar = afbiVar.b;
            String str = au != null ? au.a : "null";
            String str2 = at.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
            sb2.append("from.");
            sb2.append(str);
            sb2.append(";to.");
            sb2.append(str2);
            aetvVar.i("ilt", new aest(sb2.toString()));
        } else if (i == 0 || ((!this.h.s.ac() && i == 1 && !akzj.f(afbiVar, at)) || (this.h.s.ac() && i == 1 && at.s))) {
            ((aewx) this.g).H = false;
            at.s = false;
            if (this.h.s.o().w) {
                if (i == 1) {
                    at.c.d();
                }
                this.g.O(auzVar);
                return;
            }
            this.g.O(auzVar);
        } else if (i != 2) {
        } else {
            long j2 = auzVar.g;
            at.f = j2;
            if (at.t.F() == 0 || at.r) {
                return;
            }
            at.b.i("sst", new aest(Long.toString(j2)));
            at.r = true;
        }
    }

    @Override // defpackage.ava
    public final void p(auz auzVar, Object obj, long j) {
        if (this.h.s.ae()) {
            this.c.add(new aeue(auzVar.a, "onRendererFirstFrame."));
        }
        afnh afnhVar = this.h.m;
        if (afnhVar != null) {
            afnhVar.n(0);
            afnhVar.m(obj);
        }
        afbi at = at(auzVar);
        if (at != null) {
            at.D = true;
            afbj afbjVar = at.c;
            afbi afbiVar = afbjVar.a;
            if (afbiVar.B && afbiVar.C && !afbiVar.E) {
                afbiVar.b.q();
                afbjVar.a.E = true;
            }
            at.b.a().C(j);
        }
    }

    @Override // defpackage.ava
    public final void q(auz auzVar) {
        if (this.h.s.ae()) {
            this.c.add(new aeue(auzVar.a, "onSeekProcessed."));
        }
        afbi at = at(auzVar);
        if (at != null) {
            afbj afbjVar = at.c;
            if (afbjVar.a.L.ab() || !afbjVar.d) {
                return;
            }
            afbjVar.d = false;
            afbjVar.g = true;
            afbjVar.c = auzVar;
            afbjVar.a();
        }
    }

    @Override // defpackage.ava
    public final void r(auz auzVar) {
        if (this.h.s.ae()) {
            this.c.add(new aeue(auzVar.a, "onSeekStarted."));
        }
        afbi at = at(auzVar);
        if (at != null) {
            at.c.d();
        }
    }

    @Override // defpackage.ava
    public final void s(auz auzVar, boolean z) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(52);
            sb.append("onSkipSilenceEnabledChanged.skipSilenceEnabled=");
            sb.append(z);
            queue.add(new aeue(j, sb.toString()));
        }
    }

    @Override // defpackage.ava
    public final void t(auz auzVar, int i) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j = auzVar.a;
            StringBuilder sb = new StringBuilder(36);
            sb.append("onTimelineChanged.reason=");
            sb.append(i);
            queue.add(new aeue(j, sb.toString()));
        }
        this.g.L(at(auzVar), i);
    }

    @Override // defpackage.ava
    public final void u(auz auzVar, Exception exc) {
        String str;
        long g = this.g.g();
        if (exc instanceof pmu) {
            pmu pmuVar = (pmu) exc;
            int i = pmuVar.a;
            int i2 = pmuVar.b;
            StringBuilder sb = new StringBuilder(47);
            sb.append("src.buffercapacity;info.");
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            str = sb.toString();
        } else {
            str = null;
        }
        afkk afkkVar = new afkk("player.exception", g);
        afkkVar.c = exc;
        afkkVar.b = str;
        this.g.u(as(auzVar), afkkVar.a());
    }

    @Override // defpackage.ava
    public final void v(auz auzVar, String str, long j, long j2) {
        if (this.h.s.ae()) {
            Queue queue = this.c;
            long j3 = auzVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 91);
            sb.append("onDecoderInitialized.trackType=2.decoderName=");
            sb.append(str);
            sb.append(".initializationDurationMs=");
            sb.append(j2);
            queue.add(new aeue(j3, sb.toString()));
        }
        afbi at = at(auzVar);
        if (at == null) {
            return;
        }
        at.b.a().as(j, j2);
        if (!at.a().ab() || TextUtils.isEmpty(str)) {
            return;
        }
        at.b.i("dec", new aest(str));
    }

    @Override // defpackage.ava
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.ava
    public final /* synthetic */ void z() {
    }
}
