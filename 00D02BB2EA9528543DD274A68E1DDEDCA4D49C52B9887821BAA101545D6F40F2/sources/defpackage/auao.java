package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: auao  reason: default package */
/* loaded from: classes2.dex */
public final class auao<T> extends btrh<T> {
    private final int d;

    public auao(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dowa dowaVar;
        if (this.d == 0) {
            auan auanVar = (auan) this.a;
            GmmLocation a = ((amqo) obj).a();
            if (a == null) {
                auanVar.d();
                return;
            } else if (!"gmfc".equals(a.getProvider())) {
                auanVar.d();
                return;
            } else if (!a.hasSpeed() || !a.hasSpeedAccuracy()) {
                auanVar.d();
                return;
            } else {
                double abs = Math.abs(a.getSpeed());
                double speedAccuracyMetersPerSecond = a.getSpeedAccuracyMetersPerSecond();
                dbsk.s(auanVar.i);
                if (speedAccuracyMetersPerSecond > 4.0d) {
                    auanVar.i.b();
                    return;
                }
                Double.isNaN(abs);
                Double.isNaN(speedAccuracyMetersPerSecond);
                if (abs - speedAccuracyMetersPerSecond <= dcyn.a) {
                    auanVar.i.c(0.0f);
                    return;
                } else {
                    auanVar.i.c((float) abs);
                    return;
                }
            }
        }
        auan auanVar2 = (auan) this.a;
        crhp crhpVar = (crhp) obj;
        boolean z = false;
        if (!crhpVar.d()) {
            int i = auanVar2.d;
            auanVar2.c(null);
            auanVar2.h = null;
            auanVar2.g = false;
            return;
        }
        if (!auanVar2.g) {
            dbsk.s(auanVar2.i);
            auanVar2.i.a.s = true;
            auanVar2.g = true;
        }
        cray g = crhpVar.e().g();
        dqvj dqvjVar = g.a.h;
        dbsk.s(auanVar2.i);
        if (dqvjVar != auanVar2.e) {
            auanVar2.i.a.k = dqvjVar;
        }
        auanVar2.e = dqvjVar;
        auanVar2.h = crhpVar.e().a;
        List<String> list = g.a.T;
        if (list.contains("US") || list.contains("CA")) {
            z = true;
        }
        amub amubVar = g.a;
        dowa dowaVar2 = amubVar.I;
        if (!g.k) {
            int i2 = auanVar2.d;
            auanVar2.c(dowaVar2);
            auanVar2.b(z);
        } else if (!amubVar.an()) {
            if (auanVar2.d != -1) {
                amub amubVar2 = g.a;
            }
            auanVar2.c(dowaVar2);
            auanVar2.b(z);
        } else {
            amuo amuoVar = g.b;
            if (amuoVar == null) {
                return;
            }
            amuo amuoVar2 = amuoVar.R;
            if (amuoVar2 == null) {
                if (auanVar2.f) {
                    return;
                }
                auanVar2.c(dowaVar2);
                auanVar2.b(z);
                auanVar2.f = true;
                return;
            }
            int i3 = amuoVar.k - g.e;
            amuo amuoVar3 = auanVar2.b;
            if (amuoVar3 == null || !amuoVar3.equals(amuoVar2)) {
                auanVar2.b = amuoVar2;
                auanVar2.c = -1;
            }
            for (dpdj dpdjVar : amuoVar2.M) {
                int i4 = dpdjVar.a;
                if (i4 > auanVar2.c && i4 <= i3) {
                    int a2 = dpdi.a(dpdjVar.c);
                    if (a2 != 0 && a2 == 2) {
                        dowaVar = dowa.KILOMETERS;
                    } else {
                        int a3 = dpdi.a(dpdjVar.c);
                        if (a3 != 0 && a3 == 3) {
                            dowaVar = dowa.MILES;
                        } else {
                            if (list.size() <= 1) {
                                if (list.contains("US")) {
                                    dowaVar = dowa.MILES;
                                } else if (list.contains("AU") || list.contains("BR") || list.contains("CA")) {
                                    dowaVar = dowa.KILOMETERS;
                                }
                            }
                            dowaVar = null;
                        }
                    }
                    if (dowaVar == null) {
                        auanVar2.c(dowaVar2);
                    } else {
                        int i5 = dpdjVar.b;
                        int i6 = auanVar2.c;
                        int i7 = dpdjVar.a;
                        dbsk.s(dpdjVar);
                        int i8 = dpdjVar.b;
                        int i9 = dpdjVar.d;
                        dbsk.s(auanVar2.i);
                        auanVar2.d = i8;
                        auanVar2.i.a(auan.a(i8, dowaVar), auan.a(i9, dowaVar), dowaVar);
                    }
                    auanVar2.b(z);
                }
            }
            auanVar2.c = i3;
        }
    }
}
