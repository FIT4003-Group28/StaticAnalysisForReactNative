package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public abstract class jx {
    public abstract void a(Typeface typeface);

    public abstract void b(int i);

    public final void c(int i) {
        new Handler(Looper.getMainLooper()).post(new jw(this, i));
    }

    public final void d(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new jv(this, typeface));
    }
}
