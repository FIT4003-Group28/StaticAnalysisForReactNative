package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.w;
import java.util.List;
/* loaded from: classes.dex */
public class a extends w {
    private int k;
    private c l;
    private List<com.facebook.react.views.picker.c> m;
    private List<com.facebook.react.views.picker.c> n;
    private Integer o;
    private Integer p;
    private final AdapterView.OnItemSelectedListener q;
    private final Runnable r;

    /* renamed from: com.facebook.react.views.picker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0134a implements AdapterView.OnItemSelectedListener {
        C0134a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (a.this.l != null) {
                a.this.l.a(i);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (a.this.l != null) {
                a.this.l.a(-1);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.measure(View.MeasureSpec.makeMeasureSpec(aVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.this.getHeight(), 1073741824));
            a aVar2 = a.this;
            aVar2.layout(aVar2.getLeft(), a.this.getTop(), a.this.getRight(), a.this.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);
    }

    public a(Context context, int i) {
        super(context, i);
        this.k = 0;
        this.q = new C0134a();
        this.r = new b();
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        setOnItemSelectedListener(null);
        com.facebook.react.views.picker.b bVar = (com.facebook.react.views.picker.b) getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        List<com.facebook.react.views.picker.c> list = this.n;
        if (list != null && list != this.m) {
            this.m = list;
            this.n = null;
            if (bVar == null) {
                bVar = new com.facebook.react.views.picker.b(getContext(), this.m);
                setAdapter((SpinnerAdapter) bVar);
            } else {
                bVar.clear();
                bVar.addAll(this.m);
                bVar.notifyDataSetChanged();
            }
        }
        Integer num = this.o;
        if (num != null && num.intValue() != selectedItemPosition) {
            setSelection(this.o.intValue(), false);
            this.o = null;
        }
        Integer num2 = this.p;
        if (num2 != null && bVar != null && num2 != bVar.a()) {
            bVar.a(this.p);
            this.p = null;
        }
        setOnItemSelectedListener(this.q);
    }

    public int getMode() {
        return this.k;
    }

    public c getOnSelectListener() {
        return this.l;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.q);
        }
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setImmediateSelection(int i) {
        if (i != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i, false);
            setOnItemSelectedListener(this.q);
        }
    }

    public void setOnSelectListener(c cVar) {
        this.l = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedItems(List<com.facebook.react.views.picker.c> list) {
        this.n = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedPrimaryTextColor(Integer num) {
        this.p = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedSelection(int i) {
        this.o = Integer.valueOf(i);
    }
}
