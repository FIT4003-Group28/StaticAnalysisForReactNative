package c.e.a.c.a0;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(int i) {
        return i != 0 ? i != 1 ? a() : new e() : new j();
    }

    public static void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            a(view, (g) background);
        }
    }

    public static void a(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).a(f2);
        }
    }

    public static void a(View view, g gVar) {
        if (gVar.q()) {
            gVar.c(com.google.android.material.internal.h.a(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f b() {
        return new f();
    }
}
