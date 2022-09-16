package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: DrawBackgroundColor.java */
/* loaded from: classes.dex */
final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3394c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private final int f3395d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i) {
        this.f3395d = i;
    }

    @Override // com.facebook.react.flat.b
    public void c(Canvas canvas) {
        f3394c.setColor(this.f3395d);
        canvas.drawRect(n(), o(), p(), q(), f3394c);
    }
}
