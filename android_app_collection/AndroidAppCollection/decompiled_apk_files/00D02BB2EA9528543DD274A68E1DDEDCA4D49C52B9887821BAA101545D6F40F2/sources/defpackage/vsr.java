package defpackage;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vsr  reason: default package */
/* loaded from: classes7.dex */
public final class vsr implements crzp<aufb> {
    final /* synthetic */ vtb a;

    public vsr(vtb vtbVar) {
        this.a = vtbVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        aufb l = crzmVar.l();
        dbsk.s(l);
        vtb vtbVar = this.a;
        vtbVar.w = l;
        synchronized (vtbVar.v) {
            for (WeakReference<vtw> weakReference : this.a.v) {
                vtw vtwVar = weakReference.get();
                if (vtwVar != null) {
                    vtwVar.d(l);
                }
            }
        }
    }
}
