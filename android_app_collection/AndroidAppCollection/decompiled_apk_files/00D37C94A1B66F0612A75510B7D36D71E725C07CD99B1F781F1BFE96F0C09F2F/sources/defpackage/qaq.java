package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qaq  reason: default package */
/* loaded from: classes4.dex */
public abstract class qaq {
    private static final qbs a;

    static {
        qbs qbsVar;
        qbs qbsVar2 = null;
        try {
            Object newInstance = qap.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                qfl.e("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof qbs) {
                        qbsVar = (qbs) queryLocalInterface;
                    } else {
                        qbsVar = new qbs(iBinder);
                    }
                    qbsVar2 = qbsVar;
                }
            }
        } catch (Exception unused) {
            qfl.e("Failed to instantiate ClientApi class.");
        }
        a = qbsVar2;
    }

    private final Object e() {
        qbs qbsVar = a;
        if (qbsVar == null) {
            qfl.e("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(qbsVar);
        } catch (RemoteException e) {
            qfl.f("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object f() {
        try {
            return b();
        } catch (RemoteException e) {
            qfl.f("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b();

    protected abstract Object c(qbs qbsVar);

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r6) {
        /*
            r5 = this;
            defpackage.qar.c()
            qrr r0 = defpackage.qrr.d
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.h(r6, r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            java.lang.String r3 = "com.google.android.gms.ads.dynamite"
            int r4 = defpackage.ras.a(r6, r3)
            int r3 = defpackage.ras.b(r6, r3)
            if (r4 <= r3) goto L21
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            r3 = r3 ^ r2
            r0 = r0 | r3
            defpackage.qdb.b(r6)
            qdd r3 = defpackage.qde.a
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L37
        L35:
            r0 = 0
            goto L4a
        L37:
            qdd r3 = defpackage.qde.b
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L48
            r0 = 1
            r1 = 1
            goto L4a
        L48:
            r1 = r0
            goto L35
        L4a:
            if (r1 == 0) goto L59
            java.lang.Object r6 = r5.e()
            if (r6 != 0) goto L9a
            if (r0 != 0) goto L9a
            java.lang.Object r6 = r5.f()
            goto L9a
        L59:
            java.lang.Object r0 = r5.f()
            if (r0 != 0) goto L92
            qdd r1 = defpackage.qdi.a
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            qar r3 = defpackage.qar.a
            java.util.Random r3 = r3.b
            int r1 = r3.nextInt(r1)
            if (r1 != 0) goto L92
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "action"
            java.lang.String r4 = "dynamite_load"
            r1.putString(r3, r4)
            java.lang.String r3 = "is_missing"
            r1.putInt(r3, r2)
            defpackage.qar.c()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = defpackage.qar.b()
            java.lang.String r2 = r2.a
            defpackage.qga.i(r6, r2, r1)
        L92:
            if (r0 != 0) goto L99
            java.lang.Object r6 = r5.e()
            goto L9a
        L99:
            r6 = r0
        L9a:
            if (r6 != 0) goto La0
            java.lang.Object r6 = r5.a()
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaq.d(android.content.Context):java.lang.Object");
    }
}
