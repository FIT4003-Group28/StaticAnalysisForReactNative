package defpackage;

import android.media.MediaCodec;
import android.view.Surface;
/* compiled from: PG */
@Deprecated
/* renamed from: affu  reason: default package */
/* loaded from: classes.dex */
public final class affu {
    private final snc a;
    private final afjz b;

    public affu(afjz afjzVar, snc sncVar) {
        this.b = afjzVar;
        this.a = sncVar;
    }

    public static afkn b(IllegalStateException illegalStateException, long j, Surface surface) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return new afkn(afkl.DEFAULT, "fmt.decode", j, "src.decfail;d." + c((MediaCodec.CodecException) illegalStateException) + ";sur." + d(surface), illegalStateException, null);
        }
        String d = d(surface);
        return new afkn(afkl.DEFAULT, "fmt.decode", j, d.length() != 0 ? "src.decfail;sur.".concat(d) : new String("src.decfail;sur."), illegalStateException, null);
    }

    public static String c(MediaCodec.CodecException codecException) {
        return codecException.getDiagnosticInfo().replace("android.media.MediaCodec", "MC");
    }

    public static String d(Surface surface) {
        return surface == null ? "null" : surface.isValid() ? "valid" : "invalid";
    }

    public static boolean e(Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            return false;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        return (th instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afkn a(java.io.IOException r16, long r17, defpackage.yrj r19, defpackage.afkl r20, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affu.a(java.io.IOException, long, yrj, afkl, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData):afkn");
    }
}
