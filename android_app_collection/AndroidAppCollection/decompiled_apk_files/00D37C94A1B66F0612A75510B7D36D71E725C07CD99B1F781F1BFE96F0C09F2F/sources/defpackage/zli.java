package defpackage;

import android.hardware.display.DisplayManager;
/* compiled from: PG */
/* renamed from: zli  reason: default package */
/* loaded from: classes4.dex */
final class zli implements DisplayManager.DisplayListener {
    final /* synthetic */ zlk a;

    public zli(zlk zlkVar) {
        this.a = zlkVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zlk zlkVar = this.a;
        dt mJ = zlkVar.mJ();
        if (zlkVar.mJ() == null) {
            return;
        }
        int d = zlk.d(mJ);
        if (zlkVar.a != null && Math.abs(zlkVar.b - d) == 180) {
            zlkVar.a.e(d);
        }
        zlkVar.b = d;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
