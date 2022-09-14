package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: alan  reason: default package */
/* loaded from: classes.dex */
public final class alan {
    public static float a(SharedPreferences sharedPreferences, String str) {
        float f = sharedPreferences.getFloat(str, -1000.0f);
        if (f != -1000.0f) {
            return f;
        }
        throw new IllegalArgumentException();
    }
}
