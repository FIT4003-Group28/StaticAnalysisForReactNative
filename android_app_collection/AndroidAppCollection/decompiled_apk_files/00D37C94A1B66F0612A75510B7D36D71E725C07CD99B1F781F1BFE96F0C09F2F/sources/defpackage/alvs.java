package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alvs  reason: default package */
/* loaded from: classes.dex */
public final class alvs extends Fragment {
    private static final String a = "alvs";
    private MetricKey b;
    private long c;
    private long d = 0;

    public alvs() {
        setRetainInstance(true);
    }

    public static void a(Activity activity) {
        FragmentManager fragmentManager;
        if (aqgn.j(activity.getIntent())) {
            alvw a2 = alvw.a(activity.getApplicationContext());
            String o = apwt.o(activity);
            Bundle bundle = new Bundle();
            bundle.putString("screenName", apwt.o(activity));
            bundle.putString("intentAction", activity.getIntent().getAction());
            a2.b(o, bundle);
            if (Build.VERSION.SDK_INT <= 23 || (fragmentManager = activity.getFragmentManager()) == null || fragmentManager.isDestroyed()) {
                return;
            }
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
            if (findFragmentByTag == null) {
                alvs alvsVar = new alvs();
                try {
                    fragmentManager.beginTransaction().add(alvsVar, "lifecycle_monitor").commitNow();
                    findFragmentByTag = alvsVar;
                } catch (IllegalStateException e) {
                    String str = a;
                    String valueOf = String.valueOf(activity.getComponentName());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("Error occurred when attach to Activity:");
                    sb.append(valueOf);
                    Log.e(str, sb.toString(), e);
                }
            } else if (!(findFragmentByTag instanceof alvs)) {
                Log.wtf(a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
                return;
            }
            alvs alvsVar2 = (alvs) findFragmentByTag;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b = MetricKey.b("ScreenDuration", getActivity());
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.d);
        apwt.n(activity, "Context cannot be null.");
        apwt.n(metricKey, "Timer name cannot be null.");
        apwt.l(millis >= 0, "Duration cannot be negative.");
        alvw a2 = alvw.a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.a(metricKey));
        bundle.putLong("timeMillis", millis);
        a2.e(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.d += System.nanoTime() - this.c;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            alwb.a(getActivity(), CustomEvent.e(MetricKey.b("ScreenActivity", getActivity()), persistableBundle));
        }
    }
}
