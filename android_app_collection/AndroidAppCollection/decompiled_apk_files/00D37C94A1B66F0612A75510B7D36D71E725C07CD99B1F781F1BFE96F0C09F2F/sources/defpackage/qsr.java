package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: qsr  reason: default package */
/* loaded from: classes4.dex */
public final class qsr {
    public Looper a;
    private qvs b;

    public final qss a() {
        if (this.b == null) {
            this.b = new anwi(1);
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new qss(this.b, this.a);
    }

    public final void b(qvs qvsVar) {
        qnm.n(qvsVar, "StatusExceptionMapper must not be null.");
        this.b = qvsVar;
    }
}
