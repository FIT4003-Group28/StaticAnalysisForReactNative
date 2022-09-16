package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExternalSurfaceManager {
    private static final String b = "ExternalSurfaceManager";
    public final axea a;
    private final Object c;
    private volatile axeg d;
    private int e;
    private boolean f;

    public ExternalSurfaceManager(long j) {
        axea axeaVar = new axea(j);
        this.c = new Object();
        this.d = new axeg();
        this.e = 1;
        this.a = axeaVar;
    }

    private final int a(int i, int i2, axee axeeVar, boolean z) {
        int i3;
        synchronized (this.c) {
            axeg axegVar = new axeg(this.d);
            i3 = this.e;
            this.e = i3 + 1;
            axegVar.a.put(Integer.valueOf(i3), new axed(i3, i, i2, axeeVar, z));
            this.d = axegVar;
        }
        return i3;
    }

    private final void b(axef axefVar) {
        axeg axegVar = this.d;
        if (this.f && !axegVar.a.isEmpty()) {
            for (axed axedVar : axegVar.a.values()) {
                axedVar.a();
                axefVar.a(axedVar);
            }
        }
        if (!axegVar.b.isEmpty()) {
            for (axed axedVar2 : axegVar.b.values()) {
                axedVar2.c(this.a);
            }
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext() {
        this.f = true;
        axeg axegVar = this.d;
        if (!axegVar.a.isEmpty()) {
            for (axed axedVar : axegVar.a.values()) {
                axedVar.a();
            }
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.f = false;
        axeg axegVar = this.d;
        if (!axegVar.a.isEmpty()) {
            for (axed axedVar : axegVar.a.values()) {
                if (axedVar.i) {
                    axee axeeVar = axedVar.b;
                    if (axeeVar != null) {
                        axeeVar.a();
                    }
                    axedVar.g.detachFromGLContext();
                    axedVar.i = false;
                }
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        b(new axdz(this, 1));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        b(new axdz(this));
    }

    public int createExternalSurface() {
        return a(-1, -1, null, false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return a(i, i2, new axeh(j, j2), z);
    }

    public Surface getSurface(int i) {
        axeg axegVar = this.d;
        HashMap hashMap = axegVar.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            axed axedVar = (axed) axegVar.a.get(valueOf);
            if (axedVar.i) {
                return axedVar.h;
            }
            return null;
        }
        String str = b;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Surface with ID ");
        sb.append(i);
        sb.append(" does not exist, returning null");
        Log.e(str, sb.toString());
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.c) {
            axeg axegVar = new axeg(this.d);
            HashMap hashMap = axegVar.a;
            Integer valueOf = Integer.valueOf(i);
            axed axedVar = (axed) hashMap.remove(valueOf);
            if (axedVar != null) {
                axegVar.b.put(valueOf, axedVar);
                this.d = axegVar;
            } else {
                String str = b;
                StringBuilder sb = new StringBuilder(48);
                sb.append("Not releasing nonexistent surface ID ");
                sb.append(i);
                Log.e(str, sb.toString());
            }
        }
    }

    public void shutdown() {
        synchronized (this.c) {
            axeg axegVar = this.d;
            this.d = new axeg();
            if (!axegVar.a.isEmpty()) {
                for (Map.Entry entry : axegVar.a.entrySet()) {
                    ((axed) entry.getValue()).c(this.a);
                }
            }
            if (!axegVar.b.isEmpty()) {
                for (Map.Entry entry2 : axegVar.b.entrySet()) {
                    ((axed) entry2.getValue()).c(this.a);
                }
            }
        }
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return a(i, i2, new axeb(runnable, runnable2, handler), false);
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.f = true;
        axeg axegVar = this.d;
        if (!this.d.a.isEmpty()) {
            for (Integer num : this.d.a.keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (axegVar.a.containsKey(entry.getKey())) {
                    ((axed) axegVar.a.get(entry.getKey())).b(((Integer) entry.getValue()).intValue());
                } else {
                    Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
                }
            }
        }
    }
}
