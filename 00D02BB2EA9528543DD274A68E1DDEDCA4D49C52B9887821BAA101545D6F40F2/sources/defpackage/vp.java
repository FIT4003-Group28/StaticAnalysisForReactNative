package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vp  reason: default package */
/* loaded from: classes7.dex */
public abstract class vp implements AdapterView.OnItemClickListener, vx, vt {
    public Rect g;

    /* JADX INFO: Access modifiers changed from: protected */
    public static vc v(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (vc) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (vc) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean w(vf vfVar) {
        int size = vfVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = vfVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int x(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    @Override // defpackage.vt
    public final void a(Context context, vf vfVar) {
    }

    public abstract void c(boolean z);

    @Override // defpackage.vt
    public final boolean g(vi viVar) {
        return false;
    }

    @Override // defpackage.vt
    public final boolean h(vi viVar) {
        return false;
    }

    public abstract void l(vf vfVar);

    public abstract void n(int i);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        v(listAdapter).a.p((MenuItem) listAdapter.getItem(i), this, true != u() ? 4 : 0);
    }

    public abstract void p(PopupWindow.OnDismissListener onDismissListener);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(boolean z);

    protected boolean u() {
        return true;
    }
}
