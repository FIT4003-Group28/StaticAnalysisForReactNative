package com.facebook.react.modules.debug;

import com.facebook.react.bridge.aj;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: FpsDebugFrameCallback.java */
/* loaded from: classes.dex */
public class b extends a.AbstractC0069a {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.modules.core.a f3549a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f3550b;

    /* renamed from: c  reason: collision with root package name */
    private final UIManagerModule f3551c;
    private TreeMap<Long, a> m;
    private boolean e = false;
    private long f = -1;
    private long g = -1;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private boolean l = false;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.modules.debug.a f3552d = new com.facebook.react.modules.debug.a();

    /* compiled from: FpsDebugFrameCallback.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3553a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3554b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3555c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3556d;
        public final double e;
        public final double f;
        public final int g;

        public a(int i, int i2, int i3, int i4, double d2, double d3, int i5) {
            this.f3553a = i;
            this.f3554b = i2;
            this.f3555c = i3;
            this.f3556d = i4;
            this.e = d2;
            this.f = d3;
            this.g = i5;
        }
    }

    public b(com.facebook.react.modules.core.a aVar, aj ajVar) {
        this.f3549a = aVar;
        this.f3550b = ajVar;
        this.f3551c = (UIManagerModule) ajVar.b(UIManagerModule.class);
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0069a
    public void b(long j) {
        if (this.e) {
            return;
        }
        if (this.f == -1) {
            this.f = j;
        }
        long j2 = this.g;
        this.g = j;
        if (this.f3552d.a(j2, j)) {
            this.k++;
        }
        this.h++;
        int j3 = j();
        if ((j3 - this.i) - 1 >= 4) {
            this.j++;
        }
        if (this.l) {
            com.facebook.j.a.a.b(this.m);
            this.m.put(Long.valueOf(System.currentTimeMillis()), new a(h(), i(), j3, this.j, f(), g(), k()));
        }
        this.i = j3;
        this.f3549a.a(this);
    }

    public void c() {
        this.e = false;
        this.f3550b.a().addBridgeIdleDebugListener(this.f3552d);
        this.f3551c.setViewHierarchyUpdateDebugListener(this.f3552d);
        this.f3549a.a(this);
    }

    public void d() {
        this.m = new TreeMap<>();
        this.l = true;
        c();
    }

    public void e() {
        this.e = true;
        this.f3550b.a().removeBridgeIdleDebugListener(this.f3552d);
        this.f3551c.setViewHierarchyUpdateDebugListener(null);
    }

    public double f() {
        if (this.g == this.f) {
            return 0.0d;
        }
        return (h() * 1.0E9d) / (this.g - this.f);
    }

    public double g() {
        if (this.g == this.f) {
            return 0.0d;
        }
        return (i() * 1.0E9d) / (this.g - this.f);
    }

    public int h() {
        return this.h - 1;
    }

    public int i() {
        return this.k - 1;
    }

    public int j() {
        return (int) ((k() / 16.9d) + 1.0d);
    }

    public int k() {
        return ((int) (this.g - this.f)) / 1000000;
    }

    public a a(long j) {
        com.facebook.j.a.a.a(this.m, "FPS was not recorded at each frame!");
        Map.Entry<Long, a> floorEntry = this.m.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }
}
