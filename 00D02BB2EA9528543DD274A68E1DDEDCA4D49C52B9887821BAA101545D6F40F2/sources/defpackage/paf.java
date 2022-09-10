package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: paf  reason: default package */
/* loaded from: classes7.dex */
public final class paf implements pag {
    private final pcg a;

    public paf(Application application, btrm btrmVar, buwj buwjVar, bvjj bvjjVar, ped pedVar, bvrb bvrbVar, dxio dxioVar, cqat cqatVar, btvo btvoVar, String str, pbz pbzVar) {
        pbzVar.a();
        String packageName = application.getPackageName();
        int i = application.getResources().getDisplayMetrics().densityDpi;
        pcg pcgVar = new pcg(packageName, str, i == 213 ? dawo.ANDROID_TVDPI : i >= 640 ? dawo.ANDROID_XXXHDPI : i >= 480 ? dawo.ANDROID_XXHDPI : i >= 320 ? dawo.ANDROID_XHDPI : i >= 240 ? dawo.ANDROID_HDPI : i >= 160 ? dawo.ANDROID_MDPI : i >= 120 ? dawo.ANDROID_LDPI : dawo.UNKNOWN, application.getResources().getDisplayMetrics().density, buwjVar, bvrbVar, dxioVar, bvjjVar, pedVar, cqatVar, btvoVar);
        dceq a = dcet.a();
        a.b(pah.class, new pch(0, pah.class, pcgVar, bvrj.UI_THREAD));
        a.b(gds.class, new pch(1, gds.class, pcgVar, bvrj.UI_THREAD));
        a.b(btas.class, new pch(2, btas.class, pcgVar, bvrj.UI_THREAD));
        btrmVar.g(pcgVar, a.a());
        this.a = pcgVar;
    }

    @Override // defpackage.pag
    public final dutq a() {
        pcg pcgVar = this.a;
        return pcg.b(pcgVar.g, pcgVar.b);
    }

    @Override // defpackage.pag
    public final void b() {
    }
}
