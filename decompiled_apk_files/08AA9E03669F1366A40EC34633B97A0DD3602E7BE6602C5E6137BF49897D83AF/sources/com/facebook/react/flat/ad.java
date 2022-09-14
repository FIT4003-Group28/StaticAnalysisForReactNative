package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: RCTVirtualText.java */
/* loaded from: classes.dex */
class ad extends r {

    /* renamed from: d  reason: collision with root package name */
    private t f3375d = t.f3418a;
    private ae e = ae.f3376a;

    protected int h() {
        return -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.flat.q, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void addChildAt(com.facebook.react.uimanager.x xVar, int i) {
        super.addChildAt(xVar, i);
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.r
    public void b(SpannableStringBuilder spannableStringBuilder) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((r) getChildAt(i)).a(spannableStringBuilder);
        }
    }

    @Override // com.facebook.react.flat.r
    protected void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        this.f3375d.c();
        int i3 = z ? 33 : i == 0 ? 18 : 34;
        spannableStringBuilder.setSpan(this.f3375d, i, i2, i3);
        if (this.e.b() != 0 && this.e.a() != BitmapDescriptorFactory.HUE_RED) {
            this.e.e();
            spannableStringBuilder.setSpan(this.e, i, i2, i3);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((r) getChildAt(i4)).a(spannableStringBuilder, z);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fontSize", d = Float.NaN)
    public void setFontSize(float f) {
        int a2;
        if (Float.isNaN(f)) {
            a2 = h();
        } else {
            a2 = a(f);
        }
        if (this.f3375d.f() != a2) {
            l().b(a2);
            a(true);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "color", c = Double.NaN)
    public void setColor(double d2) {
        if (this.f3375d.d() != d2) {
            l().a(d2);
            a(false);
        }
    }

    @Override // com.facebook.react.flat.q
    public void setBackgroundColor(int i) {
        if (isVirtual()) {
            if (this.f3375d.e() == i) {
                return;
            }
            l().a(i);
            a(false);
            return;
        }
        super.setBackgroundColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "fontFamily")
    public void setFontFamily(String str) {
        if (!TextUtils.equals(this.f3375d.i(), str)) {
            l().a(str);
            a(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r3 >= 500) goto L12;
     */
    @com.facebook.react.uimanager.a.a(a = "fontWeight")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFontWeight(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            if (r5 != 0) goto L7
            r0 = -1
            goto L3c
        L7:
            java.lang.String r3 = "bold"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L11
        Lf:
            r0 = 1
            goto L3c
        L11:
            java.lang.String r3 = "normal"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1a
            goto L3c
        L1a:
            int r3 = a(r5)
            if (r3 != r1) goto L37
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid font weight "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L37:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r3 < r5) goto L3c
            goto Lf
        L3c:
            com.facebook.react.flat.t r5 = r4.f3375d
            int r5 = r5.h()
            if (r5 == r0) goto L4e
            com.facebook.react.flat.t r5 = r4.l()
            r5.d(r0)
            r4.a(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.ad.setFontWeight(java.lang.String):void");
    }

    @com.facebook.react.uimanager.a.a(a = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        boolean z;
        String[] split;
        boolean z2 = false;
        if (str != null) {
            boolean z3 = false;
            z = false;
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    z3 = true;
                } else if ("line-through".equals(str2)) {
                    z = true;
                }
            }
            z2 = z3;
        } else {
            z = false;
        }
        if (z2 == this.f3375d.j() && z == this.f3375d.k()) {
            return;
        }
        t l = l();
        l.a(z2);
        l.b(z);
        a(true);
    }

    @com.facebook.react.uimanager.a.a(a = "fontStyle")
    public void setFontStyle(String str) {
        int i;
        if (str == null) {
            i = -1;
        } else if ("italic".equals(str)) {
            i = 2;
        } else if (!"normal".equals(str)) {
            throw new RuntimeException("invalid font style " + str);
        } else {
            i = 0;
        }
        if (this.f3375d.g() != i) {
            l().c(i);
            a(true);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowOffset")
    public void setTextShadowOffset(an anVar) {
        float f;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (anVar != null) {
            f = anVar.hasKey("width") ? com.facebook.react.uimanager.o.a(anVar.getDouble("width")) : BitmapDescriptorFactory.HUE_RED;
            if (anVar.hasKey("height")) {
                f2 = com.facebook.react.uimanager.o.a(anVar.getDouble("height"));
            }
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (!this.e.a(f, f2)) {
            i().b(f, f2);
            a(false);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        float a2 = com.facebook.react.uimanager.o.a(f);
        if (this.e.a() != a2) {
            i().a(a2);
            a(false);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowColor", b = "Color", e = 1426063360)
    public void setTextShadowColor(int i) {
        if (this.e.b() != i) {
            i().a(i);
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int j() {
        return this.f3375d.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int k() {
        int g = this.f3375d.g();
        if (g >= 0) {
            return g;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f) {
        return (int) Math.ceil(com.facebook.react.uimanager.o.b(f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t l() {
        if (this.f3375d.b()) {
            this.f3375d = this.f3375d.a();
        }
        return this.f3375d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SpannableStringBuilder m() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder);
        a(spannableStringBuilder, g());
        return spannableStringBuilder;
    }

    private final ae i() {
        if (this.e.d()) {
            this.e = this.e.c();
        }
        return this.e;
    }

    private static int a(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }
}
