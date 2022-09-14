package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ARTTextShadowNode.java */
/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: d  reason: collision with root package name */
    private an f3944d;
    private int e = 0;

    @com.facebook.react.uimanager.a.a(a = "frame")
    public void setFrame(an anVar) {
        this.f3944d = anVar;
    }

    @com.facebook.react.uimanager.a.a(a = "alignment", e = 0)
    public void setAlignment(int i) {
        this.e = i;
    }

    @Override // com.facebook.react.views.art.b, com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f) {
        am e;
        if (this.f3944d == null) {
            return;
        }
        float f2 = f * this.f3947b;
        if (f2 <= 0.01f || !this.f3944d.hasKey("lines") || (e = this.f3944d.e("lines")) == null || e.size() == 0) {
            return;
        }
        a(canvas);
        String[] strArr = new String[e.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = e.getString(i);
        }
        String join = TextUtils.join("\n", strArr);
        if (a(paint, f2)) {
            a(paint);
            if (this.f3940a == null) {
                canvas.drawText(join, BitmapDescriptorFactory.HUE_RED, -paint.ascent(), paint);
            } else {
                canvas.drawTextOnPath(join, this.f3940a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            }
        }
        if (b(paint, f2)) {
            a(paint);
            if (this.f3940a == null) {
                canvas.drawText(join, BitmapDescriptorFactory.HUE_RED, -paint.ascent(), paint);
            } else {
                canvas.drawTextOnPath(join, this.f3940a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            }
        }
        b(canvas);
        markUpdateSeen();
    }

    private void a(Paint paint) {
        an d2;
        switch (this.e) {
            case 0:
                paint.setTextAlign(Paint.Align.LEFT);
                break;
            case 1:
                paint.setTextAlign(Paint.Align.RIGHT);
                break;
            case 2:
                paint.setTextAlign(Paint.Align.CENTER);
                break;
        }
        if (this.f3944d == null || !this.f3944d.hasKey("font") || (d2 = this.f3944d.d("font")) == null) {
            return;
        }
        float f = 12.0f;
        if (d2.hasKey("fontSize")) {
            f = (float) d2.getDouble("fontSize");
        }
        paint.setTextSize(f * this.f3948c);
        int i = 0;
        boolean z = d2.hasKey("fontWeight") && "bold".equals(d2.getString("fontWeight"));
        boolean z2 = d2.hasKey("fontStyle") && "italic".equals(d2.getString("fontStyle"));
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        paint.setTypeface(Typeface.create(d2.getString("fontFamily"), i));
    }
}
