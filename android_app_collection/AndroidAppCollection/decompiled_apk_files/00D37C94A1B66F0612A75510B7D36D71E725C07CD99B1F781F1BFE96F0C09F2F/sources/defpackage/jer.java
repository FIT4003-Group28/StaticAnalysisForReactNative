package defpackage;

import android.content.Context;
import android.text.Spanned;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: jer  reason: default package */
/* loaded from: classes3.dex */
public final class jer implements ahcz, ahcf {
    public final dt a;
    public final jdy b;
    public final srv c;
    public final srr d;
    private final Context e;
    private final ahcu f;
    private final jnn g;
    private final fcu h;
    private final azqb i;
    private final azqb j;
    private final fbv k;
    private final jgn l;
    private final fcl m;
    private final zey n;
    private final axxh o;
    private final axxa p;

    public jer(Context context, dt dtVar, ahcu ahcuVar, jnn jnnVar, fcu fcuVar, azqb azqbVar, azqb azqbVar2, fbv fbvVar, jgn jgnVar, jdy jdyVar, srv srvVar, srr srrVar, fcl fclVar, zey zeyVar, axxh axxhVar, axxa axxaVar) {
        this.e = context;
        this.a = dtVar;
        this.f = ahcuVar;
        this.g = jnnVar;
        this.h = fcuVar;
        this.i = azqbVar;
        this.j = azqbVar2;
        this.k = fbvVar;
        this.l = jgnVar;
        this.b = jdyVar;
        this.c = srvVar;
        this.d = srrVar;
        this.m = fclVar;
        this.n = zeyVar;
        this.o = axxhVar;
        this.p = axxaVar;
    }

    public static void a(attp attpVar, acti actiVar) {
        if (actiVar == null) {
            return;
        }
        actiVar.n(new acte(actj.DOWNLOAD_QUALITY_SELECTION_DIALOG));
        ahdq.g(attpVar, actiVar);
    }

    private final void e(apy apyVar, ankt anktVar, zdt zdtVar, zdt zdtVar2) {
        Boolean bool;
        aqxe aqxeVar = this.o.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45354988L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354988L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354988L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            ylx.p(apyVar, anktVar, zdtVar, zdtVar2);
        } else {
            ylx.n(apyVar, anktVar, zdtVar, zdtVar2);
        }
    }

    private final void t(String str, String str2, attp attpVar, acti actiVar) {
        boolean z;
        arag aragVar;
        arag aragVar2;
        ahcu ahcuVar = this.f;
        List<aqnl> c = agqb.c(attpVar);
        amuk s = ahcuVar.a.s();
        ArrayList arrayList = new ArrayList();
        for (aqnl aqnlVar : c) {
            if ((aqnlVar.b & 2) != 0) {
                attl b = attl.b(aqnlVar.d);
                if (b == null) {
                    b = attl.UNKNOWN_FORMAT_TYPE;
                }
                if (s.contains(b)) {
                    arrayList.add(aqnlVar);
                }
            }
        }
        Collections.sort(arrayList, ahcuVar.a.e());
        amuk o = amuk.o(arrayList);
        aopu aopuVar = attpVar.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = aopuVar.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            attm attmVar = (attm) it.next();
            String str3 = null;
            if ((attmVar.b & 2) != 0) {
                aragVar = attmVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b2 = ajgl.b(aragVar);
            String obj = b2 != null ? b2.toString() : null;
            String str4 = attmVar.c;
            if (!amps.e(obj) && !amps.e(str4)) {
                aopa createBuilder = aqnh.a.createBuilder();
                createBuilder.copyOnWrite();
                aqnh aqnhVar = (aqnh) createBuilder.instance;
                obj.getClass();
                aqnhVar.b |= 2;
                aqnhVar.d = obj;
                createBuilder.copyOnWrite();
                aqnh aqnhVar2 = (aqnh) createBuilder.instance;
                str4.getClass();
                aqnhVar2.b = 1 | aqnhVar2.b;
                aqnhVar2.c = str4;
                if ((attmVar.b & 4) != 0) {
                    aragVar2 = attmVar.e;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                Spanned b3 = ajgl.b(aragVar2);
                if (b3 != null) {
                    str3 = b3.toString();
                }
                if (!amps.e(str3)) {
                    createBuilder.copyOnWrite();
                    aqnh aqnhVar3 = (aqnh) createBuilder.instance;
                    str3.getClass();
                    aqnhVar3.b |= 4;
                    aqnhVar3.e = str3;
                }
                arrayList2.add((aqnh) createBuilder.mo39build());
            }
        }
        amuk o2 = amuk.o(arrayList2);
        if (!o.isEmpty()) {
            if (amps.e(str)) {
                c(attpVar, o, o2, actiVar, str, str2);
                a(attpVar, actiVar);
                return;
            }
            agqv e = ((agrf) this.i.get()).a().m().e(str);
            if (e == null || !e.s()) {
                z = false;
            }
            boolean g = this.m.g(emn.v(str));
            if ((!z && !g) || ((yrj) this.j.get()).o()) {
                this.f.c(this.a, attpVar, str, o, new jeq(this, attpVar, o2, actiVar, str, str2, o));
                return;
            }
            c(attpVar, o, o2, actiVar, str, str2);
            a(attpVar, actiVar);
        }
    }

    public final void b(amuk amukVar, amuk amukVar2, final acti actiVar, String str, String str2, boolean z, String str3, ampq ampqVar) {
        amuk amukVar3;
        ampq ampqVar2;
        amuk g;
        Boolean bool;
        int lastIndexOf = ((List) Collection.EL.stream(amukVar).map(ioc.n).collect(Collectors.toList())).lastIndexOf(attj.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) + 1;
        boolean z2 = false;
        if (this.k.b()) {
            ArrayList arrayList = new ArrayList(amukVar);
            amuf f = amuk.f();
            f.j(arrayList.subList(lastIndexOf, arrayList.size()));
            f.j(arrayList.subList(0, lastIndexOf));
            amukVar3 = f.g();
        } else {
            amukVar3 = amukVar;
        }
        attl v = this.g.v(attl.UNKNOWN_FORMAT_TYPE);
        Comparator comparator = ahdp.f;
        ampq ampqVar3 = amon.a;
        int size = amukVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ampqVar2 = ampqVar3;
                break;
            }
            aqnl aqnlVar = (aqnl) amukVar.get(i);
            attj b = attj.b(aqnlVar.f);
            if (b == null) {
                b = attj.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
            }
            if (b != attj.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) {
                if (v != attl.UNKNOWN_FORMAT_TYPE) {
                    attl b2 = attl.b(aqnlVar.d);
                    if (b2 == null) {
                        b2 = attl.UNKNOWN_FORMAT_TYPE;
                    }
                    if (v == b2) {
                        ampqVar2 = ampq.j(aqnlVar);
                        break;
                    }
                }
                if (!ampqVar3.h() || comparator.compare((aqnl) ampqVar3.c(), aqnlVar) > 0) {
                    ampqVar3 = ampq.j(aqnlVar);
                }
            }
            i++;
        }
        if (lastIndexOf == 0) {
            g = amuk.q();
        } else if (!this.k.b()) {
            amuf f2 = amuk.f();
            aopa createBuilder = aqnu.a.createBuilder();
            createBuilder.copyOnWrite();
            aqnu aqnuVar = (aqnu) createBuilder.instance;
            aqnuVar.c = 1;
            aqnuVar.b |= 1;
            createBuilder.copyOnWrite();
            aqnu aqnuVar2 = (aqnu) createBuilder.instance;
            aqnuVar2.b |= 2;
            aqnuVar2.d = lastIndexOf;
            f2.h((aqnu) createBuilder.mo39build());
            aopa createBuilder2 = aqnu.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqnu aqnuVar3 = (aqnu) createBuilder2.instance;
            aqnuVar3.c = 2;
            aqnuVar3.b |= 1;
            createBuilder2.copyOnWrite();
            aqnu aqnuVar4 = (aqnu) createBuilder2.instance;
            aqnuVar4.b = 2 | aqnuVar4.b;
            aqnuVar4.d = 0;
            f2.h((aqnu) createBuilder2.mo39build());
            g = f2.g();
        } else {
            amuf f3 = amuk.f();
            aopa createBuilder3 = aqnu.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqnu aqnuVar5 = (aqnu) createBuilder3.instance;
            aqnuVar5.c = 2;
            aqnuVar5.b |= 1;
            int size2 = amukVar.size();
            createBuilder3.copyOnWrite();
            aqnu aqnuVar6 = (aqnu) createBuilder3.instance;
            aqnuVar6.b = 2 | aqnuVar6.b;
            aqnuVar6.d = size2 - lastIndexOf;
            f3.h((aqnu) createBuilder3.mo39build());
            g = f3.g();
        }
        amuk amukVar4 = g;
        int a = this.k.a();
        if (!zew.y(this.e)) {
            if (amukVar2.isEmpty()) {
                aqxe aqxeVar = this.p.a.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                if (aqxeVar.a(45357967L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45357967L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45357967L);
                    if (aqxfVar.b == 1) {
                        z2 = ((Boolean) aqxfVar.c).booleanValue();
                    }
                    bool = Boolean.valueOf(z2);
                } else {
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    dt dtVar = this.a;
                    jgn jgnVar = this.l;
                    e(dtVar, jgnVar.c.qp(new jgm(jgnVar, amukVar3, ampqVar2, amukVar2, str, str2, z, str3, amukVar4, a, ampqVar)), hmv.r, new zdt() { // from class: jeo
                        @Override // defpackage.zdt
                        public final void a(Object obj) {
                            jer jerVar = jer.this;
                            acti actiVar2 = actiVar;
                            ampq ampqVar4 = (ampq) obj;
                            if (ampqVar4 == null || !ampqVar4.h()) {
                                return;
                            }
                            srr srrVar = jerVar.d;
                            awnn awnnVar = ((awsr) ampqVar4.c()).d;
                            if (awnnVar == null) {
                                awnnVar = awnn.a;
                            }
                            srp a2 = srq.a();
                            a2.a = actiVar2;
                            srrVar.g(awnnVar, 2, a2.a());
                        }
                    });
                    return;
                }
            }
            dt dtVar2 = this.a;
            jgn jgnVar2 = this.l;
            e(dtVar2, jgnVar2.c.qp(new jgm(jgnVar2, amukVar3, ampqVar2, amukVar2, str, str2, z, str3, amukVar4, a, ampqVar, 1)), hmv.q, new jen(this, 1));
            return;
        }
        dt dtVar3 = this.a;
        jgn jgnVar3 = this.l;
        e(dtVar3, jgnVar3.c.qp(new jgm(jgnVar3, amukVar3, ampqVar2, amukVar2, str, str2, z, str3, amukVar4, a, ampqVar, 2)), hmv.s, new jen(this));
    }

    public final void c(attp attpVar, amuk amukVar, amuk amukVar2, acti actiVar, String str, String str2) {
        ampq ampqVar;
        String a = this.n.a();
        if ((attpVar.b & 128) != 0 && attpVar.i.d() > 0) {
            ampqVar = ampq.j(attpVar.i);
        } else {
            ampqVar = amon.a;
        }
        ampq ampqVar2 = ampqVar;
        e(this.a, this.h.a(), new jep(this, amukVar, amukVar2, actiVar, str, str2, a, ampqVar2), new jep(this, amukVar, amukVar2, actiVar, str, str2, a, ampqVar2, 1));
    }

    @Override // defpackage.ahcf
    public final void d(attp attpVar, acti actiVar, ahdc ahdcVar, String str) {
        t(null, str, attpVar, actiVar);
    }

    @Override // defpackage.ahcz
    public final void f(ahda ahdaVar) {
        this.b.f(ahdaVar);
    }

    @Override // defpackage.ahcz
    public final void g(String str, attp attpVar, acti actiVar, ahdc ahdcVar) {
        t(str, null, attpVar, actiVar);
    }

    @Override // defpackage.ahcf
    public final void h(ahda ahdaVar) {
        this.b.h(ahdaVar);
    }

    @Override // defpackage.ahcf
    public final void i(ahda ahdaVar, ahbt ahbtVar) {
        this.b.i(ahdaVar, ahbtVar);
    }

    @Override // defpackage.ahcz
    public final void j(ahda ahdaVar) {
        this.b.j(ahdaVar);
    }

    @Override // defpackage.ahcz
    public final void k(ahda ahdaVar, String str, String str2) {
        this.b.k(ahdaVar, str, str2);
    }

    @Override // defpackage.ahcz
    public final void l(ahdb ahdbVar) {
        this.b.l(ahdbVar);
    }

    @Override // defpackage.ahcz
    public final void m(ahdb ahdbVar) {
        this.b.m(ahdbVar);
    }

    @Override // defpackage.ahcz
    public final void n(ahdb ahdbVar, String str) {
        this.b.n(ahdbVar, str);
    }

    @Override // defpackage.ahcz
    public final void o(ahdb ahdbVar) {
        this.b.o(ahdbVar);
    }

    @Override // defpackage.ahcf
    public final void p(ahda ahdaVar, ahbt ahbtVar) {
        this.b.i(ahdaVar, ahbtVar);
    }

    @Override // defpackage.ahcz
    public final void q(ahda ahdaVar) {
        this.b.q(ahdaVar);
    }

    @Override // defpackage.ahcf
    public final void r(ahaz ahazVar) {
        this.b.r(ahazVar);
    }

    @Override // defpackage.ahcf
    public final void s(ahay ahayVar) {
        this.b.s(ahayVar);
    }
}
