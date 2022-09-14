package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class b extends a.AbstractC0125a {

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.modules.core.a f5651b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactContext f5652c;

    /* renamed from: d  reason: collision with root package name */
    private final UIManagerModule f5653d;
    private TreeMap<Long, C0128b> n;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5655f = false;

    /* renamed from: g  reason: collision with root package name */
    private long f5656g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f5657h = -1;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private boolean m = false;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.react.modules.debug.a f5654e = new com.facebook.react.modules.debug.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f5658b;

        a(b bVar) {
            this.f5658b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f5651b = com.facebook.react.modules.core.a.b();
            b.this.f5651b.a(this.f5658b);
        }
    }

    /* renamed from: com.facebook.react.modules.debug.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5660a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5661b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5662c;

        /* renamed from: d  reason: collision with root package name */
        public final double f5663d;

        /* renamed from: e  reason: collision with root package name */
        public final double f5664e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5665f;

        public C0128b(int i, int i2, int i3, int i4, double d2, double d3, int i5) {
            this.f5660a = i;
            this.f5661b = i2;
            this.f5662c = i3;
            this.f5663d = d2;
            this.f5664e = d3;
            this.f5665f = i5;
        }
    }

    public b(ReactContext reactContext) {
        this.f5652c = reactContext;
        this.f5653d = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0125a
    public void a(long j) {
        if (this.f5655f) {
            return;
        }
        if (this.f5656g == -1) {
            this.f5656g = j;
        }
        long j2 = this.f5657h;
        this.f5657h = j;
        if (this.f5654e.a(j2, j)) {
            this.l++;
        }
        this.i++;
        int b2 = b();
        if ((b2 - this.j) - 1 >= 4) {
            this.k++;
        }
        if (this.m) {
            c.d.k.a.a.a(this.n);
            this.n.put(Long.valueOf(System.currentTimeMillis()), new C0128b(e(), f(), b2, this.k, c(), d(), g()));
        }
        this.j = b2;
        com.facebook.react.modules.core.a aVar = this.f5651b;
        if (aVar == null) {
            return;
        }
        aVar.a(this);
    }

    public int b() {
        return (int) ((g() / 16.9d) + 1.0d);
    }

    public C0128b b(long j) {
        c.d.k.a.a.a(this.n, "FPS was not recorded at each frame!");
        Map.Entry<Long, C0128b> floorEntry = this.n.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public double c() {
        if (this.f5657h == this.f5656g) {
            return 0.0d;
        }
        return (e() * 1.0E9d) / (this.f5657h - this.f5656g);
    }

    public double d() {
        if (this.f5657h == this.f5656g) {
            return 0.0d;
        }
        return (f() * 1.0E9d) / (this.f5657h - this.f5656g);
    }

    public int e() {
        return this.i - 1;
    }

    public int f() {
        return this.l - 1;
    }

    public int g() {
        return ((int) (this.f5657h - this.f5656g)) / 1000000;
    }

    public void h() {
        this.f5655f = false;
        this.f5652c.getCatalystInstance().addBridgeIdleDebugListener(this.f5654e);
        this.f5653d.setViewHierarchyUpdateDebugListener(this.f5654e);
        UiThreadUtil.runOnUiThread(new a(this));
    }

    public void i() {
        this.n = new TreeMap<>();
        this.m = true;
        h();
    }

    public void j() {
        this.f5655f = true;
        this.f5652c.getCatalystInstance().removeBridgeIdleDebugListener(this.f5654e);
        this.f5653d.setViewHierarchyUpdateDebugListener(null);
    }
}
