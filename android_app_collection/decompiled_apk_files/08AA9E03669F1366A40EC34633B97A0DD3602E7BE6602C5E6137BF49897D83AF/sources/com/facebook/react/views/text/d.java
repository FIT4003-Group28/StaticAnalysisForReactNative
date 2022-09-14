package com.facebook.react.views.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.o;
import com.facebook.react.uimanager.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReactBaseTextShadowNode.java */
/* loaded from: classes.dex */
public abstract class d extends com.facebook.react.uimanager.g {

    /* renamed from: d  reason: collision with root package name */
    protected int f4075d;
    protected int f;
    protected int l;
    protected float m;
    protected float n;
    protected float o;
    protected int p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    protected int t;
    protected int u;
    protected String v;
    protected boolean w;
    protected float x;

    /* renamed from: a  reason: collision with root package name */
    protected float f4072a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f4073b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f4074c = true;
    protected boolean e = false;
    protected int g = -1;
    protected int h = -1;
    protected float i = -1.0f;
    protected float j = -1.0f;
    protected int k = 0;

    public d() {
        this.l = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.m = BitmapDescriptorFactory.HUE_RED;
        this.n = BitmapDescriptorFactory.HUE_RED;
        this.o = 1.0f;
        this.p = 1426063360;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = -1;
        this.u = -1;
        this.v = null;
        this.w = false;
        this.x = Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactBaseTextShadowNode.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f4076a;

        /* renamed from: b  reason: collision with root package name */
        protected int f4077b;

        /* renamed from: c  reason: collision with root package name */
        protected Object f4078c;

        a(int i, int i2, Object obj) {
            this.f4076a = i;
            this.f4077b = i2;
            this.f4078c = obj;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f4078c, this.f4076a, this.f4077b, ((i << 16) & 16711680) | ((this.f4076a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    private static void a(d dVar, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int length = spannableStringBuilder.length();
        int childCount = dVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            x childAt = dVar.getChildAt(i);
            if (childAt instanceof f) {
                spannableStringBuilder.append((CharSequence) ((f) childAt).a());
            } else if (childAt instanceof d) {
                a((d) childAt, spannableStringBuilder, list);
            } else if (childAt instanceof h) {
                spannableStringBuilder.append("I");
                list.add(new a(spannableStringBuilder.length() - "I".length(), spannableStringBuilder.length(), ((h) childAt).a()));
            } else {
                throw new com.facebook.react.uimanager.e("Unexpected view type nested under text node: " + childAt.getClass());
            }
            childAt.markUpdateSeen();
        }
        int length2 = spannableStringBuilder.length();
        if (length2 >= length) {
            if (dVar.f4073b) {
                list.add(new a(length, length2, new ForegroundColorSpan(dVar.f4075d)));
            }
            if (dVar.e) {
                list.add(new a(length, length2, new BackgroundColorSpan(dVar.f)));
            }
            if (dVar.h != -1) {
                list.add(new a(length, length2, new AbsoluteSizeSpan(dVar.h)));
            }
            if (dVar.t != -1 || dVar.u != -1 || dVar.v != null) {
                list.add(new a(length, length2, new b(dVar.t, dVar.u, dVar.v, dVar.getThemedContext().getAssets())));
            }
            if (dVar.q) {
                list.add(new a(length, length2, new UnderlineSpan()));
            }
            if (dVar.r) {
                list.add(new a(length, length2, new StrikethroughSpan()));
            }
            if (dVar.m != BitmapDescriptorFactory.HUE_RED || dVar.n != BitmapDescriptorFactory.HUE_RED) {
                list.add(new a(length, length2, new m(dVar.m, dVar.n, dVar.o, dVar.p)));
            }
            if (!Float.isNaN(dVar.a())) {
                list.add(new a(length, length2, new com.facebook.react.views.text.a(dVar.a())));
            }
            list.add(new a(length, length2, new g(dVar.getReactTag())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Spannable a(d dVar, String str) {
        int ceil;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(dVar, spannableStringBuilder, arrayList);
        if (str != null) {
            spannableStringBuilder.append((CharSequence) str);
        }
        int i = 0;
        if (dVar.h == -1) {
            if (dVar.f4074c) {
                ceil = (int) Math.ceil(o.b(14.0f));
            } else {
                ceil = (int) Math.ceil(o.a(14.0f));
            }
            arrayList.add(new a(0, spannableStringBuilder.length(), new AbsoluteSizeSpan(ceil)));
        }
        dVar.w = false;
        dVar.x = Float.NaN;
        for (a aVar : arrayList) {
            if (aVar.f4078c instanceof n) {
                int f = ((n) aVar.f4078c).f();
                dVar.w = true;
                if (Float.isNaN(dVar.x) || f > dVar.x) {
                    dVar.x = f;
                }
            }
            aVar.a(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }

    private static int a(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public float a() {
        return !Float.isNaN(this.f4072a) && !Float.isNaN(this.x) && (this.x > this.f4072a ? 1 : (this.x == this.f4072a ? 0 : -1)) > 0 ? this.x : this.f4072a;
    }

    @com.facebook.react.uimanager.a.a(a = "numberOfLines", e = -1)
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.g = i;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "lineHeight", d = GroundOverlayOptions.NO_DIMENSION)
    public void setLineHeight(float f) {
        float a2;
        this.j = f;
        if (f == -1.0f) {
            this.f4072a = Float.NaN;
        } else {
            if (this.f4074c) {
                a2 = o.b(f);
            } else {
                a2 = o.a(f);
            }
            this.f4072a = a2;
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "allowFontScaling", f = true)
    public void setAllowFontScaling(boolean z) {
        if (z != this.f4074c) {
            this.f4074c = z;
            setFontSize(this.i);
            setLineHeight(this.j);
            markUpdated();
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textAlign")
    public void setTextAlign(String str) {
        if (str == null || "auto".equals(str)) {
            this.k = 0;
        } else if ("left".equals(str)) {
            this.k = 3;
        } else if ("right".equals(str)) {
            this.k = 5;
        } else if ("center".equals(str)) {
            this.k = 1;
        } else if ("justify".equals(str)) {
            this.k = 3;
        } else {
            throw new com.facebook.react.bridge.n("Invalid textAlign: " + str);
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "fontSize", d = GroundOverlayOptions.NO_DIMENSION)
    public void setFontSize(float f) {
        this.i = f;
        if (f != -1.0f) {
            if (this.f4074c) {
                f = (float) Math.ceil(o.b(f));
            } else {
                f = (float) Math.ceil(o.a(f));
            }
        }
        this.h = (int) f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "color")
    public void setColor(Integer num) {
        this.f4073b = num != null;
        if (this.f4073b) {
            this.f4075d = num.intValue();
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (!isVirtualAnchor()) {
            this.e = num != null;
            if (this.e) {
                this.f = num.intValue();
            }
            markUpdated();
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fontFamily")
    public void setFontFamily(String str) {
        this.v = str;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "fontWeight")
    public void setFontWeight(String str) {
        int i = -1;
        int a2 = str != null ? a(str) : -1;
        if (a2 >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (a2 != -1 && a2 < 500)) {
            i = 0;
        }
        if (i != this.u) {
            this.u = i;
            markUpdated();
        }
    }

    @com.facebook.react.uimanager.a.a(a = "fontStyle")
    public void setFontStyle(String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        if (i != this.t) {
            this.t = i;
            markUpdated();
        }
    }

    @com.facebook.react.uimanager.a.a(a = "includeFontPadding", f = true)
    public void setIncludeFontPadding(boolean z) {
        this.s = z;
    }

    @com.facebook.react.uimanager.a.a(a = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.q = false;
        this.r = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.q = true;
                } else if ("line-through".equals(str2)) {
                    this.r = true;
                }
            }
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "highQuality".equals(str)) {
            this.l = 1;
        } else if ("simple".equals(str)) {
            this.l = 0;
        } else if ("balanced".equals(str)) {
            this.l = 2;
        } else {
            throw new com.facebook.react.bridge.n("Invalid textBreakStrategy: " + str);
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowOffset")
    public void setTextShadowOffset(an anVar) {
        this.m = BitmapDescriptorFactory.HUE_RED;
        this.n = BitmapDescriptorFactory.HUE_RED;
        if (anVar != null) {
            if (anVar.hasKey("width") && !anVar.isNull("width")) {
                this.m = o.a(anVar.getDouble("width"));
            }
            if (anVar.hasKey("height") && !anVar.isNull("height")) {
                this.n = o.a(anVar.getDouble("height"));
            }
        }
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowRadius", e = 1)
    public void setTextShadowRadius(float f) {
        if (f != this.o) {
            this.o = f;
            markUpdated();
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textShadowColor", b = "Color", e = 1426063360)
    public void setTextShadowColor(int i) {
        if (i != this.p) {
            this.p = i;
            markUpdated();
        }
    }
}
