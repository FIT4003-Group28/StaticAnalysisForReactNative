package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: acrx  reason: default package */
/* loaded from: classes.dex */
public final class acrx implements afuc {
    public final acrf a;
    public final acrs b;
    public final afug c;
    public final ykw d;
    private final aazp e;
    private final afvn f;
    private final double g;
    private final boolean h;
    private final afso i;

    public acrx(acrf acrfVar, aazp aazpVar, acrs acrsVar, afvn afvnVar, afso afsoVar, ykw ykwVar, afug afugVar) {
        this.a = acrfVar;
        this.e = aazpVar;
        this.b = acrsVar;
        this.f = afvnVar;
        this.i = afsoVar;
        this.c = afugVar;
        this.d = ykwVar;
        this.h = afsoVar.l();
        this.g = afsoVar.a();
    }

    @Override // defpackage.afuc
    public final afta a() {
        return this.i.f();
    }

    @Override // defpackage.afuc
    public final String b() {
        return "event_logging";
    }

    @Override // defpackage.afuc
    public final void c(String str, aftv aftvVar, List list) {
        afvm d = this.f.d(str);
        acre acreVar = null;
        if (d == null) {
            d = afvl.a;
            e("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        afvm afvmVar = d;
        afuq afuqVar = aftvVar.a;
        d("Create requests for GEL!");
        aazo a = this.e.a(afvmVar, ahdq.i(afuqVar, this.f), afuqVar.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aopa aopaVar = (aopa) it.next();
            arrf a2 = arrh.a();
            try {
                a2.m29mergeFrom(((oro) aopaVar.instance).e, aoos.b());
                if (a2 == null) {
                    e("clientEvent is null", null);
                }
                a.d.add((arrh) a2.mo39build());
            } catch (aopx e) {
                e(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent"), e);
            }
        }
        d("Finish deserializing ClientEvent!");
        if (a.t()) {
            return;
        }
        if (this.b.a()) {
            acrf acrfVar = this.a;
            String string = acrfVar.a.getString(acrf.e(afvmVar), "no_event_id_found");
            long a3 = acrfVar.a(afvmVar);
            if (!string.equals("no_event_id_found") && a3 != -1) {
                acreVar = new acre(string, a3);
            }
            if (acreVar != null) {
                String str2 = acreVar.a;
                long j = acreVar.b;
                a.a = str2;
                a.b = j;
            }
        }
        a.c = aftvVar.b;
        d("Try to send GEL request!");
        this.e.b(a, new acrw(this, a, list, str, afuqVar, afvmVar));
    }

    public final void d(final String str) {
        ylx.i(afzk.a(), new ylw() { // from class: acrt
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                acrx acrxVar = acrx.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    String.valueOf(acrxVar.getClass().getCanonicalName()).length();
                    String.valueOf(str2).length();
                }
            }
        });
    }

    public final void e(String str, Exception exc) {
        if (exc != null) {
            zep.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            if (!this.h) {
                return;
            }
            String valueOf = String.valueOf(str);
            afus.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(valueOf) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.g);
            return;
        }
        zep.c("GEL_DELAYED_EVENT_DEBUG", str);
        if (!this.h) {
            return;
        }
        String valueOf2 = String.valueOf(str);
        afus.e(1, 12, valueOf2.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf2) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.g);
    }
}
