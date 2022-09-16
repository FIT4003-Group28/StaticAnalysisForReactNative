package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btwq  reason: default package */
/* loaded from: classes.dex */
public final class btwq extends btvp implements btvw {
    private final dxio<btvt> a;
    @dzsi
    private btwd d;
    @dzsi
    private btvv e;
    @dzsi
    private String h;
    private dspd b = dspd.b;
    private final Map<dvgn, dvgo> c = new HashMap();
    private volatile btwh f = new btwh(this);
    private final btvx g = new btvy(this);

    public btwq(@dzsi String str, dspd dspdVar, List<dvgo> list, dxio<btvt> dxioVar) {
        this.a = dxioVar;
        d(str, dspdVar, list);
    }

    private final synchronized btwd g() {
        if (this.d == null) {
            this.d = new btwd(btvn.a(this));
        }
        return this.d;
    }

    private final synchronized btvv h() {
        if (this.e == null) {
            this.e = new btvv(btvn.d(this));
        }
        return this.e;
    }

    private static boolean i(boolean z, boolean z2) {
        return z2 && z;
    }

    @Override // defpackage.btvw
    public final synchronized btvm a() {
        return this.f.a();
    }

    @Override // defpackage.btvw
    public final btvt b() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d(@dzsi String str, dspd dspdVar, List<dvgo> list) {
        boolean z;
        dvgn dvgnVar;
        boolean z2;
        dvgo dvgoVar;
        boolean f;
        boolean isEmpty = this.c.isEmpty();
        if (!dund.c.a.equals(list) || !dbsd.a(this.b, dspdVar)) {
            if (!dbsd.a(this.b, dspdVar)) {
                this.b = dspdVar;
                z = true;
            } else {
                z = false;
            }
            for (dvgo dvgoVar2 : list) {
                if ((dvgoVar2.a & 1) != 0) {
                    dvgnVar = dvgn.b(dvgoVar2.b);
                    if (dvgnVar == null) {
                        dvgnVar = dvgn.UNKNOWN_TYPE;
                    }
                } else {
                    dvgnVar = null;
                }
                if (btwf.a.contains(dvgnVar)) {
                    if ((dvgoVar2.a & 2) == 0 && this.c.containsKey(dvgnVar)) {
                    }
                    dvgn b = dvgn.b(dvgoVar2.b);
                    if (b == null) {
                        b = dvgn.UNKNOWN_TYPE;
                    }
                    if (b == dvgn.ENABLE_FEATURES && (dvgoVar = this.c.get(dvgn.ENABLE_FEATURES)) != null) {
                        dsqp dsqpVar = (dsqp) dvgoVar2.cu(5);
                        dsqpVar.bC(dvgoVar2);
                        dvgl dvglVar = (dvgl) dsqpVar;
                        dkiy dkiyVar = dvgoVar.e;
                        if (dkiyVar == null) {
                            dkiyVar = dkiy.bB;
                        }
                        dkiy dkiyVar2 = dvgoVar2.e;
                        if (dkiyVar2 == null) {
                            dkiyVar2 = dkiy.bB;
                        }
                        dsqp dsqpVar2 = (dsqp) dkiyVar2.cu(5);
                        dsqpVar2.bC(dkiyVar2);
                        dkin dkinVar = (dkin) dsqpVar2;
                        boolean i = i(dkiyVar.m, dkiyVar2.m);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar3 = (dkiy) dkinVar.b;
                        dkiyVar3.a |= 1;
                        dkiyVar3.m = i;
                        boolean i2 = i(dkiyVar.n, dkiyVar2.n);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar4 = (dkiy) dkinVar.b;
                        dkiyVar4.a |= 128;
                        dkiyVar4.n = i2;
                        boolean i3 = i(dkiyVar.o, dkiyVar2.o);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar5 = (dkiy) dkinVar.b;
                        dkiyVar5.a |= 256;
                        dkiyVar5.o = i3;
                        boolean i4 = i(dkiyVar.p, dkiyVar2.p);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar6 = (dkiy) dkinVar.b;
                        dkiyVar6.a |= 131072;
                        dkiyVar6.p = i4;
                        boolean i5 = i(dkiyVar.r, dkiyVar2.r);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar7 = (dkiy) dkinVar.b;
                        dkiyVar7.a |= 4194304;
                        dkiyVar7.r = i5;
                        boolean i6 = i(dkiyVar.q, dkiyVar2.q);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar8 = (dkiy) dkinVar.b;
                        dkiyVar8.a |= 262144;
                        dkiyVar8.q = i6;
                        boolean i7 = i(dkiyVar.s, dkiyVar2.s);
                        if (dkinVar.c) {
                            dkinVar.bF();
                            dkinVar.c = false;
                        }
                        dkiy dkiyVar9 = (dkiy) dkinVar.b;
                        dkiyVar9.a |= 8388608;
                        dkiyVar9.s = i7;
                        dkiy bK = dkinVar.bK();
                        if (dvglVar.c) {
                            dvglVar.bF();
                            dvglVar.c = false;
                        }
                        dvgo dvgoVar3 = (dvgo) dvglVar.b;
                        bK.getClass();
                        dvgoVar3.e = bK;
                        dvgoVar3.a |= 8;
                        dvgoVar2 = dvglVar.bK();
                    }
                    this.c.put(b, dvgoVar2);
                    int ordinal = b.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 21) {
                            if (ordinal == 142) {
                                this.f.b(dvgoVar2.c);
                            }
                        } else if (this.e != null) {
                            durx durxVar = dvgoVar2.q;
                            if (durxVar == null) {
                                durxVar = durx.b;
                            }
                            this.e = new btvv(durxVar);
                        }
                    } else if (this.d != null) {
                        dvek dvekVar = dvgoVar2.d;
                        if (dvekVar == null) {
                            dvekVar = dvek.br;
                        }
                        this.d = new btwd(dvekVar);
                    }
                    z2 = true;
                    z |= z2;
                }
                z2 = false;
                z |= z2;
            }
        } else {
            z = false;
        }
        f = f(str) | z;
        if (isEmpty) {
            dcpd<dvgn> it = btwf.a.iterator();
            while (it.hasNext()) {
                dvgn next = it.next();
                if (!this.c.containsKey(next)) {
                    dvgl bZ = dvgo.bZ.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvgo dvgoVar4 = (dvgo) bZ.b;
                    dvgoVar4.b = next.ct;
                    dvgoVar4.a |= 1;
                    this.c.put(next, bZ.bK());
                }
            }
        }
        notifyAll();
        return f;
    }

    @Override // defpackage.btvo
    public final void dumpInternal(String str, PrintWriter printWriter, List<dvgn> list) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dund e() {
        dunc bZ;
        bZ = dund.c.bZ();
        Collection<dvgo> values = this.c.values();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dund dundVar = (dund) bZ.b;
        dundVar.c();
        dsod.bv(values, dundVar.a);
        return bZ.bK();
    }

    final synchronized boolean f(@dzsi String str) {
        boolean z;
        if (dbsd.a(this.h, str)) {
            z = false;
        } else {
            this.h = str;
            z = true;
        }
        return z;
    }

    @Override // defpackage.btvo
    public final btvv getExternalInvocationParameters() {
        return h();
    }

    @Override // defpackage.btvo
    @dzsi
    public final synchronized String getGmmAccountId() {
        return this.h;
    }

    @Override // defpackage.btvo
    public final synchronized dvgo getGroup(dvgn dvgnVar) {
        return this.c.get(dvgnVar);
    }

    @Override // defpackage.btvo
    public final synchronized Map<dvgn, dvgo> getGroupMap() {
        return new HashMap(this.c);
    }

    @Override // defpackage.btvo
    public final btvx getLoggingInstrumentor() {
        return this.g;
    }

    @Override // defpackage.btvo
    public final btwd getNavigationParameters() {
        return g();
    }

    @Override // defpackage.btvo
    public final synchronized dspd getNextRequestToken() {
        return this.b;
    }

    @Override // defpackage.btvo
    public final synchronized List<dvgo> getParameterGroupsForRequest() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.c.size());
        for (dvgo dvgoVar : this.c.values()) {
            dvgl bZ = dvgo.bZ.bZ();
            if ((dvgoVar.a & 1) != 0) {
                dvgn b = dvgn.b(dvgoVar.b);
                if (b == null) {
                    b = dvgn.UNKNOWN_TYPE;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvgo dvgoVar2 = (dvgo) bZ.b;
                dvgoVar2.b = b.ct;
                dvgoVar2.a |= 1;
            }
            if ((dvgoVar.a & 2) != 0) {
                long j = dvgoVar.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dvgo dvgoVar3 = (dvgo) bZ.b;
                dvgoVar3.a |= 2;
                dvgoVar3.c = j;
            }
            arrayList.add(bZ.bK());
        }
        return arrayList;
    }

    @Override // defpackage.btvo
    public final synchronized List<dbsi<String, ?>> getParametersList() {
        dccx F;
        F = dcdc.F();
        F.h(dbsi.a("NavigationParameters", g()), dbsi.a("PaintParameters", btvn.e(this)));
        ArrayList arrayList = new ArrayList(this.c.keySet());
        Collections.sort(arrayList, new btwp());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dvgn dvgnVar = (dvgn) arrayList.get(i);
            F.g(dbsi.a(dvgnVar.name(), this.c.get(dvgnVar)));
        }
        return F.f();
    }
}
