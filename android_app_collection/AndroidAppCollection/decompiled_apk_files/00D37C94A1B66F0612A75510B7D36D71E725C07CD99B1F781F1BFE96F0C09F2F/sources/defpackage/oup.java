package defpackage;

import android.hardware.display.DisplayManager;
/* compiled from: PG */
/* renamed from: oup  reason: default package */
/* loaded from: classes4.dex */
final class oup implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    final /* synthetic */ our b;

    public oup(our ourVar, DisplayManager displayManager) {
        this.b = ourVar;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.b.a();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
