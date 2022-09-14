package com.facebook.imagepipeline.nativecode;
/* compiled from: WebpTranscoderFactory.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3010a = false;

    /* renamed from: b  reason: collision with root package name */
    private static b f3011b;

    static {
        try {
            f3011b = (b) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f3010a = true;
        } catch (Throwable unused) {
            f3010a = false;
        }
    }

    public static b a() {
        return f3011b;
    }
}
