package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ve, vv {
    private static final int[] a = {16842964, 16843049};
    private vf b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // defpackage.vv
    public final void a(vf vfVar) {
        this.b = vfVar;
    }

    @Override // defpackage.ve
    public final boolean b(vi viVar) {
        return this.b.o(viVar, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((vi) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aeq b = aeq.b(context, attributeSet, a, i, 0);
        if (b.p(0)) {
            setBackgroundDrawable(b.d(0));
        }
        if (b.p(1)) {
            setDivider(b.d(1));
        }
        b.q();
    }
}
