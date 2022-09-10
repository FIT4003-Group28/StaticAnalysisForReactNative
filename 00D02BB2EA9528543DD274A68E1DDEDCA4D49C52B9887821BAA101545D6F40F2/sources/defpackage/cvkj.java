package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvkj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvkj {
    public static final List<dsbc> u(List<cvkj> list) {
        ArrayList arrayList = new ArrayList();
        for (cvkj cvkjVar : list) {
            dsbb bZ = dsbc.e.bZ();
            String a = cvkjVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsbc dsbcVar = (dsbc) bZ.b;
            a.getClass();
            dsbcVar.a |= 1;
            dsbcVar.b = a;
            long longValue = cvkjVar.b().longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsbc dsbcVar2 = (dsbc) bZ.b;
            dsbcVar2.a |= 2;
            dsbcVar2.c = longValue;
            long longValue2 = cvkjVar.f().longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsbc dsbcVar3 = (dsbc) bZ.b;
            dsbcVar3.a |= 4;
            dsbcVar3.d = longValue2;
            arrayList.add(bZ.bK());
        }
        return arrayList;
    }

    public static final cvkj v(dscr dscrVar) {
        dbsk.s(dscrVar);
        cvka w = w();
        w.e(dscrVar.c);
        dsed dsedVar = dscrVar.e;
        if (dsedVar == null) {
            dsedVar = dsed.e;
        }
        int a = dsdh.a(dsedVar.a);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        w.i(a);
        dsed dsedVar2 = dscrVar.e;
        if (dsedVar2 == null) {
            dsedVar2 = dsed.e;
        }
        int a2 = dscl.a(dsedVar2.b);
        if (a2 == 0) {
            a2 = 1;
        }
        w.h(a2);
        dsed dsedVar3 = dscrVar.e;
        if (dsedVar3 == null) {
            dsedVar3 = dsed.e;
        }
        int a3 = dscj.a(dsedVar3.c);
        if (a3 == 0) {
            a3 = 1;
        }
        w.g(a3);
        dsed dsedVar4 = dscrVar.e;
        if (dsedVar4 == null) {
            dsedVar4 = dsed.e;
        }
        int a4 = dsdz.a(dsedVar4.d);
        if (a4 == 0) {
            a4 = 1;
        }
        w.k(a4);
        w.a = Long.valueOf(dscrVar.g);
        w.b = Long.valueOf(dscrVar.h);
        w.c(dscrVar.a == 12 ? (dsch) dscrVar.b : dsch.v);
        w.f(dscrVar.f);
        w.c = Long.valueOf(dscrVar.d);
        w.d = dscrVar.i;
        dsok dsokVar = dscrVar.j;
        if (dsokVar == null) {
            dsokVar = dsok.c;
        }
        w.e = dsokVar;
        w.f = dscrVar.k;
        w.g = Long.valueOf(dscrVar.l);
        int a5 = dsdl.a(dscrVar.m);
        if (a5 != 0) {
            i = a5;
        }
        w.j(i);
        dsfr dsfrVar = dscrVar.n;
        if (dsfrVar == null) {
            dsfrVar = dsfr.d;
        }
        w.i = dsfrVar;
        if (!TextUtils.isEmpty((dscrVar.a == 12 ? (dsch) dscrVar.b : dsch.v).m)) {
            w.d((dscrVar.a == 12 ? (dsch) dscrVar.b : dsch.v).m);
        }
        dsca dscaVar = (dscrVar.a == 12 ? (dsch) dscrVar.b : dsch.v).h;
        if (dscaVar == null) {
            dscaVar = dsca.h;
        }
        if (!dscaVar.e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            dsca dscaVar2 = (dscrVar.a == 12 ? (dsch) dscrVar.b : dsch.v).h;
            if (dscaVar2 == null) {
                dscaVar2 = dsca.h;
            }
            for (dsbi dsbiVar : dscaVar2.e) {
                dbsg<cvkg> k = cvkg.k(dsbiVar);
                if (k.a()) {
                    arrayList.add(k.b());
                }
            }
            w.b(arrayList);
        }
        return w.a();
    }

    public static cvka w() {
        cvka cvkaVar = new cvka();
        cvkaVar.c(dsch.v);
        cvkaVar.i(1);
        cvkaVar.h(1);
        cvkaVar.g(1);
        cvkaVar.k(1);
        cvkaVar.a = 0L;
        cvkaVar.b = 0L;
        cvkaVar.g = 0L;
        cvkaVar.c = 0L;
        cvkaVar.d("chime_default_group");
        cvkaVar.h = 0L;
        cvkaVar.f(Collections.emptyList());
        cvkaVar.b(Collections.emptyList());
        cvkaVar.j(1);
        return cvkaVar;
    }

    public abstract String a();

    public abstract Long b();

    public abstract Long c();

    public abstract dsch d();

    public abstract List<dscq> e();

    public abstract Long f();

    @dzsi
    public abstract String g();

    @dzsi
    public abstract dsok h();

    @dzsi
    public abstract String i();

    public abstract String j();

    public abstract Long k();

    public abstract Long l();

    @dzsi
    public abstract dsfr m();

    public abstract List<cvkg> n();

    public abstract cvka o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t();
}
