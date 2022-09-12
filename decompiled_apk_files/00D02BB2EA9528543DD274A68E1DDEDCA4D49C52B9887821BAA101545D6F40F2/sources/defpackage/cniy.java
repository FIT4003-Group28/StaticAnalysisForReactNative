package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cniy  reason: default package */
/* loaded from: classes5.dex */
public final class cniy {
    public static void a(IllegalStateException illegalStateException) {
        char c;
        String message = illegalStateException.getMessage();
        if (message != null) {
            int hashCode = message.hashCode();
            if (hashCode == 191842363) {
                if (message.equals("OutOfCarLifecycle")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 1028412234) {
                if (hashCode == 1587819759 && message.equals("CarNotSupported")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (message.equals("CarNotConnected")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                if (cnjc.a("CAR.CLIENT", 2)) {
                    illegalStateException.getMessage();
                }
                throw new cmwm(illegalStateException);
            } else if (c == 1) {
                if (cnjc.a("CAR.CLIENT", 2)) {
                    illegalStateException.getMessage();
                }
                throw new cnfd(illegalStateException);
            } else if (c == 2) {
                if (cnjc.a("CAR.CLIENT", 2)) {
                    illegalStateException.getMessage();
                }
                throw new cmwn(illegalStateException);
            } else {
                throw illegalStateException;
            }
        }
        throw illegalStateException;
    }

    public static void b(RemoteException remoteException) {
        if (cnjc.a("CAR.CLIENT", 2)) {
            remoteException.getMessage();
        }
        throw new cnfc(remoteException);
    }

    public static void c(IllegalStateException illegalStateException) {
        try {
            a(illegalStateException);
        } catch (cmwn unused) {
        }
        throw illegalStateException;
    }
}
