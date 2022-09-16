package com.facebook.react.views.text;

import android.os.Build;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
/* loaded from: classes.dex */
public class w {

    /* renamed from: d  reason: collision with root package name */
    protected int f6310d;

    /* renamed from: f  reason: collision with root package name */
    protected int f6312f;
    protected b0 l;
    protected float m;
    protected float n;
    protected float o;
    protected int p;
    protected boolean q;
    protected boolean r;
    protected int s;
    protected int t;
    protected String u;
    protected String v;
    protected float w;
    private final c0 x;

    /* renamed from: a  reason: collision with root package name */
    protected float f6307a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f6308b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f6309c = true;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f6311e = false;

    /* renamed from: g  reason: collision with root package name */
    protected int f6313g = -1;

    /* renamed from: h  reason: collision with root package name */
    protected float f6314h = -1.0f;
    protected float i = -1.0f;
    protected float j = Float.NaN;
    protected int k = 0;

    public w(c0 c0Var) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        this.l = b0.UNSET;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 1.0f;
        this.p = 1426063360;
        this.q = false;
        this.r = false;
        this.s = -1;
        this.t = -1;
        ReadableMap readableMap = null;
        this.u = null;
        this.v = null;
        this.w = Float.NaN;
        this.x = c0Var;
        a(a("numberOfLines", -1));
        c(a("lineHeight", -1.0f));
        b(a("letterSpacing", Float.NaN));
        a(a("allowFontScaling", true));
        d(i("textAlign"));
        a(a("fontSize", -1.0f));
        b(c0Var.d("color") ? Integer.valueOf(c0Var.a("color", 0)) : null);
        b(c0Var.d("foregroundColor") ? Integer.valueOf(c0Var.a("foregroundColor", 0)) : null);
        a(c0Var.d("backgroundColor") ? Integer.valueOf(c0Var.a("backgroundColor", 0)) : null);
        a(i("fontFamily"));
        c(i("fontWeight"));
        b(i("fontStyle"));
        a(h("fontVariant"));
        b(a("includeFontPadding", true));
        f(i("textDecorationLine"));
        e(i("textBreakStrategy"));
        a(c0Var.d("textShadowOffset") ? c0Var.b("textShadowOffset") : readableMap);
        d(a("textShadowRadius", 1));
        b(a("textShadowColor", 1426063360));
        g(i("textTransform"));
    }

    private float a(String str, float f2) {
        return this.x.d(str) ? this.x.a(str, f2) : f2;
    }

    private int a(String str, int i) {
        return this.x.d(str) ? this.x.a(str, i) : i;
    }

    private boolean a(String str, boolean z) {
        return this.x.d(str) ? this.x.a(str, z) : z;
    }

    private com.facebook.yoga.h d() {
        return com.facebook.yoga.h.LTR;
    }

    private ReadableArray h(String str) {
        if (this.x.d(str)) {
            return this.x.a(str);
        }
        return null;
    }

    private String i(String str) {
        if (this.x.d(str)) {
            return this.x.c(str);
        }
        return null;
    }

    private static int j(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public float a() {
        return !Float.isNaN(this.f6307a) && !Float.isNaN(this.w) && (this.w > this.f6307a ? 1 : (this.w == this.f6307a ? 0 : -1)) > 0 ? this.w : this.f6307a;
    }

    public void a(float f2) {
        this.f6314h = f2;
        if (f2 != -1.0f) {
            f2 = (float) Math.ceil(this.f6309c ? com.facebook.react.uimanager.q.c(f2) : com.facebook.react.uimanager.q.b(f2));
        }
        this.f6313g = (int) f2;
    }

    public void a(int i) {
    }

    public void a(ReadableArray readableArray) {
        this.v = s.a(readableArray);
    }

    public void a(ReadableMap readableMap) {
        this.m = 0.0f;
        this.n = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.m = com.facebook.react.uimanager.q.a(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.n = com.facebook.react.uimanager.q.a(readableMap.getDouble("height"));
        }
    }

    public void a(Integer num) {
        this.f6311e = num != null;
        if (this.f6311e) {
            this.f6312f = num.intValue();
        }
    }

    public void a(String str) {
        this.u = str;
    }

    public void a(boolean z) {
        if (z != this.f6309c) {
            this.f6309c = z;
            a(this.f6314h);
            c(this.i);
            b(this.j);
        }
    }

    public float b() {
        float c2 = this.f6309c ? com.facebook.react.uimanager.q.c(this.j) : com.facebook.react.uimanager.q.b(this.j);
        int i = this.f6313g;
        if (i > 0) {
            return c2 / i;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f6313g);
    }

    public void b(float f2) {
        this.j = f2;
    }

    public void b(int i) {
        if (i != this.p) {
            this.p = i;
        }
    }

    public void b(Integer num) {
        this.f6308b = num != null;
        if (this.f6308b) {
            this.f6310d = num.intValue();
        }
    }

    public void b(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.s) {
            this.s = i;
        }
    }

    public void b(boolean z) {
    }

    public int c() {
        int i = this.k;
        if (d() == com.facebook.yoga.h.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i != 3) {
                return i;
            }
            return 5;
        }
        return i;
    }

    public void c(float f2) {
        this.i = f2;
        this.f6307a = f2 == -1.0f ? Float.NaN : this.f6309c ? com.facebook.react.uimanager.q.c(f2) : com.facebook.react.uimanager.q.b(f2);
    }

    public void c(String str) {
        int i = -1;
        int j = str != null ? j(str) : -1;
        if (j >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (j != -1 && j < 500)) {
            i = 0;
        }
        if (i != this.t) {
            this.t = i;
        }
    }

    public void d(float f2) {
        if (f2 != this.o) {
            this.o = f2;
        }
    }

    public void d(String str) {
        int i;
        if (!"justify".equals(str)) {
            int i2 = Build.VERSION.SDK_INT;
            if (str == null || "auto".equals(str)) {
                i = 0;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    i = 5;
                } else if (!"center".equals(str)) {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                } else {
                    i = 1;
                }
            }
            this.k = i;
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        this.k = 3;
    }

    public void e(String str) {
        if (Build.VERSION.SDK_INT >= 23 && str != null && !"highQuality".equals(str) && !"simple".equals(str) && !"balanced".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        }
    }

    public void f(String str) {
        String[] split;
        this.q = false;
        this.r = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.q = true;
                } else if ("strikethrough".equals(str2)) {
                    this.r = true;
                }
            }
        }
    }

    public void g(String str) {
        b0 b0Var;
        if (str == null || "none".equals(str)) {
            b0Var = b0.NONE;
        } else if ("uppercase".equals(str)) {
            b0Var = b0.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            b0Var = b0.LOWERCASE;
        } else if (!"capitalize".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        } else {
            b0Var = b0.CAPITALIZE;
        }
        this.l = b0Var;
    }
}
