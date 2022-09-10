package defpackage;
/* compiled from: PG */
/* renamed from: dna  reason: default package */
/* loaded from: classes6.dex */
public final class dna {
    public static final dfhg a(akqi akqiVar, akqq akqqVar) {
        dzvx.c(akqiVar, "featureId");
        dfgn bZ = dfgo.d.bZ();
        double d = akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar = (dfgo) bZ.b;
        int i = dfgoVar.a | 1;
        dfgoVar.a = i;
        dfgoVar.b = d;
        double d2 = akqqVar.b;
        dfgoVar.a = i | 2;
        dfgoVar.c = d2;
        dfgo bK = bZ.bK();
        dzvx.b(bK, "com.google.geo.ar.arlo.a…latLng.longitude).build()");
        dfgo dfgoVar2 = bK;
        dfhd bZ2 = dfhg.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfhg dfhgVar = (dfhg) bZ2.b;
        dfgoVar2.getClass();
        dfhgVar.b = dfgoVar2;
        dfhgVar.a |= 1;
        dgrh h = akqiVar.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfhg dfhgVar2 = (dfhg) bZ2.b;
        h.getClass();
        dfhgVar2.c = h;
        dfhgVar2.a |= 2;
        dfhg bK2 = bZ2.bK();
        dzvx.b(bK2, "Place.newBuilder()\n     …Proto())\n        .build()");
        return bK2;
    }

    public static final float b(dfhp dfhpVar) {
        if (dfhpVar != null) {
            return dfhpVar.a;
        }
        return Float.NaN;
    }

    public static final void c(dfer dferVar, dhh dhhVar, float f, dfhp dfhpVar) {
        dzvx.c(dferVar, "pin");
        dzvx.c(dfhpVar, "newState");
        float f2 = dfhpVar.a;
        float abs = Math.abs(f2 - f);
        if (Float.isNaN(f) || abs > 0.5f) {
            dferVar.f(dhhVar.a(f2));
        }
    }
}
