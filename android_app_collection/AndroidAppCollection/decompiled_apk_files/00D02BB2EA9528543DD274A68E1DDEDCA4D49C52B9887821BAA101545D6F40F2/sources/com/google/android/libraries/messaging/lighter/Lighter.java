package com.google.android.libraries.messaging.lighter;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Lighter {
    private static Lighter o;
    public final ctss a;
    public final ctog b;
    public final Context c;
    public final csuu d;
    public final csuk e;
    public final csug f;
    public final csuf g;
    public final csud h;
    public final csum i;
    public final csui j;
    public final csuy k;
    public final csuz l;
    public final csue m;
    public final ctcu n;
    private final csst optionalLighterPackageInitializer;
    private final csvf p;
    private final Map<String, ctuk> q;
    private final ctgc r;
    private final csuj s;
    private final cusx t;
    private final ctir u;

    private Lighter(aqan aqanVar, Context context, csuo csuoVar, csup csupVar, csun csunVar, csuh csuhVar, cuim cuimVar, csst csstVar, dbsg dbsgVar, dbsg dbsgVar2, dbsg dbsgVar3, Map map) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = csvf.a(applicationContext);
        cxju.b(applicationContext);
        ctir ctirVar = new ctir(new ctgd(applicationContext, dbsgVar));
        this.u = ctirVar;
        ctip ctipVar = new ctip(applicationContext, ctirVar);
        this.t = ctipVar;
        if (cstf.a == null) {
            cstf.a = new cstf(map);
        }
        ctog a = ctog.a(applicationContext);
        this.b = a;
        ctgc ctgcVar = new ctgc(applicationContext, a, dbsgVar3, dbsgVar2);
        this.r = ctgcVar;
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        ctmp.a();
        ctss ctssVar = new ctss(applicationContext, aqanVar, new ctmu(), cuimVar);
        this.a = ctssVar;
        ctud ctudVar = new ctud(applicationContext, ctssVar, csvf.a(applicationContext));
        cttz cttzVar = new cttz(ctssVar, applicationContext, hashMap);
        cttq cttqVar = new cttq(ctssVar, applicationContext);
        cttp cttpVar = new cttp(ctssVar);
        ctue ctueVar = new ctue(ctssVar);
        cszz cszzVar = new cszz(applicationContext, ctgcVar, cttzVar);
        this.s = cszzVar;
        ctdr ctdrVar = new ctdr(applicationContext, hashMap, ctudVar, ctipVar, csuoVar, csunVar, a, csuhVar);
        csyc csycVar = new csyc(ctgcVar);
        ctct ctctVar = new ctct(applicationContext, cttzVar, ctgcVar, csycVar, hashMap, csuhVar, a, cszzVar);
        csyb csybVar = new csyb(applicationContext, ctgcVar);
        csxv csxvVar = new csxv(applicationContext, ctgcVar, cttqVar, a);
        ctdz ctdzVar = new ctdz(applicationContext, cttzVar, ctgcVar);
        csxc csxcVar = new csxc(applicationContext, ctgcVar, cttpVar, new ctiq(applicationContext), ctdzVar);
        ctda ctdaVar = new ctda(applicationContext, cttzVar, ctipVar, ctgcVar, csycVar, csuhVar, hashMap);
        csyr csyrVar = new csyr(applicationContext, ctgcVar);
        ctssVar.e = ctdrVar;
        ctssVar.f = csupVar;
        ctsy ctsyVar = new ctsy(ctssVar, applicationContext, a, hashMap);
        if (csxj.a == null) {
            csxj.a = new csxj(applicationContext, ctgcVar, ctsyVar, csxcVar, ctctVar, a);
        }
        cstl.a("LitBstrpCntrl");
        if (csxj.a == null) {
            cstl.a("LitBstrpCntrl");
            throw new IllegalArgumentException("No instance available, please call initialize first.");
        }
        csxj csxjVar = csxj.a;
        this.m = csxjVar;
        ctdrVar.k = csxjVar;
        ctdrVar.h = ctctVar;
        ctctVar.p = csxvVar;
        ctctVar.q = csxcVar;
        ctctVar.r = ctdzVar;
        csybVar.c = ctctVar;
        ctdaVar.i = ctctVar;
        ctdaVar.j = csxcVar;
        ctdaVar.l = ctctVar;
        ctdaVar.m = ctctVar;
        ctdaVar.k = ctdzVar;
        this.d = ctdrVar;
        this.e = ctctVar;
        this.f = csybVar;
        this.g = csxvVar;
        this.h = csxcVar;
        this.i = ctdaVar;
        this.j = csyrVar;
        this.n = new ctcu();
        this.k = ctdzVar;
        this.l = new cteb(ctueVar);
        this.optionalLighterPackageInitializer = csstVar;
        dcdc<csss> dcdcVar = csstVar.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            csss csssVar = dcdcVar.get(i);
            for (ctuk ctukVar : csssVar.b(this.a, this.r, this.c)) {
                this.q.put(ctukVar.b(), ctukVar);
            }
            this.p.b(csssVar.a());
        }
        deew.h(this.d.c(), new dbrn(this) { // from class: cssr
            private final Lighter a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                String str;
                String str2;
                Lighter lighter = this.a;
                dcdc dcdcVar2 = (dcdc) obj;
                Context context2 = lighter.c;
                cstq.a();
                coxs.a(context2).a(csvx.a(context2), csvu.a(context2).b, new String[]{"LIGHTER_ANDROID"}, null).m(csvy.a);
                Iterator<E> it = dcdcVar2.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        str2 = str;
                        break;
                    }
                    ctyy ctyyVar = (ctyy) it.next();
                    if (ContactId.ContactType.EMAIL.equals(ctyyVar.b().e().c())) {
                        str2 = ctyyVar.b().e().a();
                        break;
                    }
                }
                if (str2 != null) {
                    str = str2;
                }
                if (str.length() == 0) {
                    new String("Retrieve experiment configurations for: ");
                }
                cstl.a("PhenotypeApiImplV12");
                new csvz(coxs.a(context2), csvx.a(context2)).g(str);
                lighter.e.l(dcdcVar2);
                lighter.b.a = cswe.a(context2).av.f().booleanValue();
                return null;
            }
        }, dege.a);
    }

    public static synchronized Lighter a(aqan aqanVar, Context context, csuo csuoVar, csup csupVar, csun csunVar, csuh csuhVar, cuim cuimVar, csst csstVar, Map<Integer, String> map) {
        Lighter b;
        synchronized (Lighter.class) {
            b = b(aqanVar, context, csuoVar, csupVar, csunVar, csuhVar, cuimVar, csstVar, dbpy.a, dbpy.a, dbpy.a, dbpy.a, dbpy.a, map);
        }
        return b;
    }

    private static synchronized Lighter b(aqan aqanVar, Context context, csuo csuoVar, csup csupVar, csun csunVar, csuh csuhVar, cuim cuimVar, csst csstVar, dbsg dbsgVar, dbsg dbsgVar2, dbsg dbsgVar3, dbsg<ctir> dbsgVar4, dbsg dbsgVar5, Map<Integer, String> map) {
        Lighter lighter;
        synchronized (Lighter.class) {
            if (o == null) {
                Lighter lighter2 = new Lighter(aqanVar, context, csuoVar, csupVar, csunVar, csuhVar, cuimVar, csstVar, dbsgVar, dbsgVar2, dbsgVar5, map);
                o = lighter2;
                csst csstVar2 = lighter2.optionalLighterPackageInitializer;
                if (csstVar2 != null) {
                    dcdc<csss> dcdcVar = csstVar2.a;
                }
            }
            lighter = o;
        }
        return lighter;
    }

    protected final void finalize() {
        deew.h(this.d.c(), new dbrn(this) { // from class: cssp
            private final Lighter a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Lighter lighter = this.a;
                cstl.a("Lighter");
                lighter.e.o((dcdc) obj);
                return null;
            }
        }, dege.a);
    }
}
