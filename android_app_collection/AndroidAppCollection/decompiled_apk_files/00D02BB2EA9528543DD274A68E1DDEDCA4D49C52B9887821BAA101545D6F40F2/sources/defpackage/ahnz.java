package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ahnz  reason: default package */
/* loaded from: classes.dex */
public final class ahnz {
    static final Uri a = Uri.parse("content://com.google.settings/partner");

    public static boolean a(Context context) {
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
            try {
                Cursor b = new btnz(context.getContentResolver()).b(a, new String[]{"value"}, new String[]{"use_location_for_services"});
                if (b != null) {
                    try {
                        if (b.moveToNext()) {
                            int parseInt = b.isNull(0) ? 2 : Integer.parseInt(b.getString(0));
                            b.close();
                            if (parseInt == 0) {
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            b.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                        throw th;
                    }
                }
                if (b != null) {
                    b.close();
                }
            } catch (btnx | RuntimeException e) {
                bvoo.j(e);
            }
        }
        return false;
    }

    public static void b(Context context, ContentObserver contentObserver) {
        try {
            context.getContentResolver().registerContentObserver(a, true, contentObserver);
        } catch (RuntimeException e) {
            bvoo.j(e);
        }
    }
}
