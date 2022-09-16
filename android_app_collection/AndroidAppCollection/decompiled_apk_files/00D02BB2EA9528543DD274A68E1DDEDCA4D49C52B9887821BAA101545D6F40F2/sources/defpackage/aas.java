package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: aas  reason: default package */
/* loaded from: classes2.dex */
public final class aas extends zh {
    final int c;
    final int d;
    private aar e;
    private MenuItem f;

    public aas(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.c = 21;
            this.d = 22;
            return;
        }
        this.c = 22;
        this.d = 21;
    }

    @Override // defpackage.zh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        vc vcVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                vcVar = (vc) headerViewListAdapter.getWrappedAdapter();
            } else {
                vcVar = (vc) adapter;
                i = 0;
            }
            vi viVar = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < vcVar.getCount()) {
                viVar = vcVar.getItem(i2);
            }
            MenuItem menuItem = this.f;
            if (menuItem != viVar) {
                vf vfVar = vcVar.a;
                if (menuItem != null) {
                    this.e.a(vfVar, menuItem);
                }
                this.f = viVar;
                if (viVar != null) {
                    this.e.b(vfVar, viVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((vc) getAdapter()).a.q(false);
            return true;
        }
    }

    public void setHoverListener(aar aarVar) {
        this.e = aarVar;
    }

    @Override // defpackage.zh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
