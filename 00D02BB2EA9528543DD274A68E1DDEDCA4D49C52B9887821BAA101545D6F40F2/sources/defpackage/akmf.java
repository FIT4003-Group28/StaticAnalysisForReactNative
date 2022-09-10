package defpackage;

import android.util.DisplayMetrics;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: akmf  reason: default package */
/* loaded from: classes2.dex */
final class akmf implements Runnable {
    final /* synthetic */ akmg a;

    public akmf(akmg akmgVar) {
        this.a = akmgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvrj.UI_THREAD.c();
        akmg akmgVar = this.a;
        if (!akmgVar.aD) {
            return;
        }
        akoc akocVar = akmgVar.g;
        MajorEvent majorEvent = akmgVar.af;
        akqs a = alao.a(akmgVar.d.a());
        bvrj.UI_THREAD.c();
        if (a != null) {
            DisplayMetrics displayMetrics = akocVar.a.getResources().getDisplayMetrics();
            if (majorEvent.l(a, akqo.l(a, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density))) {
                alax alaxVar = this.a.ag;
                if (alaxVar == null) {
                    return;
                }
                alaxVar.a();
                return;
            }
        }
        alax alaxVar2 = this.a.ag;
        if (alaxVar2 == null) {
            return;
        }
        alaxVar2.b();
    }
}
