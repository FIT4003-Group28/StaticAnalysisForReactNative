package com.google.android.material.datepicker;

import a.g.m.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f8007b;

    /* loaded from: classes.dex */
    class a extends a.g.m.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8007b = o.d();
        if (MaterialDatePicker.g(getContext())) {
            setNextFocusLeftId(c.e.a.c.f.cancel_button);
            setNextFocusRightId(c.e.a.c.f.confirm_button);
        }
        v.a(this, new a(this));
    }

    private static int a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private void a(int i, Rect rect) {
        int a2;
        if (i == 33) {
            a2 = getAdapter2().b();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            a2 = getAdapter2().a();
        }
        setSelection(a2);
    }

    private static boolean a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: collision with other method in class */
    public ListAdapter getAdapter2() {
        return (j) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a2;
        int a3;
        int a4;
        int a5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter2 = getAdapter2();
        d<?> dVar = adapter2.f8053c;
        c cVar = adapter2.f8054d;
        Long mo280getItem = adapter2.mo280getItem(adapter2.a());
        Long mo280getItem2 = adapter2.mo280getItem(adapter2.b());
        for (androidx.core.util.d<Long, Long> dVar2 : dVar.f()) {
            Long l = dVar2.f1593a;
            if (l != null) {
                if (dVar2.f1594b == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = dVar2.f1594b.longValue();
                    if (a(mo280getItem, mo280getItem2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < mo280getItem.longValue()) {
                        a2 = adapter2.a();
                        a3 = adapter2.b(a2) ? 0 : materialCalendarGridView.getChildAt(a2 - 1).getRight();
                    } else {
                        materialCalendarGridView.f8007b.setTimeInMillis(longValue);
                        a2 = adapter2.a(materialCalendarGridView.f8007b.get(5));
                        a3 = a(materialCalendarGridView.getChildAt(a2));
                    }
                    if (longValue2 > mo280getItem2.longValue()) {
                        a4 = adapter2.b();
                        a5 = adapter2.c(a4) ? getWidth() : materialCalendarGridView.getChildAt(a4).getRight();
                    } else {
                        materialCalendarGridView.f8007b.setTimeInMillis(longValue2);
                        a4 = adapter2.a(materialCalendarGridView.f8007b.get(5));
                        a5 = a(materialCalendarGridView.getChildAt(a4));
                    }
                    int itemId = (int) adapter2.getItemId(a2);
                    int itemId2 = (int) adapter2.getItemId(a4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > a2 ? 0 : a3, childAt.getTop() + cVar.f8031a.b(), a4 > numColumns2 ? getWidth() : a5, childAt.getBottom() - cVar.f8031a.a(), cVar.f8038h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().a());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof j) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().a()) {
            i = getAdapter2().a();
        }
        super.setSelection(i);
    }
}
