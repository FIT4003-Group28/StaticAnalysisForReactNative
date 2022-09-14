package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpst  reason: default package */
/* loaded from: classes5.dex */
public class cpst<T, D> extends cpsr<T, D> {
    private D a;
    private final boolean b;

    public cpst() {
        this.a = null;
        this.b = false;
    }

    @Override // defpackage.cptb
    public boolean a(cpoj<T, D> cpojVar, List<cpvg<T, D>> list) {
        D d = null;
        if (list == null || list.isEmpty()) {
            boolean z = this.b;
        } else {
            float f = Float.MAX_VALUE;
            for (cpvg<T, D> cpvgVar : list) {
                cpvi<T, D> cpviVar = cpvgVar.a;
                float f2 = cpvgVar.c;
                if (f2 < f) {
                    d = cpvgVar.b;
                    f = f2;
                }
            }
        }
        return g(d);
    }

    @Override // defpackage.cptb
    public final boolean f() {
        return this.b || this.a != null;
    }

    public final boolean g(D d) {
        D d2 = this.a;
        this.a = d;
        c();
        boolean z = true;
        if (d2 != null ? d2.equals(this.a) : this.a == null) {
            z = false;
        }
        if (z) {
            b();
        }
        return z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcpvi<TT;TD;>;TD;)Ljava/lang/Object; */
    @Override // defpackage.cptb
    public final int h(cpvi cpviVar, Object obj) {
        if (this.b && this.a == null) {
            Iterator<T> it = cpviVar.e.iterator();
            if (it.hasNext()) {
                T next = it.next();
                cpve d = cpviVar.d(cpvf.c);
                if (d == null) {
                    d = cpviVar.d(cpvf.d);
                }
                this.a = (D) d.a(next, 0, cpviVar);
            }
        }
        D d2 = this.a;
        if (d2 == null) {
            return 2;
        }
        return d2.equals(obj) ? 1 : 3;
    }

    public cpst(boolean z) {
        this.a = null;
        this.b = z;
    }
}
