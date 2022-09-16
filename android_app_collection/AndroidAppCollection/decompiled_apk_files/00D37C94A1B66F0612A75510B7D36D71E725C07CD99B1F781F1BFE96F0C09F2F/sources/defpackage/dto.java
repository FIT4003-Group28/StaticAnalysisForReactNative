package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dto  reason: default package */
/* loaded from: classes3.dex */
public final class dto implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dtq b;

    public dto(dtq dtqVar, int i) {
        this.b = dtqVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dnw dnwVar;
        dtq dtqVar = this.b;
        int i = this.a;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = dtqVar.a.getPackageManager().getPackageInfo(dtqVar.a.getPackageName(), 0);
            Context context = dtqVar.a;
            dnwVar = tzh.n(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            dnwVar = null;
        }
        this.b.i = dnwVar;
        if (this.a < 4) {
            if (dnwVar != null && (dnwVar.b & 4194304) != 0 && !dnwVar.s.equals("0000000000000000000000000000000000000000000000000000000000000000") && (dnwVar.d & 16384) != 0) {
                dnz dnzVar = dnwVar.af;
                if (dnzVar == null) {
                    dnzVar = dnz.a;
                }
                if ((dnzVar.b & 1) != 0) {
                    dnz dnzVar2 = dnwVar.af;
                    if (dnzVar2 == null) {
                        dnzVar2 = dnz.a;
                    }
                    if (dnzVar2.c != -2) {
                        return;
                    }
                }
            }
            this.b.e(this.a + 1);
        }
    }
}
