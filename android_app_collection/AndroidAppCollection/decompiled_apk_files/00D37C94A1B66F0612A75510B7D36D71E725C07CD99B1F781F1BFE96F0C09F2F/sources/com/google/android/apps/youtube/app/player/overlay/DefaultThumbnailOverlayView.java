package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultThumbnailOverlayView extends ImageView implements aibj {
    private aibn a;

    public DefaultThumbnailOverlayView(Context context) {
        super(context);
        c(context);
    }

    private final void c(Context context) {
        setBackgroundColor(-16777216);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.a = new kbw(this, context);
    }

    @Override // defpackage.aibj
    public final void b(Bitmap bitmap) {
        this.a.b(bitmap);
    }

    @Override // defpackage.aibj
    public final void kT() {
        this.a.kT();
    }

    @Override // defpackage.aibj
    public final void kU() {
        this.a.kU();
    }

    @Override // defpackage.aibj
    public final void nC() {
        this.a.nC();
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
