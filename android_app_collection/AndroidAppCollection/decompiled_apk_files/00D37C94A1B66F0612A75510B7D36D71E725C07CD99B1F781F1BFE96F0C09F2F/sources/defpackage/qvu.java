package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: PG */
/* renamed from: qvu  reason: default package */
/* loaded from: classes4.dex */
final class qvu implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ qvv c;

    public qvu(qvv qvvVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = qvvVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qvv qvvVar = this.c;
        if (qvvVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = qvvVar.c;
            lifecycleCallback.e(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.i();
        }
        if (this.c.b >= 3) {
            this.a.k();
        }
        if (this.c.b >= 4) {
            this.a.j();
        }
        if (this.c.b >= 5) {
            this.a.n();
        }
    }
}
