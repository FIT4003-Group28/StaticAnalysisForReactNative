package com.facebook.react.uimanager;

import android.content.Context;
import android.widget.FrameLayout;
/* compiled from: SizeMonitoringFrameLayout.java */
/* loaded from: classes.dex */
public class ad extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f3742a;

    /* compiled from: SizeMonitoringFrameLayout.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public ad(Context context) {
        super(context);
    }

    public void setOnSizeChangedListener(a aVar) {
        this.f3742a = aVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f3742a != null) {
            this.f3742a.a(i, i2, i3, i4);
        }
    }
}
