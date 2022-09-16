package defpackage;
/* compiled from: PG */
/* renamed from: rvh  reason: default package */
/* loaded from: classes4.dex */
public final class rvh {
    public final rvj a = new rvj();

    public final void a(Exception exc) {
        this.a.s(exc);
    }

    public final void b(Object obj) {
        this.a.t(obj);
    }

    public final boolean c(Exception exc) {
        rvj rvjVar = this.a;
        qnm.n(exc, "Exception must not be null");
        synchronized (rvjVar.a) {
            if (rvjVar.c) {
                return false;
            }
            rvjVar.c = true;
            rvjVar.f = exc;
            rvjVar.b.b(rvjVar);
            return true;
        }
    }

    public final boolean d(Object obj) {
        rvj rvjVar = this.a;
        synchronized (rvjVar.a) {
            if (rvjVar.c) {
                return false;
            }
            rvjVar.c = true;
            rvjVar.e = obj;
            rvjVar.b.b(rvjVar);
            return true;
        }
    }
}
