package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: PG */
/* renamed from: cnsy  reason: default package */
/* loaded from: classes5.dex */
final class cnsy implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ cnsz c;

    public cnsy(cnsz cnszVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = cnszVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnsz cnszVar = this.c;
        if (cnszVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = cnszVar.c;
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
