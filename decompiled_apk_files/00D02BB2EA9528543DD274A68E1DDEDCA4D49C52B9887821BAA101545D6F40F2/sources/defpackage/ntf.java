package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ntf  reason: default package */
/* loaded from: classes7.dex */
public final class ntf extends FrameLayout {
    private final ArrayList<View> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntf(Context context, View view) {
        super(context);
        List<View> singletonList = Collections.singletonList(view);
        this.a = new ArrayList<>();
        dbsk.s(singletonList);
        for (View view2 : singletonList) {
            dbsk.s(view2);
            this.a.add(view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = arrayList2.get(i3);
            if (indexOfChild(view) >= 0) {
                view.addFocusables(arrayList, i, i2);
            }
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (!this.a.contains(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList2.get(i2);
            if (indexOfChild(view) >= 0 && view.hasFocusable()) {
                arrayList.add(view);
            }
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!this.a.contains(childAt) && childAt.hasFocusable()) {
                arrayList.add(childAt);
            }
        }
        if ((i & 2) == 0) {
            Collections.reverse(arrayList);
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i4 + 1;
            if (nol.a((View) arrayList.get(i4), i, rect)) {
                return true;
            }
            i4 = i5;
        }
        return false;
    }
}
