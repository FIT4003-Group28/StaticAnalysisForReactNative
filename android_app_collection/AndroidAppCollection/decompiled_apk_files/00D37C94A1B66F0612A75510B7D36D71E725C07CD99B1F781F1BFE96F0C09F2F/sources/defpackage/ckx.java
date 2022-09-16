package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ckx  reason: default package */
/* loaded from: classes2.dex */
public final class ckx {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new ctw(1));

    public final synchronized void a(cku ckuVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            ckuVar.e();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, ckuVar).sendToTarget();
    }
}
