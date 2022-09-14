package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: afhl  reason: default package */
/* loaded from: classes.dex */
public final class afhl {
    private static final dcqe a = dcqe.c("afhl");

    public static boolean a(PackageManager packageManager, Intent intent) {
        try {
            return packageManager.resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null;
        } catch (RuntimeException e) {
            bvoo.h("Package manager crashed: %s", e);
            return false;
        }
    }

    public static Uri b(Context context, akqs akqsVar) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double l = akqo.l(akqsVar, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density);
        akqq c = akqsVar.c();
        double d = c.a;
        double d2 = c.b;
        StringBuilder sb = new StringBuilder(71);
        sb.append("geo:");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append("?z=");
        sb.append((float) l);
        return Uri.parse(sb.toString());
    }
}
