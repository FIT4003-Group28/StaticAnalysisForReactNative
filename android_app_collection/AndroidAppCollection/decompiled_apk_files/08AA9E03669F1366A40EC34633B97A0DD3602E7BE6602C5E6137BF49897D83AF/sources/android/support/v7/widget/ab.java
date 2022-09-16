package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public class ab extends z implements aa {

    /* renamed from: a  reason: collision with root package name */
    private static Method f877a;

    /* renamed from: b  reason: collision with root package name */
    private aa f878b;

    static {
        try {
            f877a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public ab(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.support.v7.widget.z
    v a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.g.setEnterTransition((Transition) obj);
        }
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.g.setExitTransition((Transition) obj);
        }
    }

    public void a(aa aaVar) {
        this.f878b = aaVar;
    }

    public void c(boolean z) {
        if (f877a != null) {
            try {
                f877a.invoke(this.g, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.v7.widget.aa
    public void b(android.support.v7.view.menu.g gVar, MenuItem menuItem) {
        if (this.f878b != null) {
            this.f878b.b(gVar, menuItem);
        }
    }

    @Override // android.support.v7.widget.aa
    public void a(android.support.v7.view.menu.g gVar, MenuItem menuItem) {
        if (this.f878b != null) {
            this.f878b.a(gVar, menuItem);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a extends v {

        /* renamed from: a  reason: collision with root package name */
        final int f879a;

        /* renamed from: b  reason: collision with root package name */
        final int f880b;

        /* renamed from: c  reason: collision with root package name */
        private aa f881c;

        /* renamed from: d  reason: collision with root package name */
        private MenuItem f882d;

        @Override // android.support.v7.widget.v
        public /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
            return super.a(i, i2, i3, i4, i5);
        }

        @Override // android.support.v7.widget.v
        public /* bridge */ /* synthetic */ boolean a(MotionEvent motionEvent, int i) {
            return super.a(motionEvent, i);
        }

        @Override // android.support.v7.widget.v, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // android.support.v7.widget.v, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // android.support.v7.widget.v, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // android.support.v7.widget.v, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // android.support.v7.widget.v, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.support.v7.widget.v, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f879a = 21;
                this.f880b = 22;
                return;
            }
            this.f879a = 22;
            this.f880b = 21;
        }

        public void setHoverListener(aa aaVar) {
            this.f881c = aaVar;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f879a) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f880b) {
                setSelection(-1);
                ((android.support.v7.view.menu.f) getAdapter()).a().a(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // android.support.v7.widget.v, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            android.support.v7.view.menu.f fVar;
            int pointToPosition;
            int i2;
            if (this.f881c != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (android.support.v7.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (android.support.v7.view.menu.f) adapter;
                }
                android.support.v7.view.menu.h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    hVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f882d;
                if (menuItem != hVar) {
                    android.support.v7.view.menu.g a2 = fVar.a();
                    if (menuItem != null) {
                        this.f881c.a(a2, menuItem);
                    }
                    this.f882d = hVar;
                    if (hVar != null) {
                        this.f881c.b(a2, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
