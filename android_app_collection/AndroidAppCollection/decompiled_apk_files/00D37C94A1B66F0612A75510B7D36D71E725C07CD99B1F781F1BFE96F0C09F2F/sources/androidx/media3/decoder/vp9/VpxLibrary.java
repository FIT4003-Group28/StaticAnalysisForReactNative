package androidx.media3.decoder.vp9;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class VpxLibrary {
    private static final pwb a;

    static {
        piq.b("goog.exo.vpx");
        a = new pwb("vpx", "vpxV2JNI");
    }

    private VpxLibrary() {
    }

    public static boolean a() {
        return a.a();
    }

    public static boolean b(Class cls) {
        return pxi.M(null, cls);
    }

    private static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
