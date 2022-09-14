package c.e.a.b.d.g;

import java.util.Comparator;
/* loaded from: classes.dex */
final class x3 implements Comparator<v3> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(v3 v3Var, v3 v3Var2) {
        int b2;
        int b3;
        v3 v3Var3 = v3Var;
        v3 v3Var4 = v3Var2;
        a4 a4Var = (a4) v3Var3.iterator();
        a4 a4Var2 = (a4) v3Var4.iterator();
        while (a4Var.hasNext() && a4Var2.hasNext()) {
            b2 = v3.b(a4Var.f());
            b3 = v3.b(a4Var2.f());
            int compare = Integer.compare(b2, b3);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(v3Var3.f(), v3Var4.f());
    }
}
