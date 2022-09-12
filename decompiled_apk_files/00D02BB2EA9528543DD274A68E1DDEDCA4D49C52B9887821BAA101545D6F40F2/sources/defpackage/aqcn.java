package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqcn  reason: default package */
/* loaded from: classes2.dex */
public final class aqcn {
    private final Activity a;

    public aqcn(Activity activity) {
        this.a = activity;
    }

    public final String a(int i) {
        return bqq.c(this.a, R.string.STATUS_UNREAD, "num_unread", Integer.valueOf(i));
    }
}
