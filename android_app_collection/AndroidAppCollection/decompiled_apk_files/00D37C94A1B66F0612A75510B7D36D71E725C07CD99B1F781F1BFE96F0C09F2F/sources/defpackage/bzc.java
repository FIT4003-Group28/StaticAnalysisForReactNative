package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bzc  reason: default package */
/* loaded from: classes2.dex */
public final class bzc extends bzd {
    public bzc(List list) {
        super(list);
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        return Integer.valueOf(k(cdiVar, f));
    }

    public final int k(cdi cdiVar, float f) {
        if (cdiVar.b == null || cdiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f2 = cdiVar.g;
            cdiVar.h.floatValue();
            Integer num = (Integer) cdiVar.b;
            Integer num2 = (Integer) cdiVar.c;
            c();
            Integer num3 = (Integer) cdjVar.a();
            if (num3 != null) {
                return num3.intValue();
            }
        }
        int i = cdiVar.k;
        if (i == 784923401) {
            i = ((Integer) cdiVar.b).intValue();
            cdiVar.k = i;
        }
        int i2 = cdiVar.l;
        if (i2 == 784923401) {
            i2 = ((Integer) cdiVar.c).intValue();
            cdiVar.l = i2;
        }
        return cdc.e(i, i2, f);
    }
}
