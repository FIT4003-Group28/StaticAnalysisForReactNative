package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pxy  reason: default package */
/* loaded from: classes4.dex */
public final class pxy implements DisplayManager.DisplayListener, pxw {
    public static final /* synthetic */ int a = 0;
    private final DisplayManager b;
    private pxu c;

    public pxy(DisplayManager displayManager) {
        this.b = displayManager;
    }

    private final Display c() {
        return this.b.getDisplay(0);
    }

    @Override // defpackage.pxw
    public final void a() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    @Override // defpackage.pxw
    public final void b(pxu pxuVar) {
        this.c = pxuVar;
        this.b.registerDisplayListener(this, pxi.s());
        pxuVar.a(c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        pxu pxuVar = this.c;
        if (pxuVar == null || i != 0) {
            return;
        }
        pxuVar.a(c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
