package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anru  reason: default package */
/* loaded from: classes2.dex */
public class anru {
    private static final dcqe a = dcqe.c("anru");

    public static final dvyw d(dvay dvayVar) {
        dvat dvatVar;
        dvas dvasVar;
        dvat dvatVar2;
        if (dvayVar.b == 7) {
            dvatVar = (dvat) dvayVar.c;
        } else {
            dvatVar = dvat.g;
        }
        if (dvatVar.b.size() > 0) {
            if (dvayVar.b == 7) {
                dvatVar2 = (dvat) dvayVar.c;
            } else {
                dvatVar2 = dvat.g;
            }
            dvasVar = dvatVar2.b.get(0);
        } else {
            bvoo.h("getMainCandidate called even though the segment does not contain any candidates", new Object[0]);
            dvasVar = dvas.g;
        }
        dvyw dvywVar = dvasVar.b;
        return dvywVar == null ? dvyw.bv : dvywVar;
    }

    public static final dnic e(dnhz dnhzVar, dnhz dnhzVar2, int i, long j) {
        boolean z = i == 2;
        if (z) {
            dsqp dsqpVar = (dsqp) dnhzVar2.cu(5);
            dsqpVar.bC(dnhzVar2);
            dnhy dnhyVar = (dnhy) dsqpVar;
            if (dnhyVar.c) {
                dnhyVar.bF();
                dnhyVar.c = false;
            }
            dnhz dnhzVar3 = (dnhz) dnhyVar.b;
            dnhz dnhzVar4 = dnhz.e;
            dnhzVar3.a |= 4;
            dnhzVar3.d = j;
            dnhzVar2 = dnhyVar.bK();
        }
        dnhx bZ = dnic.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnic dnicVar = (dnic) bZ.b;
        dnhzVar.getClass();
        dnicVar.c = dnhzVar;
        int i2 = dnicVar.a | 2;
        dnicVar.a = i2;
        dnhzVar2.getClass();
        dnicVar.d = dnhzVar2;
        int i3 = i2 | 4;
        dnicVar.a = i3;
        dnicVar.a = i3 | 8;
        dnicVar.e = z;
        return bZ.bK();
    }

    public static final dniu f(dvyw dvywVar) {
        dnip bZ = dniu.i.bZ();
        dbsg<String> d = anpx.d(dvywVar);
        if (!d.a()) {
            bvoo.h("Got a tactile place without a feature id", new Object[0]);
            return dniu.i;
        }
        String b = d.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dniu dniuVar = (dniu) bZ.b;
        b.getClass();
        int i = dniuVar.a | 1;
        dniuVar.a = i;
        dniuVar.b = b;
        if (dvywVar.an) {
            String str = dvywVar.p;
            str.getClass();
            dniuVar.a = i | 4;
            dniuVar.d = str;
        }
        return bZ.bK();
    }

    public static final dnic g(dngq dngqVar, dniu dniuVar, int i, long j) {
        dnia bZ = dnib.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnib dnibVar = (dnib) bZ.b;
        dniuVar.getClass();
        dnibVar.b = dniuVar;
        dnibVar.a |= 1;
        dnib bK = bZ.bK();
        dnhy bZ2 = dnhz.e.bZ();
        dngs dngsVar = dngqVar.b;
        if (dngsVar == null) {
            dngsVar = dngs.h;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnhz dnhzVar = (dnhz) bZ2.b;
        dngsVar.getClass();
        dnhzVar.b = dngsVar;
        int i2 = dnhzVar.a | 1;
        dnhzVar.a = i2;
        bK.getClass();
        dnhzVar.c = bK;
        dnhzVar.a = i2 | 2;
        dnhz bK2 = bZ2.bK();
        dnhy bZ3 = dnhz.e.bZ();
        dngs dngsVar2 = dngqVar.c;
        if (dngsVar2 == null) {
            dngsVar2 = dngs.h;
        }
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnhz dnhzVar2 = (dnhz) bZ3.b;
        dngsVar2.getClass();
        dnhzVar2.b = dngsVar2;
        int i3 = dnhzVar2.a | 1;
        dnhzVar2.a = i3;
        bK.getClass();
        dnhzVar2.c = bK;
        dnhzVar2.a = i3 | 2;
        return e(bK2, bZ3.bK(), i, j);
    }

    public final anro a() {
        return anro.e(iva.c(R.color.qu_blue_grey_400, R.color.mod_grey850), cqrt.c(R.color.qu_white_alpha_87), cqrt.c(R.color.qu_white_alpha_54), cqrt.c(R.color.qu_white_alpha_87));
    }

    public final jic b(String str) {
        return aple.d(str, ckqc.FULLY_QUALIFIED, null);
    }

    public final jbf c(Resources resources, Runnable runnable) {
        ixw ixwVar = new ixw();
        ixwVar.e = runnable;
        ixwVar.a = resources.getString(R.string.MAPS_ACTIVITY_CREATE_A_PERSONAL_PLACE);
        ixwVar.f = cjtd.a(dtyi.bC);
        ixwVar.d = cqkp.T;
        return ixwVar.a();
    }
}
