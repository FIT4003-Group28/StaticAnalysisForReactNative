package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
/* compiled from: PG */
/* renamed from: daoq  reason: default package */
/* loaded from: classes5.dex */
public final class daoq {
    public static void a(Context context, CustomEvent customEvent) {
        daof.c(context, "Context cannot be null.");
        daoi e = daoi.e(context);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CustomEvent_version", 1);
        bundle2.putLong("CustomEvent_timestamp", customEvent.a);
        bundle2.putBundle("CustomEvent_metricKey", MetricKey.b(customEvent.b));
        bundle2.putBundle("CustomEvent_bundleValues", daoe.a(new PersistableBundle(customEvent.c)));
        bundle2.putBundle("CustomEvent_pii_bundleValues", daoe.a(customEvent.d));
        bundle.putParcelable("CustomEvent_bundle", bundle2);
        e.a(1, bundle);
    }
}
