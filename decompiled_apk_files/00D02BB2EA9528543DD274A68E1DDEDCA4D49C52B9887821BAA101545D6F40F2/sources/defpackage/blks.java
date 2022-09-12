package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: blks  reason: default package */
/* loaded from: classes3.dex */
public final class blks {
    public static String a(Resources resources, int i) {
        return resources.getQuantityString(R.plurals.UGC_ATTRIBUTION_PHOTOS_STRING_INPUT, i, NumberFormat.getNumberInstance(resources.getConfiguration().locale).format(i));
    }

    public static String b(Resources resources, int i) {
        return resources.getQuantityString(R.plurals.UGC_ATTRIBUTION_REVIEWS_STRING_INPUT, i, NumberFormat.getNumberInstance(resources.getConfiguration().locale).format(i));
    }
}
