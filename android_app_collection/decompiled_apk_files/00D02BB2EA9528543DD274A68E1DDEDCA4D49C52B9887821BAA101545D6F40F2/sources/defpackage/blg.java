package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: blg  reason: default package */
/* loaded from: classes3.dex */
public final class blg extends blh<Integer> {
    public blg(List<bpt<Integer>> list) {
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
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f2 = bptVar.e;
            Float f3 = bptVar.f;
            e();
            Integer num2 = (Integer) bpvVar.b(num);
            if (num2 != null) {
                return num2.intValue();
            }
        }
        int i = bptVar.i;
        if (i == 784923401) {
            i = bptVar.b.intValue();
            bptVar.i = i;
        }
        int i2 = bptVar.j;
        if (i2 == 784923401) {
            i2 = bptVar.c.intValue();
            bptVar.j = i2;
        }
        return bpr.e(i, i2, f);
    }
}
