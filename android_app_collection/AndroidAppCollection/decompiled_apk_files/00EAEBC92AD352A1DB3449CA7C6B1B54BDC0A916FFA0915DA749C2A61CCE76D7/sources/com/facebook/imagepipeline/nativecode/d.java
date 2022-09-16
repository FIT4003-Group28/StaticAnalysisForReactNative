package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.soloader.SoLoader;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5285a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f5285a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        SoLoader.a("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                SoLoader.a("native-imagetranscoder");
                f5285a = true;
            }
        }
    }
}
