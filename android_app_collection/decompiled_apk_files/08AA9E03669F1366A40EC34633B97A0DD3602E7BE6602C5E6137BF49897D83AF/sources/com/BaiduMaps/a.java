package com.BaiduMaps;

import android.content.Context;
/* compiled from: BaiduMapCallout.java */
/* loaded from: classes.dex */
public class a extends com.facebook.react.views.view.f {

    /* renamed from: a  reason: collision with root package name */
    public int f1330a;

    /* renamed from: b  reason: collision with root package name */
    public int f1331b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1332c;

    public a(Context context) {
        super(context);
        this.f1332c = false;
    }

    public void setTooltip(boolean z) {
        this.f1332c = z;
    }

    public boolean getTooltip() {
        return this.f1332c;
    }
}
