package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
/* compiled from: PG */
/* renamed from: ipl  reason: default package */
/* loaded from: classes3.dex */
final class ipl implements fsu {
    final /* synthetic */ ipm a;

    public ipl(ipm ipmVar) {
        this.a = ipmVar;
    }

    @Override // defpackage.fsu
    public final void b(int i, boolean z) {
        avfo g = this.a.e.g();
        if (!z && g != null) {
            ipm ipmVar = this.a;
            if (ipmVar.ch) {
                ipmVar.ct = g.c;
            }
        }
        OfflineModeChangedMealbarController offlineModeChangedMealbarController = (OfflineModeChangedMealbarController) this.a.cs.get();
        if (g == null || !"FElibrary".equals(g.c)) {
            return;
        }
        offlineModeChangedMealbarController.i();
    }

    @Override // defpackage.fsu
    public final boolean d(int i) {
        return true;
    }

    @Override // defpackage.fsu
    public final void e(float f) {
    }

    @Override // defpackage.fsu
    public final void oB(int i) {
    }
}
