package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bvta  reason: default package */
/* loaded from: classes4.dex */
public final class bvta {
    public final CharSequence a;
    public final boolean b;

    private bvta(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public static bvta a(Context context, long j, TimeZone timeZone, String str) {
        String string;
        TimeZone timeZone2 = TimeZone.getDefault();
        long j2 = eaow.d(j).b;
        boolean z = timeZone == null || timeZone2.getOffset(j2) == timeZone.getOffset(j2);
        if (z) {
            string = bvtb.i(context, j);
        } else {
            string = context.getString(R.string.ESTIMATED_TIME_OF_ARRIVAL_WITH_TIME_ZONE, bvtb.k(context, j, timeZone), str);
        }
        return new bvta(string, z);
    }
}
