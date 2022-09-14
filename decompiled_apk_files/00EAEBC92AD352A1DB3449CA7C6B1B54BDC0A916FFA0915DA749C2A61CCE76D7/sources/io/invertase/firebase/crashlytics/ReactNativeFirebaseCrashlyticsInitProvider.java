package io.invertase.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.invertase.firebase.common.h;
import io.invertase.firebase.common.i;
import io.invertase.firebase.common.j;
import io.invertase.firebase.common.k;
/* loaded from: classes.dex */
public class ReactNativeFirebaseCrashlyticsInitProvider extends h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        i c2 = i.c();
        j c3 = j.c();
        k d2 = k.d();
        return d2.a("crashlytics_auto_collection_enabled") ? d2.a("crashlytics_auto_collection_enabled", true) : c2.a("crashlytics_auto_collection_enabled") ? c2.a("crashlytics_auto_collection_enabled", true) : c3.a("crashlytics_auto_collection_enabled", true);
    }

    @Override // io.invertase.firebase.common.h, android.content.ContentProvider
    public boolean onCreate() {
        super.onCreate();
        try {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(a());
            Log.i("RNFBCrashlyticsInit", "initialization successful");
            return true;
        } catch (Exception e2) {
            Log.e("RNFBCrashlyticsInit", "initialization failed", e2);
            return false;
        }
    }
}
