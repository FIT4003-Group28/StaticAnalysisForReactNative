package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aehv  reason: default package */
/* loaded from: classes2.dex */
public final class aehv {
    public static dbsg<String> a(Resources resources, dbsg<duui> dbsgVar) {
        if (!dbsgVar.a()) {
            return dbpy.a;
        }
        duui b = dbsgVar.b();
        int i = b.a;
        if ((i & 1) == 0) {
            return dbpy.a;
        }
        if ((i & 2) != 0) {
            return dbsg.i(b.c);
        }
        int i2 = b.b;
        return dbsg.i(resources.getQuantityString(R.plurals.COMPLIANT_LODGING_CLASS, i2, Integer.valueOf(i2)));
    }
}
