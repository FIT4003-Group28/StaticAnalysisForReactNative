package com.facebook.imagepipeline.nativecode;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static e f5286a;

    static {
        try {
            f5286a = (e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
        } catch (Throwable unused) {
        }
    }

    public static e a() {
        return f5286a;
    }
}
