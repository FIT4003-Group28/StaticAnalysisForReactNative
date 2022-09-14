package com.facebook.react.modules.debug;

import com.facebook.react.b.e;
import com.facebook.react.bridge.ad;
/* compiled from: DidJSUpdateUiDuringFrameDetector.java */
/* loaded from: classes.dex */
public class a implements ad, com.facebook.react.uimanager.b.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f3545a = e.a(20);

    /* renamed from: b  reason: collision with root package name */
    private final e f3546b = e.a(20);

    /* renamed from: c  reason: collision with root package name */
    private final e f3547c = e.a(20);

    /* renamed from: d  reason: collision with root package name */
    private final e f3548d = e.a(20);
    private volatile boolean e = true;

    @Override // com.facebook.react.bridge.ad
    public synchronized void a() {
        this.f3545a.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.ad
    public synchronized void b() {
        this.f3546b.a(System.nanoTime());
    }

    @Override // com.facebook.react.uimanager.b.a
    public synchronized void c() {
        this.f3547c.a(System.nanoTime());
    }

    @Override // com.facebook.react.uimanager.b.a
    public synchronized void d() {
        this.f3548d.a(System.nanoTime());
    }

    public synchronized boolean a(long j, long j2) {
        boolean z;
        boolean a2 = a(this.f3548d, j, j2);
        boolean b2 = b(j, j2);
        z = true;
        if (!a2 && (!b2 || a(this.f3547c, j, j2))) {
            z = false;
        }
        a(this.f3545a, j2);
        a(this.f3546b, j2);
        a(this.f3547c, j2);
        a(this.f3548d, j2);
        this.e = b2;
        return z;
    }

    private static boolean a(e eVar, long j, long j2) {
        for (int i = 0; i < eVar.a(); i++) {
            long b2 = eVar.b(i);
            if (b2 >= j && b2 < j2) {
                return true;
            }
        }
        return false;
    }

    private static long b(e eVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < eVar.a(); i++) {
            long b2 = eVar.b(i);
            if (b2 >= j && b2 < j2) {
                j3 = b2;
            } else if (b2 >= j2) {
                break;
            }
        }
        return j3;
    }

    private boolean b(long j, long j2) {
        long b2 = b(this.f3545a, j, j2);
        long b3 = b(this.f3546b, j, j2);
        if (b2 == -1 && b3 == -1) {
            return this.e;
        }
        return b2 > b3;
    }

    private static void a(e eVar, long j) {
        int a2 = eVar.a();
        int i = 0;
        for (int i2 = 0; i2 < a2; i2++) {
            if (eVar.b(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < a2 - i; i3++) {
                eVar.a(i3, eVar.b(i3 + i));
            }
            eVar.c(i);
        }
    }
}
