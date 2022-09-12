package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: PG */
/* renamed from: cnry  reason: default package */
/* loaded from: classes5.dex */
final class cnry implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ cnrz c;

    public cnry(cnrz cnrzVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = cnrzVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnrz cnrzVar = this.c;
        if (cnrzVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = cnrzVar.c;
            lifecycleCallback.h(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.c();
        }
        if (this.c.b >= 3) {
            this.a.Sh();
        }
        if (this.c.b >= 4) {
            this.a.d();
        }
    }
}
