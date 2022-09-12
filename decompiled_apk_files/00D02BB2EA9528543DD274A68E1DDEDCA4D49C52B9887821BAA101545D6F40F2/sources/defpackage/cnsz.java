package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cnsz  reason: default package */
/* loaded from: classes.dex */
public final class cnsz extends fd implements cnrx {
    public static final WeakHashMap<ff, WeakReference<cnsz>> a = new WeakHashMap<>();
    public Bundle c;
    private final Map<String, LifecycleCallback> d = Collections.synchronizedMap(new aif());
    public int b = 0;

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        super.Z(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.j(i, i2, intent);
        }
    }

    @Override // defpackage.cnrx
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.d.get(str));
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        this.b = 3;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.Sh();
        }
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // defpackage.fd
    public final void aq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.aq(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.cnrx
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.b <= 0) {
                return;
            }
            new cojb(Looper.getMainLooper()).post(new cnsy(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cnrx
    public final /* bridge */ /* synthetic */ Activity c() {
        return J();
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.d.entrySet()) {
            entry.getValue().h(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.b = 2;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        for (Map.Entry<String, LifecycleCallback> entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.b = 4;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.d();
        }
    }
}
