package com.facebook.react.flat;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: RCTText.java */
/* loaded from: classes.dex */
final class z extends ad implements YogaMeasureFunction {

    /* renamed from: d  reason: collision with root package name */
    private static final com.facebook.g.a.c f3435d = new com.facebook.g.a.c().c(false).d(true).a(new com.facebook.g.a.a.a());
    private CharSequence e;
    private l f;
    private float g = 1.0f;
    private float h = BitmapDescriptorFactory.HUE_RED;
    private int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int j = 0;
    private boolean k = true;

    @Override // com.facebook.react.flat.r, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    public z() {
        setMeasureFunction(this);
        l().b(h());
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        SpannableStringBuilder m = m();
        if (TextUtils.isEmpty(m)) {
            this.e = null;
            return com.facebook.yoga.b.a(0, 0);
        }
        this.e = m;
        Layout a2 = a((int) Math.ceil(f), yogaMeasureMode, TextUtils.TruncateAt.END, this.k, this.i, this.i == 1, m, j(), this.h, this.g, k(), i());
        if (this.f != null && !this.f.m()) {
            this.f.a(a2);
        } else {
            this.f = new l(a2);
        }
        return com.facebook.yoga.b.a(this.f.a(), this.f.b());
    }

    @com.facebook.react.uimanager.a.a(a = "lineHeight", c = Double.NaN)
    public void setLineHeight(double d2) {
        if (Double.isNaN(d2)) {
            this.g = 1.0f;
            this.h = BitmapDescriptorFactory.HUE_RED;
        } else {
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = com.facebook.react.uimanager.o.b((float) d2);
        }
        a(true);
    }

    @com.facebook.react.uimanager.a.a(a = "numberOfLines", e = Api.BaseClientBuilder.API_PRIORITY_OTHER)
    public void setNumberOfLines(int i) {
        this.i = i;
        a(true);
    }

    @com.facebook.react.uimanager.a.a(a = "includeFontPadding", f = true)
    public void setIncludeFontPadding(boolean z) {
        this.k = z;
    }

    @Override // com.facebook.react.flat.ad
    protected int h() {
        return a(14.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.r
    public void a(boolean z) {
        dirty();
    }

    @com.facebook.react.uimanager.a.a(a = "textAlign")
    public void setTextAlign(String str) {
        if (str == null || "auto".equals(str)) {
            this.j = 0;
        } else if ("left".equals(str)) {
            this.j = 3;
        } else if ("right".equals(str)) {
            this.j = 5;
        } else if ("center".equals(str)) {
            this.j = 17;
        } else {
            throw new com.facebook.react.bridge.n("Invalid textAlign: " + str);
        }
        a(false);
    }

    public Layout.Alignment i() {
        boolean z = getLayoutDirection() == YogaDirection.RTL;
        int i = this.j;
        char c2 = 4;
        if (i == 3) {
            if (!z) {
                c2 = 3;
            }
            return Layout.Alignment.values()[c2];
        } else if (i != 5) {
            if (i == 17) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            if (z) {
                c2 = 3;
            }
            return Layout.Alignment.values()[c2];
        }
    }

    private static Layout a(int i, YogaMeasureMode yogaMeasureMode, TextUtils.TruncateAt truncateAt, boolean z, int i2, boolean z2, CharSequence charSequence, int i3, float f, float f2, int i4, Layout.Alignment alignment) {
        int i5;
        switch (yogaMeasureMode) {
            case UNDEFINED:
                i5 = 0;
                break;
            case EXACTLY:
                i5 = 1;
                break;
            case AT_MOST:
                i5 = 2;
                break;
            default:
                throw new IllegalStateException("Unexpected size mode: " + yogaMeasureMode);
        }
        f3435d.a(truncateAt).c(i2).b(z2).a(charSequence).a(i3).a(i, i5);
        f3435d.b(i4);
        f3435d.a(android.support.v4.h.c.f429c);
        f3435d.a(z);
        f3435d.a(f);
        f3435d.b(f2);
        f3435d.a(alignment);
        Layout a2 = f3435d.a();
        f3435d.a((CharSequence) null);
        return a2;
    }
}
