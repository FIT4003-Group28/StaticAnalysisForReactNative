package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.EdgeKeyInfo;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: czdw  reason: default package */
/* loaded from: classes5.dex */
public abstract class czdw {
    public abstract czdx a();

    public abstract void b(AffinityContext affinityContext);

    public abstract void c(long j);

    public abstract void d(long j);

    public abstract void e();

    public abstract void f(cyes cyesVar);

    public abstract void g(boolean z);

    public abstract void h(dcet<String, InAppNotificationTarget> dcetVar);

    public abstract void i(Map<String, cywi> map);

    public abstract void j(dcdc<cywi> dcdcVar);

    public abstract void k(long j);

    public abstract void l(dcdn<cygg, cywi> dcdnVar);

    public abstract void m(dcdc<cyxj> dcdcVar);

    public abstract void n(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(cyes cyesVar) {
        g(true);
        n(2);
        b(AffinityContext.b);
        m(dcdc.e());
        j(dcdc.e());
        f(cyesVar);
        h(dcay.a);
        l(dcmn.a);
        i(dcmn.a);
        k(0L);
        d(0L);
        c(0L);
    }

    public final void p(cylc cylcVar, final ClientConfigInternal clientConfigInternal, Locale locale) {
        final cyuj cyujVar = new cyuj(locale);
        dcdc<cywi> z = dcbg.b(cylcVar.a).s(new dbrn(clientConfigInternal, cyujVar) { // from class: czdu
            private final ClientConfigInternal a;
            private final cyuj b;

            {
                this.a = clientConfigInternal;
                this.b = cyujVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cymy.a((cymg) obj, this.a, 6, this.b);
            }
        }).z();
        cyla cylaVar = cylcVar.b;
        if (cylaVar == null) {
            cylaVar = cyla.c;
        }
        dcdc<cyxj> z2 = dcbg.b(cylaVar.b).s(czdv.a).z();
        g(false);
        cyci b = AffinityContext.b();
        cyla cylaVar2 = cylcVar.b;
        if (cylaVar2 == null) {
            cylaVar2 = cyla.c;
        }
        ((cybt) b).a = Integer.valueOf(cylaVar2.a);
        b(b.a());
        m(z2);
        j(z);
        dceq a = dcet.a();
        HashMap d = dcjz.d();
        HashMap d2 = dcjz.d();
        for (cywi cywiVar : z) {
            if (cyxk.a(cywiVar.a())) {
                if (dybx.a.a().k()) {
                    if (cywiVar.c().isEmpty()) {
                        for (cyvy cyvyVar : cywiVar.p()) {
                            cygg j = cyvyVar.j();
                            if (!d.containsKey(j)) {
                                d.put(j, cywiVar);
                            }
                        }
                    } else {
                        for (cyvy cyvyVar2 : cywiVar.p()) {
                            cygg j2 = cyvyVar2.j();
                            if (cyvyVar2.c().d() != duej.PROFILE || !cyvyVar2.c().a()) {
                                dcdc<EdgeKeyInfo> dcdcVar = cyvyVar2.c().o;
                                int size = dcdcVar.size();
                                int i = 0;
                                while (i < size) {
                                    int i2 = i + 1;
                                    if (dcdcVar.get(i).b() != duej.PROFILE) {
                                        i = i2;
                                    }
                                }
                            }
                            d.put(j2, cywiVar);
                        }
                    }
                } else {
                    for (cyvy cyvyVar3 : cywiVar.p()) {
                        cygg j3 = cyvyVar3.j();
                        if (!d.containsKey(j3)) {
                            d.put(j3, cywiVar);
                        }
                    }
                }
                for (InAppNotificationTarget inAppNotificationTarget : cywiVar.q()) {
                    if (inAppNotificationTarget.SA() == cyep.IN_APP_PHONE || inAppNotificationTarget.g() == 2) {
                        a.b(ContactMethodField.l(cyfj.PHONE_NUMBER, inAppNotificationTarget.a().toString()), inAppNotificationTarget);
                    }
                    dcdc<ContactMethodField> d3 = inAppNotificationTarget.d();
                    int size2 = d3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a.b(d3.get(i3).k(), inAppNotificationTarget);
                    }
                    a.b(inAppNotificationTarget.k(), inAppNotificationTarget);
                }
            } else if (cywiVar.a() == cyxk.GROUP && !dbsj.d(cywiVar.m())) {
                String m = cywiVar.m();
                if (!d2.containsKey(m)) {
                    d2.put(m, cywiVar);
                }
            }
        }
        h(a.a());
        l(dcdn.r(d));
        i(dcdn.r(d2));
        d(clientConfigInternal.o);
        c(clientConfigInternal.p);
        e();
    }
}
