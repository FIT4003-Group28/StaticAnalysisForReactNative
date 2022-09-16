package defpackage;

import java.io.Serializable;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aqxo  reason: default package */
/* loaded from: classes2.dex */
public final class aqxo {
    public static void A(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, Integer.valueOf(i)));
    }

    public static void B(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, obj));
    }

    public static void C(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void D(boolean z, String str, Object obj, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, obj, Long.valueOf(j)));
    }

    public static void E(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, obj, obj2));
    }

    public static void F(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        throw new IllegalStateException(k(str, obj, obj2, obj3));
    }

    public static void H(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(R(i, i2, "index"));
        }
    }

    public static int I(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    private static String R(int i, int i2, String str) {
        if (i < 0) {
            return k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return k("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static amqo i(amqo amqoVar) {
        if ((amqoVar instanceof amqq) || (amqoVar instanceof amqp)) {
            return amqoVar;
        }
        if (amqoVar instanceof Serializable) {
            return new amqp(amqoVar);
        }
        return new amqq(amqoVar);
    }

    public static amqo j(Object obj) {
        return new amqr(obj);
    }

    public static String k(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + String.valueOf(name2).length());
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final amqm l(Set set) {
        return new amqm(set);
    }

    public static final void m(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    public static final void n(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    public static final void o(amqm amqmVar, Set set) {
        for (Integer num : amqmVar.b) {
            set.add(Integer.valueOf(num.intValue()));
        }
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void q(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void r(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, Character.valueOf(c)));
    }

    public static void s(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, Integer.valueOf(i)));
    }

    public static void t(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, Long.valueOf(j)));
    }

    public static void u(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, obj));
    }

    public static void v(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void w(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(k(str, obj, obj2));
    }

    public static void y(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void z(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public final synchronized void J() {
    }

    public final synchronized void K() {
    }

    public final synchronized void L() {
    }

    public final synchronized void M() {
    }

    public final synchronized void N() {
    }

    public final synchronized void O() {
    }

    public final synchronized void P() {
    }

    public final synchronized void Q() {
    }

    public static void x(int i, int i2, int i3) {
        String R;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                R = R(i, i3, "start index");
            } else {
                R = (i2 < 0 || i2 > i3) ? R(i2, i3, "end index") : k("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(R);
        }
    }

    public static void G(int i, int i2) {
        String k;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                k = k("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                k = k("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(k);
        }
    }
}
