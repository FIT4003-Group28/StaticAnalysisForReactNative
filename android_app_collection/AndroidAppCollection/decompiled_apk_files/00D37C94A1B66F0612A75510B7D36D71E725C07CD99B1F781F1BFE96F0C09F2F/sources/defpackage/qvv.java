package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: qvv  reason: default package */
/* loaded from: classes4.dex */
public final class qvv extends dp implements qux {
    public static final WeakHashMap a = new WeakHashMap();
    public Bundle c;
    private final Map d = DesugarCollections.synchronizedMap(new afw());
    public int b = 0;

    @Override // defpackage.dp
    public final void P(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.P(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
        }
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        super.S(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.d(i, i2, intent);
        }
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.b = 5;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.n();
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.b = 3;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.k();
        }
    }

    @Override // defpackage.qux
    public final /* bridge */ /* synthetic */ Activity a() {
        return mJ();
    }

    @Override // defpackage.qux
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.d.get(str));
    }

    @Override // defpackage.qux
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, lifecycleCallback);
            if (this.b <= 0) {
                return;
            }
            new rfm(Looper.getMainLooper()).post(new qvu(this, lifecycleCallback, str));
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        this.b = 2;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.i();
        }
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.b = 4;
        for (LifecycleCallback lifecycleCallback : this.d.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        for (Map.Entry entry : this.d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
