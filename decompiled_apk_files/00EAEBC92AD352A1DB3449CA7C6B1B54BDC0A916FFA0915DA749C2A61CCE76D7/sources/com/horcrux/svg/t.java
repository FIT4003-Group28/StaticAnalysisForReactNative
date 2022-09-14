package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class t extends RenderableView {

    /* renamed from: b  reason: collision with root package name */
    private Path f9705b;

    public t(ReactContext reactContext) {
        super(reactContext);
        s.f9697a = this.mScale;
        this.f9705b = new Path();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        return this.f9705b;
    }

    @com.facebook.react.uimanager.e1.a(name = "d")
    public void setD(String str) {
        this.f9705b = s.a(str);
        this.elements = s.f9702f;
        invalidate();
    }
}
