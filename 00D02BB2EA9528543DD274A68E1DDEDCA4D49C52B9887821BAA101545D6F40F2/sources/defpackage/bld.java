package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bld  reason: default package */
/* loaded from: classes3.dex */
public final class bld extends blh<Integer> {
    public bld(List<bpt<Integer>> list) {
        super(list);
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        return Integer.valueOf(j(bptVar, f));
    }

    public final int j(bpt<Integer> bptVar, float f) {
        Integer num = bptVar.b;
        if (num == null || bptVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num.intValue();
        int intValue2 = bptVar.c.intValue();
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f2 = bptVar.e;
            Float f3 = bptVar.f;
            Integer valueOf = Integer.valueOf(intValue);
            e();
            Integer num2 = (Integer) bpvVar.b(valueOf);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        return bpm.a(bpr.g(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public final int k() {
        return j(d(), f());
    }
}
