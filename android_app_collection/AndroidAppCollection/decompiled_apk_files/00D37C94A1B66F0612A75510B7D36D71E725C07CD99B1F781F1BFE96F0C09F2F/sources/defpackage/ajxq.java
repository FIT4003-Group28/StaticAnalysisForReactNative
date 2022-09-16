package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ajxq  reason: default package */
/* loaded from: classes.dex */
public class ajxq implements ajxu {
    private final Set a;
    public int d;

    public ajxq(int i) {
        aqxo.p(i > 0);
        this.d = i;
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // defpackage.ajxu
    public int a() {
        return this.d;
    }

    public void c(int i) {
        aqxo.p(i > 0);
        if (this.d == i) {
            return;
        }
        this.d = i;
        for (ajwh ajwhVar : this.a) {
            ajwl ajwlVar = ajwhVar.a;
            ajwlVar.k = ajwlVar.l(i);
            ajwlVar.u();
            ajwlVar.n();
            ajwlVar.o();
        }
    }

    @Override // defpackage.ajxu
    public final void e(ajwh ajwhVar) {
        this.a.add(ajwhVar);
    }

    @Override // defpackage.ajxu
    public final void f(ajwh ajwhVar) {
        this.a.remove(ajwhVar);
    }
}
