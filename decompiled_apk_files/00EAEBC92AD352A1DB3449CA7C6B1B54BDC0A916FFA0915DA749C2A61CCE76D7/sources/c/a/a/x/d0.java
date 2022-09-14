package c.a.a.x;

import android.graphics.PointF;
import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class d0 implements j0<c.a.a.v.k.l> {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f2627a = new d0();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2628b = c.a.a("c", "v", "i", "o");

    private d0() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public c.a.a.v.k.l mo113a(c.a.a.x.k0.c cVar, float f2) {
        if (cVar.A() == c.b.BEGIN_ARRAY) {
            cVar.a();
        }
        cVar.b();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2628b);
            if (a2 == 0) {
                z = cVar.g();
            } else if (a2 == 1) {
                list = p.e(cVar, f2);
            } else if (a2 == 2) {
                list2 = p.e(cVar, f2);
            } else if (a2 != 3) {
                cVar.B();
                cVar.C();
            } else {
                list3 = p.e(cVar, f2);
            }
        }
        cVar.d();
        if (cVar.A() == c.b.END_ARRAY) {
            cVar.c();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new c.a.a.v.k.l(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new c.a.a.v.a(c.a.a.y.g.a(list.get(i2), list3.get(i2)), c.a.a.y.g.a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new c.a.a.v.a(c.a.a.y.g.a(list.get(i3), list3.get(i3)), c.a.a.y.g.a(pointF3, list2.get(0)), pointF3));
        }
        return new c.a.a.v.k.l(pointF, z, arrayList);
    }
}
