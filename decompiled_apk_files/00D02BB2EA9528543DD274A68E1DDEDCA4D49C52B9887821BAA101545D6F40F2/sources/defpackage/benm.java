package defpackage;

import android.app.Application;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: benm  reason: default package */
/* loaded from: classes3.dex */
public class benm {
    private final Application a;
    private final cqat b;

    public benm(Application application, cqat cqatVar) {
        this.a = application;
        this.b = cqatVar;
    }

    public final String a(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        long abs = Math.abs(this.b.b() - millis);
        if (abs < 60000) {
            return this.a.getString(R.string.MERCHANT_PANEL_CALLS_LIST_TIMESTAMP_RECENT);
        }
        if (abs >= 3600000) {
            long rawOffset = TimeZone.getDefault().getRawOffset();
            if (Time.getJulianDay(millis, rawOffset) == Time.getJulianDay(this.b.b(), rawOffset)) {
                return DateUtils.formatDateTime(this.a, millis, 1);
            }
            if (Math.abs(this.b.b() - millis) <= 31449600000L) {
                return DateUtils.formatDateTime(this.a, millis, 65560);
            }
            return DateUtils.formatDateTime(this.a, millis, 65556);
        }
        return DateUtils.getRelativeTimeSpanString(millis, this.b.b(), 60000L).toString();
    }

    public final String b(long j) {
        return DateUtils.formatDateTime(this.a, TimeUnit.SECONDS.toMillis(j), 98331);
    }

    public final String c(long j) {
        int i = ((int) j) % 60;
        String b = b(j);
        String quantityString = this.a.getResources().getQuantityString(R.plurals.MERCHANT_PANEL_CALLS_LIST_TIMESTAMP_SECONDS, i, Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(quantityString).length());
        sb.append(b);
        sb.append(" ");
        sb.append(quantityString);
        return sb.toString();
    }
}
