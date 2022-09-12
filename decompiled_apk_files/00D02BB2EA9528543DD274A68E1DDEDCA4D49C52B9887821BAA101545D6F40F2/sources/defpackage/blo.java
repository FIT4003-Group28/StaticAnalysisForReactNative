package defpackage;

import android.graphics.PointF;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: blo  reason: default package */
/* loaded from: classes3.dex */
public final class blo extends blc<PointF, PointF> {
    private final PointF e;
    private final blc<Float, Float> f;
    private final blc<Float, Float> g;

    public blo(blc<Float, Float> blcVar, blc<Float, Float> blcVar2) {
        super(Collections.emptyList());
        this.e = new PointF();
        this.f = blcVar;
        this.g = blcVar2;
        b(this.c);
    }

    @Override // defpackage.blc
    public final void b(float f) {
        this.f.b(f);
        this.g.b(f);
        this.e.set(this.f.h().floatValue(), this.g.h().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ PointF h() {
        return this.e;
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ PointF i(bpt<PointF> bptVar, float f) {
        return this.e;
    }
}
