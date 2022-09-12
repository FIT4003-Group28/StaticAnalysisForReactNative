package defpackage;
/* compiled from: PG */
/* renamed from: cpct  reason: default package */
/* loaded from: classes.dex */
public final class cpct<TResult> {
    public final cpcx<TResult> a = new cpcx<>();

    public final void a(TResult tresult) {
        this.a.t(tresult);
    }

    public final boolean b(TResult tresult) {
        cpcx<TResult> cpcxVar = this.a;
        synchronized (cpcxVar.a) {
            if (cpcxVar.c) {
                return false;
            }
            cpcxVar.c = true;
            cpcxVar.e = tresult;
            cpcxVar.b.b(cpcxVar);
            return true;
        }
    }

    public final void c(Exception exc) {
        this.a.u(exc);
    }

    public final void d(Exception exc) {
        cpcx<TResult> cpcxVar = this.a;
        cnwc.n(exc, "Exception must not be null");
        synchronized (cpcxVar.a) {
            if (cpcxVar.c) {
                return;
            }
            cpcxVar.c = true;
            cpcxVar.f = exc;
            cpcxVar.b.b(cpcxVar);
        }
    }
}
