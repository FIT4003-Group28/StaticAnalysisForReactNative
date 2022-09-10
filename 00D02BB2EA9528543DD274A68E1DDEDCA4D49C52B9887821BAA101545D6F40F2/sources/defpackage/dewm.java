package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: dewm  reason: default package */
/* loaded from: classes6.dex */
public final class dewm implements dewz {
    private final dzsj<CronetEngine> a;

    static {
        dcrc.b("xRPC");
    }

    public dewm(dzsj<CronetEngine> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dewz
    public final dyeu a(dewy dewyVar) {
        czhz.c();
        try {
            dyjw a = dyjw.a(dewyVar.l(), dewyVar.m(), this.a.a());
            a.r(dewyVar.f() != null ? dewyVar.f() : new CronetEngine.Builder(dewyVar.a()).getDefaultUserAgent());
            a.m(dewyVar.d());
            a.k(dewyVar.c());
            a.j(dewyVar.k(), TimeUnit.MILLISECONDS);
            ScheduledExecutorService e = dewyVar.e();
            if (e != null) {
                a.a = e;
            }
            dewp h = dewyVar.h();
            if (h != null) {
                dcpd<dewo> it = h.a().iterator();
                while (it.hasNext()) {
                    if (it.next().a() != null) {
                        a.l();
                        throw null;
                    }
                }
            }
            Integer i = dewyVar.i();
            if (i != null) {
                int intValue = i.intValue();
                a.f = true;
                a.g = intValue;
            }
            Integer j = dewyVar.j();
            if (j != null) {
                int intValue2 = j.intValue();
                a.d = true;
                a.e = intValue2;
            }
            return dyfa.a(a.c(), new csag(csan.c(dewyVar.g())));
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            dywh a2 = dywh.a(dewyVar.l(), dewyVar.m());
            a2.m(dewyVar.d());
            a2.d = dewyVar.c();
            a2.k(dewyVar.c());
            a2.j(dewyVar.k(), TimeUnit.MILLISECONDS);
            ScheduledExecutorService e2 = dewyVar.e();
            if (e2 != null) {
                a2.e = e2;
            }
            if (dewyVar.f() != null) {
                a2.r(dewyVar.f());
            }
            return dyfa.a(a2.c(), csan.c(dewyVar.g()));
        }
    }
}
