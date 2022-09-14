package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes.dex */
public final class pa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public pa(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
