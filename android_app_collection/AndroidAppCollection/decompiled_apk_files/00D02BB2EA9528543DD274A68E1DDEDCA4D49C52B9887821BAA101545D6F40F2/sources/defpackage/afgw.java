package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: afgw  reason: default package */
/* loaded from: classes2.dex */
public final class afgw {
    public static final dcqe a = dcqe.c("afgw");
    private static final String g = afgw.class.getSimpleName();
    public final Activity b;
    public final efc c;
    public final dxio<afha> d;
    public final afgt e;
    @dzsi
    public final PowerManager.WakeLock f;
    private final Application h;
    private final dxio<ascb> i;

    public afgw(Activity activity, Application application, efc efcVar, dxio<ascb> dxioVar, dxio<afha> dxioVar2) {
        afgt afgtVar = new afgt(activity);
        PowerManager.WakeLock newWakeLock = ((PowerManager) application.getSystemService("power")).newWakeLock(805306374, g);
        this.b = activity;
        this.h = application;
        this.c = efcVar;
        this.i = dxioVar;
        this.d = dxioVar2;
        this.e = afgtVar;
        this.f = newWakeLock;
        if (newWakeLock != null) {
            newWakeLock.setReferenceCounted(false);
        }
    }

    public static boolean a(Activity activity, efc efcVar, affw affwVar) {
        afhx afhxVar = affwVar.c;
        return afhxVar != null && afhxVar.b() && afiq.d(activity) && !efcVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r2 == r0.e) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r4 = this;
            efc r0 = r4.c
            boolean r0 = r0.g()
            r1 = 0
            if (r0 == 0) goto L46
            dxio<ascb> r0 = r4.i
            java.lang.Object r0 = r0.a()
            ascb r0 = (defpackage.ascb) r0
            boolean r0 = r0.g()
            if (r0 == 0) goto L35
            android.app.Application r0 = r4.h
            boolean r0 = defpackage.btox.a(r0)
            if (r0 != 0) goto L41
            afgt r0 = r4.e
            float r2 = r0.c
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L35
            r3 = 1084227584(0x40a00000, float:5.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L41
            float r0 = r0.e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L41
        L35:
            android.app.Activity r0 = r4.b
            android.view.Window r0 = r0.getWindow()
            r2 = 4718720(0x480080, float:6.612335E-39)
            r0.clearFlags(r2)
        L41:
            efc r0 = r4.c
            r0.h(r1)
        L46:
            afgt r0 = r4.e
            boolean r2 = r0.d
            if (r2 == 0) goto L53
            r0.d = r1
            android.hardware.SensorManager r1 = r0.a
            r1.unregisterListener(r0)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgw.b():void");
    }
}
