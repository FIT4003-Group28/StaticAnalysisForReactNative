package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* compiled from: PG */
/* renamed from: quy  reason: default package */
/* loaded from: classes4.dex */
final class quy implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ quz c;

    public quy(quz quzVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = quzVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        quz quzVar = this.c;
        if (quzVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = quzVar.c;
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
