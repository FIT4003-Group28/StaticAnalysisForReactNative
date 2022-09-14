package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: alcg  reason: default package */
/* loaded from: classes2.dex */
public final class alcg {
    private static final dcqe a = dcqe.c("alcg");

    public static String a(Resources resources, String str, @dzsi String str2, String str3) {
        if (str3 == null) {
            bvoo.h("Cannot get transfer description for null head sign", new Object[0]);
            str3 = "";
        }
        if (dbsj.d(str2)) {
            return resources.getString(R.string.TRANSIT_TRANSFER_DESCRIPTION, str, str3);
        }
        return resources.getString(R.string.TRANSIT_TRANSFER_DESCRIPTION_WITH_EXPRESS_TYPE, str, str2, str3);
    }

    public static String b(Resources resources, int i) {
        return resources.getQuantityString(R.plurals.TRANSIT_NUM_STOPS, i, Integer.valueOf(i));
    }
}
