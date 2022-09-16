package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ud  reason: default package */
/* loaded from: classes4.dex */
public final class ud {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static ud b;
    private yv c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (ud.class) {
            b2 = yv.b(i, mode);
        }
        return b2;
    }

    public static synchronized ud d() {
        ud udVar;
        synchronized (ud.class) {
            if (b == null) {
                f();
            }
            udVar = b;
        }
        return udVar;
    }

    public static synchronized void f() {
        synchronized (ud.class) {
            if (b == null) {
                ud udVar = new ud();
                b = udVar;
                udVar.c = yv.e();
                b.c.g(new uc());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
