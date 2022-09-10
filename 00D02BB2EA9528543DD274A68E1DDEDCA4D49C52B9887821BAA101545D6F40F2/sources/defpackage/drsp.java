package defpackage;

import com.google.android.filament.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: drsp  reason: default package */
/* loaded from: classes.dex */
public final class drsp implements drsq {
    private static final Pattern a = Pattern.compile("(\\d+)m(\\d+)");
    private static final Pattern b = Pattern.compile("(\\d+)([a-zA-Z])(.*)", 32);
    private static final Pattern c = Pattern.compile("\\*2A", 2);
    private static final Pattern d = Pattern.compile("!", 16);
    private static final Pattern e = Pattern.compile(String.format("\\*%02X", Integer.valueOf("!".codePointAt(0))), 2);

    private static void b(String[] strArr, int i, int i2, dspp dsppVar) {
        while (i < i2) {
            String str = strArr[i];
            Matcher matcher = a.matcher(str);
            if (!matcher.matches()) {
                Matcher matcher2 = b.matcher(str);
                if (!matcher2.matches()) {
                    String valueOf = String.valueOf(str);
                    throw new dsrm(valueOf.length() != 0 ? "Could not parse serialized element: ".concat(valueOf) : new String("Could not parse serialized element: "));
                }
                int parseInt = Integer.parseInt(matcher2.group(1));
                char charAt = matcher2.group(2).charAt(0);
                String group = matcher2.group(3);
                if (parseInt <= 0) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Invalid tag number ");
                    sb.append(parseInt);
                    throw new dsrm(sb.toString());
                } else if (charAt == 'B') {
                    byte[] j = ddae.e.j(group);
                    int length = j.length;
                    ((dspo) dsppVar).aB(parseInt, 2);
                    ((dspo) dsppVar).z(j, length);
                } else if (charAt != 'b') {
                    if (charAt == 's') {
                        dsppVar.j(parseInt, group);
                    } else if (charAt == 'n') {
                        dsppVar.F(parseInt, c(group));
                    } else if (charAt == 'o') {
                        dsppVar.G(parseInt, e(group));
                    } else if (charAt == 'u') {
                        dsppVar.aD(parseInt, d(group));
                    } else if (charAt == 'v') {
                        dsppVar.aF(parseInt, f(group));
                    } else {
                        switch (charAt) {
                            case 'd':
                                dsppVar.I(parseInt, Double.parseDouble(group));
                                continue;
                            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                                dsppVar.aC(parseInt, Integer.parseInt(group));
                                continue;
                            case 'f':
                                dsppVar.H(parseInt, Float.parseFloat(group));
                                continue;
                            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                                dsppVar.aE(parseInt, c(group));
                                continue;
                            case 'h':
                                dsppVar.aG(parseInt, e(group));
                                continue;
                            case 'i':
                                dsppVar.aC(parseInt, c(group));
                                continue;
                            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                                dsppVar.aF(parseInt, e(group));
                                continue;
                            default:
                                switch (charAt) {
                                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                        dsppVar.aE(parseInt, d(group));
                                        continue;
                                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                        dsppVar.aG(parseInt, f(group));
                                        continue;
                                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                        try {
                                            dsppVar.j(parseInt, new String(ddae.e.j(group), StandardCharsets.UTF_8));
                                            continue;
                                            continue;
                                        } catch (NumberFormatException e2) {
                                            String valueOf2 = String.valueOf(e2);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(group).length() + 66 + String.valueOf(valueOf2).length());
                                            sb2.append("Could not parse numeric value '");
                                            sb2.append(group);
                                            sb2.append("' for tag ");
                                            sb2.append(parseInt);
                                            sb2.append(" of type '");
                                            sb2.append(charAt);
                                            sb2.append("': ");
                                            sb2.append(valueOf2);
                                            throw new dsrm(sb2.toString());
                                        }
                                    default:
                                        StringBuilder sb3 = new StringBuilder(41);
                                        sb3.append("Invalid field type in serialized proto: ");
                                        sb3.append(charAt);
                                        throw new dsrm(sb3.toString());
                                }
                        }
                    }
                } else if (!group.equals("0") && !group.equals("1")) {
                    String valueOf3 = String.valueOf(group);
                    throw new NumberFormatException(valueOf3.length() != 0 ? "Invalid boolean value: ".concat(valueOf3) : new String("Invalid boolean value: "));
                } else {
                    dsppVar.i(parseInt, group.equals("1"));
                }
            } else {
                int parseInt2 = Integer.parseInt(matcher.group(1));
                int parseInt3 = Integer.parseInt(matcher.group(2));
                if (parseInt2 <= 0) {
                    StringBuilder sb4 = new StringBuilder(30);
                    sb4.append("Invalid tag number ");
                    sb4.append(parseInt2);
                    throw new dsrm(sb4.toString());
                }
                int i3 = i + parseInt3;
                if (i3 < i2) {
                    int i4 = i + 1;
                    dspb L = dspd.L();
                    b(strArr, i4, parseInt3 + i4, dspp.B(L));
                    dsppVar.k(parseInt2, L.a());
                    i = i3;
                } else {
                    throw new dsrm("Not enough elements for embedded message");
                }
            }
            i++;
        }
        dsppVar.y();
    }

    private static int c(String str) {
        return Integer.decode(str).intValue();
    }

    private static int d(String str) {
        long longValue = Long.decode(str).longValue();
        if (longValue < 0 || longValue > 2147483647L) {
            if (longValue >= 2147483648L && longValue <= 4294967295L) {
                return (int) (longValue - 4294967296L);
            }
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() != 0 ? "Invalid uint32 value: ".concat(valueOf) : new String("Invalid uint32 value: "));
        }
        return (int) longValue;
    }

    private static long e(String str) {
        return Long.decode(str).longValue();
    }

    @Override // defpackage.drsq
    public final <T extends dssj> T a(String str, T t) {
        String[] split;
        dssi NH = t.NH();
        if (str.length() == 0) {
            return (T) NH.bK();
        }
        if (!Character.isDigit(str.charAt(0))) {
            char charAt = str.charAt(0);
            StringBuilder sb = new StringBuilder(1);
            sb.append(charAt);
            String sb2 = sb.toString();
            split = Pattern.compile(sb2, 16).split(str.substring(1));
            for (int i = 0; i < split.length; i++) {
                String str2 = split[i];
                int codePointAt = sb2.codePointAt(0);
                String str3 = codePointAt < 16 ? "0" : "";
                String b2 = dbqa.b(Integer.toHexString(codePointAt));
                StringBuilder sb3 = new StringBuilder(str3.length() + 2 + String.valueOf(b2).length());
                sb3.append("\\*");
                sb3.append(str3);
                sb3.append(b2);
                split[i] = c.matcher(Pattern.compile(sb3.toString(), 2).matcher(str2).replaceAll(sb2)).replaceAll("*");
            }
        } else {
            split = d.split(str);
            for (int i2 = 0; i2 < split.length; i2++) {
                split[i2] = c.matcher(e.matcher(split[i2]).replaceAll("!")).replaceAll("*");
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(split, 0, split.length, dspp.B(byteArrayOutputStream));
            NH.by(byteArrayOutputStream.toByteArray());
            return (T) NH.bK();
        } catch (dsrm e2) {
            throw e2;
        } catch (IOException e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb4.append("Could not create wire format for serialized message: ");
            sb4.append(valueOf);
            throw new dsrm(sb4.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long f(java.lang.String r5) {
        /*
            java.lang.String r0 = "-"
            boolean r0 = r5.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.String r5 = r5.substring(r1)
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r2 = "0X"
            boolean r2 = r5.startsWith(r2)
            r3 = 10
            r4 = 16
            if (r2 != 0) goto L47
            java.lang.String r2 = "0x"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L25
            goto L47
        L25:
            java.lang.String r2 = "#"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L32
            java.lang.String r5 = r5.substring(r1)
            goto L4c
        L32:
            java.lang.String r2 = "0"
            boolean r2 = r5.startsWith(r2)
            if (r2 == 0) goto L4e
            int r2 = r5.length()
            if (r2 <= r1) goto L4e
            java.lang.String r5 = r5.substring(r1)
            r3 = 8
            goto L4e
        L47:
            r1 = 2
            java.lang.String r5 = r5.substring(r1)
        L4c:
            r3 = 16
        L4e:
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r5, r3)
            if (r0 == 0) goto L59
            java.math.BigInteger r1 = r1.negate()
        L59:
            long r0 = r1.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drsp.f(java.lang.String):long");
    }
}
