package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: alel  reason: default package */
/* loaded from: classes2.dex */
public final class alel extends aldi {
    private final akxa a;
    private final alem b;

    public alel(alem alemVar, akxa akxaVar) {
        this.a = akxaVar;
        this.b = alemVar;
    }

    private final akuh d(dpen dpenVar, boolean z, boolean z2) {
        if (!z) {
            alem alemVar = this.b;
            return alemVar.e.containsKey(dpenVar) ? alemVar.e.get(dpenVar) : alemVar.f;
        } else if (z2) {
            alem alemVar2 = this.b;
            return alemVar2.a.containsKey(dpenVar) ? alemVar2.a.get(dpenVar) : alemVar2.b;
        } else {
            alem alemVar3 = this.b;
            return alemVar3.c.containsKey(dpenVar) ? alemVar3.c.get(dpenVar) : alemVar3.d;
        }
    }

    @Override // defpackage.aldi
    protected final List<aldh> b(aldp aldpVar, boolean z, boolean z2) {
        dozl dozlVar;
        dozl dozlVar2;
        dozl dozlVar3;
        dcpc a = dcpc.a();
        a.b(dclz.g(0, Integer.MAX_VALUE), d(dpen.UNKNOWN_STYLE, z2, z));
        ArrayList<dpeo> arrayList = new ArrayList(aldpVar.h);
        Collections.sort(arrayList, alej.a);
        for (dpeo dpeoVar : arrayList) {
            dclz g = dclz.g(Integer.valueOf(dpeoVar.c), Integer.valueOf(dpeoVar.c + dpeoVar.d));
            dpen b = dpen.b(dpeoVar.b);
            if (b == null) {
                b = dpen.UNKNOWN_STYLE;
            }
            a.b(g, d(b, z2, z));
        }
        List<dozr> list = aldpVar.g;
        ArrayList<dozr> arrayList2 = new ArrayList();
        for (dozr dozrVar : list) {
            if (dozrVar.b == 4) {
                arrayList2.add(dozrVar);
            }
        }
        Collections.sort(arrayList2, alek.a);
        for (dozr dozrVar2 : arrayList2) {
            dozq dozqVar = dozrVar2.d;
            if (dozqVar == null) {
                dozqVar = dozq.e;
            }
            if ((dozqVar.a & 1) != 0) {
                if (dozrVar2.b == 4) {
                    dozlVar = (dozl) dozrVar2.c;
                } else {
                    dozlVar = dozl.e;
                }
                Integer valueOf = Integer.valueOf(dozlVar.b);
                if (dozrVar2.b == 4) {
                    dozlVar2 = (dozl) dozrVar2.c;
                } else {
                    dozlVar2 = dozl.e;
                }
                int i = dozlVar2.b;
                if (dozrVar2.b == 4) {
                    dozlVar3 = (dozl) dozrVar2.c;
                } else {
                    dozlVar3 = dozl.e;
                }
                dclz g2 = dclz.g(valueOf, Integer.valueOf(i + dozlVar3.c));
                alem alemVar = this.b;
                dozq dozqVar2 = dozrVar2.d;
                if (dozqVar2 == null) {
                    dozqVar2 = dozq.e;
                }
                dmqc b2 = dmqc.b(dozqVar2.b);
                if (b2 == null) {
                    b2 = dmqc.LEGEND_STYLE_UNDEFINED;
                }
                if (b2 == dmqc.LEGEND_STYLE_UNDEFINED) {
                    b2 = dmqc.LEGEND_STYLE_JAMCIDENT_PRIMARY_ROUTE;
                }
                a.b(g2, alemVar.g.a(b2));
            }
        }
        return dcbg.b(a.e().entrySet()).s(alei.a).z();
    }

    @Override // defpackage.aleh
    public final List<akte> e(aldp aldpVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        a(aldpVar, z, arrayList, arrayList2, arrayList3);
        dbsk.m(!arrayList.isEmpty(), "At least one merged point must be provided.");
        arrayList.size();
        arrayList2.size();
        arrayList3.size();
        int i = aldpVar.i;
        float f = aldpVar.j;
        List<akte> d = this.a.d(arrayList, decl.l(arrayList2), arrayList3, aldpVar.i, 2, 2, 1, aldpVar.j);
        HashSet hashSet = new HashSet();
        for (akte akteVar : d) {
            hashSet.addAll(akteVar.c());
        }
        hashSet.isEmpty();
        return d;
    }
}
