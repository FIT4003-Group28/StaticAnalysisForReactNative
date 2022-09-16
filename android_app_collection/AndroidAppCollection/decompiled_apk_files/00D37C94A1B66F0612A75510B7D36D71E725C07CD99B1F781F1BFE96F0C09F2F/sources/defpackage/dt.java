package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.IntentSenderRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: dt  reason: default package */
/* loaded from: classes3.dex */
public class dt extends abp implements ajl, ajm {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final l mFragmentLifecycleRegistry;
    final dx mFragments;
    boolean mResumed;
    boolean mStopped;

    public dt() {
        this.mFragments = dx.a(new ds(this));
        this.mFragmentLifecycleRegistry = new l(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().b(LIFECYCLE_TAG, new bli() { // from class: dr
            @Override // defpackage.bli
            public final Bundle a() {
                return dt.this.lambda$init$0$FragmentActivity();
            }
        });
        addOnContextAvailableListener(new abv() { // from class: dq
            @Override // defpackage.abv
            public final void a(Context context) {
                dt.this.lambda$init$1$FragmentActivity(context);
            }
        });
    }

    private static boolean markState(eo eoVar, apt aptVar) {
        boolean z = false;
        for (dp dpVar : eoVar.m()) {
            if (dpVar != null) {
                if (dpVar.M() != null) {
                    z |= markState(dpVar.mL(), aptVar);
                }
                fa faVar = dpVar.Y;
                if (faVar != null && ((l) faVar.getLifecycle()).b.a(apt.STARTED)) {
                    dpVar.Y.a.f(aptVar);
                    z = true;
                }
                if (dpVar.X.b.a(apt.STARTED)) {
                    dpVar.X.f(aptVar);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.e.c.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            aqh.a(this).c(str2, printWriter);
        }
        this.mFragments.b().F(str, fileDescriptor, printWriter, strArr);
    }

    public eo getSupportFragmentManager() {
        return this.mFragments.b();
    }

    @Deprecated
    public aqh getSupportLoaderManager() {
        return aqh.a(this);
    }

    public /* synthetic */ Bundle lambda$init$0$FragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.d(aps.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1$FragmentActivity(Context context) {
        dz dzVar = this.mFragments.a;
        dzVar.e.o(dzVar, dzVar, null);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), apt.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.c();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(dp dpVar) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.c();
        super.onConfigurationChanged(configuration);
        this.mFragments.a.e.s(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.d(aps.ON_CREATE);
        this.mFragments.a.e.t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
            dx dxVar = this.mFragments;
            return onCreatePanelMenu | dxVar.a.e.U(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.e.u();
        this.mFragmentLifecycleRegistry.d(aps.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.a.e.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.a.e.V(menuItem);
        }
        if (i == 6) {
            return this.mFragments.a.e.T(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.a.e.w(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.mFragments.c();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.a.e.x(menu);
            i = 0;
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.e.z();
        this.mFragmentLifecycleRegistry.d(aps.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.a.e.A(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.a.e.W(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // defpackage.abp, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.c();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.c();
        super.onResume();
        this.mResumed = true;
        this.mFragments.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.d(aps.ON_RESUME);
        this.mFragments.a.e.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.c();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.a.e.r();
        }
        this.mFragments.d();
        this.mFragmentLifecycleRegistry.d(aps.ON_START);
        this.mFragments.a.e.C();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.a.e.E();
        this.mFragmentLifecycleRegistry.d(aps.ON_STOP);
    }

    public void setEnterSharedElementCallback(ft ftVar) {
        setEnterSharedElementCallback(ftVar != null ? new ajn() : null);
    }

    public void setExitSharedElementCallback(ft ftVar) {
        setExitSharedElementCallback(ftVar != null ? new ajn() : null);
    }

    public void startActivityFromFragment(dp dpVar, Intent intent, int i) {
        startActivityFromFragment(dpVar, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(dp dpVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2 = intent;
        if (i == -1) {
            startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
        } else if (dpVar.A != null) {
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(dpVar);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i);
                sb.append(" IntentSender: ");
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
            }
            eo F = dpVar.F();
            if (F.r == null) {
                dz dzVar = F.m;
                if (i != -1) {
                    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
                }
                dzVar.b.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
                return;
            }
            if (bundle != null) {
                if (intent2 == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (eo.X(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ActivityOptions ");
                    sb2.append(bundle);
                    sb2.append(" were added to fillInIntent ");
                    sb2.append(intent2);
                    sb2.append(" for fragment ");
                    sb2.append(dpVar);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            acf acfVar = new acf(intentSender);
            acfVar.a = intent2;
            acfVar.b(i3, i2);
            IntentSenderRequest a = acfVar.a();
            F.t.addLast(new FragmentManager$LaunchedFragmentInfo(dpVar.l, i));
            if (eo.X(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Fragment ");
                sb3.append(dpVar);
                sb3.append("is launching an IntentSender for result ");
            }
            F.r.b(a);
        } else {
            throw new IllegalStateException("Fragment " + dpVar + " not attached to Activity");
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(dp dpVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            dpVar.an(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public dt(int i) {
        super(i);
        this.mFragments = dx.a(new ds(this));
        this.mFragmentLifecycleRegistry = new l(this);
        this.mStopped = true;
        init();
    }
}
