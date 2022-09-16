package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: byz  reason: default package */
/* loaded from: classes2.dex */
public final class byz extends bzd {
    public byz(List list) {
        super(list);
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        return Integer.valueOf(l(cdiVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(cdi cdiVar, float f) {
        Object obj = cdiVar.b;
        if (obj == null || cdiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) cdiVar.c).intValue();
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f2 = cdiVar.g;
            cdiVar.h.floatValue();
            c();
            Integer num = (Integer) cdjVar.a();
            if (num != null) {
                return num.intValue();
            }
        }
        return na.e(cdc.b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
