package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: answ  reason: default package */
/* loaded from: classes.dex */
public final class answ {
    public static void b(anro anroVar) {
        int c = anqx.c(anroVar.b);
        if (c == 0) {
            c = 1;
        }
        f(c);
    }

    public static void c(anrs anrsVar) {
        int c = anqx.c(anrsVar.b);
        int i = 1;
        if (c == 0) {
            c = 1;
        }
        f(c);
        int c2 = anqx.c(anrsVar.b);
        if (c2 == 0) {
            c2 = 1;
        }
        int c3 = anqx.c(anrsVar.c);
        if (c3 != 0) {
            i = c3;
        }
        if (c2 == i) {
            if (anrsVar.d < 0) {
                throw new GeneralSecurityException("salt length is negative");
            }
            return;
        }
        throw new GeneralSecurityException("MGF1 hash is different from signature hash");
    }

    public static int d(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 == 3) {
                return 2;
            }
            if (i2 == 4) {
                return 3;
            }
            String str = i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "null" : "CURVE25519" : "NIST_P521" : "NIST_P384" : "NIST_P256" : "UNKNOWN_CURVE" : "UNRECOGNIZED";
            throw new GeneralSecurityException(str.length() != 0 ? "unknown curve type: ".concat(str) : new String("unknown curve type: "));
        }
        return 1;
    }

    public static int e(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                String str = i != 2 ? i != 3 ? i != 4 ? "UNRECOGNIZED" : "DER" : "IEEE_P1363" : "UNKNOWN_ENCODING";
                throw new GeneralSecurityException(str.length() != 0 ? "unknown ECDSA encoding: ".concat(str) : new String("unknown ECDSA encoding: "));
            }
        }
        return i3;
    }

    public static int f(int i) {
        String str;
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 == 3) {
                return 3;
            }
            if (i2 == 4) {
                return 5;
            }
            switch (i) {
                case 2:
                    str = "UNKNOWN_HASH";
                    break;
                case 3:
                    str = "SHA1";
                    break;
                case 4:
                    str = "SHA384";
                    break;
                case 5:
                    str = "SHA256";
                    break;
                case 6:
                    str = "SHA512";
                    break;
                case 7:
                    str = "SHA224";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            throw new GeneralSecurityException(str.length() != 0 ? "unsupported hash type: ".concat(str) : new String("unsupported hash type: "));
        }
        return 4;
    }

    public static int g(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            return i != 4 ? 0 : 6;
        }
        return 2;
    }

    public static int i(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            return i != 3 ? 0 : 5;
        }
        return 2;
    }

    public static int j(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            return i != 4 ? 0 : 6;
        }
        return 2;
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ankt l(java.util.List r4, defpackage.ampt r5, java.util.concurrent.Executor r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r4.next()
            aniq r1 = (defpackage.aniq) r1
            ankt r1 = r1.a()     // Catch: java.lang.Exception -> L4d
            boolean r2 = r1.isDone()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L49
            java.lang.Object r2 = defpackage.anlz.y(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            boolean r3 = r1.isCancelled()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r3 != 0) goto L33
            boolean r2 = r5.a(r2)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r2 == 0) goto Ld
        L33:
            boolean r4 = r0.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r4 == 0) goto L3a
            return r1
        L3a:
            r0.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            goto L5c
        L3e:
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L45
            return r1
        L45:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto L5c
        L49:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto Ld
        L4d:
            r4 = move-exception
            ankt r4 = defpackage.anlz.p(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L59
            return r4
        L59:
            r0.add(r4)
        L5c:
            ambm r4 = new ambm
            r4.<init>(r0, r5, r6)
            int r5 = r4.d
            r6 = -1
            if (r5 != r6) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            defpackage.aqxo.y(r5)
            ankt r5 = r4.b()
            ambl r6 = new ambl
            r6.<init>()
            java.util.concurrent.Executor r4 = r4.c
            r5.qY(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.answ.l(java.util.List, ampt, java.util.concurrent.Executor):ankt");
    }

    public static void m(amau amauVar) {
        if (amauVar instanceof amar) {
            ((amar) amauVar).a();
        }
    }

    public static void a(anql anqlVar) {
        int f = anqx.f(anqlVar.d);
        if (f == 0) {
            f = 1;
        }
        int c = anqx.c(anqlVar.b);
        if (c == 0) {
            c = 1;
        }
        int e = anqx.e(anqlVar.c);
        if (e == 0) {
            e = 1;
        }
        int i = f - 2;
        if (i == 1 || i == 2) {
            int i2 = e - 2;
            if (i2 == 2) {
                if (c != 5) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
                return;
            } else if (i2 == 3) {
                if (c != 4 && c != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
                return;
            } else if (i2 != 4) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            } else {
                if (c != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
                return;
            }
        }
        throw new GeneralSecurityException("unsupported signature encoding");
    }
}
