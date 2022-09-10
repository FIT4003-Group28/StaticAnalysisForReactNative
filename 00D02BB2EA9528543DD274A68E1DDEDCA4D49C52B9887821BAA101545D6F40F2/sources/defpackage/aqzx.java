package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqzx  reason: default package */
/* loaded from: classes2.dex */
public final class aqzx {
    public final Object a = new Object();
    public final amub b;
    public final akqa c;
    public final bvnx d;
    public long e;
    private final float f;

    public aqzx(amub amubVar, float f, bvnx bvnxVar, double d, double d2) {
        this.b = amubVar;
        this.f = f;
        this.d = bvnxVar;
        akqa akqaVar = new akqa(d);
        this.c = akqaVar;
        akqaVar.h(dcyn.a, d + d2, d2);
        this.e = bvnxVar.a();
    }

    public static double b(@dzsi GmmLocation gmmLocation, @dzsi amub amubVar, double d) {
        akrn Y;
        if (gmmLocation != null && amubVar != null) {
            akra C = gmmLocation.C();
            double r = C.r();
            float accuracy = gmmLocation.getAccuracy();
            double max = Math.max(50.0d, accuracy + accuracy) * r;
            if (!gmmLocation.G(amubVar.W) || (Y = amubVar.Y(gmmLocation.H(amubVar.W))) == null || Y.a.y(gmmLocation.C()) >= max) {
                List<akrn> aB = amubVar.aB(C, max);
                int l = amubVar.w().l() - 2;
                ArrayList arrayList = new ArrayList(aB.size());
                for (akrn akrnVar : aB) {
                    if (akrnVar.d <= l) {
                        arrayList.add(akrnVar);
                    }
                }
                if (!Double.isNaN(d)) {
                    double accuracy2 = gmmLocation.getAccuracy();
                    Double.isNaN(accuracy2);
                    double min = r * Math.min(100.0d, accuracy2 + 20.0d);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        double I = amubVar.I((akrn) arrayList.get(i));
                        double d2 = I - d;
                        if ((-min) < d2 && d2 < min) {
                            return I;
                        }
                    }
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    akrn akrnVar2 = (akrn) arrayList.get(i2);
                    i2++;
                    if (akrb.g((float) akrnVar2.b, gmmLocation.getBearing()) < 120.0f) {
                        return amubVar.I(akrnVar2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return amubVar.I((akrn) arrayList.get(0));
                }
            } else {
                return amubVar.I(Y);
            }
        }
        return Double.NaN;
    }

    public final float a() {
        float d;
        synchronized (this.a) {
            double a = this.d.a() - this.e;
            Double.isNaN(a);
            d = ((float) this.c.d(Math.min(a / 1000.0d, 1.0d))) - this.f;
        }
        return d;
    }
}
