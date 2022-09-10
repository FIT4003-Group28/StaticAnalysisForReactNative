package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alyz  reason: default package */
/* loaded from: classes.dex */
public final class alyz {
    private static final alyh c = new alyh(0, 0, 0);
    public final dzsj<akwu> a;
    @dzsi
    private alyy b;
    private final Map<dxdd, alyv> d = new EnumMap(dxdd.class);
    @dzsi
    private akra e;

    public alyz(dzsj<akwu> dzsjVar) {
        this.a = dzsjVar;
    }

    private final alyv d(int i, int i2, int i3, dxdd dxddVar, alyy alyyVar) {
        if (alyyVar != this.b && alyyVar.a(dxddVar) != null) {
            alyv a = alyyVar.a(dxddVar);
            return a == null ? alyv.a : a;
        }
        int i4 = i3 - 1;
        int c2 = alyy.c(i, i2, i4);
        alyy[] alyyVarArr = alyyVar.a;
        alyy alyyVar2 = alyyVarArr != null ? alyyVarArr[c2] : null;
        if (alyyVar2 == null) {
            alyy alyyVar3 = this.b;
            dbsk.s(alyyVar3);
            alyv a2 = alyyVar3.a(dxddVar);
            return a2 == null ? alyv.a : a2;
        }
        return d(i, i2, i4, dxddVar, alyyVar2);
    }

    public final synchronized alyv a(akra akraVar, akry akryVar) {
        alyv d;
        if (!akryVar.equals(akry.BASE)) {
            akryVar.equals(akry.PERSONALIZED_SMARTMAPS);
        }
        dxdd dxddVar = akryVar.I;
        if (this.b == null) {
            d = alyv.a;
        } else {
            akra akraVar2 = this.e;
            if (akraVar2 == null || !akraVar2.equals(akraVar)) {
                this.d.clear();
            } else {
                alyv alyvVar = this.d.get(dxddVar);
                if (alyvVar != null) {
                    d = alyvVar;
                }
            }
            alyh a = alyh.a(30, akraVar);
            if (a == null) {
                a = c;
            }
            this.e = akraVar;
            int i = a.b;
            int i2 = a.c;
            int i3 = a.a;
            alyy alyyVar = this.b;
            dbsk.s(alyyVar);
            d = d(i, i2, i3, dxddVar, alyyVar);
            this.d.put(dxddVar, d);
        }
        return d;
    }

    public final synchronized boolean b() {
        return this.b != null;
    }

    public final synchronized void c(@dzsi alyy alyyVar) {
        this.b = alyyVar;
        this.e = null;
        this.d.clear();
    }
}
