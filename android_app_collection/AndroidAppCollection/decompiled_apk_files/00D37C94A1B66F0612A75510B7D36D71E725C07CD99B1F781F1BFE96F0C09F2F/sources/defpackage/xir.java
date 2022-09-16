package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: xir  reason: default package */
/* loaded from: classes4.dex */
public final class xir {
    public final wwe a;
    private final wkn b;
    private final aadd c;
    private final snc d;
    private final acrr e;
    private final ScheduledExecutorService f;
    private final AtomicInteger g = new AtomicInteger(0);

    public xir(wkn wknVar, aadd aaddVar, snc sncVar, acrr acrrVar, ScheduledExecutorService scheduledExecutorService, wwe wweVar) {
        this.b = wknVar;
        this.c = aaddVar;
        this.d = sncVar;
        this.e = acrrVar;
        this.f = scheduledExecutorService;
        this.a = wweVar;
    }

    public final void a(apbz apbzVar, xcb xcbVar, xdu xduVar, xci xciVar) {
        e(apbzVar, xduVar, xciVar, null, 0, null, null, xcbVar, false);
    }

    public final void b(apbz apbzVar, xcb xcbVar, xdu xduVar, boolean z) {
        e(apbzVar, xduVar, null, null, 0, null, null, xcbVar, z);
    }

    public final void c(apbz apbzVar, xdu xduVar, xci xciVar, xdj xdjVar, xcb xcbVar) {
        e(apbzVar, xduVar, xciVar, null, 0, null, xdjVar, xcbVar, false);
    }

    public final void d(apbz apbzVar, int i, List list, xcb xcbVar) {
        e(apbzVar, null, null, null, i, list, null, xcbVar, false);
    }

    public final void e(apbz apbzVar, xdu xduVar, xci xciVar, xeh xehVar, int i, List list, xdj xdjVar, xcb xcbVar, boolean z) {
        if (apbzVar == apbz.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED) {
            return;
        }
        long c = this.d.c();
        int incrementAndGet = this.g.incrementAndGet();
        wkn wknVar = this.b;
        if (!wknVar.m) {
            f(apbzVar, xduVar, xciVar, xehVar, i, list, xdjVar, xcbVar, z, c, incrementAndGet);
            return;
        }
        int i2 = wknVar.n;
        if (i2 > 0) {
            this.f.schedule(new xiq(this, apbzVar, xduVar, xciVar, xehVar, i, list, xdjVar, xcbVar, z, c, incrementAndGet, 1), i2, TimeUnit.MILLISECONDS);
        } else {
            this.f.execute(new xiq(this, apbzVar, xduVar, xciVar, xehVar, i, list, xdjVar, xcbVar, z, c, incrementAndGet));
        }
    }

    public final void f(apbz apbzVar, xdu xduVar, xci xciVar, xeh xehVar, int i, List list, xdj xdjVar, xcb xcbVar, boolean z, long j, int i2) {
        int i3;
        aoyz aoyzVar;
        apcv apcvVar;
        apdq a = xrz.a(this.c);
        if (a == null || !a.b) {
            apck a2 = apcl.a();
            a2.copyOnWrite();
            ((apcl) a2.instance).i(apbzVar);
            a2.copyOnWrite();
            ((apcl) a2.instance).h(i2);
            boolean d = this.a.d();
            aopa createBuilder = apcg.a.createBuilder();
            if (xduVar != null) {
                apdh a3 = wwe.a(xduVar, z, d);
                createBuilder.copyOnWrite();
                apcg apcgVar = (apcg) createBuilder.instance;
                a3.getClass();
                apcgVar.d = a3;
                apcgVar.b |= 2;
            }
            if (xciVar != null) {
                aopa f = wwe.f(xciVar.b, xciVar.c, xciVar.g.keySet());
                if (d) {
                    aopa createBuilder2 = apcx.a.createBuilder();
                    String str = xciVar.a;
                    createBuilder2.copyOnWrite();
                    apcx apcxVar = (apcx) createBuilder2.instance;
                    apcxVar.b |= 1;
                    apcxVar.c = str;
                    amuk amukVar = xciVar.d;
                    int i4 = ((amxx) amukVar).c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        apdi b = wwe.b((xek) amukVar.get(i5));
                        createBuilder2.copyOnWrite();
                        apcx apcxVar2 = (apcx) createBuilder2.instance;
                        b.getClass();
                        aopu aopuVar = apcxVar2.d;
                        if (!aopuVar.c()) {
                            apcxVar2.d = aopi.mutableCopy(aopuVar);
                        }
                        apcxVar2.d.add(b);
                    }
                    amuk amukVar2 = xciVar.e;
                    int i6 = ((amxx) amukVar2).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        apdi b2 = wwe.b((xek) amukVar2.get(i7));
                        createBuilder2.copyOnWrite();
                        apcx apcxVar3 = (apcx) createBuilder2.instance;
                        b2.getClass();
                        aopu aopuVar2 = apcxVar3.e;
                        if (!aopuVar2.c()) {
                            apcxVar3.e = aopi.mutableCopy(aopuVar2);
                        }
                        apcxVar3.e.add(b2);
                    }
                    amuk amukVar3 = xciVar.f;
                    int i8 = ((amxx) amukVar3).c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        apdi b3 = wwe.b((xek) amukVar3.get(i9));
                        createBuilder2.copyOnWrite();
                        apcx apcxVar4 = (apcx) createBuilder2.instance;
                        b3.getClass();
                        aopu aopuVar3 = apcxVar4.f;
                        if (!aopuVar3.c()) {
                            apcxVar4.f = aopi.mutableCopy(aopuVar3);
                        }
                        apcxVar4.f.add(b3);
                    }
                    apcx apcxVar5 = (apcx) createBuilder2.mo39build();
                    f.copyOnWrite();
                    apcy apcyVar = (apcy) f.instance;
                    apcy apcyVar2 = apcy.a;
                    apcxVar5.getClass();
                    apcyVar.d = apcxVar5;
                    apcyVar.b |= 2;
                }
                apcy apcyVar3 = (apcy) f.mo39build();
                createBuilder.copyOnWrite();
                apcg apcgVar2 = (apcg) createBuilder.instance;
                apcyVar3.getClass();
                apcgVar2.e = apcyVar3;
                apcgVar2.b |= 4;
            }
            if (xehVar != null) {
                aopa createBuilder3 = apdi.a.createBuilder();
                apce apceVar = (apce) wvv.a.get(Integer.valueOf(xehVar.a));
                if (apceVar == null) {
                    apceVar = apce.TRIGGER_CATEGORY_UNSPECIFIED;
                }
                createBuilder3.copyOnWrite();
                apdi apdiVar = (apdi) createBuilder3.instance;
                apdiVar.f = apceVar.k;
                apdiVar.b |= 2;
                apdi e = wwe.e(xehVar.b, createBuilder3);
                createBuilder.copyOnWrite();
                apcg apcgVar3 = (apcg) createBuilder.instance;
                e.getClass();
                apcgVar3.f = e;
                apcgVar3.b |= 8;
            }
            if (i != 0) {
                aopa createBuilder4 = apdb.a.createBuilder();
                createBuilder4.copyOnWrite();
                apdb apdbVar = (apdb) createBuilder4.instance;
                apdbVar.d = i - 1;
                apdbVar.b |= 2;
                if (d) {
                    aopa createBuilder5 = apda.a.createBuilder();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            apdh a4 = wwe.a((xdu) it.next(), false, true);
                            createBuilder5.copyOnWrite();
                            apda apdaVar = (apda) createBuilder5.instance;
                            a4.getClass();
                            aopu aopuVar4 = apdaVar.b;
                            if (!aopuVar4.c()) {
                                apdaVar.b = aopi.mutableCopy(aopuVar4);
                            }
                            apdaVar.b.add(a4);
                        }
                    }
                    i3 = 0;
                    apda apdaVar2 = (apda) createBuilder5.mo39build();
                    createBuilder4.copyOnWrite();
                    apdb apdbVar2 = (apdb) createBuilder4.instance;
                    apdaVar2.getClass();
                    apdbVar2.c = apdaVar2;
                    apdbVar2.b |= 1;
                } else {
                    i3 = 0;
                }
                apdb apdbVar3 = (apdb) createBuilder4.mo39build();
                createBuilder.copyOnWrite();
                apcg apcgVar4 = (apcg) createBuilder.instance;
                apdbVar3.getClass();
                apcgVar4.c = apdbVar3;
                apcgVar4.b |= 1;
            } else {
                i3 = 0;
            }
            if (xdjVar != null) {
                aopa createBuilder6 = apde.a.createBuilder();
                apcf apcfVar = xdjVar.a;
                createBuilder6.copyOnWrite();
                apde apdeVar = (apde) createBuilder6.instance;
                apdeVar.c = apcfVar.af;
                apdeVar.b |= 1;
                int i10 = xdjVar.b;
                createBuilder6.copyOnWrite();
                apde apdeVar2 = (apde) createBuilder6.instance;
                apdeVar2.b |= 2;
                apdeVar2.e = i10;
                if (d) {
                    amuk amukVar4 = xdjVar.c;
                    int i11 = ((amxx) amukVar4).c;
                    while (i3 < i11) {
                        ampq ampqVar = (ampq) amukVar4.get(i3);
                        if (ampqVar.h()) {
                            aopa createBuilder7 = apdd.a.createBuilder();
                            createBuilder7.copyOnWrite();
                            apdd apddVar = (apdd) createBuilder7.instance;
                            apddVar.b |= 1;
                            apddVar.d = true;
                            amuk<String> amukVar5 = ((xcd) ampqVar.c()).e;
                            ArrayList<apcc> arrayList = new ArrayList();
                            for (String str2 : amukVar5) {
                                if (wvv.e.containsKey(str2)) {
                                    arrayList.add((apcc) wvv.e.get(str2));
                                } else {
                                    String valueOf = String.valueOf(str2);
                                    wwf.a(null, valueOf.length() != 0 ? "Ping migration undefined key for macro logging map: ".concat(valueOf) : new String("Ping migration undefined key for macro logging map: "));
                                }
                            }
                            createBuilder7.copyOnWrite();
                            apdd apddVar2 = (apdd) createBuilder7.instance;
                            aopq aopqVar = apddVar2.c;
                            if (!aopqVar.c()) {
                                apddVar2.c = aopi.mutableCopy(aopqVar);
                            }
                            for (apcc apccVar : arrayList) {
                                apddVar2.c.g(apccVar.ac);
                            }
                            apdd apddVar3 = (apdd) createBuilder7.mo39build();
                            createBuilder6.copyOnWrite();
                            apde apdeVar3 = (apde) createBuilder6.instance;
                            apddVar3.getClass();
                            aopu aopuVar5 = apdeVar3.d;
                            if (!aopuVar5.c()) {
                                apdeVar3.d = aopi.mutableCopy(aopuVar5);
                            }
                            apdeVar3.d.add(apddVar3);
                        }
                        i3++;
                    }
                }
                apde apdeVar4 = (apde) createBuilder6.mo39build();
                createBuilder.copyOnWrite();
                apcg apcgVar5 = (apcg) createBuilder.instance;
                apdeVar4.getClass();
                apcgVar5.g = apdeVar4;
                apcgVar5.b |= 16;
            }
            if (xcbVar != null) {
                if (xcbVar == xcb.a) {
                    apcvVar = apcv.a;
                } else {
                    aopa createBuilder8 = apcv.a.createBuilder();
                    xdi xdiVar = xcbVar.b;
                    aopa createBuilder9 = apdc.a.createBuilder();
                    if (!TextUtils.isEmpty(xdiVar.a)) {
                        String str3 = xdiVar.a;
                        createBuilder9.copyOnWrite();
                        apdc apdcVar = (apdc) createBuilder9.instance;
                        apdcVar.b |= 1;
                        apdcVar.c = str3;
                    }
                    boolean z2 = xdiVar.b;
                    createBuilder9.copyOnWrite();
                    apdc apdcVar2 = (apdc) createBuilder9.instance;
                    apdcVar2.b |= 2;
                    apdcVar2.d = z2;
                    boolean z3 = xdiVar.c;
                    createBuilder9.copyOnWrite();
                    apdc apdcVar3 = (apdc) createBuilder9.instance;
                    apdcVar3.b |= 4;
                    apdcVar3.e = z3;
                    boolean z4 = xdiVar.d;
                    createBuilder9.copyOnWrite();
                    apdc apdcVar4 = (apdc) createBuilder9.instance;
                    apdcVar4.b |= 8;
                    apdcVar4.f = z4;
                    wzw wzwVar = xcbVar.c;
                    aopa createBuilder10 = apci.a.createBuilder();
                    if (!TextUtils.isEmpty(wzwVar.a)) {
                        String str4 = wzwVar.a;
                        createBuilder10.copyOnWrite();
                        apci apciVar = (apci) createBuilder10.instance;
                        apciVar.b |= 1;
                        apciVar.c = str4;
                    }
                    createBuilder8.copyOnWrite();
                    apcv apcvVar2 = (apcv) createBuilder8.instance;
                    apdc apdcVar5 = (apdc) createBuilder9.mo39build();
                    apdcVar5.getClass();
                    apcvVar2.c = apdcVar5;
                    apcvVar2.b |= 1;
                    createBuilder8.copyOnWrite();
                    apcv apcvVar3 = (apcv) createBuilder8.instance;
                    apci apciVar2 = (apci) createBuilder10.mo39build();
                    apciVar2.getClass();
                    apcvVar3.d = apciVar2;
                    apcvVar3.b |= 4;
                    apcvVar = (apcv) createBuilder8.mo39build();
                }
                createBuilder.copyOnWrite();
                apcg apcgVar6 = (apcg) createBuilder.instance;
                apcvVar.getClass();
                apcgVar6.h = apcvVar;
                apcgVar6.b |= 32;
            }
            a2.copyOnWrite();
            ((apcl) a2.instance).g((apcg) createBuilder.mo39build());
            if (xciVar != null && (aoyzVar = (aoyz) xciVar.h.f()) != null && (aoyzVar.b & 1) != 0) {
                aoob aoobVar = aoyzVar.c;
                a2.copyOnWrite();
                ((apcl) a2.instance).j(aoobVar);
            }
            apcl apclVar = (apcl) a2.mo39build();
            acrr acrrVar = this.e;
            aopa createBuilder11 = apcm.a.createBuilder();
            createBuilder11.copyOnWrite();
            apcm apcmVar = (apcm) createBuilder11.instance;
            apclVar.getClass();
            apcmVar.c = apclVar;
            apcmVar.b = 11;
            arrf a5 = arrh.a();
            a5.copyOnWrite();
            ((arrh) a5.instance).bW((apcm) createBuilder11.mo39build());
            acrrVar.f((arrh) a5.mo39build(), j);
        }
    }
}
