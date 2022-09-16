package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: qmm  reason: default package */
/* loaded from: classes4.dex */
public final class qmm implements bgx {
    public final qmu a;
    public final Handler b;

    static {
        new qpu("MediaRouterOPTListener");
    }

    public qmm(qmu qmuVar) {
        qnm.b(qmuVar);
        this.a = qmuVar;
        this.b = new rfm(Looper.getMainLooper());
    }
}
