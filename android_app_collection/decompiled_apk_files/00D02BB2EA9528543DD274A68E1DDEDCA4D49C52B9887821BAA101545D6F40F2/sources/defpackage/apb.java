package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: apb  reason: default package */
/* loaded from: classes.dex */
public final class apb extends Fragment {
    public static final /* synthetic */ int b = 0;
    public aow a;

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new apa());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new apb(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Activity activity, i iVar) {
        if (activity instanceof p) {
            ((p) activity).a().e(iVar);
        } else if (!(activity instanceof m)) {
        } else {
            k Nh = ((m) activity).Nh();
            if (!(Nh instanceof o)) {
                return;
            }
            ((o) Nh).e(iVar);
        }
    }

    private final void c(i iVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b(getActivity(), iVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(i.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c(i.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        c(i.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        aow aowVar = this.a;
        if (aowVar != null) {
            aowVar.a.c();
        }
        c(i.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        aow aowVar = this.a;
        if (aowVar != null) {
            aowVar.a.a();
        }
        c(i.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        c(i.ON_STOP);
    }
}
