package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: acsc  reason: default package */
/* loaded from: classes.dex */
public final class acsc implements afuc {
    public final acrf a;
    public final acrs b;
    public final afug c;
    public final afta d = new acry();
    public final ykw e;
    private final aazp f;
    private final afvn g;
    private final boolean h;
    private final double i;

    public acsc(acrf acrfVar, acrs acrsVar, aazp aazpVar, afvn afvnVar, ykw ykwVar, afug afugVar) {
        acrfVar.getClass();
        this.a = acrfVar;
        aazpVar.getClass();
        this.f = aazpVar;
        acrsVar.getClass();
        this.b = acrsVar;
        afvnVar.getClass();
        this.g = afvnVar;
        afugVar.getClass();
        this.c = afugVar;
        ykwVar.getClass();
        this.e = ykwVar;
        this.h = afugVar.k();
        this.i = afugVar.a();
    }

    private final void d(String str, Exception exc) {
        if (exc != null) {
            zep.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            if (!this.h) {
                return;
            }
            afus.d(1, 12, str.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(str) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.i);
            return;
        }
        zep.c("GEL_DELAYED_EVENT_DEBUG", str);
        if (!this.h) {
            return;
        }
        afus.e(1, 12, str.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.i);
    }

    @Override // defpackage.afuc
    public final afta a() {
        return this.d;
    }

    @Override // defpackage.afuc
    public final String b() {
        return "event_logging_fixed_batch_retry";
    }

    @Override // defpackage.afuc
    public final void c(String str, aftv aftvVar, List list) {
        afvm d = this.g.d(str);
        if (d == null) {
            d = afvl.a;
            d("Cannot resolve Identity from identityId in EventLoggingRequestRetryDelayedEventDispatcher. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        afuq afuqVar = aftvVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aopa aopaVar = (aopa) it.next();
            aopa createBuilder = arrj.a.createBuilder();
            try {
                createBuilder.m29mergeFrom(((oro) aopaVar.instance).e, aoos.b());
                aazo a = this.f.a(d, ahdq.i(afuqVar, this.g), afuqVar.b);
                arrj arrjVar = (arrj) createBuilder.mo39build();
                if (arrjVar.f.size() != 0) {
                    a.d = arrjVar.f;
                }
                if ((arrjVar.b & 4) != 0) {
                    arrn arrnVar = arrjVar.e;
                    if (arrnVar == null) {
                        arrnVar = arrn.a;
                    }
                    a.a = arrnVar.c;
                    arrn arrnVar2 = arrjVar.e;
                    if (arrnVar2 == null) {
                        arrnVar2 = arrn.a;
                    }
                    a.b = arrnVar2.d;
                }
                if (!a.t()) {
                    this.f.b(a, new acsb(this, aopaVar, d));
                }
            } catch (aopx e) {
                d("EventLoggingRequestRetryDelayedEventDispatcher.dispatchEvents() could not deserialize EventLoggingRequest", e);
            }
        }
    }
}
