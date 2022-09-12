package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.SectionIndexer;
/* compiled from: PG */
/* renamed from: cqlm  reason: default package */
/* loaded from: classes.dex */
public final class cqlm extends BaseAdapter implements AbsListView.RecyclerListener, SectionIndexer, cqli {
    private static final String[] a = new String[26];
    private final cqlk b;
    private Filter c;

    static {
        for (char c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
            a[c - 'A'] = Character.toString(c);
        }
    }

    public cqlm(cqkj cqkjVar) {
        this.b = new cqlk(cqkjVar);
    }

    private final char c(int i) {
        Object e = this.b.e(i);
        if (e instanceof cqkm) {
            String a2 = ((cqkm) e).a();
            if (!a2.isEmpty()) {
                return Character.toUpperCase(a2.charAt(0));
            }
            return 'A';
        }
        return 'A';
    }

    public final void a(cqix<?> cqixVar) {
        this.b.b(cqixVar);
        notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, cqkp] */
    public final void b(cqlm cqlmVar) {
        this.b.c();
        int count = cqlmVar.getCount();
        for (int i = 0; i < count; i++) {
            cqlk cqlkVar = this.b;
            cqlk cqlkVar2 = cqlmVar.b;
            cqlkVar.b(cqix.d(cqlkVar2.h(cqlkVar2.f(i)), cqlmVar.b.e(i), cqlmVar.b.g(i)));
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.d();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.c == null) {
            this.c = new cqll();
        }
        return this.c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.e(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.b.f(i);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        int i2 = 0;
        int max = Math.max(0, i);
        String[] strArr = a;
        int length = strArr.length;
        char charAt = strArr[Math.min(max, 25)].charAt(0);
        int d = this.b.d() - 1;
        while (i2 < d) {
            int i3 = (i2 + d) / 2;
            char c = c(i3);
            if (c == charAt) {
                return i3;
            }
            if (c < charAt) {
                i2 = i3 + 1;
            } else {
                d = i3 - 1;
            }
        }
        return i2;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        return c(Math.min(Math.max(0, i), this.b.d())) - 'A';
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r2.j().equals(r1.h(r0)) != false) goto L7;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            int r0 = r3.getItemViewType(r4)
            cqlk r1 = r3.b
            if (r5 != 0) goto L9
            goto L1f
        L9:
            cqkj r2 = r1.c
            cqkf r2 = defpackage.cqke.a(r5)
            if (r2 == 0) goto L1f
            cqiw r2 = r2.j()
            cqiw r1 = r1.h(r0)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L25
        L1f:
            cqlk r5 = r3.b
            android.view.View r5 = r5.i(r6, r0)
        L25:
            cqlk r6 = r3.b
            r6.j(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqlm.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        cqlk cqlkVar = this.b;
        int i = cqlkVar.d;
        if (i == 0) {
            int max = Math.max(1, cqlkVar.a.keySet().size());
            cqlkVar.d = max;
            return max;
        }
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.b.g(i);
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        cqlk.k(view);
    }
}
