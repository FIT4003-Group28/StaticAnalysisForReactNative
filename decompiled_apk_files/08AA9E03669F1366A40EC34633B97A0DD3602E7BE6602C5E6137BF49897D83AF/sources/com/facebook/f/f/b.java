package com.facebook.f.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.common.d.i;
import com.facebook.f.e.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
/* compiled from: GenericDraweeHierarchyBuilder.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final o.b f2459a = o.b.f;

    /* renamed from: b  reason: collision with root package name */
    public static final o.b f2460b = o.b.g;

    /* renamed from: c  reason: collision with root package name */
    private Resources f2461c;

    /* renamed from: d  reason: collision with root package name */
    private int f2462d;
    private float e;
    private Drawable f;
    private o.b g;
    private Drawable h;
    private o.b i;
    private Drawable j;
    private o.b k;
    private Drawable l;
    private o.b m;
    private o.b n;
    private Matrix o;
    private PointF p;
    private ColorFilter q;
    private Drawable r;
    private List<Drawable> s;
    private Drawable t;
    private d u;

    public b(Resources resources) {
        this.f2461c = resources;
        t();
    }

    public static b a(Resources resources) {
        return new b(resources);
    }

    private void t() {
        this.f2462d = 300;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = null;
        this.g = f2459a;
        this.h = null;
        this.i = f2459a;
        this.j = null;
        this.k = f2459a;
        this.l = null;
        this.m = f2459a;
        this.n = f2460b;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
    }

    public Resources a() {
        return this.f2461c;
    }

    public b a(int i) {
        this.f2462d = i;
        return this;
    }

    public int b() {
        return this.f2462d;
    }

    public Drawable c() {
        return this.f;
    }

    public o.b d() {
        return this.g;
    }

    public Drawable e() {
        return this.h;
    }

    public o.b f() {
        return this.i;
    }

    public Drawable g() {
        return this.j;
    }

    public o.b h() {
        return this.k;
    }

    public Drawable i() {
        return this.l;
    }

    public o.b j() {
        return this.m;
    }

    public b a(o.b bVar) {
        this.n = bVar;
        this.o = null;
        return this;
    }

    public o.b k() {
        return this.n;
    }

    public Matrix l() {
        return this.o;
    }

    public PointF m() {
        return this.p;
    }

    public ColorFilter n() {
        return this.q;
    }

    public Drawable o() {
        return this.r;
    }

    public List<Drawable> p() {
        return this.s;
    }

    public Drawable q() {
        return this.t;
    }

    public b a(d dVar) {
        this.u = dVar;
        return this;
    }

    public d r() {
        return this.u;
    }

    private void u() {
        if (this.s != null) {
            for (Drawable drawable : this.s) {
                i.a(drawable);
            }
        }
    }

    public a s() {
        u();
        return new a(this);
    }
}
