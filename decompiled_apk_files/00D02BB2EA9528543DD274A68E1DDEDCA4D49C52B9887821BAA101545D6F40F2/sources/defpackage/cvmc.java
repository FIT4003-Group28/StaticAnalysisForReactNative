package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvmc  reason: default package */
/* loaded from: classes5.dex */
public final class cvmc implements cvmb, cvle {
    public static final long a = TimeUnit.HOURS.toMillis(24);
    public final cvnp b;
    private final cvkf c;
    private final cvkk d;
    private final dxio<Boolean> e;
    private final dxio<Long> f;
    private final Set<cvpv> g;
    private final cvlr h;

    public cvmc(cvnp cvnpVar, cvkf cvkfVar, cvkk cvkkVar, cvlr cvlrVar, Set set, dxio dxioVar, dxio dxioVar2) {
        this.b = cvnpVar;
        this.c = cvkfVar;
        this.d = cvkkVar;
        this.h = cvlrVar;
        this.g = set;
        this.e = dxioVar;
        this.f = dxioVar2;
    }

    private final void a(@dzsi cvkc cvkcVar) {
        cvlp a2 = this.h.a(drwv.PERIODIC_LOG);
        if (cvkcVar != null) {
            a2.i(cvkcVar);
        }
        a2.a();
    }

    private final void b(@dzsi cvkc cvkcVar) {
        if (!this.e.a().booleanValue() || this.f.a().longValue() <= 0) {
            return;
        }
        this.d.k(cvkcVar == null ? null : cvkcVar.b(), this.f.a().longValue());
        dcpd it = ((dcnn) this.g).iterator();
        while (it.hasNext()) {
            ((cvpv) it.next()).c(cvkcVar, this.f.a().longValue());
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "PERIODIC_TASK";
    }

    @Override // defpackage.cvle
    public final cviw d(Bundle bundle) {
        List<cvkc> a2 = this.c.a();
        if (!a2.isEmpty()) {
            for (cvkc cvkcVar : a2) {
                a(cvkcVar);
                b(cvkcVar);
            }
        } else {
            a(null);
        }
        b(null);
        return cviw.a;
    }
}
