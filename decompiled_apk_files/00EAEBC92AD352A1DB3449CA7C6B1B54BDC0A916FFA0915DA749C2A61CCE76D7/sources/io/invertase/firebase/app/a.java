package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f10232a;

    public static Context a() {
        return f10232a;
    }

    public static void a(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f10232a = context;
    }
}
