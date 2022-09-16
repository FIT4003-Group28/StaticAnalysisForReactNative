package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzg  reason: default package */
/* loaded from: classes2.dex */
public final class bzg extends bzd {
    private final PointF e;
    private final float[] f;
    private final PathMeasure g;
    private bzf h;

    public bzg(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new PathMeasure();
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        bzf bzfVar = (bzf) cdiVar;
        Path path = bzfVar.a;
        if (path == null) {
            return (PointF) cdiVar.b;
        }
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f2 = bzfVar.g;
            bzfVar.h.floatValue();
            PointF pointF = (PointF) bzfVar.b;
            PointF pointF2 = (PointF) bzfVar.c;
            c();
            PointF pointF3 = (PointF) cdjVar.a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        if (this.h != bzfVar) {
            this.g.setPath(path, false);
            this.h = bzfVar;
        }
        PathMeasure pathMeasure = this.g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
        PointF pointF4 = this.e;
        float[] fArr = this.f;
        pointF4.set(fArr[0], fArr[1]);
        return this.e;
    }
}
