package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: bxh  reason: default package */
/* loaded from: classes.dex */
public final class bxh {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new bxg());

    public final synchronized void a(bxd<?> bxdVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            bxdVar.d();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, bxdVar).sendToTarget();
    }
}
