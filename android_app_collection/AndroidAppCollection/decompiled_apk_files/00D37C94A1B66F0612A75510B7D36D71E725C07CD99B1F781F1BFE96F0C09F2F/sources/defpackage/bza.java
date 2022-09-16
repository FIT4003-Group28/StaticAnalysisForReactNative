package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bza  reason: default package */
/* loaded from: classes2.dex */
public final class bza extends bzd {
    public bza(List list) {
        super(list);
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        return Float.valueOf(l(cdiVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(cdi cdiVar, float f) {
        if (cdiVar.b == null || cdiVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f2 = cdiVar.g;
            cdiVar.h.floatValue();
            Float f3 = (Float) cdiVar.b;
            Float f4 = (Float) cdiVar.c;
            c();
            Float f5 = (Float) cdjVar.a();
            if (f5 != null) {
                return f5.floatValue();
            }
        }
        float f6 = cdiVar.i;
        if (f6 == -3987645.8f) {
            f6 = ((Float) cdiVar.b).floatValue();
            cdiVar.i = f6;
        }
        float f7 = cdiVar.j;
        if (f7 == -3987645.8f) {
            f7 = ((Float) cdiVar.c).floatValue();
            cdiVar.j = f7;
        }
        return cdc.c(f6, f7, f);
    }
}
