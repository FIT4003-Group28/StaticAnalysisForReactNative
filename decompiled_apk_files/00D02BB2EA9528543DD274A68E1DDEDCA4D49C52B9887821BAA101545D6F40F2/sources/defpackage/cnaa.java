package defpackage;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.Display;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: cnaa  reason: default package */
/* loaded from: classes.dex */
public final class cnaa {
    private final VirtualDisplay a;
    private Surface b;
    private final cngw c;

    public cnaa(DisplayManager displayManager, String str, int i, int i2, int i3, Surface surface, cngw cngwVar) {
        this.b = surface;
        this.c = cngwVar;
        try {
            VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(str, i, i2, i3, surface, 10);
            if (createVirtualDisplay == null) {
                throw new RuntimeException("Failed to create virtual display");
            }
            this.a = createVirtualDisplay;
        } catch (SecurityException e) {
            throw new RuntimeException("Failed to create virtual display", e);
        }
    }

    public final Display a() {
        return this.a.getDisplay();
    }

    public final synchronized void b(Surface surface) {
        if (surface == this.b) {
            return;
        }
        if (cmwk.a("CAR.PROJECTION", 3)) {
            int i = cnjc.a;
        }
        this.a.setSurface(surface);
        Surface surface2 = this.b;
        if (surface2 != null) {
            surface2.release();
            this.c.a(this.b);
        }
        this.b = surface;
    }

    public final synchronized Surface c() {
        return this.b;
    }

    public final synchronized void d() {
        this.a.release();
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.c.a(this.b);
            this.b = null;
        }
    }
}
