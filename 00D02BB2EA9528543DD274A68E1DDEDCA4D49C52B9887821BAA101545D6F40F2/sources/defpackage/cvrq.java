package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cvrq  reason: default package */
/* loaded from: classes5.dex */
public final class cvrq implements cvro {
    private final cvrr a;
    private final Set<cvql> b;

    public cvrq(cvrr cvrrVar, Set<cvql> set) {
        this.a = cvrrVar;
        this.b = set;
    }

    @Override // defpackage.cvro
    public final boolean a(dsfr dsfrVar) {
        dsfz dsfzVar;
        dseo dseoVar;
        if (dsfrVar.a == 2) {
            dsfzVar = (dsfz) dsfrVar.b;
        } else {
            dsfzVar = dsfz.h;
        }
        dsgb dsgbVar = dsfzVar.a;
        if (dsgbVar == null) {
            dsgbVar = dsgb.c;
        }
        int i = dsgbVar.a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            float f = 0.0f;
            if (i3 == 0) {
                dsgb dsgbVar2 = dsfzVar.a;
                if (dsgbVar2 == null) {
                    dsgbVar2 = dsgb.c;
                }
                if (dsgbVar2.a == 1) {
                    f = ((Float) dsgbVar2.b).floatValue();
                }
            } else if (i3 == 1) {
                cvrr cvrrVar = this.a;
                dsgb dsgbVar3 = dsfzVar.a;
                if (dsgbVar3 == null) {
                    dsgbVar3 = dsgb.c;
                }
                if (dsgbVar3.a == 2) {
                    dseoVar = (dseo) dsgbVar3.b;
                } else {
                    dseoVar = dseo.b;
                }
                dsen dsenVar = dsen.c;
                cqat cqatVar = cvrrVar.a;
                long currentTimeMillis = System.currentTimeMillis();
                for (dsen dsenVar2 : dseoVar.a) {
                    dstv dstvVar = dsenVar2.a;
                    if (dstvVar == null) {
                        dstvVar = dstv.c;
                    }
                    long b = dsvb.b(dstvVar);
                    if (b <= currentTimeMillis) {
                        dstv dstvVar2 = dsenVar.a;
                        if (dstvVar2 == null) {
                            dstvVar2 = dstv.c;
                        }
                        if (b >= dsvb.b(dstvVar2)) {
                            dsenVar = dsenVar2;
                        }
                    }
                }
                f = dsenVar.b;
            }
            double d = f;
            if (d == dcyn.a) {
                return true;
            }
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (cvql cvqlVar : this.b) {
                double a = cvqlVar.a(dsfzVar);
                if (a != dcyn.a) {
                    dbsg<Float> b2 = cvqlVar.b(dsfzVar);
                    if (b2.a()) {
                        double floatValue = b2.b().floatValue();
                        Double.isNaN(a);
                        Double.isNaN(floatValue);
                        d3 += floatValue * a;
                        Double.isNaN(a);
                        d2 += a;
                    }
                }
            }
            dbsg i4 = d2 == dcyn.a ? dbpy.a : dbsg.i(Double.valueOf(d3 / d2));
            return !i4.a() || ((Double) i4.b()).doubleValue() >= d;
        }
        throw null;
    }
}
