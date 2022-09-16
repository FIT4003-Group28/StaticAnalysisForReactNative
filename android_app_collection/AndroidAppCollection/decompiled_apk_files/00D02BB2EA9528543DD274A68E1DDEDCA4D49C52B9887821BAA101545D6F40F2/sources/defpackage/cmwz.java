package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
/* compiled from: PG */
/* renamed from: cmwz  reason: default package */
/* loaded from: classes.dex */
public abstract class cmwz extends cmwc {
    final int a;

    public cmwz(int i) {
        this.a = i;
    }

    public abstract void c();

    public abstract void d();

    public final void e(Context context, ddid ddidVar) {
        if (cnjc.a("CAR.TOKEN", 3) && ddidVar != ddid.NO_FALLBACK_GH_CAR_USED) {
            ddidVar.name();
        }
        if (this.a == 1) {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str = runningAppProcessInfo.processName;
                    return;
                }
            }
        } else if (a().l(cniz.SHOULD_LOG_CAR_CLIENT_TOKEN_CONNECTION_EVENT)) {
            ddhz bZ = ddia.d.bZ();
            int i = this.a - 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddia ddiaVar = (ddia) bZ.b;
            int i2 = 1 | ddiaVar.a;
            ddiaVar.a = i2;
            ddiaVar.b = i;
            int i3 = ddidVar.o;
            ddiaVar.a = i2 | 2;
            ddiaVar.c = i3;
            ddia bK = bZ.bK();
            ddib bZ2 = ddic.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddic ddicVar = (ddic) bZ2.b;
            bK.getClass();
            ddicVar.b = bK;
            ddicVar.a |= 2097152;
            try {
                a().g(bZ2.bK().bS(), 59);
            } catch (cmwm unused) {
                ddidVar.name();
            }
        }
    }
}
