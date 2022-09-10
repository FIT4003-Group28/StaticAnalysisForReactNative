package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bml  reason: default package */
/* loaded from: classes3.dex */
public final class bml implements bmp<PointF, PointF> {
    private final bme a;
    private final bme b;

    public bml(bme bmeVar, bme bmeVar2) {
        this.a = bmeVar;
        this.b = bmeVar2;
    }

    @Override // defpackage.bmp
    public final blc<PointF, PointF> a() {
        return new blo(this.a.a(), this.b.a());
    }

    @Override // defpackage.bmp
    public final List<bpt<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.bmp
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
