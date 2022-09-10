package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqlh  reason: default package */
/* loaded from: classes.dex */
public abstract class cqlh<M extends cqkp> extends bas {
    protected final List<M> b = new ArrayList();
    protected final Map<M, View> c = new HashMap();

    public final void A(@dzsi List<M> list) {
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
        }
        Pa();
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.b.size();
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return this.c.get((cqkp) obj) == view;
    }

    @Override // defpackage.bas
    public final int OX(Object obj) {
        int indexOf = this.b.indexOf((cqkp) obj);
        if (indexOf < 0) {
            return -2;
        }
        return indexOf;
    }

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        M m = this.b.get(i);
        StringBuilder sb = new StringBuilder(34);
        sb.append("Null model at position ");
        sb.append(i);
        dbsk.t(m, sb.toString());
        View z = z(m);
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Null view for model at position ");
        sb2.append(i);
        dbsk.t(z, sb2.toString());
        viewGroup.addView(z);
        cqke.a(s(z)).e(m);
        this.c.put(m, z);
        return m;
    }

    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        cqkp cqkpVar = (cqkp) obj;
        View view = this.c.get(cqkpVar);
        viewGroup.removeView(view);
        cqke.a(s(view)).e(null);
        this.c.remove(cqkpVar);
        t(view);
    }

    protected View s(View view) {
        return view;
    }

    protected void t(View view) {
        throw null;
    }

    protected abstract View z(M m);
}
