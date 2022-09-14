package c.a.a.v.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import c.a.a.v.k.n;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class f extends a {
    private final c.a.a.t.b.d w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(c.a.a.g gVar, d dVar) {
        super(gVar, dVar);
        this.w = new c.a.a.t.b.d(gVar, this, new n("__container", dVar.l(), false));
        this.w.a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // c.a.a.v.l.a, c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.w.a(rectF, this.m, z);
    }

    @Override // c.a.a.v.l.a
    void b(Canvas canvas, Matrix matrix, int i) {
        this.w.a(canvas, matrix, i);
    }

    @Override // c.a.a.v.l.a
    protected void b(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        this.w.a(eVar, i, list, eVar2);
    }
}
