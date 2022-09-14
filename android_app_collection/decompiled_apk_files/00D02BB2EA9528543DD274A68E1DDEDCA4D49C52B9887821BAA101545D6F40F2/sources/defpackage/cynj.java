package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cynj  reason: default package */
/* loaded from: classes5.dex */
public final class cynj implements cylx {
    public static final /* synthetic */ int a = 0;
    private final dewl b;

    static {
        TimeUnit.MINUTES.toMillis(60L);
    }

    public cynj(dewl dewlVar) {
        this.b = dewlVar;
    }

    static dhef l(cyip cyipVar, cylu cyluVar) {
        dhee bZ = dhef.e.bZ();
        String str = cyipVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((dhef) bZ.b).a = str;
        dhfu bZ2 = dhfv.b.bZ();
        String str2 = cyipVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        str2.getClass();
        ((dhfv) bZ2.b).a = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhfv bK = bZ2.bK();
        bK.getClass();
        ((dhef) bZ.b).b = bK;
        int i = cyipVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dhef) bZ.b).c = i;
        dhdc y = y(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        y.getClass();
        ((dhef) bZ.b).d = y;
        return bZ.bK();
    }

    static dhdw m(cyjv cyjvVar, cylu cyluVar) {
        dhdv bZ = dhdw.g.bZ();
        dsrj<String> dsrjVar = cyjvVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhdw dhdwVar = (dhdw) bZ.b;
        dsrj<String> dsrjVar2 = dhdwVar.a;
        if (!dsrjVar2.a()) {
            dhdwVar.a = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dhdwVar.a);
        dhfg x = x(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        x.getClass();
        ((dhdw) bZ.b).d = x;
        dhdg q = q(cyluVar.d().r, true);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        q.getClass();
        ((dhdw) bZ.b).c = q;
        dhfp p = p(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        p.getClass();
        ((dhdw) bZ.b).b = p;
        dhex r = r(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        r.getClass();
        ((dhdw) bZ.b).f = r;
        if (cyluVar.d().M) {
            dhdt bZ2 = dhdu.a.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dhdu) bZ2.b).c = true;
            dhdu bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bK.getClass();
            ((dhdw) bZ.b).e = bK;
        } else if (cyluVar.d().L) {
            dhdt bZ3 = dhdu.a.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dhdu) bZ3.b).b = true;
            dhdu bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bK2.getClass();
            ((dhdw) bZ.b).e = bK2;
        }
        return bZ.bK();
    }

    static dhek n(cyko cykoVar, cylu cyluVar) {
        dcen N = dcep.N();
        N.b(dhdf.INCLUDE_EMAIL_LOOKUP_KEY);
        dhei bZ = dhek.h.bZ();
        int i = cykoVar.a;
        int i2 = 5;
        int i3 = 3;
        if (i == 0) {
            i3 = 2;
        } else if (i != 1) {
            i3 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i3 == 0) {
            i3 = 1;
        }
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        int i4 = i3 - 2;
        if (i4 == 1) {
            i2 = 4;
        } else if (i4 != 2) {
            String valueOf = String.valueOf(Integer.toString(cykn.a(i3)));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("No mapping for ");
            sb.append(valueOf);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dhek) bZ.b).b = dhej.a(i2);
        dsrj<String> dsrjVar = cykoVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhek dhekVar = (dhek) bZ.b;
        dsrj<String> dsrjVar2 = dhekVar.a;
        if (!dsrjVar2.a()) {
            dhekVar.a = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, dhekVar.a);
        dhfg x = x(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        x.getClass();
        ((dhek) bZ.b).c = x;
        N.i(cyluVar.d().r);
        dhdg q = q(N.f(), dyat.a.a().c());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        q.getClass();
        ((dhek) bZ.b).f = q;
        dhfp p = p(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        p.getClass();
        ((dhek) bZ.b).d = p;
        dhex r = r(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        r.getClass();
        ((dhek) bZ.b).e = r;
        if (cyluVar.d().M) {
            dhdt bZ2 = dhdu.a.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dhdu) bZ2.b).c = true;
            dhdu bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bK.getClass();
            ((dhek) bZ.b).g = bK;
        } else if (cyluVar.d().L) {
            dhdt bZ3 = dhdu.a.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dhdu) bZ3.b).b = true;
            dhdu bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bK2.getClass();
            ((dhek) bZ.b).g = bK2;
        }
        return bZ.bK();
    }

    static dher o(cykv cykvVar, cylu cyluVar) {
        dheq bZ = dher.g.bZ();
        dhfa bZ2 = dhfb.b.bZ();
        int i = cykvVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dhfb) bZ2.b).a = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhfb bK = bZ2.bK();
        bK.getClass();
        ((dher) bZ.b).b = bK;
        dhfs bZ3 = dhft.b.bZ();
        String name = cyluVar.d().h.name();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        name.getClass();
        ((dhft) bZ3.b).a = name;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhft bK2 = bZ3.bK();
        bK2.getClass();
        ((dher) bZ.b).a = bK2;
        dhfg x = x(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        x.getClass();
        ((dher) bZ.b).d = x;
        dhdg q = q(cyluVar.d().r, true);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        q.getClass();
        ((dher) bZ.b).e = q;
        dhfp p = p(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        p.getClass();
        ((dher) bZ.b).c = p;
        dhex r = r(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        r.getClass();
        ((dher) bZ.b).f = r;
        return bZ.bK();
    }

    static dhfp p(cylu cyluVar) {
        dhfl bZ;
        if (dyaw.a.a().i()) {
            ClientConfigInternal d = cyluVar.d();
            dcep<cydt> dcepVar = d.l;
            dsqf bZ2 = dsqg.b.bZ();
            bZ2.a(cyoc.c);
            if (dcepVar.contains(cydt.EMAIL)) {
                if (d.s) {
                    bZ2.a(cyoc.e);
                }
                bZ2.a(cyoc.d);
            }
            if (dcepVar.contains(cydt.PHONE_NUMBER)) {
                bZ2.a(cyoc.f);
            }
            if (dcepVar.contains(cydt.IN_APP_NOTIFICATION_TARGET)) {
                bZ2.a(cyoc.g);
            }
            bZ = dhfp.d.bZ();
            dsqg bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bK.getClass();
            ((dhfp) bZ.b).a = bK;
        } else if (!dyaw.g()) {
            bZ = dhfp.d.bZ();
            dsqg dsqgVar = cyoc.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsqgVar.getClass();
            ((dhfp) bZ.b).a = dsqgVar;
        } else {
            bZ = dhfp.d.bZ();
            dsqg dsqgVar2 = cyoc.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsqgVar2.getClass();
            ((dhfp) bZ.b).a = dsqgVar2;
        }
        dcep<dhfr> dcepVar2 = cyluVar.d().K;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhfp dhfpVar = (dhfp) bZ.b;
        dsrf dsrfVar = dhfpVar.b;
        if (!dsrfVar.a()) {
            dhfpVar.b = dsqw.cg(dsrfVar);
        }
        for (dhfr dhfrVar : dcepVar2) {
            dhfpVar.b.h(dhfrVar.a());
        }
        if (dyaw.a.a().a()) {
            dhfm bZ3 = dhfo.b.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dhfo) bZ3.b).a = dhfn.a(4);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhfo bK2 = bZ3.bK();
            bK2.getClass();
            ((dhfp) bZ.b).c = bK2;
        }
        return bZ.bK();
    }

    static dhdg q(Set<dhdf> set, boolean z) {
        dcen N = dcep.N();
        N.b(dhdf.FILTER_UNVERIFIED_PROFILE_FIELDS);
        if (dyat.a.a().k()) {
            N.b(dhdf.SIGN_PHOTOS_IANTS);
        }
        if (z) {
            N.b(dhdf.FILTER_UNUSED_FIELDS);
        }
        N.i(set);
        dhdd bZ = dhdg.b.bZ();
        dcep<dhdf> f = N.f();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhdg dhdgVar = (dhdg) bZ.b;
        dsrf dsrfVar = dhdgVar.a;
        if (!dsrfVar.a()) {
            dhdgVar.a = dsqw.cg(dsrfVar);
        }
        for (dhdf dhdfVar : f) {
            dhdgVar.a.h(dhdfVar.a());
        }
        return bZ.bK();
    }

    static dhex r(cylu cyluVar) {
        dheu bZ = dhex.c.bZ();
        dhew dhewVar = dhew.CORE_ID;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhex dhexVar = (dhex) bZ.b;
        dhewVar.getClass();
        dhexVar.b();
        dhexVar.b.h(dhewVar.a());
        if (!cyluVar.d().N.isEmpty()) {
            dcep<dhew> dcepVar = cyluVar.d().N;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhex dhexVar2 = (dhex) bZ.b;
            dhexVar2.b();
            for (dhew dhewVar2 : dcepVar) {
                dhexVar2.b.h(dhewVar2.a());
            }
        }
        if (cyluVar.d().s) {
            dhdq bZ2 = dhds.b.bZ();
            dhdr dhdrVar = dhdr.SMIME_EMAIL_CERTIFICATE;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhds dhdsVar = (dhds) bZ2.b;
            dhdrVar.getClass();
            dsrf dsrfVar = dhdsVar.a;
            if (!dsrfVar.a()) {
                dhdsVar.a = dsqw.cg(dsrfVar);
            }
            dhdsVar.a.h(dhdrVar.a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhds bK = bZ2.bK();
            bK.getClass();
            ((dhex) bZ.b).a = bK;
        }
        return bZ.bK();
    }

    public static int s(Throwable th) {
        if (th instanceof TimeoutException) {
            return 1;
        }
        if (th instanceof InterruptedException) {
            return 2;
        }
        if (th instanceof CancellationException) {
            return 3;
        }
        if (th instanceof ExecutionException) {
            if (th.getCause() == null) {
                return 9;
            }
            return s(th.getCause());
        }
        dyjb c = dyjb.c(th);
        dyiy dyiyVar = dyiy.OK;
        int ordinal = c.p.ordinal();
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 4) {
            return 1;
        }
        if (ordinal == 7 || ordinal == 16) {
            return 6;
        }
        if (ordinal == 13) {
            return 7;
        }
        return ordinal != 14 ? 4 : 8;
    }

    private static <ResponseT> dehn<ResponseT> t(dehn<ResponseT> dehnVar) {
        return deee.h(dehnVar, Throwable.class, cyni.a, dege.a);
    }

    private final dhfd u(cylu cyluVar) {
        dhfd dhfdVar = (dhfd) ((dhfd) dhfd.e(new dhfc(), this.b.a(dhgd.c))).g(dexa.a, dexa.c(cyluVar.b().a));
        return !dyaw.c().isEmpty() ? (dhfd) dhfdVar.g(dewv.a, dyaw.c()) : dhfdVar;
    }

    private final dhec v(cylu cyluVar) {
        dhec dhecVar = (dhec) ((dhec) dhec.e(new dheb(), this.b.a(dhgb.g))).g(dexa.a, dexa.c(cyluVar.b().a));
        return !dyaw.c().isEmpty() ? (dhec) dhecVar.g(dewv.a, dyaw.c()) : dhecVar;
    }

    private final dshx w(cylu cyluVar) {
        dshx dshxVar = (dshx) ((dshx) ((dshx) dshx.e(new dshw(), this.b.a(dsiy.e))).f(dyaw.e(), TimeUnit.MILLISECONDS)).g(dexa.a, dexa.c(cyluVar.b().a));
        return !dyaw.b().isEmpty() ? (dshx) dshxVar.g(dewv.a, dyaw.b()) : dshxVar;
    }

    private static dhfg x(cylu cyluVar) {
        dhff bZ = dhfg.c.bZ();
        dhdc y = y(cyluVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        y.getClass();
        ((dhfg) bZ.b).a = y;
        if (cyluVar.d().M) {
            dhey bZ2 = dhez.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dhez) bZ2.b).b = true;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhez bK = bZ2.bK();
            bK.getClass();
            ((dhfg) bZ.b).b = bK;
        }
        if (dyaw.g()) {
            dhey bZ3 = dhez.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ((dhez) bZ3.b).a = true;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhez bK2 = bZ3.bK();
            bK2.getClass();
            ((dhfg) bZ.b).b = bK2;
        }
        return bZ.bK();
    }

    private static dhdc y(cylu cyluVar) {
        dhda bZ = dhdc.d.bZ();
        String a2 = cyluVar.c().a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a2.getClass();
        ((dhdc) bZ.b).a = a2;
        String b = cyluVar.c().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dhdc) bZ.b).b = b;
        ((dhdc) bZ.b).c = dhdb.a(4);
        return bZ.bK();
    }

    private static final <ResponseT> ResponseT z(dehn<ResponseT> dehnVar) {
        try {
            return dehnVar.get(dyaw.e(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new cylw(s(e), e);
        }
    }

    @Override // defpackage.cylx
    public final cyit a(cyip cyipVar, cylu cyluVar) {
        dhef l = l(cyipVar, cyluVar);
        cylv cylvVar = new cylv();
        return cyob.a((dheh) z(((dhfd) u(cyluVar).g(cylv.a, cylvVar)).b(l)), cylvVar);
    }

    @Override // defpackage.cylx
    public final dehn<cyit> b(cyip cyipVar, cylu cyluVar) {
        dhef l = l(cyipVar, cyluVar);
        final cylv cylvVar = new cylv();
        return deew.h(t(((dhfd) u(cyluVar).g(cylv.a, cylvVar)).b(l)), new dbrn(cylvVar) { // from class: cync
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cyob.a((dheh) obj, this.a);
            }
        }, dege.a);
    }

    @Override // defpackage.cylx
    public final cyka c(cyjv cyjvVar, cylu cyluVar) {
        dhdw m = m(cyjvVar, cyluVar);
        cylv cylvVar = new cylv();
        return cyob.b((dhdy) z(((dhec) v(cyluVar).g(cylv.a, cylvVar)).b(m)), cylvVar);
    }

    @Override // defpackage.cylx
    public final dehn<cyka> d(cyjv cyjvVar, cylu cyluVar) {
        dhdw m = m(cyjvVar, cyluVar);
        final cylv cylvVar = new cylv();
        return deew.h(t(((dhec) v(cyluVar).g(cylv.a, cylvVar)).b(m)), new dbrn(cylvVar) { // from class: cynd
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cyob.b((dhdy) obj, this.a);
            }
        }, dege.a);
    }

    @Override // defpackage.cylx
    public final cykt e(cyko cykoVar, cylu cyluVar) {
        dhek n = n(cykoVar, cyluVar);
        cylv cylvVar = new cylv();
        return cyob.c((dhep) z(((dhec) v(cyluVar).g(cylv.a, cylvVar)).d(n)), cylvVar);
    }

    @Override // defpackage.cylx
    public final dehn<cykt> f(cyko cykoVar, cylu cyluVar) {
        dhek n = n(cykoVar, cyluVar);
        final cylv cylvVar = new cylv();
        return deew.h(t(((dhec) v(cyluVar).g(cylv.a, cylvVar)).d(n)), new dbrn(cylvVar) { // from class: cyne
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cyob.c((dhep) obj, this.a);
            }
        }, dege.a);
    }

    @Override // defpackage.cylx
    public final cylc g(cykv cykvVar, cylu cyluVar) {
        dher o = o(cykvVar, cyluVar);
        cylv cylvVar = new cylv();
        return cyob.d((dhet) z(((dhec) v(cyluVar).g(cylv.a, cylvVar)).c(o)), cylvVar);
    }

    @Override // defpackage.cylx
    public final dehn<cylc> h(cykv cykvVar, cylu cyluVar) {
        dher o = o(cykvVar, cyluVar);
        final cylv cylvVar = new cylv();
        return deew.h(t(((dhec) v(cyluVar).g(cylv.a, cylvVar)).c(o)), new dbrn(cylvVar) { // from class: cynf
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cyob.d((dhet) obj, this.a);
            }
        }, dege.a);
    }

    @Override // defpackage.cylx
    public final dehn<cyli> i(dsgf dsgfVar, cylu cyluVar) {
        final cylv cylvVar = new cylv();
        dshx dshxVar = (dshx) w(cyluVar).g(cylv.a, cylvVar);
        dyeu dyeuVar = dshxVar.a;
        dyib<dsgf, dsgh> dyibVar = dshy.a;
        if (dyibVar == null) {
            synchronized (dshy.class) {
                dyibVar = dshy.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("peoplestack.PeopleStackAutocompleteService", "Autocomplete");
                    c.e = true;
                    c.a = dyyq.b(dsgf.e);
                    c.b = dyyq.b(dsgh.c);
                    dyibVar = c.a();
                    dshy.a = dyibVar;
                }
            }
        }
        return deew.h(t(dyzf.d(dyeuVar.a(dyibVar, dshxVar.b), dsgfVar)), new dbrn(cylvVar) { // from class: cyng
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cylv cylvVar2 = this.a;
                dsgh dsghVar = (dsgh) obj;
                int i = cynj.a;
                cylh bZ = cyli.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dsghVar.getClass();
                ((cyli) bZ.b).a = dsghVar;
                cylg a2 = cylvVar2.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a2.getClass();
                ((cyli) bZ.b).b = a2;
                return bZ.bK();
            }
        }, dege.a);
    }

    @Override // defpackage.cylx
    public final dehn<dsim> j(dsik dsikVar, cylu cyluVar) {
        dshx dshxVar = (dshx) w(cyluVar).g(cylv.a, new cylv());
        dyeu dyeuVar = dshxVar.a;
        dyib<dsik, dsim> dyibVar = dshy.b;
        if (dyibVar == null) {
            synchronized (dshy.class) {
                dyibVar = dshy.b;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("peoplestack.PeopleStackAutocompleteService", "Warmup");
                    c.e = true;
                    c.a = dyyq.b(dsik.d);
                    c.b = dyyq.b(dsim.a);
                    dyibVar = c.a();
                    dshy.b = dyibVar;
                }
            }
        }
        return t(dyzf.d(dyeuVar.a(dyibVar, dshxVar.b), dsikVar));
    }

    @Override // defpackage.cylx
    public final dehn<cylk> k(dshn dshnVar, cylu cyluVar) {
        final cylv cylvVar = new cylv();
        dshx dshxVar = (dshx) w(cyluVar).g(cylv.a, cylvVar);
        dyeu dyeuVar = dshxVar.a;
        dyib<dshn, dsht> dyibVar = dshy.c;
        if (dyibVar == null) {
            synchronized (dshy.class) {
                dyibVar = dshy.c;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("peoplestack.PeopleStackAutocompleteService", "Lookup");
                    c.e = true;
                    c.a = dyyq.b(dshn.e);
                    c.b = dyyq.b(dsht.b);
                    dyibVar = c.a();
                    dshy.c = dyibVar;
                }
            }
        }
        return deew.h(t(dyzf.d(dyeuVar.a(dyibVar, dshxVar.b), dshnVar)), new dbrn(cylvVar) { // from class: cynh
            private final cylv a;

            {
                this.a = cylvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cylv cylvVar2 = this.a;
                dsht dshtVar = (dsht) obj;
                int i = cynj.a;
                cylj bZ = cylk.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dshtVar.getClass();
                ((cylk) bZ.b).a = dshtVar;
                cylg a2 = cylvVar2.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a2.getClass();
                ((cylk) bZ.b).b = a2;
                return bZ.bK();
            }
        }, dege.a);
    }
}
