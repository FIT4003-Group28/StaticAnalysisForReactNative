package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: cxfg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cxfg {
    private static final Random b = new Random();
    public final eaby a;

    public cxfg(eaby eabyVar) {
        this.a = eabyVar;
    }

    public abstract boolean a();

    public abstract boolean b();

    public static cxfg c(eaby eabyVar) {
        cxfg cxfeVar;
        Random random = b;
        int a = eabx.a(eabyVar.c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            if (eabyVar.b != 1000) {
                z = false;
            }
            return new cxfe(eabyVar, z);
        }
        if (i == 3) {
            if (random.nextFloat() * 1000.0f >= ((float) eabyVar.b)) {
                z = false;
            }
            cxfeVar = new cxfe(eabyVar, z);
        } else if (i == 4) {
            cxfeVar = new cxff(eabyVar, random);
        } else {
            return new cxfe(eabyVar, true);
        }
        return cxfeVar;
    }
}
