package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: blk  reason: default package */
/* loaded from: classes3.dex */
public final class blk extends blh<PointF> {
    private final PointF e;
    private final float[] f;
    private blj g;
    private final PathMeasure h;

    public blk(List<? extends bpt<PointF>> list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.h = new PathMeasure();
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Object i(bpt bptVar, float f) {
        blj bljVar = (blj) bptVar;
        Path path = bljVar.a;
        if (path == null) {
            return (PointF) bptVar.b;
        }
        bpv<A> bpvVar = this.d;
        if (bpvVar != 0) {
            float f2 = bljVar.e;
            Float f3 = bljVar.f;
            PointF pointF = (PointF) bljVar.c;
            e();
            PointF pointF2 = (PointF) bpvVar.b((PointF) bljVar.b);
            if (pointF2 != null) {
                return pointF2;
            }
        }
        if (this.g != bljVar) {
            this.h.setPath(path, false);
            this.g = bljVar;
        }
        PathMeasure pathMeasure = this.h;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
        PointF pointF3 = this.e;
        float[] fArr = this.f;
        pointF3.set(fArr[0], fArr[1]);
        return this.e;
    }
}
