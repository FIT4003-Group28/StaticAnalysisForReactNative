package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adao  reason: default package */
/* loaded from: classes.dex */
public final class adao {
    public final snc b;
    public final acrr c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final double h;
    public final boolean i;
    public final vne j;
    private static final String k = zep.a("MDX.devicemanager");
    public static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long l = TimeUnit.DAYS.toMillis(31);

    public final void d(final adig adigVar) {
        ylx.j(this.j.b(new ampg() { // from class: adal
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                adao adaoVar = adao.this;
                adig adigVar2 = adigVar;
                awts awtsVar = (awts) obj;
                String g = adigVar2.g();
                awtp awtpVar = awtp.a;
                aoqp aoqpVar = awtsVar.c;
                if (aoqpVar.containsKey(g)) {
                    awtpVar = (awtp) aoqpVar.get(g);
                }
                aopa mo52toBuilder = awtpVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awtp awtpVar2 = (awtp) mo52toBuilder.instance;
                awtpVar2.b |= 1;
                awtpVar2.c = g;
                awtq awtqVar = awtpVar2.d;
                if (awtqVar == null) {
                    awtqVar = awtq.a;
                }
                aopa mo52toBuilder2 = awtqVar.mo52toBuilder();
                String b = adigVar2.b();
                mo52toBuilder2.copyOnWrite();
                awtq awtqVar2 = (awtq) mo52toBuilder2.instance;
                b.getClass();
                awtqVar2.b |= 8;
                awtqVar2.f = b;
                long c = adaoVar.b.c();
                mo52toBuilder2.copyOnWrite();
                awtq awtqVar3 = (awtq) mo52toBuilder2.instance;
                awtqVar3.b |= 32;
                awtqVar3.h = c;
                if (adigVar2 instanceof adhz) {
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar4 = (awtq) mo52toBuilder2.instance;
                    awtqVar4.g = 1;
                    awtqVar4.b |= 16;
                    String str = ((adhz) adigVar2).a.e;
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar5 = (awtq) mo52toBuilder2.instance;
                    str.getClass();
                    awtqVar5.b |= 2;
                    awtqVar5.d = str;
                } else if (adigVar2 instanceof adid) {
                    adid adidVar = (adid) adigVar2;
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar6 = (awtq) mo52toBuilder2.instance;
                    awtqVar6.g = 2;
                    awtqVar6.b |= 16;
                    String str2 = adidVar.d;
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar7 = (awtq) mo52toBuilder2.instance;
                    str2.getClass();
                    awtqVar7.b |= 4;
                    awtqVar7.e = str2;
                    String str3 = adidVar.g;
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar8 = (awtq) mo52toBuilder2.instance;
                    str3.getClass();
                    awtqVar8.b |= 2;
                    awtqVar8.d = str3;
                    String str4 = adidVar.f;
                    mo52toBuilder2.copyOnWrite();
                    awtq awtqVar9 = (awtq) mo52toBuilder2.instance;
                    str4.getClass();
                    awtqVar9.b |= 1;
                    awtqVar9.c = str4;
                    Map m = adidVar.m();
                    if (m != null) {
                        String str5 = (String) m.get("brand");
                        if (!TextUtils.isEmpty(str5)) {
                            mo52toBuilder2.copyOnWrite();
                            awtq awtqVar10 = (awtq) mo52toBuilder2.instance;
                            str5.getClass();
                            awtqVar10.b |= 128;
                            awtqVar10.j = str5;
                        }
                        String str6 = (String) m.get("model");
                        if (!TextUtils.isEmpty(str6)) {
                            mo52toBuilder2.copyOnWrite();
                            awtq awtqVar11 = (awtq) mo52toBuilder2.instance;
                            str6.getClass();
                            awtqVar11.b |= 256;
                            awtqVar11.k = str6;
                        }
                    }
                    if (!adidVar.o()) {
                        mo52toBuilder2.copyOnWrite();
                        awtq awtqVar12 = (awtq) mo52toBuilder2.instance;
                        awtqVar12.i = null;
                        awtqVar12.b &= -65;
                    } else {
                        awtu awtuVar = ((awtq) mo52toBuilder2.instance).i;
                        if (awtuVar == null) {
                            awtuVar = awtu.a;
                        }
                        aopa mo52toBuilder3 = awtuVar.mo52toBuilder();
                        String str7 = adidVar.e;
                        mo52toBuilder3.copyOnWrite();
                        awtu awtuVar2 = (awtu) mo52toBuilder3.instance;
                        str7.getClass();
                        awtuVar2.b = 1 | awtuVar2.b;
                        awtuVar2.c = str7;
                        String str8 = adidVar.j;
                        mo52toBuilder3.copyOnWrite();
                        awtu awtuVar3 = (awtu) mo52toBuilder3.instance;
                        str8.getClass();
                        awtuVar3.b |= 2;
                        awtuVar3.d = str8;
                        long j = adidVar.k;
                        mo52toBuilder3.copyOnWrite();
                        awtu awtuVar4 = (awtu) mo52toBuilder3.instance;
                        awtuVar4.b |= 4;
                        awtuVar4.e = j;
                        long c2 = adaoVar.b.c();
                        mo52toBuilder3.copyOnWrite();
                        awtu awtuVar5 = (awtu) mo52toBuilder3.instance;
                        awtuVar5.b |= 8;
                        awtuVar5.f = c2;
                        mo52toBuilder2.copyOnWrite();
                        awtq awtqVar13 = (awtq) mo52toBuilder2.instance;
                        awtu awtuVar6 = (awtu) mo52toBuilder3.mo39build();
                        awtuVar6.getClass();
                        awtqVar13.i = awtuVar6;
                        awtqVar13.b |= 64;
                    }
                }
                mo52toBuilder.copyOnWrite();
                awtp awtpVar3 = (awtp) mo52toBuilder.instance;
                awtq awtqVar14 = (awtq) mo52toBuilder2.mo39build();
                awtqVar14.getClass();
                awtpVar3.d = awtqVar14;
                awtpVar3.b |= 2;
                aopa mo52toBuilder4 = awtsVar.mo52toBuilder();
                mo52toBuilder4.bc(g, (awtp) mo52toBuilder.mo39build());
                return (awts) mo52toBuilder4.mo39build();
            }
        }, anjk.a), anjk.a, acsn.k);
    }

    public adao(vne vneVar, snc sncVar, acwu acwuVar, acrr acrrVar) {
        this.j = vneVar;
        this.b = sncVar;
        this.c = acrrVar;
        int i = acwuVar.aa;
        this.d = i > 0 ? i : l;
        this.e = acwuVar.aj > 0 ? TimeUnit.HOURS.toMillis(acwuVar.aj) : 0L;
        this.f = acwuVar.ak > 0 ? TimeUnit.HOURS.toMillis(acwuVar.ak) : 0L;
        this.g = Math.max(acwuVar.al, 0L);
        this.h = Math.max(acwuVar.am, 0.0d);
        this.i = acwuVar.at;
        ylx.j(vneVar.b(new ampg() { // from class: adak
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                Iterator it;
                int i2;
                adao adaoVar = adao.this;
                awts awtsVar = (awts) obj;
                long j = awtsVar.d;
                Map map = (Map) Collection.EL.stream(Collections.unmodifiableMap(awtsVar.c).entrySet()).sorted(utr.h).limit(100L).map(omr.q).collect(Collectors.toMap(omr.o, omr.p));
                aopa createBuilder = awts.a.createBuilder();
                createBuilder.copyOnWrite();
                ((awts) createBuilder.instance).a().putAll(map);
                long c = adaoVar.b.c();
                if (adaoVar.e > 0) {
                    if (adao.a + j >= c || c <= adaoVar.e) {
                        createBuilder.copyOnWrite();
                        awts awtsVar2 = (awts) createBuilder.instance;
                        awtsVar2.b |= 1;
                        awtsVar2.d = j;
                    } else {
                        java.util.Collection values = map.values();
                        long j2 = c - adaoVar.e;
                        atbj a2 = atbk.a();
                        Iterator it2 = values.iterator();
                        while (it2.hasNext()) {
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            for (awtt awttVar : Collections.unmodifiableMap(((awtp) it2.next()).e).values()) {
                                long j3 = c;
                                if (awttVar.e >= j2) {
                                    int e = awwc.e(awttVar.c);
                                    if (e == 0) {
                                        e = 1;
                                    }
                                    int i9 = e - 1;
                                    if (i9 == 1) {
                                        i2 = i8;
                                        i3++;
                                        int f = awwc.f(awttVar.d);
                                        if (f != 0 && f == 3) {
                                            i4++;
                                        }
                                    } else if (i9 == 2) {
                                        i2 = i8;
                                        i5++;
                                        int f2 = awwc.f(awttVar.d);
                                        if (f2 != 0 && f2 == 3) {
                                            i6++;
                                        }
                                    } else if (i9 == 3) {
                                        i7++;
                                        int f3 = awwc.f(awttVar.d);
                                        if (f3 != 0 && f3 == 3) {
                                            i8++;
                                        } else {
                                            i2 = i8;
                                        }
                                    }
                                    i8 = i2;
                                }
                                c = j3;
                            }
                            long j4 = c;
                            int i10 = i8;
                            aopa createBuilder2 = atbi.a.createBuilder();
                            if (i3 > 0) {
                                aopa createBuilder3 = atbl.a.createBuilder();
                                createBuilder3.copyOnWrite();
                                atbl atblVar = (atbl) createBuilder3.instance;
                                atblVar.c = 1;
                                it = it2;
                                atblVar.b |= 1;
                                createBuilder3.copyOnWrite();
                                atbl atblVar2 = (atbl) createBuilder3.instance;
                                atblVar2.b |= 2;
                                atblVar2.d = i3;
                                createBuilder3.copyOnWrite();
                                atbl atblVar3 = (atbl) createBuilder3.instance;
                                atblVar3.b |= 4;
                                atblVar3.e = i4;
                                createBuilder2.av((atbl) createBuilder3.mo39build());
                            } else {
                                it = it2;
                            }
                            if (i5 > 0) {
                                aopa createBuilder4 = atbl.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                atbl atblVar4 = (atbl) createBuilder4.instance;
                                atblVar4.c = 2;
                                atblVar4.b |= 1;
                                createBuilder4.copyOnWrite();
                                atbl atblVar5 = (atbl) createBuilder4.instance;
                                atblVar5.b |= 2;
                                atblVar5.d = i5;
                                createBuilder4.copyOnWrite();
                                atbl atblVar6 = (atbl) createBuilder4.instance;
                                atblVar6.b |= 4;
                                atblVar6.e = i6;
                                createBuilder2.av((atbl) createBuilder4.mo39build());
                            }
                            if (i7 > 0) {
                                aopa createBuilder5 = atbl.a.createBuilder();
                                createBuilder5.copyOnWrite();
                                atbl atblVar7 = (atbl) createBuilder5.instance;
                                atblVar7.c = 5;
                                atblVar7.b |= 1;
                                createBuilder5.copyOnWrite();
                                atbl atblVar8 = (atbl) createBuilder5.instance;
                                atblVar8.b |= 2;
                                atblVar8.d = i7;
                                createBuilder5.copyOnWrite();
                                atbl atblVar9 = (atbl) createBuilder5.instance;
                                atblVar9.b |= 4;
                                atblVar9.e = i10;
                                createBuilder2.av((atbl) createBuilder5.mo39build());
                            }
                            a2.copyOnWrite();
                            atbk.d((atbk) a2.instance, (atbi) createBuilder2.mo39build());
                            it2 = it;
                            c = j4;
                        }
                        long hours = TimeUnit.MILLISECONDS.toHours(adaoVar.e);
                        a2.copyOnWrite();
                        atbk.c((atbk) a2.instance, (int) hours);
                        acrr acrrVar2 = adaoVar.c;
                        arrf a3 = arrh.a();
                        a3.copyOnWrite();
                        ((arrh) a3.instance).cU((atbk) a2.mo39build());
                        acrrVar2.c((arrh) a3.mo39build());
                        createBuilder.copyOnWrite();
                        awts awtsVar3 = (awts) createBuilder.instance;
                        awtsVar3.b |= 1;
                        awtsVar3.d = c;
                    }
                }
                return (awts) createBuilder.mo39build();
            }
        }, anjk.a), anjk.a, acsn.j);
    }
}
