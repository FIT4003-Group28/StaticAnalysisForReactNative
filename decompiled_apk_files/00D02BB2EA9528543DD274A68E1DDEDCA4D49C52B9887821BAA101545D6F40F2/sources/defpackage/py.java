package defpackage;

import android.widget.ListView;
/* compiled from: PG */
/* renamed from: py  reason: default package */
/* loaded from: classes7.dex */
public final class py extends pt {
    private final ListView f;

    public py(ListView listView) {
        super(listView);
        this.f = listView;
    }

    @Override // defpackage.pt
    public final boolean b(int i) {
        ListView listView = this.f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            return i2 < count || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight();
        } else if (i >= 0) {
            return false;
        } else {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        }
    }

    @Override // defpackage.pt
    public final boolean d() {
        return false;
    }

    @Override // defpackage.pt
    public final void e(int i) {
        this.f.scrollListBy(i);
    }
}
