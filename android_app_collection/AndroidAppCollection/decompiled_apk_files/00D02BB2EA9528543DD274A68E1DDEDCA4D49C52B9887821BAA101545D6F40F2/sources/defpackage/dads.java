package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: dads  reason: default package */
/* loaded from: classes.dex */
public final class dads {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static dadl a(int i) {
        return i != 0 ? i != 1 ? b() : new dadm() : new dadv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dadl b() {
        return new dadv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dadn c() {
        return new dadn();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof dadr) {
            ((dadr) background).aa(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof dadr) {
            f(view, (dadr) background);
        }
    }

    public static void f(View view, dadr dadrVar) {
        czyv czyvVar = dadrVar.w.b;
        if (czyvVar == null || !czyvVar.a) {
            return;
        }
        float c = dabd.c(view);
        dadq dadqVar = dadrVar.w;
        if (dadqVar.n == c) {
            return;
        }
        dadqVar.n = c;
        dadrVar.ac();
    }
}
