package defpackage;

import com.google.android.filament.R;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: eato  reason: default package */
/* loaded from: classes6.dex */
public final class eato {
    private static final ConcurrentHashMap<String, eatp> a = new ConcurrentHashMap<>();
    private static final eatp[] b = new eatp[25];

    public static eatp a() {
        return c(4, 3);
    }

    public static eatp b(String str) {
        ConcurrentHashMap<String, eatp> concurrentHashMap;
        eatp putIfAbsent;
        boolean z;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        eatp eatpVar = a.get(str);
        if (eatpVar == null) {
            eaue eaueVar = new eaue();
            int length = str.length();
            int[] iArr = new int[1];
            int i = 0;
            while (i < length) {
                iArr[0] = i;
                String d = d(str, iArr);
                int i2 = iArr[0];
                int length2 = d.length();
                if (length2 == 0) {
                    eatpVar = eaueVar.a();
                    concurrentHashMap = a;
                    if (concurrentHashMap.size() >= 500 && (putIfAbsent = concurrentHashMap.putIfAbsent(str, eatpVar)) != null) {
                        return putIfAbsent;
                    }
                } else {
                    char charAt = d.charAt(0);
                    if (charAt == '\'') {
                        String substring = d.substring(1);
                        if (substring.length() == 1) {
                            eaueVar.z(substring.charAt(0));
                        } else {
                            eaueVar.A(new String(substring));
                        }
                    } else if (charAt == 'K') {
                        eaueVar.w(eaop.p, length2, 2);
                    } else if (charAt != 'M') {
                        if (charAt == 'S') {
                            eaueVar.c(length2, length2);
                        } else if (charAt == 'a') {
                            eaueVar.r(eaop.o);
                        } else if (charAt == 'h') {
                            eaueVar.w(eaop.q, length2, 2);
                        } else if (charAt == 'k') {
                            eaueVar.w(eaop.r, length2, 2);
                        } else if (charAt == 'm') {
                            eaueVar.e(length2);
                        } else if (charAt == 's') {
                            eaueVar.d(length2);
                        } else if (charAt == 'G') {
                            eaueVar.r(eaop.c);
                        } else if (charAt != 'H') {
                            if (charAt != 'Y') {
                                if (charAt != 'Z') {
                                    if (charAt == 'd') {
                                        eaueVar.h(length2);
                                    } else if (charAt != 'e') {
                                        switch (charAt) {
                                            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                                eaueVar.C(eaop.e, length2, length2);
                                                break;
                                            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                                eaueVar.i(length2);
                                                break;
                                            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                                if (length2 < 4) {
                                                    eaueVar.q(eaop.n);
                                                    break;
                                                } else {
                                                    eaueVar.r(eaop.n);
                                                    break;
                                                }
                                            default:
                                                switch (charAt) {
                                                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                        eaueVar.j(length2);
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                        if (length2 < 4) {
                                                            eaua eauaVar = new eaua(1);
                                                            eaueVar.p(eauaVar, eauaVar);
                                                            break;
                                                        } else {
                                                            eaueVar.p(new eaua(0), null);
                                                            break;
                                                        }
                                                    default:
                                                        String valueOf = String.valueOf(d);
                                                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Illegal pattern component: ".concat(valueOf) : new String("Illegal pattern component: "));
                                                }
                                        }
                                    } else {
                                        eaueVar.g(length2);
                                    }
                                } else if (length2 == 1) {
                                    eaueVar.s(false);
                                } else if (length2 != 2) {
                                    eaueVar.p(eatz.a, eatz.a);
                                } else {
                                    eaueVar.s(true);
                                }
                            }
                            if (length2 == 2) {
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    z = !e(d(str, iArr));
                                    iArr[0] = iArr[0] - 1;
                                } else {
                                    z = true;
                                }
                                if (charAt == 'x') {
                                    eaol eaolVar = new eaol();
                                    eaueVar.o(new eauc(eaop.l, eaolVar.b.I().d(eaolVar.a) - 30, z));
                                } else {
                                    eaueVar.o(new eauc(eaop.g, new eaol().y() - 30, z));
                                }
                            } else {
                                int i3 = 9;
                                if (i2 + 1 < length) {
                                    iArr[0] = iArr[0] + 1;
                                    if (true == e(d(str, iArr))) {
                                        i3 = length2;
                                    }
                                    iArr[0] = iArr[0] - 1;
                                }
                                if (charAt == 'Y') {
                                    eaueVar.w(eaop.d, length2, i3);
                                } else if (charAt == 'x') {
                                    eaueVar.k(length2, i3);
                                } else if (charAt == 'y') {
                                    eaueVar.m(length2, i3);
                                }
                            }
                        } else {
                            eaueVar.f(length2);
                        }
                    } else if (length2 < 3) {
                        eaueVar.l(length2);
                    } else if (length2 < 4) {
                        eaueVar.q(eaop.i);
                    } else {
                        eaueVar.r(eaop.i);
                    }
                    i = i2 + 1;
                }
            }
            eatpVar = eaueVar.a();
            concurrentHashMap = a;
            if (concurrentHashMap.size() >= 500) {
            }
        }
        return eatpVar;
    }

    public static eatp c(int i, int i2) {
        int i3 = (i << 2) + i + i2;
        eatp[] eatpVarArr = b;
        int length = eatpVarArr.length;
        eatp eatpVar = eatpVarArr[i3];
        if (eatpVar == null) {
            synchronized (eatpVarArr) {
                eatpVar = eatpVarArr[i3];
                if (eatpVar == null) {
                    eatn eatnVar = new eatn(i, i2, i == 4 ? 1 : i2 == 4 ? 0 : 2);
                    eatp eatpVar2 = new eatp(eatnVar, eatnVar);
                    eatpVarArr[i3] = eatpVar2;
                    eatpVar = eatpVar2;
                }
            }
        }
        return eatpVar;
    }

    private static String d(String str, int[] iArr) {
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
    private static boolean e(java.lang.String r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eato.e(java.lang.String):boolean");
    }
}
