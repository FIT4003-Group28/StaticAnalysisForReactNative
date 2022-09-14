package com.teslamotors.plugins.colorblending;

import android.graphics.Color;
import com.facebook.react.bridge.an;
import java.io.File;
/* compiled from: ColorBlendingSpecification.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static File f5360a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f5361b = "c";

    /* renamed from: c  reason: collision with root package name */
    private float f5362c;

    /* renamed from: d  reason: collision with root package name */
    private float f5363d;
    private float e;
    private double f;
    private double g;
    private double h;
    private String i;
    private String j;

    public c(an anVar) {
        a(anVar);
    }

    private void a(an anVar) {
        an d2;
        this.i = anVar.d("source").getString("uri");
        if (anVar.hasKey("maskImage") && (d2 = anVar.d("maskImage")) != null) {
            this.j = d2.getString("uri");
        }
        this.f5362c = (float) anVar.getDouble("hue");
        this.f5363d = (float) anVar.getDouble("saturation");
        this.e = (float) anVar.getDouble("brightness");
        this.f = anVar.getDouble("alpha");
        this.g = anVar.getDouble("preLightnessVariant");
        this.h = anVar.getDouble("postLightnessVariant");
    }

    public double a() {
        return this.g;
    }

    public double b() {
        return this.h;
    }

    public String c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public String toString() {
        return String.format("%s %s hsv(%s %s %s) alpha:%s pre:%s post:%s", a(this.i), a(this.j), Float.valueOf(this.f5362c), Float.valueOf(this.f5363d), Float.valueOf(this.e), Double.valueOf(this.f), Double.valueOf(this.g), Double.valueOf(this.h));
    }

    public String e() {
        return String.format("%s%s%s%s%s%s%s%s", a(this.i), a(this.j), Float.valueOf(this.f5362c), Float.valueOf(this.f5363d), Float.valueOf(this.e), Double.valueOf(this.f), Double.valueOf(this.g), Double.valueOf(this.h));
    }

    public int f() {
        return Color.HSVToColor(new float[]{this.f5362c * 1.0f, this.f5363d * 0.01f, this.e * 0.01f});
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(47) + 1;
        int indexOf = str.indexOf(63);
        return (lastIndexOf < 0 || indexOf < 0) ? str : str.substring(lastIndexOf, indexOf);
    }

    public File g() {
        return new File(f5360a, String.format("%s.png", Integer.valueOf(e().hashCode())));
    }
}
