package com.facebook.react.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: ReactSlider.java */
/* loaded from: classes.dex */
public class a extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private static int f4052a = 128;

    /* renamed from: b  reason: collision with root package name */
    private double f4053b;

    /* renamed from: c  reason: collision with root package name */
    private double f4054c;

    /* renamed from: d  reason: collision with root package name */
    private double f4055d;
    private double e;
    private double f;

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4053b = 0.0d;
        this.f4054c = 0.0d;
        this.f4055d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d2) {
        this.f4054c = d2;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d2) {
        this.f4053b = d2;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d2) {
        this.f4055d = d2;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d2) {
        this.e = d2;
        a();
    }

    public double a(int i) {
        if (i == getMax()) {
            return this.f4054c;
        }
        return (i * getStepValue()) + this.f4053b;
    }

    private void a() {
        if (this.e == 0.0d) {
            this.f = (this.f4054c - this.f4053b) / f4052a;
        }
        setMax(getTotalSteps());
        b();
    }

    private void b() {
        setProgress((int) Math.round(((this.f4055d - this.f4053b) / (this.f4054c - this.f4053b)) * getTotalSteps()));
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f4054c - this.f4053b) / getStepValue());
    }

    private double getStepValue() {
        return this.e > 0.0d ? this.e : this.f;
    }
}
