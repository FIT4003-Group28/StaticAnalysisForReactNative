package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ybo  reason: default package */
/* loaded from: classes7.dex */
public class ybo implements xzl {
    @dzsi
    private final dgaw a;
    @dzsi
    private final CharSequence b;

    private ybo(@dzsi dgaw dgawVar, @dzsi CharSequence charSequence) {
        this.a = dgawVar;
        this.b = charSequence;
    }

    public static ybo b(dpbp dpbpVar, int i, int i2, Context context, @dzsi wpv wpvVar) {
        dpgw dpgwVar;
        dgaw dgawVar;
        CharSequence charSequence;
        eapr ab;
        dpdy dpdyVar = dpbpVar.c.get(i);
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        if (i2 != dpheVar.l.size() - 1) {
            dpgwVar = null;
        } else {
            dphe dpheVar2 = dpdyVar.e;
            if (dpheVar2 == null) {
                dpheVar2 = dphe.x;
            }
            dpgwVar = dpheVar2.d;
            if (dpgwVar == null) {
                dpgwVar = dpgw.r;
            }
        }
        if (dpgwVar == null || (dpgwVar.a & 8) == 0) {
            dgawVar = null;
            charSequence = null;
        } else {
            dgawVar = dpgwVar.e;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            dgaw dgawVar2 = dpgwVar.e;
            if (dgawVar2 == null) {
                dgawVar2 = dgaw.g;
            }
            dpbw b = dpbw.b(dpgwVar.p);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            String h = bvtb.h(context, dgawVar2);
            charSequence = dbsj.d(h) ? null : ydg.a(h, b, context);
        }
        if (charSequence == null && dpgwVar != null && (ab = wpvVar.ab()) != null) {
            dphe dpheVar3 = dpbpVar.c.get(i).e;
            if (dpheVar3 == null) {
                dpheVar3 = dphe.x;
            }
            dgas dgasVar = dpheVar3.s;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            eaol m = new eaol(ab).m(dgasVar.b);
            dgav bZ = dgaw.g.bZ();
            long j = m.a / 1000;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgaw dgawVar3 = (dgaw) bZ.b;
            dgawVar3.a |= 1;
            dgawVar3.b = j;
            String id = m.v().s().getID();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgaw dgawVar4 = (dgaw) bZ.b;
            id.getClass();
            dgawVar4.a |= 2;
            dgawVar4.c = id;
            dgawVar = bZ.bK();
            charSequence = ydg.a(zbc.a(context, m), null, context);
        }
        return new ybo(dgawVar, charSequence);
    }

    @Override // defpackage.xzl
    @dzsi
    public CharSequence a() {
        return this.b;
    }

    @dzsi
    public dgaw c() {
        return this.a;
    }
}
