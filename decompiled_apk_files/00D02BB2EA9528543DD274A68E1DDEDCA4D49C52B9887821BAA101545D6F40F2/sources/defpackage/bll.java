package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bll  reason: default package */
/* loaded from: classes3.dex */
public final class bll extends blh<PointF> {
    private final PointF e;

    public bll(List<bpt<PointF>> list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        T t;
        T t2 = bptVar.b;
        if (t2 == 0 || (t = bptVar.c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f2 = bptVar.e;
            Float f3 = bptVar.f;
            e();
            PointF pointF3 = (PointF) bpvVar.b(pointF);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.e;
    }
}
