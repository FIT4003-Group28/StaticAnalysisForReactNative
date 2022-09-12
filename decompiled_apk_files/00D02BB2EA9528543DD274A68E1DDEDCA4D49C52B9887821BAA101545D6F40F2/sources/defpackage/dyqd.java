package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyqd  reason: default package */
/* loaded from: classes6.dex */
final class dyqd implements Runnable {
    final /* synthetic */ dyqg a;

    public dyqd(dyqg dyqgVar) {
        this.a = dyqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long nextLong;
        synchronized (this.a) {
            dyqg dyqgVar = this.a;
            dyqgVar.d = null;
            int i = dyqgVar.i;
            z = true;
            if (i == 2) {
                dyqgVar.i = 4;
                dyqgVar.c = dyqgVar.a.schedule(dyqgVar.e, dyqgVar.h, TimeUnit.NANOSECONDS);
                z2 = true;
            } else {
                if (i == 3) {
                    dyqgVar.d = dyqgVar.a.schedule(dyqgVar.f, dyqgVar.g - dyqgVar.b.d(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                    this.a.i = 2;
                }
                z2 = false;
            }
        }
        if (z2) {
            dyqf dyqfVar = this.a.j;
            dymc dymcVar = dyqfVar.a;
            dyqe dyqeVar = new dyqe(dyqfVar);
            dege degeVar = dege.a;
            synchronized (((dywr) dymcVar).j) {
                dbsk.l(((dywr) dymcVar).h != null);
                if (((dywr) dymcVar).r) {
                    dypd.b(dyqeVar, degeVar, ((dywr) dymcVar).q());
                    return;
                }
                dypd dypdVar = ((dywr) dymcVar).q;
                if (dypdVar != null) {
                    nextLong = 0;
                    z = false;
                } else {
                    nextLong = ((dywr) dymcVar).e.nextLong();
                    dbtp a = dbtp.a();
                    a.f();
                    dypd dypdVar2 = new dypd(nextLong, a);
                    ((dywr) dymcVar).q = dypdVar2;
                    ((dywr) dymcVar).D.f++;
                    dypdVar = dypdVar2;
                }
                if (z) {
                    ((dywr) dymcVar).h.g(false, (int) (nextLong >>> 32), (int) nextLong);
                }
                synchronized (dypdVar) {
                    if (!dypdVar.d) {
                        dypdVar.c.put(dyqeVar, degeVar);
                        return;
                    }
                    Throwable th = dypdVar.e;
                    dypd.a(degeVar, th != null ? dypd.d(dyqeVar, th) : dypd.c(dyqeVar, dypdVar.f));
                }
            }
        }
    }
}
