package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: cysw  reason: default package */
/* loaded from: classes5.dex */
final class cysw extends cyvd<czfo, cyzo> {
    final /* synthetic */ cywa a;
    final /* synthetic */ cytq b;
    final /* synthetic */ cyem c;
    final /* synthetic */ cytb d;

    public cysw(cytb cytbVar, cywa cywaVar, cytq cytqVar, cyem cyemVar) {
        this.d = cytbVar;
        this.a = cywaVar;
        this.b = cytqVar;
        this.c = cyemVar;
    }

    @Override // defpackage.cyvd
    public final /* bridge */ /* synthetic */ void a(czfo czfoVar, cyzo cyzoVar) {
        czdc czdeVar;
        int i;
        dbtp dbtpVar;
        int i2;
        dbtp dbtpVar2;
        double d;
        dcdc<cyzl> dcdcVar;
        int i3;
        cyvt g;
        int i4;
        czfo czfoVar2 = czfoVar;
        cyzo cyzoVar2 = cyzoVar;
        dbtp b = this.d.j.b();
        cydx c = cydx.c(cyer.DEVICE_CONTACTS, cyzoVar2.a());
        cydx c2 = cydx.c(cyer.PEOPLE_API_TOP_N, czfoVar2.e());
        if (c2 != null) {
            c = c2;
        }
        cyyz cyyzVar = new cyyz(this.d.a, czfoVar2.b());
        dcdc<cywi> c3 = czfoVar2.c();
        int size = c3.size();
        int i5 = 0;
        while (i5 < size) {
            Iterator<InAppNotificationTarget> it = c3.get(i5).q().iterator();
            while (true) {
                i4 = i5 + 1;
                if (it.hasNext()) {
                    it.next().b().i = dcyn.a;
                }
            }
            i5 = i4;
        }
        boolean a = this.d.h.J.a(cyfe.b);
        ArrayList arrayList = new ArrayList(cyzoVar2.b().size());
        dcdc<cyzl> b2 = cyzoVar2.b();
        int size2 = b2.size();
        int i6 = 0;
        while (i6 < size2) {
            cyzl cyzlVar = b2.get(i6);
            if (a) {
                dcdg p = dcdn.p();
                dcdc<cyvy> e = cyzlVar.e();
                int size3 = e.size();
                int i7 = 0;
                while (i7 < size3) {
                    dcdc<cyzl> dcdcVar2 = b2;
                    cyvy cyvyVar = e.get(i7);
                    p.f(cyvyVar, Double.valueOf(cyyzVar.a(cyvyVar.g(), false)));
                    i7++;
                    b2 = dcdcVar2;
                    size2 = size2;
                }
                dcdcVar = b2;
                i3 = size2;
                g = cyzlVar.h(p.b());
            } else {
                dcdcVar = b2;
                i3 = size2;
                g = cyzlVar.g();
            }
            g.c = cyyzVar.a(cyzlVar.f(), true);
            arrayList.add(g);
            i6++;
            b2 = dcdcVar;
            size2 = i3;
        }
        int size4 = arrayList.size();
        int i8 = 0;
        while (i8 < size4) {
            cyvt cyvtVar = (cyvt) arrayList.get(i8);
            dccx F = dcdc.F();
            for (cyvi cyviVar : cyvtVar.j) {
                dcdc<InAppNotificationTarget> b3 = this.d.b(cyviVar);
                if (b3 != null) {
                    int size5 = b3.size();
                    int i9 = 0;
                    while (i9 < size5) {
                        InAppNotificationTarget inAppNotificationTarget = b3.get(i9);
                        if (a) {
                            i2 = size4;
                            dbtpVar2 = b;
                            d = cyviVar.b().i;
                        } else {
                            i2 = size4;
                            dbtpVar2 = b;
                            d = cyvtVar.c;
                        }
                        inAppNotificationTarget.b().i = d;
                        i9++;
                        b = dbtpVar2;
                        size4 = i2;
                    }
                    i = size4;
                    dbtpVar = b;
                    F.i(b3);
                } else {
                    i = size4;
                    dbtpVar = b;
                }
                if (!a) {
                    cyviVar.b().i = cyvtVar.c;
                }
                b = dbtpVar;
                size4 = i;
            }
            cyvtVar.g = F.f();
            i8++;
            size4 = size4;
        }
        dbtp dbtpVar3 = b;
        ArrayList arrayList2 = new ArrayList(czfoVar2.c().size());
        if (this.a.a() != cygp.COALESCED) {
            for (cywi cywiVar : cyua.d(czfoVar2.c())) {
                arrayList2.add(cywiVar.t(true));
            }
        } else {
            dcdc<cywi> c4 = czfoVar2.c();
            int size6 = c4.size();
            for (int i10 = 0; i10 < size6; i10++) {
                arrayList2.add(c4.get(i10).t(false));
            }
        }
        cytb cytbVar = this.d;
        cywa cywaVar = this.a;
        AffinityContext a2 = czfoVar2.a();
        int ordinal = cywaVar.a().ordinal();
        if (ordinal == 1) {
            czdeVar = new czde(a2);
        } else if (ordinal != 2) {
            String valueOf = String.valueOf(cywaVar.a());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("No mixer defined for ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } else {
            czdeVar = new czdk(a2);
        }
        cytbVar.f = czdeVar;
        LinkedList<cyvs> a3 = this.d.f.a(arrayList2, arrayList);
        cypg.a(this.d.j, 18, dbtpVar3, this.b.k);
        boolean b4 = dyaq.b() ? this.b.b(this.c) : false;
        cyem cyemVar = this.c;
        cytn i11 = cyto.i();
        cyte cyteVar = (cyte) i11;
        cyteVar.a = czfoVar2.a();
        i11.e(this.d.c(a3, this.b, this.a, true, false, cyer.PEOPLE_API_TOP_N));
        cyteVar.c = czfoVar2.f();
        cyteVar.b = c;
        i11.f(b4);
        cyteVar.d = czfoVar2.g();
        i11.d(czfoVar2.h());
        i11.g(4);
        cyemVar.a(i11.h());
    }
}
