package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
/* loaded from: classes.dex */
public class a extends u {

    /* renamed from: h  reason: collision with root package name */
    private static int f6242h = 128;

    /* renamed from: c  reason: collision with root package name */
    private double f6243c;

    /* renamed from: d  reason: collision with root package name */
    private double f6244d;

    /* renamed from: e  reason: collision with root package name */
    private double f6245e;

    /* renamed from: f  reason: collision with root package name */
    private double f6246f;

    /* renamed from: g  reason: collision with root package name */
    private double f6247g;

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6243c = 0.0d;
        this.f6244d = 0.0d;
        this.f6245e = 0.0d;
        this.f6246f = 0.0d;
        this.f6247g = 0.0d;
        a();
    }

    private void a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    private void b() {
        if (this.f6246f == 0.0d) {
            this.f6247g = (this.f6244d - this.f6243c) / f6242h;
        }
        setMax(getTotalSteps());
        c();
    }

    private void c() {
        double d2 = this.f6245e;
        double d3 = this.f6243c;
        setProgress((int) Math.round(((d2 - d3) / (this.f6244d - d3)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d2 = this.f6246f;
        return d2 > 0.0d ? d2 : this.f6247g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f6244d - this.f6243c) / getStepValue());
    }

    public double a(int i) {
        return i == getMax() ? this.f6244d : (i * getStepValue()) + this.f6243c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d2) {
        this.f6244d = d2;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d2) {
        this.f6243c = d2;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d2) {
        this.f6246f = d2;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d2) {
        this.f6245e = d2;
        c();
    }
}
