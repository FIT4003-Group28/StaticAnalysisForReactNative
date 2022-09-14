package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: daod  reason: default package */
/* loaded from: classes5.dex */
public final class daod extends Fragment {
    private MetricKey a;
    private long b;
    private long c = 0;

    public daod() {
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = MetricKey.a("ScreenDuration", getActivity());
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.a;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.c);
        daof.c(activity, "Context cannot be null.");
        daof.c(metricKey, "Timer name cannot be null.");
        daof.a(millis >= 0, "Duration cannot be negative.");
        daoi e = daoi.e(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.b(metricKey));
        bundle.putLong("timeMillis", millis);
        e.a(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.c += System.nanoTime() - this.b;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            daoq.a(getActivity(), CustomEvent.a(MetricKey.a("ScreenActivity", getActivity()), persistableBundle));
        }
    }
}
