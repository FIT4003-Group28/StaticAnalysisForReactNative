package defpackage;

import android.os.Handler;
import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qu  reason: default package */
/* loaded from: classes4.dex */
public final class qu implements ra {
    final /* synthetic */ ra b;
    final qx a = new qx();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Runnable d = new qt(this);

    public qu(ra raVar) {
        this.b = raVar;
    }

    public final void a(qy qyVar) {
        this.a.c(qyVar);
        this.c.post(this.d);
    }
}
