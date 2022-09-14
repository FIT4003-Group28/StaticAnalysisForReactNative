package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
/* compiled from: NativeViewHierarchyManager.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f3910a = "k";

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.a.d f3911b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<View> f3912c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<ViewManager> f3913d;
    private final SparseBooleanArray e;
    private final as f;
    private final com.facebook.react.g.a g;
    private final RootViewManager h;
    private final com.facebook.react.uimanager.c.f i;
    private boolean j;

    public k(as asVar) {
        this(asVar, new RootViewManager());
    }

    public k(as asVar, RootViewManager rootViewManager) {
        this.g = new com.facebook.react.g.a();
        this.i = new com.facebook.react.uimanager.c.f();
        this.f3911b = new com.facebook.react.a.d();
        this.f = asVar;
        this.f3912c = new SparseArray<>();
        this.f3913d = new SparseArray<>();
        this.e = new SparseBooleanArray();
        this.h = rootViewManager;
    }

    public final synchronized View a(int i) {
        View view;
        view = this.f3912c.get(i);
        if (view == null) {
            throw new e("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager b(int i) {
        ViewManager viewManager;
        viewManager = this.f3913d.get(i);
        if (viewManager == null) {
            throw new e("ViewManager for tag " + i + " could not be found");
        }
        return viewManager;
    }

    public com.facebook.react.a.d a() {
        return this.f3911b;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public synchronized void a(int i, y yVar) {
        com.facebook.react.bridge.ap.b();
        try {
            b(i).updateProperties(a(i), yVar);
        } catch (e e) {
            String str = f3910a;
            Log.e(str, "Unable to update properties for view tag " + i, e);
        }
    }

    public synchronized void a(int i, Object obj) {
        com.facebook.react.bridge.ap.b();
        b(i).updateExtraData(a(i), obj);
    }

    public synchronized void a(int i, int i2, int i3, int i4, int i5, int i6) {
        com.facebook.react.bridge.ap.b();
        com.facebook.m.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i).a("tag", i2).a();
        View a2 = a(i2);
        a2.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        ViewParent parent = a2.getParent();
        if (parent instanceof aa) {
            parent.requestLayout();
        }
        if (!this.e.get(i)) {
            ViewManager viewManager = this.f3913d.get(i);
            if (viewManager instanceof ViewGroupManager) {
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                if (viewGroupManager != null && !viewGroupManager.needsCustomLayoutForChildren()) {
                    a(a2, i3, i4, i5, i6);
                }
            } else {
                throw new e("Trying to use view with tag " + i2 + " as a parent, but its Manager doesn't extends ViewGroupManager");
            }
        } else {
            a(a2, i3, i4, i5, i6);
        }
        com.facebook.m.a.b(0L);
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        if (this.j && this.i.a(view)) {
            this.i.a(view, i, i2, i3, i4);
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public synchronized void a(af afVar, int i, String str, y yVar) {
        com.facebook.react.bridge.ap.b();
        com.facebook.m.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i).a("className", str).a();
        ViewManager a2 = this.f.a(str);
        View createView = a2.createView(afVar, this.g);
        this.f3912c.put(i, createView);
        this.f3913d.put(i, a2);
        createView.setId(i);
        if (yVar != null) {
            a2.updateProperties(createView, yVar);
        }
        com.facebook.m.a.b(0L);
    }

    private static String a(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, ap[] apVarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 < viewGroupManager.getChildCount(viewGroup) && i2 < 16) {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 < iArr.length && i5 < 16) {
                        sb.append(iArr[i6] + ",");
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (apVarArr != null) {
            sb.append("  viewsToAdd(" + apVarArr.length + "): [\n");
            for (int i7 = 0; i7 < apVarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < apVarArr.length && i8 < 16) {
                        sb.append("[" + apVarArr[i9].f3814c + "," + apVarArr[i9].f3813b + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 < iArr2.length && i11 < 16) {
                        sb.append(iArr2[i12] + ",");
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public synchronized void a(int i, int[] iArr, ap[] apVarArr, int[] iArr2) {
        com.facebook.react.bridge.ap.b();
        final ViewGroup viewGroup = (ViewGroup) this.f3912c.get(i);
        final ViewGroupManager viewGroupManager = (ViewGroupManager) b(i);
        if (viewGroup == null) {
            throw new e("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
        }
        int childCount = viewGroupManager.getChildCount(viewGroup);
        if (iArr != null) {
            int length = iArr.length - 1;
            while (length >= 0) {
                int i2 = iArr[length];
                if (i2 < 0) {
                    throw new e("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
                } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                    throw new e("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
                } else if (i2 >= childCount) {
                    throw new e("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
                } else {
                    View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                    if (!this.j || !this.i.a(childAt) || !a(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, i2);
                    }
                    length--;
                    childCount = i2;
                }
            }
        }
        if (apVarArr != null) {
            for (ap apVar : apVarArr) {
                View view = this.f3912c.get(apVar.f3813b);
                if (view == null) {
                    throw new e("Trying to add unknown view tag: " + apVar.f3813b + "\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
                }
                viewGroupManager.addView(viewGroup, view, apVar.f3814c);
            }
        }
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                final View view2 = this.f3912c.get(i3);
                if (view2 == null) {
                    throw new e("Trying to destroy unknown view tag: " + i3 + "\n detail: " + a(viewGroup, viewGroupManager, iArr, apVarArr, iArr2));
                }
                if (this.j && this.i.a(view2)) {
                    this.i.a(view2, new com.facebook.react.uimanager.c.g() { // from class: com.facebook.react.uimanager.k.1
                        @Override // com.facebook.react.uimanager.c.g
                        public void a() {
                            viewGroupManager.removeView(viewGroup, view2);
                            k.this.a(view2);
                        }
                    });
                } else {
                    a(view2);
                }
            }
        }
    }

    private boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a(int i, ad adVar, af afVar) {
        a(i, (ViewGroup) adVar, afVar);
    }

    protected final synchronized void a(int i, ViewGroup viewGroup, af afVar) {
        if (viewGroup.getId() != -1) {
            throw new e("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.f3912c.put(i, viewGroup);
        this.f3913d.put(i, this.h);
        this.e.put(i, true);
        viewGroup.setId(i);
    }

    protected synchronized void a(View view) {
        com.facebook.react.bridge.ap.b();
        if (!this.e.get(view.getId())) {
            b(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.f3913d.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (this.f3912c.get(childAt.getId()) != null) {
                    a(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.f3912c.remove(view.getId());
        this.f3913d.remove(view.getId());
    }

    public synchronized void c(int i) {
        com.facebook.react.bridge.ap.b();
        if (!this.e.get(i)) {
            com.facebook.react.bridge.ao.a("View with tag " + i + " is not registered as a root view");
        }
        a(this.f3912c.get(i));
        this.e.delete(i);
    }

    public synchronized void a(int i, int[] iArr) {
        com.facebook.react.bridge.ap.b();
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new m("No native view for " + i + " currently exists");
        }
        View view2 = (View) ab.a(view);
        if (view2 == null) {
            throw new m("Native view " + i + " is no longer on screen");
        }
        view2.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized void b(int i, int[] iArr) {
        com.facebook.react.bridge.ap.b();
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new m("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Resources resources = view.getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
        if (identifier > 0) {
            iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
        }
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized int a(int i, float f, float f2) {
        View view;
        com.facebook.react.bridge.ap.b();
        view = this.f3912c.get(i);
        if (view == null) {
            throw new com.facebook.react.bridge.n("Could not find view with tag " + i);
        }
        return ag.a(f, f2, (ViewGroup) view);
    }

    public synchronized void a(int i, int i2, boolean z) {
        if (!z) {
            this.g.a(i2, (ViewParent) null);
            return;
        }
        View view = this.f3912c.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.g.a(i2, (ViewParent) view);
            return;
        }
        if (this.e.get(i)) {
            com.facebook.react.bridge.ao.a("Cannot block native responder on " + i + " that is a root view");
        }
        this.g.a(i2, view.getParent());
    }

    public void b() {
        this.g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.facebook.react.bridge.an anVar) {
        this.i.a(anVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(int i, com.facebook.react.a.a aVar, final com.facebook.react.bridge.d dVar) {
        com.facebook.react.bridge.ap.b();
        View view = this.f3912c.get(i);
        final int c2 = aVar.c();
        if (view != null) {
            aVar.a(new com.facebook.react.a.b() { // from class: com.facebook.react.uimanager.k.2
                @Override // com.facebook.react.a.b
                public void a() {
                    com.facebook.j.a.a.a(k.this.f3911b.b(c2), "Animation was already removed somehow!");
                    if (dVar != null) {
                        dVar.a(false);
                    }
                }
            });
            aVar.a(view);
        } else {
            throw new e("View with tag " + i + " not found");
        }
    }

    public synchronized void a(int i, int i2, com.facebook.react.bridge.am amVar) {
        com.facebook.react.bridge.ap.b();
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new e("Trying to send command to a non-existing view with tag " + i);
        }
        b(i).receiveCommand(view, i2, amVar);
    }

    public synchronized void a(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar) {
        com.facebook.react.bridge.ap.b();
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new com.facebook.react.bridge.n("Could not find view with tag " + i);
        }
        PopupMenu popupMenu = new PopupMenu(d(i), view);
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < amVar.size(); i2++) {
            menu.add(0, 0, i2, amVar.getString(i2));
        }
        a aVar = new a(dVar);
        popupMenu.setOnMenuItemClickListener(aVar);
        popupMenu.setOnDismissListener(aVar);
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeViewHierarchyManager.java */
    /* loaded from: classes.dex */
    public static class a implements PopupMenu.OnDismissListener, PopupMenu.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final com.facebook.react.bridge.d f3921a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3922b;

        private a(com.facebook.react.bridge.d dVar) {
            this.f3922b = false;
            this.f3921a = dVar;
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (!this.f3922b) {
                this.f3921a.a("dismissed");
                this.f3922b = true;
            }
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!this.f3922b) {
                this.f3921a.a("itemSelected", Integer.valueOf(menuItem.getOrder()));
                this.f3922b = true;
                return true;
            }
            return false;
        }
    }

    private af d(int i) {
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new com.facebook.react.bridge.n("Could not find view with tag " + i);
        }
        return (af) view.getContext();
    }

    public void a(int i, int i2) {
        View view = this.f3912c.get(i);
        if (view == null) {
            throw new com.facebook.react.bridge.n("Could not find view with tag " + i);
        }
        com.facebook.react.uimanager.a.a(view, i2);
    }
}
