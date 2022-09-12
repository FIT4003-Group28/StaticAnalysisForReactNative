package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amsd  reason: default package */
/* loaded from: classes2.dex */
public final class amsd {
    private final List<amse> a = new ArrayList();

    private final void f(amri amriVar, boolean z, int i, float f) {
        Iterator<amse> it = this.a.iterator();
        while (it.hasNext()) {
            if (dbsd.a(it.next().a.getClass(), amriVar.getClass())) {
                bvoo.h("Overriding existing scorer of type '%s'. Explicitly remove() the previous definition to silence this warning.", amriVar.getClass().getSimpleName());
                it.remove();
            }
        }
        this.a.add(new amse(amriVar, z, i, f));
    }

    public final amsf a() {
        ArrayList arrayList = new ArrayList(this.a);
        Collections.sort(arrayList, amsc.a);
        return new amsf(arrayList);
    }

    public final void c(amri amriVar) {
        f(amriVar, true, 0, 0.0f);
    }

    public final void d(int i, amri amriVar) {
        f(amriVar, true, i, Float.POSITIVE_INFINITY);
    }

    public final void e(int i, amri amriVar) {
        f(amriVar, false, i, Float.POSITIVE_INFINITY);
    }

    public final void b(int i, amri amriVar, float f) {
        if (f < 0.0f || f >= 1.0f) {
            bvoo.h("threshold must be in range [0:1). Scorer will not be added.", new Object[0]);
        } else {
            f(amriVar, true, i, f);
        }
    }
}
