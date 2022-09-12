package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ble  reason: default package */
/* loaded from: classes3.dex */
public final class ble extends blh<Float> {
    public ble(List<bpt<Float>> list) {
        super(list);
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        return Float.valueOf(j(bptVar, f));
    }

    final float j(bpt<Float> bptVar, float f) {
        Float f2 = bptVar.b;
        if (f2 == null || bptVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f3 = bptVar.e;
            Float f4 = bptVar.f;
            e();
            Float f5 = (Float) bpvVar.b(f2);
            if (f5 != null) {
                return f5.floatValue();
            }
        }
        float f6 = bptVar.g;
        if (f6 == -3987645.8f) {
            f6 = bptVar.b.floatValue();
            bptVar.g = f6;
        }
        float f7 = bptVar.h;
        if (f7 == -3987645.8f) {
            f7 = bptVar.c.floatValue();
            bptVar.h = f7;
        }
        return bpr.c(f6, f7, f);
    }

    public final float k() {
        return j(d(), f());
    }
}
