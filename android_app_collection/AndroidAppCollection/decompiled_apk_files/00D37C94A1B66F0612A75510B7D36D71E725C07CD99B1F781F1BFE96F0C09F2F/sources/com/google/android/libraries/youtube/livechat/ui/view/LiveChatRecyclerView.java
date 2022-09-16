package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveChatRecyclerView extends RecyclerView {
    private final abqg W;
    private float aa;
    private float ab;

    public LiveChatRecyclerView(Context context) {
        super(context);
        abqg abqgVar = new abqg();
        this.W = abqgVar;
        aC(abqgVar);
        af(null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ag(xw xwVar) {
        super.ag(xwVar);
        if (xwVar instanceof WrappedLinearLayoutManager) {
            ((WrappedLinearLayoutManager) xwVar).r(true);
        } else if (!(xwVar instanceof LinearLayoutManager)) {
        } else {
            ((LinearLayoutManager) xwVar).r(true);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.aa = motionEvent.getX();
            this.ab = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.aa - x;
            float f2 = this.ab - y;
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if ((f * f) + (f2 * f2) < scaledTouchSlop * scaledTouchSlop) {
                performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        abqg abqgVar = new abqg();
        this.W = abqgVar;
        aC(abqgVar);
        af(null);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        abqg abqgVar = new abqg();
        this.W = abqgVar;
        aC(abqgVar);
        af(null);
    }
}
