package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbbn  reason: default package */
/* loaded from: classes5.dex */
public final class dbbn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArCoreApk.Availability a(Context context) {
        try {
            if (b(context) == null) {
                return ArCoreApk.Availability.SUPPORTED_INSTALLED;
            }
            return ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
        } catch (UnavailableDeviceNotCompatibleException unused) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingIntent b(Context context) {
        try {
            Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                return null;
            }
            if (!string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                if (string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                    throw new UnavailableUserDeclinedInstallationException();
                }
                Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                String string2 = call.getString("exceptionText", null);
                if (string2 != null) {
                    throw ((RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2));
                }
                throw ((RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            throw new UnavailableDeviceNotCompatibleException();
        } catch (ReflectiveOperationException | RuntimeException unused) {
            return null;
        }
    }
}
