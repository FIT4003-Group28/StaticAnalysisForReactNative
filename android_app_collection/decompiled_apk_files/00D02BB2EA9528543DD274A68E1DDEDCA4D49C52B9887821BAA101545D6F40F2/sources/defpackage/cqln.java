package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqln  reason: default package */
/* loaded from: classes.dex */
public final class cqln extends bas {
    public final cqlk a;
    private final cqkj b;
    private final Map<cqkp, View> c = new HashMap();

    public cqln(cqkj cqkjVar) {
        this.a = new cqlk(cqkjVar);
        this.b = cqkjVar;
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.d();
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return this.c.get((cqkp) obj) == view;
    }

    @Override // defpackage.bas
    public final int OX(Object obj) {
        int indexOf = this.a.b.indexOf(obj);
        if (indexOf < 0) {
            return -2;
        }
        return indexOf;
    }

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        cqlk cqlkVar = this.a;
        View i2 = cqlkVar.i(viewGroup, cqlkVar.f(i));
        viewGroup.addView(i2);
        this.a.j(i2, i);
        cqjz<?> g = cqjz.g(i2);
        dbsk.s(g);
        cqkp cqkpVar = g.j;
        this.c.put(cqkpVar, i2);
        return cqkpVar;
    }

    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        cqkp cqkpVar = (cqkp) obj;
        View view = this.c.get(cqkpVar);
        dbsk.s(view);
        viewGroup.removeView(view);
        this.c.remove(cqkpVar);
        cqlk.k(view);
        this.a.c.h(view);
    }

    @Override // defpackage.bas
    public final CharSequence q(int i) {
        cqlk cqlkVar = this.a;
        cqiw<?> h = cqlkVar.h(cqlkVar.f(i));
        this.a.e(i);
        if (h instanceof cqlj) {
            Context context = this.b.d;
            return ((cqlj) h).a();
        }
        return "";
    }
}
