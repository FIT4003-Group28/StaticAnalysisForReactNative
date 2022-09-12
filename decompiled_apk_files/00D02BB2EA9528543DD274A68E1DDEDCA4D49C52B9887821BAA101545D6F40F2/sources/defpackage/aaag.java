package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aaag  reason: default package */
/* loaded from: classes2.dex */
public final class aaag {
    private final Activity a;

    public aaag(Activity activity) {
        this.a = activity;
    }

    public final void a() {
        Toast.makeText(this.a, (int) R.string.LOCATION_DATA_ERROR, 0).show();
    }
}
