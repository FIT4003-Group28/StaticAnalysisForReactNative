package com.facebook.react.views.picker;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
/* compiled from: ReactPicker.java */
/* loaded from: classes.dex */
public class a extends Spinner {

    /* renamed from: a  reason: collision with root package name */
    private int f4003a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f4004b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4005c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0073a f4006d;
    private Integer e;
    private final Runnable f;

    /* compiled from: ReactPicker.java */
    /* renamed from: com.facebook.react.views.picker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0073a {
        void a(int i);
    }

    public a(Context context, int i) {
        super(context, i);
        this.f4003a = 0;
        this.f = new Runnable() { // from class: com.facebook.react.views.picker.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.measure(View.MeasureSpec.makeMeasureSpec(a.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.this.getHeight(), 1073741824));
                a.this.layout(a.this.getLeft(), a.this.getTop(), a.this.getRight(), a.this.getBottom());
            }
        };
        this.f4003a = i;
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f);
    }

    public void setOnSelectListener(InterfaceC0073a interfaceC0073a) {
        if (getOnItemSelectedListener() == null) {
            this.f4005c = true;
            setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.facebook.react.views.picker.a.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (!a.this.f4005c && a.this.f4006d != null) {
                        a.this.f4006d.a(i);
                    }
                    a.this.f4005c = false;
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                    if (!a.this.f4005c && a.this.f4006d != null) {
                        a.this.f4006d.a(-1);
                    }
                    a.this.f4005c = false;
                }
            });
        }
        this.f4006d = interfaceC0073a;
    }

    public InterfaceC0073a getOnSelectListener() {
        return this.f4006d;
    }

    public void setStagedSelection(int i) {
        this.e = Integer.valueOf(i);
    }

    public void a() {
        if (this.e != null) {
            setSelectionWithSuppressEvent(this.e.intValue());
            this.e = null;
        }
    }

    private void setSelectionWithSuppressEvent(int i) {
        if (i != getSelectedItemPosition()) {
            this.f4005c = true;
            setSelection(i);
        }
    }

    public Integer getPrimaryColor() {
        return this.f4004b;
    }

    public void setPrimaryColor(Integer num) {
        this.f4004b = num;
    }

    public int getMode() {
        return this.f4003a;
    }
}
