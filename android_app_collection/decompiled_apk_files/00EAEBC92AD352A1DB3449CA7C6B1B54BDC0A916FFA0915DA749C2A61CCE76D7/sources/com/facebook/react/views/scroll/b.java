package com.facebook.react.views.scroll;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f6200a = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: b  reason: collision with root package name */
    private int f6201b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c  reason: collision with root package name */
    private float f6202c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f6203d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private long f6204e = -11;

    public float a() {
        return this.f6202c;
    }

    public boolean a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.f6204e <= 10 && this.f6200a == i && this.f6201b == i2) ? false : true;
        long j = this.f6204e;
        if (uptimeMillis - j != 0) {
            this.f6202c = (i - this.f6200a) / ((float) (uptimeMillis - j));
            this.f6203d = (i2 - this.f6201b) / ((float) (uptimeMillis - j));
        }
        this.f6204e = uptimeMillis;
        this.f6200a = i;
        this.f6201b = i2;
        return z;
    }

    public float b() {
        return this.f6203d;
    }
}
