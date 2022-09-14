package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: cnod  reason: default package */
/* loaded from: classes.dex */
public final class cnod {
    private cnsw a;
    private Looper b;

    public final cnoe a() {
        if (this.a == null) {
            this.a = new cnoz();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new cnoe(this.a, this.b);
    }

    public final void b(Looper looper) {
        cnwc.n(looper, "Looper must not be null.");
        this.b = looper;
    }

    public final void c(cnsw cnswVar) {
        cnwc.n(cnswVar, "StatusExceptionMapper must not be null.");
        this.a = cnswVar;
    }
}
