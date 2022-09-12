package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: qho  reason: default package */
/* loaded from: classes7.dex */
public class qho {
    private final qia a;
    private final qhx b;

    public qho(qia qiaVar, qhx qhxVar) {
        this.a = qiaVar;
        this.b = qhxVar;
    }

    @dzsi
    public static amuk c(amve amveVar) {
        amuq[] c;
        for (amtr amtrVar : amveVar.b) {
            for (amuq amuqVar : amtrVar.c()) {
                if (!amsr.c(amuqVar)) {
                    if (amsr.d(amuqVar)) {
                        dpan dpanVar = amuqVar.j().b;
                        if (dpanVar == null) {
                            dpanVar = dpan.e;
                        }
                        return amuk.e(dpanVar);
                    }
                } else {
                    dpan dpanVar2 = amuqVar.i().f;
                    if (dpanVar2 == null) {
                        dpanVar2 = dpan.e;
                    }
                    return amuk.e(dpanVar2);
                }
            }
        }
        return null;
    }

    @dzsi
    private static qic d(amuq[] amuqVarArr, int i) {
        if (i < 0 || i >= amuqVarArr.length) {
            return null;
        }
        return qic.c(amuqVarArr[i]);
    }

    @dzsi
    public final qib a(amve amveVar) {
        amtr[] amtrVarArr;
        int i;
        amuq[] amuqVarArr;
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        qic qicVar = null;
        if (c != dqvj.BIKESHARING) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        amtr[] amtrVarArr2 = amveVar.b;
        int length = amtrVarArr2.length;
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            amuq[] c2 = amtrVarArr2[i2].c();
            int length2 = c2.length;
            qic qicVar2 = qicVar;
            int i3 = 0;
            while (i3 < length2) {
                amuq amuqVar = c2[i3];
                if (amsr.c(amuqVar)) {
                    qia qiaVar = this.a;
                    dbsk.a(amsr.c(amuqVar));
                    dowh i4 = amuqVar.i();
                    dpan dpanVar = i4.f;
                    if (dpanVar == null) {
                        dpanVar = dpan.e;
                    }
                    amuk e = amuk.e(dpanVar);
                    qhk qhkVar = new qhk();
                    qhkVar.a(z);
                    qhkVar.a = e;
                    dott dottVar = i4.c;
                    if (dottVar == null) {
                        dottVar = dott.h;
                    }
                    qhkVar.c = qhv.a(e, dottVar);
                    dsrj<dott> dsrjVar = i4.d;
                    dccx G = dcdc.G(dsrjVar.size());
                    for (dott dottVar2 : dsrjVar) {
                        amtr[] amtrVarArr3 = amtrVarArr2;
                        if (amsr.f(dottVar2)) {
                            G.g(qhv.a(e, dottVar2));
                        }
                        amtrVarArr2 = amtrVarArr3;
                    }
                    amtrVarArr = amtrVarArr2;
                    dcdc<qhu> f = G.f();
                    if (f != null) {
                        qhkVar.d = f;
                        dquj dqujVar = i4.b;
                        if (dqujVar == null) {
                            dqujVar = dquj.f;
                        }
                        if (dqujVar != null) {
                            qhkVar.e = dqujVar;
                            qhkVar.a(i4.g);
                            qhkVar.j = qicVar2;
                            qhkVar.i = alcf.t(amuqVar.a());
                            Resources resources = qiaVar.a.getResources();
                            Object[] objArr = new Object[1];
                            dpan dpanVar2 = i4.f;
                            if (dpanVar2 == null) {
                                dpanVar2 = dpan.e;
                            }
                            objArr[0] = dpanVar2.c;
                            String string = resources.getString(R.string.BIKESHARING_UNLOCK_IN_X, objArr);
                            if (string != null) {
                                qhkVar.b = string;
                                int i5 = i4.a;
                                if ((i5 & 32) != 0) {
                                    qhkVar.f = i4.h;
                                }
                                if ((i5 & 4) != 0) {
                                    qhkVar.g = i4.e;
                                }
                                String str = qhkVar.a == null ? " provider" : "";
                                if (qhkVar.b == null) {
                                    str = str.concat(" partnerAppLinkText");
                                }
                                if (qhkVar.c == null) {
                                    str = String.valueOf(str).concat(" recommendedVehicle");
                                }
                                if (qhkVar.d == null) {
                                    str = String.valueOf(str).concat(" alternativeVehicles");
                                }
                                if (qhkVar.e == null) {
                                    str = String.valueOf(str).concat(" fareEstimate");
                                }
                                if (qhkVar.h == null) {
                                    str = String.valueOf(str).concat(" hasAdsBadge");
                                }
                                if (!str.isEmpty()) {
                                    String valueOf = String.valueOf(str);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                }
                                i = length;
                                amuqVarArr = c2;
                                arrayList.add(new qhl(qhkVar.a, qhkVar.b, qhkVar.c, qhkVar.d, qhkVar.e, qhkVar.f, qhkVar.g, qhkVar.h.booleanValue(), qhkVar.i, qhkVar.j));
                            } else {
                                throw new NullPointerException("Null partnerAppLinkText");
                            }
                        } else {
                            throw new NullPointerException("Null fareEstimate");
                        }
                    } else {
                        throw new NullPointerException("Null alternativeVehicles");
                    }
                } else {
                    amtrVarArr = amtrVarArr2;
                    i = length;
                    amuqVarArr = c2;
                }
                qicVar2 = qic.c(amuqVar);
                i3++;
                length = i;
                amtrVarArr2 = amtrVarArr;
                c2 = amuqVarArr;
                z = false;
            }
            i2++;
            qicVar = null;
            z = false;
        }
        if (arrayList.size() == 1) {
            return (qib) arrayList.get(0);
        }
        return null;
    }

    @dzsi
    public final qhy b(amve amveVar) {
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (c != dqvj.BIKESHARING) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        amtr[] amtrVarArr = amveVar.b;
        int length = amtrVarArr.length;
        for (int i = 0; i < length; i++) {
            amtr amtrVar = amtrVarArr[i];
            ListIterator listIterator = Arrays.asList(amtrVar.c()).listIterator();
            while (listIterator.hasNext()) {
                int previousIndex = listIterator.previousIndex();
                amuq amuqVar = (amuq) listIterator.next();
                if (amsr.d(amuqVar)) {
                    qic d = d(amtrVar.c(), previousIndex);
                    qic d2 = d(amtrVar.c(), listIterator.nextIndex());
                    dbsk.a(amsr.d(amuqVar));
                    dowf j = amuqVar.j();
                    dpan dpanVar = j.b;
                    if (dpanVar == null) {
                        dpanVar = dpan.e;
                    }
                    amuk e = amuk.e(dpanVar);
                    qhi qhiVar = new qhi();
                    qhiVar.b(dcdc.e());
                    qhiVar.a(dcdc.e());
                    qhiVar.a = e;
                    qhiVar.i = d;
                    dowd dowdVar = j.c;
                    if (dowdVar == null) {
                        dowdVar = dowd.f;
                    }
                    qhiVar.d = qhr.a(e, dowdVar);
                    qhiVar.b(qhx.a(e, j.d));
                    qhiVar.a(qhx.a(e, j.f));
                    qhiVar.j = d2;
                    dowd dowdVar2 = j.e;
                    if (dowdVar2 == null) {
                        dowdVar2 = dowd.f;
                    }
                    qhiVar.f = qhr.a(e, dowdVar2);
                    qhiVar.h = alcf.t(amuqVar.a());
                    qhiVar.c = j.h;
                    if ((j.a & 8) != 0) {
                        dqdk dqdkVar = j.g;
                        if (dqdkVar == null) {
                            dqdkVar = dqdk.e;
                        }
                        dplx dplxVar = dqdkVar.b;
                        if (dplxVar == null) {
                            dplxVar = dplx.g;
                        }
                        qhiVar.b = bvrq.a(dplxVar);
                    }
                    String str = qhiVar.a == null ? " provider" : "";
                    if (qhiVar.d == null) {
                        str = str.concat(" recommendedPickupStation");
                    }
                    if (qhiVar.e == null) {
                        str = String.valueOf(str).concat(" alternativePickupStations");
                    }
                    if (qhiVar.f == null) {
                        str = String.valueOf(str).concat(" recommendedDropOffStation");
                    }
                    if (qhiVar.g == null) {
                        str = String.valueOf(str).concat(" alternativeDropOffStations");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    arrayList.add(new qhj(qhiVar.a, qhiVar.b, qhiVar.c, qhiVar.d, qhiVar.e, qhiVar.f, qhiVar.g, qhiVar.h, qhiVar.i, qhiVar.j));
                    amtrVarArr = amtrVarArr;
                    length = length;
                }
            }
        }
        if (arrayList.size() == 1) {
            return (qhy) arrayList.get(0);
        }
        return null;
    }
}
