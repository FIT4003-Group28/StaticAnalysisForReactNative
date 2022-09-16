package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: gt  reason: default package */
/* loaded from: classes3.dex */
public abstract class gt {
    public static Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface typeface);

    public final void b(int i) {
        d().post(new gs(this));
    }

    public final void c(Typeface typeface) {
        d().post(new gr(this, typeface));
    }

    public abstract void e();
}
