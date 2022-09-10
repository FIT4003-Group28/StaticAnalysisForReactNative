package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awtj  reason: default package */
/* loaded from: classes3.dex */
public class awtj {
    public static final String a(Context context, long j, long j2) {
        long j3 = j - j2;
        if (j3 > 0) {
            return d(context, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_EXPIRES, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_EXPIRES_ONE_MINUTE, j3);
        }
        return d(context, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_EXPIRED, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_EXPIRED_ONE_MINUTE, Math.abs(j3));
    }

    public static final String b(Context context, cqat cqatVar, awtn awtnVar) {
        if (awtnVar.p()) {
            return d(context, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_DETECTED, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_DETECTED_ONE_MINUTE, cqatVar.b() - awtnVar.k());
        } else if (!awtnVar.o()) {
            if (awtnVar.d() <= awtnVar.k()) {
                return d(context, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_SAVED, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_SAVED_ONE_MINUTE, cqatVar.b() - awtnVar.k());
            }
            return d(context, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_UPDATED, R.string.PARKING_LOCATION_SHEET_HEADER_SUBTITLE_UPDATED_ONE_MINUTE, cqatVar.b() - awtnVar.d());
        } else {
            return a(context, awtnVar.b(), cqatVar.b());
        }
    }

    public static final String c(Context context, long j) {
        return DateUtils.formatDateTime(context, j, true != DateUtils.isToday(j) ? 524313 : ImageMetadata.LENS_STATE);
    }

    private static String d(Context context, int i, int i2, long j) {
        if (j < TimeUnit.MINUTES.toMillis(1L)) {
            return context.getString(i2);
        }
        return context.getString(i, bvtb.e(context.getResources(), (int) (j / TimeUnit.SECONDS.toMillis(1L)), bvsz.ABBREVIATED));
    }
}
