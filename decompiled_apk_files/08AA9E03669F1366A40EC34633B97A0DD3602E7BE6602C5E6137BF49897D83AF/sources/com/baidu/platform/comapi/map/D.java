package com.baidu.platform.comapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.inner.Point;
/* loaded from: classes.dex */
public class D {
    private static final String t = "D";
    public double m;
    public double n;
    public int o;
    public String p;
    public float q;
    public boolean r;
    public int s;

    /* renamed from: a  reason: collision with root package name */
    public float f2026a = 12.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f2027b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2028c = 0;

    /* renamed from: d  reason: collision with root package name */
    public double f2029d = 1.2958162E7d;
    public double e = 4825907.0d;
    public long h = 0;
    public long i = 0;
    public int f = -1;
    public int g = -1;
    public b j = new b();
    public a k = new a();
    public boolean l = false;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2030a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f2031b = 0;

        /* renamed from: c  reason: collision with root package name */
        public long f2032c = 0;

        /* renamed from: d  reason: collision with root package name */
        public long f2033d = 0;
        public Point e = new Point(0, 0);
        public Point f = new Point(0, 0);
        public Point g = new Point(0, 0);
        public Point h = new Point(0, 0);

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2034a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2035b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2036c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2037d = 0;

        public b() {
        }
    }

    public Bundle a(C0132e c0132e) {
        if (this.f2026a < c0132e.f2057b) {
            this.f2026a = c0132e.f2057b;
        }
        if (this.f2026a > c0132e.f2056a) {
            this.f2026a = c0132e.f2056a;
        }
        while (this.f2027b < 0) {
            this.f2027b += 360;
        }
        this.f2027b %= 360;
        if (this.f2028c > 0) {
            this.f2028c = 0;
        }
        if (this.f2028c < -45) {
            this.f2028c = -45;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", this.f2026a);
        bundle.putDouble("rotation", this.f2027b);
        bundle.putDouble("overlooking", this.f2028c);
        bundle.putDouble("centerptx", this.f2029d);
        bundle.putDouble("centerpty", this.e);
        bundle.putInt("left", this.j.f2034a);
        bundle.putInt("right", this.j.f2035b);
        bundle.putInt("top", this.j.f2036c);
        bundle.putInt("bottom", this.j.f2037d);
        if (this.f >= 0 && this.g >= 0 && this.f <= this.j.f2035b && this.g <= this.j.f2037d && this.j.f2035b > 0 && this.j.f2037d > 0) {
            int i = this.f - ((this.j.f2035b - this.j.f2034a) / 2);
            int i2 = this.g - ((this.j.f2037d - this.j.f2036c) / 2);
            this.h = i;
            this.i = -i2;
            bundle.putLong("xoffset", this.h);
            bundle.putLong("yoffset", this.i);
        }
        bundle.putInt("lbx", this.k.e.x);
        bundle.putInt("lby", this.k.e.y);
        bundle.putInt("ltx", this.k.f.x);
        bundle.putInt("lty", this.k.f.y);
        bundle.putInt("rtx", this.k.g.x);
        bundle.putInt("rty", this.k.g.y);
        bundle.putInt("rbx", this.k.h.x);
        bundle.putInt("rby", this.k.h.y);
        bundle.putInt("bfpp", this.l ? 1 : 0);
        bundle.putInt("animation", 1);
        bundle.putInt("animatime", this.o);
        bundle.putString("panoid", this.p);
        bundle.putInt("autolink", 0);
        bundle.putFloat("siangle", this.q);
        bundle.putInt("isbirdeye", this.r ? 1 : 0);
        bundle.putInt("ssext", this.s);
        return bundle;
    }

    public void a(Bundle bundle) {
        this.f2026a = (float) bundle.getDouble("level");
        this.f2027b = (int) bundle.getDouble("rotation");
        this.f2028c = (int) bundle.getDouble("overlooking");
        this.f2029d = bundle.getDouble("centerptx");
        this.e = bundle.getDouble("centerpty");
        this.j.f2034a = bundle.getInt("left");
        this.j.f2035b = bundle.getInt("right");
        this.j.f2036c = bundle.getInt("top");
        this.j.f2037d = bundle.getInt("bottom");
        this.h = bundle.getLong("xoffset");
        this.i = bundle.getLong("yoffset");
        if (this.j.f2035b != 0 && this.j.f2037d != 0) {
            int i = (int) this.h;
            int i2 = (int) (-this.i);
            this.f = i + ((this.j.f2035b - this.j.f2034a) / 2);
            this.g = i2 + ((this.j.f2037d - this.j.f2036c) / 2);
        }
        this.k.f2030a = bundle.getLong("gleft");
        this.k.f2031b = bundle.getLong("gright");
        this.k.f2032c = bundle.getLong("gtop");
        this.k.f2033d = bundle.getLong("gbottom");
        if (this.k.f2030a <= -20037508) {
            this.k.f2030a = -20037508L;
        }
        if (this.k.f2031b >= 20037508) {
            this.k.f2031b = 20037508L;
        }
        if (this.k.f2032c >= 20037508) {
            this.k.f2032c = 20037508L;
        }
        if (this.k.f2033d <= -20037508) {
            this.k.f2033d = -20037508L;
        }
        this.k.e.x = bundle.getInt("lbx");
        this.k.e.y = bundle.getInt("lby");
        this.k.f.x = bundle.getInt("ltx");
        this.k.f.y = bundle.getInt("lty");
        this.k.g.x = bundle.getInt("rtx");
        this.k.g.y = bundle.getInt("rty");
        this.k.h.x = bundle.getInt("rbx");
        this.k.h.y = bundle.getInt("rby");
        boolean z = false;
        this.l = bundle.getInt("bfpp") == 1;
        this.m = bundle.getDouble("adapterzoomunit");
        this.n = bundle.getDouble("zoomunit");
        this.p = bundle.getString("panoid");
        this.q = bundle.getFloat("siangle");
        if (bundle.getInt("isbirdeye") != 0) {
            z = true;
        }
        this.r = z;
        this.s = bundle.getInt("ssext");
    }
}
