package defpackage;

import android.app.Application;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: avto  reason: default package */
/* loaded from: classes3.dex */
public final class avto {
    public final Application a;

    public avto(Application application) {
        this.a = application;
    }

    public final ddqs a() {
        ddqr bZ = ddqs.d.bZ();
        boolean isInteractive = ((PowerManager) this.a.getSystemService("power")).isInteractive();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqs ddqsVar = (ddqs) bZ.b;
        ddqsVar.a |= 1;
        ddqsVar.b = isInteractive;
        return bZ.bK();
    }
}
