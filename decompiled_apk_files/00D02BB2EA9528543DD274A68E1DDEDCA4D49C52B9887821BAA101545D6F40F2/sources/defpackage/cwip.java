package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cwip  reason: default package */
/* loaded from: classes5.dex */
public final class cwip {
    public static <T> void a(z<T> zVar, T t) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            zVar.f(t);
        } else {
            zVar.g(t);
        }
    }
}
