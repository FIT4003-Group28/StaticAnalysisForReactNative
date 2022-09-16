package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: abp  reason: default package */
/* loaded from: classes.dex */
public class abp extends gb implements apy, ak, i, bll, abt, ace, abx {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final acd mActivityResultRegistry;
    private int mContentLayoutId;
    public final abu mContextAwareHelper;
    private ae mDefaultFactory;
    private final l mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final abs mOnBackPressedDispatcher;
    final blk mSavedStateRegistryController;
    private aj mViewModelStore;

    public abp() {
        this.mContextAwareHelper = new abu();
        this.mLifecycleRegistry = new l(this);
        this.mSavedStateRegistryController = blk.a(this);
        this.mOnBackPressedDispatcher = new abs(new abl(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new acd(this);
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().c(new j() { // from class: androidx.activity.ComponentActivity$3
            @Override // defpackage.j
            public final void a(apy apyVar, aps apsVar) {
                if (apsVar == aps.ON_STOP) {
                    Window window = abp.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView == null) {
                        return;
                    }
                    peekDecorView.cancelPendingInputEvents();
                }
            }
        });
        getLifecycle().c(new j() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.j
            public final void a(apy apyVar, aps apsVar) {
                if (apsVar == aps.ON_DESTROY) {
                    abp.this.mContextAwareHelper.b = null;
                    if (abp.this.isChangingConfigurations()) {
                        return;
                    }
                    abp.this.getViewModelStore().c();
                }
            }
        });
        getLifecycle().c(new j() { // from class: androidx.activity.ComponentActivity$5
            @Override // defpackage.j
            public final void a(apy apyVar, aps apsVar) {
                abp.this.ensureViewModelStore();
                abp.this.getLifecycle().e(this);
            }
        });
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().c(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new bli() { // from class: abk
            @Override // defpackage.bli
            public final Bundle a() {
                return abp.this.lambda$new$0$ComponentActivity();
            }
        });
        addOnContextAvailableListener(new abv() { // from class: abj
            @Override // defpackage.abv
            public final void a(Context context) {
                abp.this.lambda$new$1$ComponentActivity(context);
            }
        });
    }

    private void initViewTreeOwners() {
        ao.d(getWindow().getDecorView(), this);
        ao.c(getWindow().getDecorView(), this);
        le.d(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(abv abvVar) {
        abu abuVar = this.mContextAwareHelper;
        if (abuVar.b != null) {
            abvVar.a(abuVar.b);
        }
        abuVar.a.add(abvVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            abo aboVar = (abo) getLastNonConfigurationInstance();
            if (aboVar != null) {
                this.mViewModelStore = aboVar.b;
            }
            if (this.mViewModelStore != null) {
                return;
            }
            this.mViewModelStore = new aj();
        }
    }

    public final acd getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // defpackage.i
    public ae getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new z(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        abo aboVar = (abo) getLastNonConfigurationInstance();
        if (aboVar != null) {
            return aboVar.a;
        }
        return null;
    }

    @Override // defpackage.gb, defpackage.apy
    public apu getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final abs getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.bll
    public final blj getSavedStateRegistry() {
        return this.mSavedStateRegistryController.a;
    }

    @Override // defpackage.ak
    public aj getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public /* synthetic */ Bundle lambda$new$0$ComponentActivity() {
        Bundle bundle = new Bundle();
        acd acdVar = this.mActivityResultRegistry;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(acdVar.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(acdVar.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(acdVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) acdVar.g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", acdVar.a);
        return bundle;
    }

    public /* synthetic */ void lambda$new$1$ComponentActivity(Context context) {
        Bundle a = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            acd acdVar = this.mActivityResultRegistry;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            acdVar.d = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            acdVar.a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            acdVar.g.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (acdVar.c.containsKey(str)) {
                    Integer num = (Integer) acdVar.c.remove(str);
                    if (!acdVar.g.containsKey(str)) {
                        acdVar.b.remove(num);
                    }
                }
                acdVar.c(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.e(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        abu abuVar = this.mContextAwareHelper;
        abuVar.b = this;
        for (abv abvVar : abuVar.a) {
            abvVar.a(this);
        }
        super.onCreate(bundle);
        aqf.b(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        abo aboVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        aj ajVar = this.mViewModelStore;
        if (ajVar == null && (aboVar = (abo) getLastNonConfigurationInstance()) != null) {
            ajVar = aboVar.b;
        }
        if (ajVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        abo aboVar2 = new abo();
        aboVar2.a = onRetainCustomNonConfigurationInstance;
        aboVar2.b = ajVar;
        return aboVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gb, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        apu lifecycle = getLifecycle();
        if (lifecycle instanceof l) {
            ((l) lifecycle).f(apt.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    @Override // defpackage.abx
    public final aby registerForActivityResult(ach achVar, abw abwVar) {
        return registerForActivityResult(achVar, this.mActivityResultRegistry, abwVar);
    }

    public final void removeOnContextAvailableListener(abv abvVar) {
        this.mContextAwareHelper.a.remove(abvVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final aby registerForActivityResult(ach achVar, acd acdVar, abw abwVar) {
        return acdVar.b("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, achVar, abwVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        if (Build.VERSION.SDK_INT >= 29) {
            bmr.a();
        } else {
            try {
                if (acy.b == null) {
                    acy.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    acy.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                ((Boolean) acy.b.invoke(null, Long.valueOf(acy.a))).booleanValue();
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
            }
        }
        super.reportFullyDrawn();
    }

    public abp(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
