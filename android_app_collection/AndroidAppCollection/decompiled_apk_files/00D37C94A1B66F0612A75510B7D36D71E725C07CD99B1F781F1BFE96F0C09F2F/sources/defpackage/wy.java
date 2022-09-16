package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: wy  reason: default package */
/* loaded from: classes4.dex */
public final class wy extends vv {
    final int c;
    final int d;
    public wx e;
    private MenuItem f;

    public wy(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.c = 21;
            this.d = 22;
            return;
        }
        this.c = 22;
        this.d = 21;
    }

    @Override // defpackage.vv, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        sc scVar;
        int i;
        wx wxVar;
        wx wxVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                scVar = (sc) headerViewListAdapter.getWrappedAdapter();
            } else {
                scVar = (sc) adapter;
                i = 0;
            }
            ry ryVar = null;
            si item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= scVar.getCount()) ? null : scVar.getItem(i2);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                sf sfVar = scVar.a;
                if (menuItem != null && (wxVar2 = ((wz) this.e).b) != null) {
                    ((rx) wxVar2).a.a.removeCallbacksAndMessages(sfVar);
                }
                this.f = item;
                if (item != null && (wxVar = ((wz) this.e).b) != null) {
                    rx rxVar = (rx) wxVar;
                    rxVar.a.a.removeCallbacksAndMessages(null);
                    int size = rxVar.a.b.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        } else if (sfVar == ((ry) rxVar.a.b.get(i3)).b) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        if (i4 < rxVar.a.b.size()) {
                            ryVar = (ry) rxVar.a.b.get(i4);
                        }
                        rxVar.a.a.postAtTime(new rw(rxVar, ryVar, item, sfVar), sfVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        sc scVar;
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
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                scVar = (sc) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                scVar = (sc) adapter;
            }
            scVar.a.i(false);
            return true;
        }
    }
}
