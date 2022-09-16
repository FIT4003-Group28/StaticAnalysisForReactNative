package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ufb  reason: default package */
/* loaded from: classes4.dex */
public final class ufb implements ufa, ujj {
    static final long a = TimeUnit.HOURS.toMillis(24);
    private final ujk b;
    private final ucs c;
    private final Set d;
    private final udc e;
    private final ues f;

    public ufb(ujk ujkVar, ucs ucsVar, udc udcVar, ues uesVar, Set set) {
        this.b = ujkVar;
        this.c = ucsVar;
        this.e = udcVar;
        this.f = uesVar;
        this.d = set;
    }

    private final void c(ucp ucpVar) {
        uep a2 = this.f.a(aojw.PERIODIC_LOG);
        if (ucpVar != null) {
            a2.d(ucpVar);
        }
        a2.i();
    }

    @Override // defpackage.ufa
    public final void a() {
        if (this.b.d()) {
            uev.e("ChimePeriodicTaskManager", "Periodic Task already scheduled.", new Object[0]);
            return;
        }
        try {
            this.b.a(null, 7, this, new Bundle());
        } catch (uji unused) {
            uev.g("ChimePeriodicTaskManager", "Unable to schedule periodic task.", new Object[0]);
        }
    }

    @Override // defpackage.ujj
    public final long d() {
        return a;
    }

    @Override // defpackage.ujj
    public final uby e(Bundle bundle) {
        List<ucp> c = this.c.c();
        if (!c.isEmpty()) {
            for (ucp ucpVar : c) {
                c(ucpVar);
                b(ucpVar);
            }
        } else {
            c(null);
        }
        b(null);
        return uby.a;
    }

    @Override // defpackage.ujj
    public final String f() {
        return "PERIODIC_TASK";
    }

    @Override // defpackage.ujj
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ujj
    public final /* synthetic */ void i() {
    }

    private final void b(ucp ucpVar) {
        String str = ucpVar == null ? null : ucpVar.b;
        long b = axqe.a.get().b();
        if (axqe.a.get().c() && b > 0) {
            udc udcVar = this.e;
            vfm b2 = vfm.b();
            b2.c("thread_stored_timestamp");
            b2.d("<= ?", Long.valueOf(udcVar.b.c() - b));
            udcVar.a.e(str, amuk.r(b2.a()));
            amzs it = ((amyg) this.d).iterator();
            while (it.hasNext()) {
                ((uih) it.next()).c();
            }
        }
        long a2 = axqe.a.get().a();
        if (a2 > 0) {
            udc udcVar2 = this.e;
            vfm b3 = vfm.b();
            b3.c("_id");
            b3.c(" NOT IN (SELECT ");
            b3.c("_id");
            b3.c(" FROM ");
            b3.c("threads");
            b3.c(" ORDER BY ");
            b3.c("last_notification_version");
            b3.c(" DESC");
            b3.d(" LIMIT ?)", Long.valueOf(a2));
            udcVar2.a.e(str, amuk.r(b3.a()));
        }
    }
}
