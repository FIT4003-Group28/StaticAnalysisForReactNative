package a.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class j extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f637b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f638c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f637b = viewGroup;
        this.f637b.setTag(s.ghost_view_holder, this);
        j0.a(this.f637b).a(this);
        this.f638c = true;
    }

    private int a(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            a(((l) getChildAt(i2)).f656d, arrayList2);
            if (a(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a(ViewGroup viewGroup) {
        return (j) viewGroup.getTag(s.ghost_view_holder);
    }

    private static void a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean a(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT >= 21 && view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(j0.a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    private static boolean a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return a(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f638c) {
            j0.a(this.f637b).b(this);
            j0.a(this.f637b).a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        a(lVar.f656d, arrayList);
        int a2 = a(arrayList);
        if (a2 < 0 || a2 >= getChildCount()) {
            addView(lVar);
        } else {
            addView(lVar, a2);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f638c) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f637b.setTag(s.ghost_view_holder, null);
            j0.a(this.f637b).b(this);
            this.f638c = false;
        }
    }
}
