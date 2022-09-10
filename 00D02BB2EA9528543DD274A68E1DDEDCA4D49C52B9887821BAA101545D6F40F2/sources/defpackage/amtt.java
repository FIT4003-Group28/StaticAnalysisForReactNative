package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: amtt  reason: default package */
/* loaded from: classes2.dex */
public final class amtt {
    public static final dcqe a = dcqe.c("amtt");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuo[] a(amtr[] amtrVarArr, akrk akrkVar, amvh[] amvhVarArr) {
        return b(amtrVarArr, akrkVar, amvhVarArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amuo[] b(amtr[] amtrVarArr, akrk akrkVar, amvh[] amvhVarArr, int i, int i2) {
        for (amtr amtrVar : amtrVarArr) {
            dbsk.s(amtrVar);
        }
        for (amvh amvhVar : amvhVarArr) {
            dbsk.s(amvhVar);
        }
        dbsk.a(amtrVarArr.length == amvhVarArr.length + (-1));
        if (akrkVar.l() <= 0) {
            bvoo.h("polyline should have at least one vertex.", new Object[0]);
            return new amuo[0];
        }
        amts d = amts.d();
        int i3 = 0;
        while (i3 < amtrVarArr.length) {
            amtr amtrVar2 = amtrVarArr[i3];
            int i4 = i3 + 1;
            amvh amvhVar2 = amvhVarArr[i4];
            d.c();
            for (int i5 = 0; i5 < amtrVar2.e(); i5++) {
                if (!d(amtrVar2.d(i5), d, akrkVar, amvhVar2, i, i2)) {
                    return new amuo[0];
                }
            }
            i3 = i4;
        }
        return d.b();
    }

    public static void c(amun amunVar, @dzsi dpec dpecVar) {
        int i;
        int i2;
        int i3 = 0;
        if (dpecVar != null) {
            dowb dowbVar = dpecVar.d;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            if ((dowbVar.a & 1) != 0) {
                dowb dowbVar2 = dpecVar.d;
                if (dowbVar2 == null) {
                    dowbVar2 = dowb.d;
                }
                i2 = dowbVar2.b;
            } else {
                i2 = 0;
            }
            dgas dgasVar = dpecVar.e;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            if ((dgasVar.a & 1) != 0) {
                dgas dgasVar2 = dpecVar.e;
                if (dgasVar2 == null) {
                    dgasVar2 = dgas.e;
                }
                i = dgasVar2.b;
                i3 = i2;
                amunVar.l = i3;
                amunVar.n = i;
            }
            i3 = i2;
        }
        i = 0;
        amunVar.l = i3;
        amunVar.n = i;
    }

    public static boolean d(amuq amuqVar, amts amtsVar, akrk akrkVar, amvh amvhVar, int i, int i2) {
        int i3;
        int d = amuqVar.d();
        for (int i4 = 0; i4 < d; i4++) {
            dpdq e = amuqVar.e(i4);
            int i5 = (e.a & 4096) != 0 ? e.q : -1;
            if (i5 >= 0 && i5 < akrkVar.l()) {
                dbsi<Float, Float> g = g(akrkVar, i5);
                amun h = amux.h(e, akrkVar.m(i5), amvhVar);
                h.g = amtsVar.a.size() + i;
                h.h = i5 + i2;
                h.m = amtsVar.b;
                h.o = g.a.floatValue();
                h.p = g.b.floatValue();
                h.x = amuqVar;
                c(h, amtsVar.c);
                amtsVar.a.add(h.a());
                dpec dpecVar = h.w;
                amtsVar.c = dpecVar;
                if (dpecVar == null) {
                    i3 = 0;
                } else {
                    dowb dowbVar = dpecVar.d;
                    if (dowbVar == null) {
                        dowbVar = dowb.d;
                    }
                    i3 = dowbVar.b;
                }
                amtsVar.b += i3;
            } else {
                bvoo.h("compact_polyline_vertex_offset %d out of range [0..%d)", Integer.valueOf(i5), Integer.valueOf(akrkVar.l()));
                return false;
            }
        }
        return true;
    }

    public static amuo e(int i, amuo amuoVar, dphe dpheVar, @dzsi amuo amuoVar2, akrk akrkVar, Resources resources) {
        int l = amuoVar2 != null ? amuoVar2.j : akrkVar.l() - 1;
        dbsi<Float, Float> g = g(akrkVar, l);
        amun h = amuoVar.h();
        h.g = i;
        dpgw dpgwVar = dpheVar.d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        h.i = resources.getString(R.string.TRANSIT_STEPTHROUGH_GET_OFF_AT, dpgwVar.b);
        h.f = akrkVar.m(l);
        h.h = l;
        h.o = g.a.floatValue();
        h.p = g.b.floatValue();
        h.a = dgau.DESTINATION;
        amuq amuqVar = h.x;
        dbsk.s(amuqVar);
        dgas dgasVar = amuqVar.a().e;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        h.n = dgasVar.b;
        return h.a();
    }

    @dzsi
    public static String f(Iterable<dpce> iterable) {
        String r = alcf.r(iterable);
        return r != null ? r : alcf.l(iterable);
    }

    public static dbsi<Float, Float> g(akrk akrkVar, int i) {
        float f;
        float w;
        float f2 = 0.0f;
        if (akrkVar.l() >= 2) {
            if (i > 0) {
                w = akrkVar.w(i - 1);
            } else {
                w = akrkVar.w(i);
            }
            f2 = w;
            if (i < akrkVar.l() - 1) {
                f = akrkVar.w(i);
            } else {
                f = akrkVar.w(i - 1);
            }
        } else {
            f = 0.0f;
        }
        return dbsi.a(Float.valueOf(f2), Float.valueOf(f));
    }
}
