package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.e;
/* loaded from: classes.dex */
public class a implements NotThreadSafeBridgeIdleDebugListener, com.facebook.react.uimanager.g1.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f5646a = e.c(20);

    /* renamed from: b  reason: collision with root package name */
    private final e f5647b = e.c(20);

    /* renamed from: c  reason: collision with root package name */
    private final e f5648c = e.c(20);

    /* renamed from: d  reason: collision with root package name */
    private final e f5649d = e.c(20);

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f5650e = true;

    private static long a(e eVar, long j, long j2) {
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
            eVar.a(i);
        }
    }

    private boolean b(long j, long j2) {
        long a2 = a(this.f5646a, j, j2);
        long a3 = a(this.f5647b, j, j2);
        return (a2 == -1 && a3 == -1) ? this.f5650e : a2 > a3;
    }

    private static boolean b(e eVar, long j, long j2) {
        for (int i = 0; i < eVar.a(); i++) {
            long b2 = eVar.b(i);
            if (b2 >= j && b2 < j2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.g1.a
    public synchronized void a() {
        this.f5648c.a(System.nanoTime());
    }

    public synchronized boolean a(long j, long j2) {
        boolean z;
        boolean b2 = b(this.f5649d, j, j2);
        boolean b3 = b(j, j2);
        z = true;
        if (!b2 && (!b3 || b(this.f5648c, j, j2))) {
            z = false;
        }
        a(this.f5646a, j2);
        a(this.f5647b, j2);
        a(this.f5648c, j2);
        a(this.f5649d, j2);
        this.f5650e = b3;
        return z;
    }

    @Override // com.facebook.react.uimanager.g1.a
    public synchronized void b() {
        this.f5649d.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f5647b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f5646a.a(System.nanoTime());
    }
}
