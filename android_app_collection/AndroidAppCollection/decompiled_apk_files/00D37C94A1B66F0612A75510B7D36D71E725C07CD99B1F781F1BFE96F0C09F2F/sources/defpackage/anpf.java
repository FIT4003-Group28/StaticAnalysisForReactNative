package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: anpf  reason: default package */
/* loaded from: classes.dex */
public final class anpf {
    public static void a(anqq anqqVar) {
        anqt anqtVar = anqqVar.b;
        if (anqtVar == null) {
            anqtVar = anqt.a;
        }
        int e = anqx.e(anqtVar.b);
        int i = 1;
        if (e == 0) {
            e = 1;
        }
        antz.k(c(e));
        anqt anqtVar2 = anqqVar.b;
        if (anqtVar2 == null) {
            anqtVar2 = anqt.a;
        }
        int c = anqx.c(anqtVar2.c);
        if (c != 0) {
            i = c;
        }
        b(i);
        int h = anqx.h(anqqVar.d);
        if (h == 0 || h != 2) {
            anqo anqoVar = anqqVar.c;
            if (anqoVar == null) {
                anqoVar = anqo.a;
            }
            anrc anrcVar = anqoVar.b;
            if (anrcVar == null) {
                anrcVar = anrc.a;
            }
            annh.h(anrcVar);
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String b(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return "HmacSha384";
            }
            if (i2 == 3) {
                return "HmacSha256";
            }
            if (i2 == 4) {
                return "HmacSha512";
            }
            if (i2 == 5) {
                return "HmacSha224";
            }
            String num = Integer.toString(anqx.b(i));
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 27);
            sb.append("hash unsupported for HMAC: ");
            sb.append(num);
            throw new NoSuchAlgorithmException(sb.toString());
        }
        return "HmacSha1";
    }

    public static int c(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 == 3) {
                return 2;
            }
            if (i2 == 4) {
                return 3;
            }
            String num = Integer.toString(anqx.d(i));
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 20);
            sb.append("unknown curve type: ");
            sb.append(num);
            throw new GeneralSecurityException(sb.toString());
        }
        return 1;
    }

    public static int d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                String num = Integer.toString(anqx.g(i));
                StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 22);
                sb.append("unknown point format: ");
                sb.append(num);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i3;
    }

    public static boolean e(int i) {
        return i + (-1) != 0 ? !anoq.b() || anoq.a().booleanValue() : !anoq.b();
    }

    public static anmn f(String str) {
        if (!annh.f().containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        return (anmn) annh.f().get(str);
    }
}
