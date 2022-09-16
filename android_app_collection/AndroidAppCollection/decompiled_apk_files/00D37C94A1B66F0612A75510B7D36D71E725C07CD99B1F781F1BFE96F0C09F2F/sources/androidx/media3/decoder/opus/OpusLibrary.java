package androidx.media3.decoder.opus;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class OpusLibrary {
    private static final pwb a;

    static {
        piq.b("goog.exo.opus");
        a = new pwb("opusV2JNI");
    }

    private OpusLibrary() {
    }

    public static boolean a() {
        return a.a();
    }

    public static boolean b(Class cls) {
        return pxi.M(null, cls);
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
