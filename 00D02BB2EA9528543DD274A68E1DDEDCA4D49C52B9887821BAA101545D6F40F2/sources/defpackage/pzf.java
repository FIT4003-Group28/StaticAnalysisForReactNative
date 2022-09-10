package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: pzf  reason: default package */
/* loaded from: classes7.dex */
public final class pzf {
    @dzsi
    public static pze a(dpgh dpghVar, PackageManager packageManager) {
        if ((dpghVar.a & 64) != 0) {
            dqdk dqdkVar = dpghVar.h;
            if (dqdkVar == null) {
                dqdkVar = dqdk.e;
            }
            Intent b = b(dqdkVar, packageManager);
            if (b != null) {
                return new pzd(b, dpghVar);
            }
        }
        return null;
    }

    @dzsi
    public static Intent b(dqdk dqdkVar, PackageManager packageManager) {
        if ((dqdkVar.a & 1) != 0) {
            dplx dplxVar = dqdkVar.b;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
            Intent intent = new Intent();
            if ((dplxVar.a & 1) != 0) {
                intent.setAction(dplxVar.b);
            }
            if ((dplxVar.a & 2) != 0) {
                intent.setData(Uri.parse(dplxVar.c));
            }
            if ((dplxVar.a & 8) != 0) {
                intent.setFlags(dplxVar.e);
            }
            if (packageManager.resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
                return intent;
            }
        }
        return null;
    }
}
