package defpackage;

import android.util.Log;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gpt  reason: default package */
/* loaded from: classes3.dex */
public final class gpt implements aafl {
    private final gps a;

    public gpt(gps gpsVar) {
        this.a = gpsVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(aqwo.b)) {
            throw new aafy();
        }
        final gps gpsVar = this.a;
        final String str = ((aqwo) apzgVar.qm(aqwo.b)).c;
        if (gpsVar.a.a() != 3) {
            Runnable runnable = new Runnable() { // from class: gpp
                @Override // java.lang.Runnable
                public final void run() {
                    gps.this.b(str);
                }
            };
            if (gpsVar.a.a() == 3) {
                return;
            }
            slp slpVar = gpsVar.a;
            gpr gprVar = new gpr(runnable);
            slp.b("bindService");
            slp.b("maybeCancelUnBindServiceTask");
            ampq ampqVar = slpVar.b;
            slpVar.d.e = gprVar;
            int a = slpVar.c.a();
            if (a == 2 || a == 3) {
                Log.w("AssistantIntegClient", "#bindService(): calling bindService when service is connected(ing).");
                return;
            }
            slpVar.f = null;
            ampq ampqVar2 = slpVar.d.c.a;
            sll sllVar = slpVar.c;
            ((amzw) ((amzw) sll.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "connect", 88, "AssistantConnector.java")).s("#connect with connector: %s", sllVar.c);
            sllVar.d = anii.h(sllVar.c, new sli((smr) slpVar.e(slpVar.f()).mo39build(), 1), anjk.a);
            sll.b("connect", sllVar.d);
            return;
        }
        gpsVar.b(str);
    }
}
