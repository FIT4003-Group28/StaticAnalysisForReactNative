package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.maps.R;
import java.util.Calendar;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private static int b(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final czyd getAdapter2() {
        return (czyd) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int e;
        int b;
        int e2;
        int b2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        czyd adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.c;
        czxf czxfVar = adapter2.e;
        Long item = adapter2.getItem(adapter2.c());
        Long item2 = adapter2.getItem(adapter2.d());
        for (mx<Long, Long> mxVar : dateSelector.d()) {
            Long l = mxVar.a;
            if (l != null && mxVar.b != null) {
                long longValue = l.longValue();
                long longValue2 = mxVar.b.longValue();
                if (!(item == null || item2 == null || Long.valueOf(longValue).longValue() > item2.longValue() || Long.valueOf(longValue2).longValue() < item.longValue())) {
                    int s = od.s(this);
                    if (longValue < item.longValue()) {
                        e = adapter2.c();
                        if (e % adapter2.b.d == 0) {
                            b = 0;
                        } else if (s != 1) {
                            b = materialCalendarGridView.getChildAt(e - 1).getRight();
                        } else {
                            b = materialCalendarGridView.getChildAt(e - 1).getLeft();
                        }
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue);
                        e = adapter2.e(materialCalendarGridView.a.get(5));
                        b = b(materialCalendarGridView.getChildAt(e));
                    }
                    if (longValue2 > item2.longValue()) {
                        e2 = Math.min(adapter2.d(), getChildCount() - 1);
                        if ((e2 + 1) % adapter2.b.d == 0) {
                            b2 = getWidth();
                        } else if (s != 1) {
                            b2 = materialCalendarGridView.getChildAt(e2).getRight();
                        } else {
                            b2 = materialCalendarGridView.getChildAt(e2).getLeft();
                        }
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue2);
                        e2 = adapter2.e(materialCalendarGridView.a.get(5));
                        b2 = b(materialCalendarGridView.getChildAt(e2));
                    }
                    int itemId = (int) adapter2.getItemId(e);
                    int itemId2 = (int) adapter2.getItemId(e2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        int top = childAt.getTop() + czxfVar.a.c();
                        int bottom = childAt.getBottom() - czxfVar.a.d();
                        czyd czydVar = adapter2;
                        if (s != 1) {
                            i = numColumns > e ? 0 : b;
                            i2 = e2 > numColumns2 ? getWidth() : b2;
                        } else {
                            int i3 = e2 > numColumns2 ? 0 : b2;
                            if (numColumns > e) {
                                i = i3;
                                i2 = getWidth();
                            } else {
                                i = i3;
                                i2 = b;
                            }
                        }
                        canvas.drawRect(i, top, i2, bottom, czxfVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter2 = czydVar;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter2().d());
        } else if (i == 130) {
            setSelection(getAdapter2().c());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().c()) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(getAdapter2().c());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof czyd)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), czyd.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().c()) {
            super.setSelection(getAdapter2().c());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = czyn.b();
        if (czxy.aM(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.b = czxy.aN(getContext(), R.attr.nestedScrollable);
        od.c(this, new czxt());
    }
}
