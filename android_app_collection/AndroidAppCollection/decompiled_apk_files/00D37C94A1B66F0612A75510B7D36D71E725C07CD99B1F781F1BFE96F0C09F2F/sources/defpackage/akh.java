package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.io.File;
/* compiled from: PG */
/* renamed from: akh  reason: default package */
/* loaded from: classes.dex */
public final class akh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File b(Context context) {
        return context.getDataDir();
    }

    public static akm c(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? akm.b(configuration.getLocales()) : akm.a(configuration.locale);
    }
}
