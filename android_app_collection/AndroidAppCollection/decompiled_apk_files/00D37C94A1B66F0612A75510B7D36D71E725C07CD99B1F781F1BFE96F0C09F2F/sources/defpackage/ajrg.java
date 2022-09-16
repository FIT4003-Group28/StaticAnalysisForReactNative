package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ajrg  reason: default package */
/* loaded from: classes.dex */
public final class ajrg extends BaseAdapter implements ajrw, ajql {
    private final ajsa b;
    private final HashSet d;
    private final Map c = new WeakHashMap();
    public final ajqc a = new ajqc();
    private ajqm e = ajqr.a;

    public ajrg(ajsk ajskVar, ajsa ajsaVar) {
        this.b = ajsaVar;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        hashSet.add(new ajse(ajskVar, 1));
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ajrw
    public final void g(ajrv ajrvVar) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.a();
    }

    @Override // android.widget.Adapter, defpackage.ajrw
    public final Object getItem(int i) {
        return this.e.c(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.e.b(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int c = this.b.c(getItem(i));
        if (c != -1) {
            return c + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ajru g;
        Object item = getItem(i);
        if (j(i)) {
            view = (View) this.c.get(item);
        }
        if (view == null) {
            int c = this.b.c(item);
            if (c != -1) {
                g = this.b.e(c, viewGroup);
            } else {
                g = new ajqs(viewGroup.getContext());
            }
            View a = g.a();
            akel.n(a, g, c);
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null && !(layoutParams instanceof AbsListView.LayoutParams)) {
                a.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
            }
            view = g.a();
        } else {
            g = akel.g(view);
        }
        View a2 = g.a();
        ajrs f = a2 != null ? akel.f(a2) : null;
        if (f == null) {
            f = new ajrs();
            akel.l(a2, f);
        }
        f.h();
        f.f("position", Integer.valueOf(i));
        this.a.a(f, this.e, i);
        this.e.mH(f, i);
        g.oK(f, item);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ajrv) it.next()).m(g, item);
        }
        if (j(i)) {
            this.c.put(item, view);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.b.d() + 1;
    }

    @Override // defpackage.ajrw
    public final void h(ajqm ajqmVar) {
        ajqmVar.getClass();
        this.e.pl(this);
        this.e = ajqmVar;
        ajqmVar.lT(this);
        notifyDataSetChanged();
    }

    @Override // defpackage.ajrw
    public final void i(ajrv ajrvVar) {
        throw null;
    }

    protected final boolean j(int i) {
        return getItemViewType(i) == -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.c.clear();
    }

    @Override // defpackage.ajql
    public final void pi() {
        notifyDataSetChanged();
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        notifyDataSetChanged();
    }

    @Override // defpackage.ajrw
    public final void rZ(ajrt ajrtVar) {
        throw null;
    }
}
