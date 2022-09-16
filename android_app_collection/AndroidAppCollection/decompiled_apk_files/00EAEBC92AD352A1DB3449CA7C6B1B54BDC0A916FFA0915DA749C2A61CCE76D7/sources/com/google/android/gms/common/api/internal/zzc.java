package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class zzc extends Fragment implements h {
    private static WeakHashMap<androidx.fragment.app.c, WeakReference<zzc>> a0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> X = new a.e.a();
    private int Y = 0;
    private Bundle Z;

    public static zzc a(androidx.fragment.app.c cVar) {
        zzc zzcVar;
        WeakReference<zzc> weakReference = a0.get(cVar);
        if (weakReference == null || (zzcVar = weakReference.get()) == null) {
            try {
                zzc zzcVar2 = (zzc) cVar.h().b("SupportLifecycleFragmentImpl");
                if (zzcVar2 == null || zzcVar2.L()) {
                    zzcVar2 = new zzc();
                    androidx.fragment.app.s b2 = cVar.h().b();
                    b2.a(zzcVar2, "SupportLifecycleFragmentImpl");
                    b2.b();
                }
                a0.put(cVar, new WeakReference<>(zzcVar2));
                return zzcVar2;
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            }
        }
        return zzcVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void Q() {
        super.Q();
        this.Y = 5;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void V() {
        super.V();
        this.Y = 3;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W() {
        super.W();
        this.Y = 2;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void X() {
        super.X();
        this.Y = 4;
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.X.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.X.containsKey(str)) {
            this.X.put(str, lifecycleCallback);
            if (this.Y <= 0) {
                return;
            }
            new c.e.a.b.d.c.d(Looper.getMainLooper()).post(new c1(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.X.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.Y = 1;
        this.Z = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.X.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final /* synthetic */ Activity e() {
        return g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.X.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().b(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }
}
