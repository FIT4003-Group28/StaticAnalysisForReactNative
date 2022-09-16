package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzh  reason: default package */
/* loaded from: classes2.dex */
public final class bzh extends bzd {
    private final PointF e;

    public bzh(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        return j(cdiVar, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.byy
    /* renamed from: k */
    public final PointF j(cdi cdiVar, float f, float f2) {
        Object obj;
        Object obj2 = cdiVar.b;
        if (obj2 == null || (obj = cdiVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        cdj cdjVar = this.d;
        if (cdjVar != null) {
            float f3 = cdiVar.g;
            cdiVar.h.floatValue();
            c();
            PointF pointF3 = (PointF) cdjVar.a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + (f * (pointF2.x - pointF.x)), pointF.y + (f2 * (pointF2.y - pointF.y)));
        return this.e;
    }
}
