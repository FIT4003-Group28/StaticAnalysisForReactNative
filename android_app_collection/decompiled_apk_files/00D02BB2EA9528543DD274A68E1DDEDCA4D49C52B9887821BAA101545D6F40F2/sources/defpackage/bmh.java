package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmh  reason: default package */
/* loaded from: classes3.dex */
public final class bmh implements bmp<PointF, PointF> {
    public final List<bpt<PointF>> a;

    public bmh() {
        this.a = Collections.singletonList(new bpt(new PointF(0.0f, 0.0f)));
    }

    public bmh(List<bpt<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.bmp
    public final blc<PointF, PointF> a() {
        if (this.a.get(0).d()) {
            return new bll(this.a);
        }
        return new blk(this.a);
    }

    @Override // defpackage.bmp
    public final List<bpt<PointF>> b() {
        return this.a;
    }

    @Override // defpackage.bmp
    public final boolean c() {
        return this.a.size() == 1 && this.a.get(0).d();
    }
}
