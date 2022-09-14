package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class a1 extends Fragment implements h {

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<a1>> f6831e = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, LifecycleCallback> f6832b = new a.e.a();

    /* renamed from: c  reason: collision with root package name */
    private int f6833c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f6834d;

    public static a1 a(Activity activity) {
        a1 a1Var;
        WeakReference<a1> weakReference = f6831e.get(activity);
        if (weakReference == null || (a1Var = weakReference.get()) == null) {
            try {
                a1 a1Var2 = (a1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (a1Var2 == null || a1Var2.isRemoving()) {
                    a1Var2 = new a1();
                    activity.getFragmentManager().beginTransaction().add(a1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f6831e.put(activity, new WeakReference<>(a1Var2));
                return a1Var2;
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
            }
        }
        return a1Var;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.f6832b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f6832b.containsKey(str)) {
            this.f6832b.put(str, lifecycleCallback);
            if (this.f6833c <= 0) {
                return;
            }
            new c.e.a.b.d.c.d(Looper.getMainLooper()).post(new b1(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6833c = 1;
        this.f6834d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f6832b.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f6833c = 5;
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f6833c = 3;
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f6832b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f6833c = 2;
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f6833c = 4;
        for (LifecycleCallback lifecycleCallback : this.f6832b.values()) {
            lifecycleCallback.e();
        }
    }
}
