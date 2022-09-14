package c.a.a.v.k;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final List<c.a.a.v.a> f2533a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f2534b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2535c;

    public l() {
        this.f2533a = new ArrayList();
    }

    public l(PointF pointF, boolean z, List<c.a.a.v.a> list) {
        this.f2534b = pointF;
        this.f2535c = z;
        this.f2533a = new ArrayList(list);
    }

    private void a(float f2, float f3) {
        if (this.f2534b == null) {
            this.f2534b = new PointF();
        }
        this.f2534b.set(f2, f3);
    }

    public List<c.a.a.v.a> a() {
        return this.f2533a;
    }

    public void a(l lVar, l lVar2, float f2) {
        if (this.f2534b == null) {
            this.f2534b = new PointF();
        }
        this.f2535c = lVar.c() || lVar2.c();
        if (lVar.a().size() != lVar2.a().size()) {
            c.a.a.y.d.b("Curves must have the same number of control points. Shape 1: " + lVar.a().size() + "\tShape 2: " + lVar2.a().size());
        }
        int min = Math.min(lVar.a().size(), lVar2.a().size());
        if (this.f2533a.size() < min) {
            for (int size = this.f2533a.size(); size < min; size++) {
                this.f2533a.add(new c.a.a.v.a());
            }
        } else if (this.f2533a.size() > min) {
            for (int size2 = this.f2533a.size() - 1; size2 >= min; size2--) {
                List<c.a.a.v.a> list = this.f2533a;
                list.remove(list.size() - 1);
            }
        }
        PointF b2 = lVar.b();
        PointF b3 = lVar2.b();
        a(c.a.a.y.g.c(b2.x, b3.x, f2), c.a.a.y.g.c(b2.y, b3.y, f2));
        for (int size3 = this.f2533a.size() - 1; size3 >= 0; size3--) {
            c.a.a.v.a aVar = lVar.a().get(size3);
            c.a.a.v.a aVar2 = lVar2.a().get(size3);
            PointF a2 = aVar.a();
            PointF b4 = aVar.b();
            PointF c2 = aVar.c();
            PointF a3 = aVar2.a();
            PointF b5 = aVar2.b();
            PointF c3 = aVar2.c();
            this.f2533a.get(size3).a(c.a.a.y.g.c(a2.x, a3.x, f2), c.a.a.y.g.c(a2.y, a3.y, f2));
            this.f2533a.get(size3).b(c.a.a.y.g.c(b4.x, b5.x, f2), c.a.a.y.g.c(b4.y, b5.y, f2));
            this.f2533a.get(size3).c(c.a.a.y.g.c(c2.x, c3.x, f2), c.a.a.y.g.c(c2.y, c3.y, f2));
        }
    }

    public PointF b() {
        return this.f2534b;
    }

    public boolean c() {
        return this.f2535c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f2533a.size() + "closed=" + this.f2535c + '}';
    }
}
