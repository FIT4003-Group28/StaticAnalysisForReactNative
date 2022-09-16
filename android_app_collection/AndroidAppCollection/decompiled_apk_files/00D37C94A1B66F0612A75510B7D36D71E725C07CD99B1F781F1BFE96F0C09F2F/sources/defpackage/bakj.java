package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: bakj  reason: default package */
/* loaded from: classes2.dex */
public final class bakj {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static bakk a(String str) {
        ConcurrentHashMap concurrentHashMap;
        bakk bakkVar;
        boolean z;
        if (str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        bakk bakkVar2 = (bakk) a.get(str);
        if (bakkVar2 == null) {
            bakz bakzVar = new bakz();
            int length = str.length();
            int[] iArr = new int[1];
            int i = 0;
            while (i < length) {
                iArr[0] = i;
                String b = b(str, iArr);
                int i2 = iArr[0];
                int length2 = b.length();
                if (length2 != 0) {
                    char charAt = b.charAt(0);
                    if (charAt == '\'') {
                        String substring = b.substring(1);
                        if (substring.length() == 1) {
                            bakzVar.o(substring.charAt(0));
                        } else {
                            bakzVar.p(new String(substring));
                        }
                    } else if (charAt == 'K') {
                        bakzVar.l(bahp.p, length2, 2);
                    } else if (charAt != 'M') {
                        if (charAt == 'S') {
                            bakzVar.w(length2, length2);
                        } else if (charAt == 'a') {
                            bakzVar.g(bahp.o);
                        } else if (charAt == 'h') {
                            bakzVar.l(bahp.q, length2, 2);
                        } else if (charAt == 'k') {
                            bakzVar.l(bahp.r, length2, 2);
                        } else if (charAt == 'm') {
                            bakzVar.y(length2);
                        } else if (charAt == 's') {
                            bakzVar.A(length2);
                        } else if (charAt == 'G') {
                            bakzVar.g(bahp.c);
                        } else if (charAt != 'H') {
                            if (charAt != 'Y') {
                                if (charAt != 'Z') {
                                    if (charAt == 'd') {
                                        bakzVar.t(length2);
                                    } else if (charAt != 'e') {
                                        switch (charAt) {
                                            case 'C':
                                                bakzVar.r(bahp.e, length2, length2);
                                                break;
                                            case 'D':
                                                bakzVar.v(length2);
                                                break;
                                            case 'E':
                                                if (length2 < 4) {
                                                    bakzVar.f(bahp.n);
                                                    break;
                                                } else {
                                                    bakzVar.g(bahp.n);
                                                    break;
                                                }
                                            default:
                                                switch (charAt) {
                                                    case 'w':
                                                        bakzVar.B(length2);
                                                        break;
                                                    case 'x':
                                                    case 'y':
                                                        break;
                                                    case 'z':
                                                        if (length2 < 4) {
                                                            bakv bakvVar = new bakv(1);
                                                            bakzVar.e(bakvVar, bakvVar);
                                                            break;
                                                        } else {
                                                            bakzVar.e(new bakv(0), null);
                                                            break;
                                                        }
                                                    default:
                                                        String valueOf = String.valueOf(b);
                                                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal pattern component: ".concat(valueOf) : new String("Illegal pattern component: "));
                                                }
                                        }
                                    } else {
                                        bakzVar.u(length2);
                                    }
                                } else if (length2 == 1) {
                                    bakzVar.h(false);
                                } else if (length2 != 2) {
                                    bakzVar.e(baku.a, baku.a);
                                } else {
                                    bakzVar.h(true);
                                }
                            }
                            if (length2 == 2) {
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    z = !c(b(str, iArr));
                                    iArr[0] = iArr[0] - 1;
                                } else {
                                    z = true;
                                }
                                if (charAt == 'x') {
                                    bahm bahmVar = new bahm();
                                    bakzVar.d(new bakx(bahp.l, bahmVar.b.u().a(bahmVar.a) - 30, z));
                                } else {
                                    bakzVar.d(new bakx(bahp.g, new bahm().p() - 30, z));
                                }
                            } else {
                                int i3 = 9;
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    if (true == c(b(str, iArr))) {
                                        i3 = length2;
                                    }
                                    iArr[0] = iArr[0] - 1;
                                }
                                if (charAt == 'Y') {
                                    bakzVar.l(bahp.d, length2, i3);
                                } else if (charAt == 'x') {
                                    bakzVar.C(length2, i3);
                                } else if (charAt == 'y') {
                                    bakzVar.D(length2, i3);
                                }
                            }
                        } else {
                            bakzVar.x(length2);
                        }
                    } else if (length2 < 3) {
                        bakzVar.z(length2);
                    } else if (length2 < 4) {
                        bakzVar.f(bahp.i);
                    } else {
                        bakzVar.g(bahp.i);
                    }
                    i = i2 + 1;
                } else {
                    bakkVar2 = bakzVar.a();
                    concurrentHashMap = a;
                    if (concurrentHashMap.size() >= 500 && (bakkVar = (bakk) concurrentHashMap.putIfAbsent(str, bakkVar2)) != null) {
                        return bakkVar;
                    }
                }
            }
            bakkVar2 = bakzVar.a();
            concurrentHashMap = a;
            if (concurrentHashMap.size() >= 500) {
            }
        }
        return bakkVar2;
    }

    private static String b(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(charAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L14
            char r3 = r3.charAt(r1)
            r2 = 1
            switch(r3) {
                case 67: goto L13;
                case 68: goto L13;
                case 70: goto L13;
                case 72: goto L13;
                case 75: goto L13;
                case 77: goto L10;
                case 83: goto L13;
                case 87: goto L13;
                case 89: goto L13;
                case 99: goto L13;
                case 100: goto L13;
                case 101: goto L13;
                case 104: goto L13;
                case 107: goto L13;
                case 109: goto L13;
                case 115: goto L13;
                case 119: goto L13;
                case 120: goto L13;
                case 121: goto L13;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            r3 = 2
            if (r0 > r3) goto L14
        L13:
            return r2
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bakj.c(java.lang.String):boolean");
    }
}
