package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.d5;
/* loaded from: classes.dex */
public class Analytics {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Analytics f7847a;

    private Analytics(d5 d5Var) {
        s.a(d5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f7847a == null) {
            synchronized (Analytics.class) {
                if (f7847a == null) {
                    f7847a = new Analytics(d5.a(context, null, null));
                }
            }
        }
        return f7847a;
    }
}
