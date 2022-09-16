package com.airbnb.android.react.maps;

import android.content.Context;
/* compiled from: AirMapCallout.java */
/* loaded from: classes.dex */
public class a extends com.facebook.react.views.view.f {

    /* renamed from: a  reason: collision with root package name */
    public int f1367a;

    /* renamed from: b  reason: collision with root package name */
    public int f1368b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1369c;

    public a(Context context) {
        super(context);
        this.f1369c = false;
    }

    public void setTooltip(boolean z) {
        this.f1369c = z;
    }

    public boolean getTooltip() {
        return this.f1369c;
    }
}
