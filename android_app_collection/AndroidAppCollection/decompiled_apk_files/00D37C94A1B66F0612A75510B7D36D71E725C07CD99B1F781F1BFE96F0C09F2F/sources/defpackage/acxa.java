package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acxa  reason: default package */
/* loaded from: classes.dex */
public final class acxa implements Runnable {
    final /* synthetic */ acxb a;

    public acxa(acxb acxbVar) {
        this.a = acxbVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        String str = acxb.a;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("Could not get available Media Routes for starting background playback: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
    }

    public final void b(List list, acxk acxkVar) {
        bhc bhcVar;
        String str = acxkVar.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bhcVar = null;
                break;
            }
            bhcVar = (bhc) it.next();
            if (adgl.c(str, bhcVar.c)) {
                break;
            }
        }
        if (bhcVar == null) {
            this.a.e.postDelayed(this, 300L);
            return;
        }
        if (!str.equals(bhcVar.c)) {
            String str2 = acxb.a;
            String.format("routeId mismatch: requested=%s matched=%s", str, bhcVar.c);
        }
        acxb acxbVar = this.a;
        acxbVar.h.g(acxbVar.s);
        if (((Boolean) this.a.j.get()).booleanValue()) {
            this.a.c(1);
        } else if (this.a.c.U(bhcVar, acxkVar.d)) {
        } else {
            zep.c(acxb.a, "failed selecting route");
            this.a.c(2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final acxk acxkVar = this.a.n;
        if (acxkVar == null) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(acxkVar.c);
        long c = this.a.f.c();
        acxb acxbVar = this.a;
        if (c - acxbVar.o >= millis) {
            zep.m(acxb.a, "timed out waiting for device");
            this.a.c(0);
        } else if (acxbVar.m.N) {
            ylx.k(acxbVar.d.b(), this.a.l, acsn.f, new ylw() { // from class: acwz
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    acxa.this.b((List) obj, acxkVar);
                }
            });
        } else {
            b(acxbVar.d.a(), acxkVar);
        }
    }
}
