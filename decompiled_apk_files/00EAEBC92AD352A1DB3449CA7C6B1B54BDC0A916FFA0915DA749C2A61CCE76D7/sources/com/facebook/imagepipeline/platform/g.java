package com.facebook.imagepipeline.platform;

import android.os.Build;
import com.facebook.imagepipeline.memory.f0;
/* loaded from: classes.dex */
public class g {
    public static f a(f0 f0Var, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int d2 = f0Var.d();
            return new e(f0Var.a(), d2, new androidx.core.util.f(d2));
        } else if (i < 21) {
            return (!z || i >= 19) ? new d(f0Var.c()) : new c();
        } else {
            int d3 = f0Var.d();
            return new a(f0Var.a(), d3, new androidx.core.util.f(d3));
        }
    }
}
