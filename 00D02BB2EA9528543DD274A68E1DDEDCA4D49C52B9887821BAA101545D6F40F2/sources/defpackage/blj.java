package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: blj  reason: default package */
/* loaded from: classes3.dex */
public final class blj extends bpt<PointF> {
    public Path a;
    private final bpt<PointF> m;

    public blj(bis bisVar, bpt<PointF> bptVar) {
        super(bisVar, bptVar.b, bptVar.c, bptVar.d, bptVar.e, bptVar.f);
        this.m = bptVar;
        a();
    }

    public final void a() {
        T t;
        T t2 = this.c;
        boolean z = false;
        if (t2 != 0 && (t = this.b) != 0 && ((PointF) t).equals(((PointF) t2).x, ((PointF) this.c).y)) {
            z = true;
        }
        T t3 = this.c;
        if (t3 == 0 || z) {
            return;
        }
        bpt<PointF> bptVar = this.m;
        this.a = bps.a((PointF) this.b, (PointF) t3, bptVar.k, bptVar.l);
    }
}
