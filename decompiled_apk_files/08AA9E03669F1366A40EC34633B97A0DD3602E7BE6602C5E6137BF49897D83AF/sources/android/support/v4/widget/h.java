package android.support.v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: EdgeEffectCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final b f672a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f672a = new a();
        } else {
            f672a = new b();
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        public void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    /* loaded from: classes.dex */
    static class a extends b {
        a() {
        }

        @Override // android.support.v4.widget.h.b
        public void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        f672a.a(edgeEffect, f, f2);
    }
}
