package c.d.j.c;

import android.os.Build;
import com.facebook.imagepipeline.memory.f0;
/* loaded from: classes.dex */
public class g {
    public static f a(f0 f0Var, com.facebook.imagepipeline.platform.f fVar, c.d.j.f.a aVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 21 ? new a(f0Var.a(), aVar) : i >= 11 ? new e(new b(f0Var.f()), fVar, aVar) : new c();
    }
}
