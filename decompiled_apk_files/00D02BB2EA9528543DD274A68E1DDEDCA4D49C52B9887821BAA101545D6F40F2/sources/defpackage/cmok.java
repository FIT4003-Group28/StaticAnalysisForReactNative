package defpackage;

import android.hardware.display.DisplayManager;
/* compiled from: PG */
/* renamed from: cmok  reason: default package */
/* loaded from: classes5.dex */
final class cmok implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    final /* synthetic */ cmom b;

    public cmok(cmom cmomVar, DisplayManager displayManager) {
        this.b = cmomVar;
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
