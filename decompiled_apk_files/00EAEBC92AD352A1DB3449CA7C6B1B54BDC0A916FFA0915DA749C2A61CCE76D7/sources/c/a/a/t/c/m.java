package c.a.a.t.c;

import android.graphics.PointF;
import java.util.Collections;
/* loaded from: classes.dex */
public class m extends a<PointF, PointF> {
    private final PointF l;
    private final a<Float, Float> m;
    private final a<Float, Float> n;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.l = new PointF();
        this.m = aVar;
        this.n = aVar2;
        a(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.t.c.a
    /* renamed from: a */
    public PointF mo103a(c.a.a.z.a<PointF> aVar, float f2) {
        return this.l;
    }

    @Override // c.a.a.t.c.a
    public void a(float f2) {
        this.m.a(f2);
        this.n.a(f2);
        this.l.set(this.m.mo102f().floatValue(), this.n.mo102f().floatValue());
        for (int i = 0; i < this.f2389a.size(); i++) {
            this.f2389a.get(i).a();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.t.c.a
    /* renamed from: f */
    public PointF mo102f() {
        return mo103a((c.a.a.z.a<PointF>) null, 0.0f);
    }
}
