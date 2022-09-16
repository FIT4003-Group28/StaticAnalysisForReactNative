package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqf  reason: default package */
/* loaded from: classes2.dex */
public final class aqf extends Fragment {
    public static final /* synthetic */ int b = 0;
    public aqa a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, aps apsVar) {
        if (activity instanceof m) {
            ((m) activity).a().d(apsVar);
        } else if (!(activity instanceof apy)) {
        } else {
            apu lifecycle = ((apy) activity).getLifecycle();
            if (!(lifecycle instanceof l)) {
                return;
            }
            ((l) lifecycle).d(apsVar);
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new aqe());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new aqf(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private final void c(aps apsVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), apsVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(aps.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c(aps.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c(aps.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        aqa aqaVar = this.a;
        if (aqaVar != null) {
            aqaVar.a.a();
        }
        c(aps.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        aqa aqaVar = this.a;
        if (aqaVar != null) {
            aqaVar.a.b();
        }
        c(aps.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        c(aps.ON_STOP);
    }
}
