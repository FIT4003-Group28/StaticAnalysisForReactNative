package defpackage;

import android.os.Build;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afll  reason: default package */
/* loaded from: classes.dex */
public final class afll {
    public static final amqo a = adyd.p;
    public static final amqo b = adyd.n;
    public static final amqo c = adyd.m;
    public static final amqo d = adyd.o;
    public static final aflk e = new aflk(amyg.a, 0);
    public static final aflj f = new aflj(amyg.a, 0);

    public static boolean a(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, amqo amqoVar) {
        aqwu aqwuVar = playerConfigModel.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        return aqwuVar.bp && ((Boolean) amqoVar.get()).booleanValue() && videoStreamingData.s && !videoStreamingData.v;
    }

    public static aflj b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar, amqo amqoVar) {
        Set a2;
        if (!playerConfigModel.au() || !playerConfigModel.aC() || !videoStreamingData.r() || (!afjzVar.aL(playerConfigModel.V()) && (!playerConfigModel.aB() || !((Boolean) amqoVar.get()).booleanValue()))) {
            if (!playerConfigModel.au() || !videoStreamingData.v()) {
                if (h(videoStreamingData, playerConfigModel, afjzVar, amqoVar)) {
                    return new aflj(e(afjzVar, playerConfigModel, videoStreamingData), 5);
                }
                if (i(videoStreamingData, playerConfigModel, afjzVar)) {
                    return new aflj(e(afjzVar, playerConfigModel, videoStreamingData), 2);
                }
                if (afjzVar.G() || videoStreamingData.D()) {
                    a2 = aank.a();
                } else {
                    a2 = new HashSet(aank.a());
                    a2.remove(Integer.valueOf(aank.aN));
                }
                return new aflj(a2, 2);
            }
            return new aflj(aank.x(), 7);
        }
        return new aflj(aank.s(), 6);
    }

    public static aflk c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar, amqo amqoVar) {
        aanu ar;
        aanu ar2;
        if (afjzVar.W()) {
            int i = videoStreamingData.z;
            boolean z = videoStreamingData.x;
            if (i != 3 && !z && !videoStreamingData.v && ((ar2 = afjzVar.ar()) == aanu.DEFAULT || ar2 == aanu.AV1_MEDIA_CODEC_HW)) {
                Set V = playerConfigModel.V();
                Set W = playerConfigModel.W();
                if (Build.VERSION.SDK_INT >= 29 && afjzVar.aI("av1_profile_main_10_supported", "video/av01", false, V, W, 4096) && afjzVar.aS(i)) {
                    return new aflk(aank.l(), 3);
                }
            }
        }
        if (l(videoStreamingData, playerConfigModel, afjzVar)) {
            return new aflk(aank.z(), 3);
        }
        if (n(videoStreamingData, playerConfigModel, afjzVar)) {
            return new aflk(aank.z(), 2);
        }
        if (!m(videoStreamingData, playerConfigModel, afjzVar, amqoVar)) {
            if (videoStreamingData.s && !videoStreamingData.v) {
                aanu ar3 = afjzVar.ar();
                boolean z2 = true;
                if ((ar3 != aanu.DEFAULT || !afjzVar.y()) && ar3 != aanu.AV1_MEDIA_CODEC_HW && !videoStreamingData.D()) {
                    z2 = false;
                }
                Set V2 = playerConfigModel.V();
                Set W2 = playerConfigModel.W();
                if (z2 && afjzVar.aH(V2, W2)) {
                    return new aflk(aank.d(), 3);
                }
            }
            if (!a(playerConfigModel, videoStreamingData, c)) {
                if (!videoStreamingData.s || videoStreamingData.v || ((((ar = afjzVar.ar()) != aanu.DEFAULT || !afjzVar.x()) && ar != aanu.AV1_MEDIA_CODEC && !videoStreamingData.D()) || !afjzVar.aG(playerConfigModel.V()))) {
                    Set f2 = f(afjzVar, videoStreamingData);
                    if (o(videoStreamingData, playerConfigModel, afjzVar)) {
                        return new aflk(f2, 3);
                    }
                    if (q(videoStreamingData, playerConfigModel, afjzVar)) {
                        return new aflk(f2, 2);
                    }
                    if (p(videoStreamingData, playerConfigModel, afjzVar, amqoVar)) {
                        return new aflk(f2, 4);
                    }
                    return g(videoStreamingData, playerConfigModel, afjzVar) ? new aflk(d(afjzVar, videoStreamingData), 2) : e;
                }
                return new aflk(aank.d(), 2);
            }
            return new aflk(aank.d(), 8);
        }
        return new aflk(aank.z(), 4);
    }

    public static Set d(afjz afjzVar, VideoStreamingData videoStreamingData) {
        HashSet hashSet = new HashSet(aank.p());
        if ((!afjzVar.I() || !afjzVar.H()) && !videoStreamingData.D()) {
            hashSet.remove(Integer.valueOf(aank.aw));
            return hashSet;
        }
        return hashSet;
    }

    static Set e(afjz afjzVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (afjzVar.G() || videoStreamingData.D()) {
            return aank.u(playerConfigModel.aX());
        }
        HashSet hashSet = new HashSet(aank.u(playerConfigModel.aX()));
        hashSet.remove(Integer.valueOf(aank.T));
        return hashSet;
    }

    public static Set f(afjz afjzVar, VideoStreamingData videoStreamingData) {
        HashSet hashSet = new HashSet(aank.y());
        if ((!afjzVar.I() || !afjzVar.K()) && !videoStreamingData.D()) {
            hashSet.remove(Integer.valueOf(aank.B));
            return hashSet;
        }
        return hashSet;
    }

    public static boolean g(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar) {
        if (videoStreamingData.u) {
            aanu ar = afjzVar.ar();
            if (ar != aanu.DEFAULT && ar != aanu.H264_MEDIA_CODEC) {
                return false;
            }
            return afjzVar.aK(playerConfigModel.V());
        }
        return false;
    }

    public static boolean h(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar, amqo amqoVar) {
        int s;
        return ((playerConfigModel.aJ() && (s = akpq.s(afjzVar.o().q)) != 0 && s == 5) || videoStreamingData.D()) && videoStreamingData.s() && ((Boolean) amqoVar.get()).booleanValue();
    }

    public static boolean i(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar) {
        int s;
        return ((playerConfigModel.aJ() && (s = akpq.s(afjzVar.o().q)) != 0 && s == 3) || videoStreamingData.D()) && videoStreamingData.s() && afjzVar.aL(playerConfigModel.V());
    }

    public static boolean j(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar, amqo amqoVar) {
        return q(videoStreamingData, playerConfigModel, afjzVar) || o(videoStreamingData, playerConfigModel, afjzVar) || p(videoStreamingData, playerConfigModel, afjzVar, amqoVar) || m(videoStreamingData, playerConfigModel, afjzVar, amqoVar) || l(videoStreamingData, playerConfigModel, afjzVar) || n(videoStreamingData, playerConfigModel, afjzVar);
    }

    public static boolean k(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, afjz afjzVar, amqo amqoVar) {
        return m(videoStreamingData, playerConfigModel, afjzVar, amqoVar) || l(videoStreamingData, playerConfigModel, afjzVar) || n(videoStreamingData, playerConfigModel, afjzVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r3.aE == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r2 == defpackage.aanu.VP9_MEDIA_CODEC_HW) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        r2 = r5.V();
        r5 = r5.W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r6.aS(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4.v != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r6.aN(r2, r5) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean l(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r4, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r5, defpackage.afjz r6) {
        /*
            int r0 = r4.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L3c
            boolean r2 = r4.v
            if (r2 != 0) goto L3c
            aanu r2 = r6.ar()
            aanu r3 = defpackage.aanu.DEFAULT
            if (r2 != r3) goto L1e
            atzv r3 = r5.c
            aqwu r3 = r3.e
            if (r3 != 0) goto L1a
            aqwu r3 = defpackage.aqwu.b
        L1a:
            boolean r3 = r3.aE
            if (r3 != 0) goto L22
        L1e:
            aanu r3 = defpackage.aanu.VP9_MEDIA_CODEC_HW
            if (r2 != r3) goto L3c
        L22:
            java.util.Set r2 = r5.V()
            java.util.Set r5 = r5.W()
            boolean r0 = r6.aS(r0)
            if (r0 == 0) goto L3c
            boolean r4 = r4.v
            if (r4 != 0) goto L3c
            boolean r4 = r6.aN(r2, r5)
            if (r4 == 0) goto L3c
            r4 = 1
            return r4
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.l(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r4.aG() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r3 == defpackage.aanu.VP9_LIBVPX_GL) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r5.o == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (android.os.Build.VERSION.SDK_INT > 25) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r5.f.getConfiguration().isScreenWideColorGamut() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        r3 = (defpackage.awuj) r5.g.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        if ((r3.b & 1024) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        r3 = r3.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r3 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r3.contains("EGL_KHR_gl_colorspace") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r3.contains("EGL_EXT_gl_colorspace_display_p3") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        r5.g.b(new defpackage.ehf(r3, 20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r3 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (((java.lang.Boolean) r6.get()).booleanValue() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean m(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afjz r5, defpackage.amqo r6) {
        /*
            int r0 = r3.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L8c
            boolean r3 = r3.v
            if (r3 != 0) goto L8c
            aanu r3 = r5.ar()
            aanu r0 = defpackage.aanu.DEFAULT
            if (r3 != r0) goto L24
            atzv r0 = r4.c
            aqwu r0 = r0.e
            if (r0 != 0) goto L1a
            aqwu r0 = defpackage.aqwu.b
        L1a:
            boolean r0 = r0.aD
            if (r0 == 0) goto L24
            boolean r4 = r4.aG()
            if (r4 != 0) goto L28
        L24:
            aanu r4 = defpackage.aanu.VP9_LIBVPX_GL
            if (r3 != r4) goto L8c
        L28:
            boolean r3 = r5.o
            if (r3 == 0) goto L2d
            goto L8c
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            r0 = 1
            if (r3 > r4) goto L35
            goto L7f
        L35:
            android.content.res.Resources r3 = r5.f
            android.content.res.Configuration r3 = r3.getConfiguration()
            boolean r3 = r3.isScreenWideColorGamut()
            if (r3 == 0) goto L7f
            yve r3 = r5.g
            aoqu r3 = r3.c()
            awuj r3 = (defpackage.awuj) r3
            int r4 = r3.b
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L52
            boolean r3 = r3.s
            goto L7d
        L52:
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.eglGetDisplay(r1)
            r4 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r3 = android.opengl.EGL14.eglQueryString(r3, r4)
            if (r3 == 0) goto L70
            java.lang.String r4 = "EGL_KHR_gl_colorspace"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L70
            java.lang.String r4 = "EGL_EXT_gl_colorspace_display_p3"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L70
            r3 = 1
            goto L71
        L70:
            r3 = 0
        L71:
            yve r4 = r5.g
            ehf r5 = new ehf
            r2 = 20
            r5.<init>(r3, r2)
            r4.b(r5)
        L7d:
            if (r3 == 0) goto L8c
        L7f:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8c
            return r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.m(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz, amqo):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r2.aF == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r3 == defpackage.aanu.VP9_MEDIA_CODEC) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        r3 = r4.V();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r5.aS(r0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r5.aN(r3, defpackage.amyg.a) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afjz r5) {
        /*
            int r0 = r3.y
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L36
            boolean r3 = r3.v
            if (r3 != 0) goto L36
            aanu r3 = r5.ar()
            aanu r2 = defpackage.aanu.DEFAULT
            if (r3 != r2) goto L1e
            atzv r2 = r4.c
            aqwu r2 = r2.e
            if (r2 != 0) goto L1a
            aqwu r2 = defpackage.aqwu.b
        L1a:
            boolean r2 = r2.aF
            if (r2 != 0) goto L22
        L1e:
            aanu r2 = defpackage.aanu.VP9_MEDIA_CODEC
            if (r3 != r2) goto L36
        L22:
            java.util.Set r3 = r4.V()
            boolean r4 = r5.aS(r0)
            if (r4 == 0) goto L36
            amyg r4 = defpackage.amyg.a
            boolean r3 = r5.aN(r3, r4)
            if (r3 == 0) goto L36
            r3 = 1
            return r3
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.n(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r1.ap == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean o(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r2, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r3, defpackage.afjz r4) {
        /*
            boolean r0 = r2.t
            if (r0 == 0) goto L38
            aanu r0 = r4.ar()
            boolean r2 = r2.v
            aanu r1 = defpackage.aanu.DEFAULT
            if (r0 != r1) goto L20
            boolean r1 = r3.j
            if (r1 == 0) goto L20
            if (r2 == 0) goto L24
            atzv r1 = r3.c
            aqwu r1 = r1.e
            if (r1 != 0) goto L1c
            aqwu r1 = defpackage.aqwu.b
        L1c:
            boolean r1 = r1.ap
            if (r1 != 0) goto L24
        L20:
            aanu r1 = defpackage.aanu.VP9_MEDIA_CODEC_HW
            if (r0 != r1) goto L38
        L24:
            java.util.Set r0 = r3.V()
            java.util.Set r3 = r3.W()
            if (r2 == 0) goto L33
            boolean r2 = r4.aM(r0, r3)
            goto L37
        L33:
            boolean r2 = r4.aP(r0, r3)
        L37:
            return r2
        L38:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.o(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r5.aK(r4.V()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean p(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afjz r5, defpackage.amqo r6) {
        /*
            boolean r0 = r3.t
            r1 = 0
            if (r0 == 0) goto L73
            boolean r0 = r3.v
            if (r0 != 0) goto L73
            boolean r0 = r3.u
            if (r0 != 0) goto L1f
            boolean r0 = r3.t()
            if (r0 == 0) goto L14
            goto L1f
        L14:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L1f:
            aanu r0 = r5.ar()
            aanu r2 = defpackage.aanu.DEFAULT
            if (r0 != r2) goto L2d
            boolean r2 = r4.aF()
            if (r2 != 0) goto L5f
        L2d:
            int r0 = r0.ordinal()
            r2 = 5
            if (r0 == r2) goto L5f
            r2 = 6
            if (r0 == r2) goto L5f
            int r0 = r4.s()
            int r0 = r3.a(r0)
            int r2 = r5.f()
            if (r0 <= r2) goto L5f
            atzv r0 = r4.c
            aqwu r0 = r0.e
            if (r0 != 0) goto L4d
            aqwu r0 = defpackage.aqwu.b
        L4d:
            boolean r0 = r0.O
            if (r0 == 0) goto L73
            boolean r3 = r3.u
            if (r3 == 0) goto L5f
            java.util.Set r3 = r4.V()
            boolean r3 = r5.aK(r3)
            if (r3 != 0) goto L73
        L5f:
            java.lang.Object r3 = r6.get()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L73
            boolean r3 = r5.aQ()
            if (r3 == 0) goto L73
            r3 = 1
            return r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.p(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz, amqo):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r2.I != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r2.H == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean q(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r3, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4, defpackage.afjz r5) {
        /*
            boolean r0 = r3.t
            if (r0 == 0) goto L6a
            aanu r0 = r5.ar()
            boolean r1 = r3.v
            aanu r2 = defpackage.aanu.DEFAULT
            if (r0 != r2) goto L2d
            boolean r2 = r4.j
            if (r2 == 0) goto L2d
            if (r1 == 0) goto L21
            atzv r2 = r4.c
            aqwu r2 = r2.e
            if (r2 != 0) goto L1c
            aqwu r2 = defpackage.aqwu.b
        L1c:
            boolean r2 = r2.I
            if (r2 == 0) goto L2d
            goto L56
        L21:
            atzv r2 = r4.c
            aqwu r2 = r2.e
            if (r2 != 0) goto L29
            aqwu r2 = defpackage.aqwu.b
        L29:
            boolean r2 = r2.H
            if (r2 != 0) goto L56
        L2d:
            aanu r2 = defpackage.aanu.VP9_MEDIA_CODEC
            if (r0 == r2) goto L56
            boolean r0 = r3.u
            if (r0 != 0) goto L3b
            boolean r0 = r3.t()
            if (r0 == 0) goto L56
        L3b:
            atzv r0 = r4.c
            aqwu r0 = r0.e
            if (r0 != 0) goto L43
            aqwu r0 = defpackage.aqwu.b
        L43:
            boolean r0 = r0.f95J
            if (r0 == 0) goto L6a
            boolean r3 = r3.u
            if (r3 == 0) goto L56
            java.util.Set r3 = r4.V()
            boolean r3 = r5.aK(r3)
            if (r3 == 0) goto L56
            goto L6a
        L56:
            java.util.Set r3 = r4.V()
            if (r1 == 0) goto L63
            amyg r4 = defpackage.amyg.a
            boolean r3 = r5.aM(r3, r4)
            goto L69
        L63:
            amyg r4 = defpackage.amyg.a
            boolean r3 = r5.aP(r3, r4)
        L69:
            return r3
        L6a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.q(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjz):boolean");
    }
}
