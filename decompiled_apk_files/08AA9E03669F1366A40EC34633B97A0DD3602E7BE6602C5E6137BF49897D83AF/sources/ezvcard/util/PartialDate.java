package ezvcard.util;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class PartialDate {

    /* renamed from: a  reason: collision with root package name */
    private static final b[] f5581a = {new b("(\\d{4})", 0), new b("(\\d{4})-(\\d{2})", 0, 1), new b("(\\d{4})-?(\\d{2})-?(\\d{2})", 0, 1, 2), new b("--(\\d{2})-?(\\d{2})", 1, 2), new b("--(\\d{2})", 1), new b("---(\\d{2})", 2)};

    /* renamed from: b  reason: collision with root package name */
    private static final b[] f5582b = {new b("(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, null, 6, 7), new b("(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, null, 6, 7), new b("(\\d{2}):?(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, 5, null, 6, 7), new b("-(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, 5, null, 6, 7), new b("-(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, null, 6, 7), new b("--(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 5, null, 6, 7)};

    /* renamed from: c  reason: collision with root package name */
    private final Integer[] f5583c;

    /* renamed from: d  reason: collision with root package name */
    private final UtcOffset f5584d;

    private PartialDate(Integer[] numArr, UtcOffset utcOffset) {
        this.f5583c = numArr;
        this.f5584d = utcOffset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (b(r4, r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (b(r1, r0) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ezvcard.util.PartialDate a(java.lang.String r6) {
        /*
            r0 = 84
            int r0 = r6.indexOf(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 >= 0) goto Ld
            r4 = r6
            goto L1e
        Ld:
            java.lang.String r4 = r6.substring(r2, r0)
            int r5 = r6.length()
            int r5 = r5 - r3
            if (r0 >= r5) goto L1e
            int r0 = r0 + r3
            java.lang.String r0 = r6.substring(r0)
            r1 = r0
        L1e:
            ezvcard.util.PartialDate$a r0 = new ezvcard.util.PartialDate$a
            r0.<init>()
            if (r1 != 0) goto L36
            boolean r1 = a(r4, r0)
            if (r1 != 0) goto L34
            boolean r1 = b(r4, r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L4e
        L34:
            r1 = 1
            goto L4e
        L36:
            int r5 = r4.length()
            if (r5 != 0) goto L41
            boolean r1 = b(r1, r0)
            goto L4e
        L41:
            boolean r4 = a(r4, r0)
            if (r4 == 0) goto L32
            boolean r1 = b(r1, r0)
            if (r1 == 0) goto L32
            goto L34
        L4e:
            if (r1 != 0) goto L5d
            ezvcard.b r0 = ezvcard.b.INSTANCE
            r1 = 36
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            java.lang.IllegalArgumentException r6 = r0.d(r1, r3)
            throw r6
        L5d:
            ezvcard.util.PartialDate r6 = r0.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ezvcard.util.PartialDate.a(java.lang.String):ezvcard.util.PartialDate");
    }

    private static boolean a(String str, a aVar) {
        return a(str, aVar, f5581a);
    }

    private static boolean b(String str, a aVar) {
        return a(str, aVar, f5582b);
    }

    private static boolean a(String str, a aVar, b[] bVarArr) {
        for (b bVar : bVarArr) {
            if (bVar.a(aVar, str)) {
                return true;
            }
        }
        return false;
    }

    public Integer a() {
        return this.f5583c[0];
    }

    private boolean h() {
        return a() != null;
    }

    public Integer b() {
        return this.f5583c[1];
    }

    private boolean i() {
        return b() != null;
    }

    public Integer c() {
        return this.f5583c[2];
    }

    private boolean j() {
        return c() != null;
    }

    public Integer d() {
        return this.f5583c[3];
    }

    private boolean k() {
        return d() != null;
    }

    public Integer e() {
        return this.f5583c[4];
    }

    private boolean l() {
        return e() != null;
    }

    public Integer f() {
        return this.f5583c[5];
    }

    private boolean m() {
        return f() != null;
    }

    private boolean n() {
        return this.f5584d != null;
    }

    public boolean g() {
        return k() || l() || m();
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String str = null;
        String num = h() ? a().toString() : null;
        String format = i() ? decimalFormat.format(b()) : null;
        String format2 = j() ? decimalFormat.format(c()) : null;
        String str2 = z ? "-" : "";
        if (h() && !i() && !j()) {
            sb.append(num);
        } else if (!h() && i() && !j()) {
            sb.append("--");
            sb.append(format);
        } else if (!h() && !i() && j()) {
            sb.append("---");
            sb.append(format2);
        } else if (h() && i() && !j()) {
            sb.append(num);
            sb.append("-");
            sb.append(format);
        } else if (!h() && i() && j()) {
            sb.append("--");
            sb.append(format);
            sb.append(str2);
            sb.append(format2);
        } else if (h() && !i() && j()) {
            throw new IllegalStateException(ezvcard.b.INSTANCE.c(38, new Object[0]));
        } else {
            if (h() && i() && j()) {
                sb.append(num);
                sb.append(str2);
                sb.append(format);
                sb.append(str2);
                sb.append(format2);
            }
        }
        if (g()) {
            sb.append('T');
            String format3 = k() ? decimalFormat.format(d()) : null;
            String format4 = l() ? decimalFormat.format(e()) : null;
            if (m()) {
                str = decimalFormat.format(f());
            }
            String str3 = z ? ":" : "";
            if (k() && !l() && !m()) {
                sb.append(format3);
            } else if (!k() && l() && !m()) {
                sb.append("-");
                sb.append(format4);
            } else if (!k() && !l() && m()) {
                sb.append("--");
                sb.append(str);
            } else if (k() && l() && !m()) {
                sb.append(format3);
                sb.append(str3);
                sb.append(format4);
            } else if (!k() && l() && m()) {
                sb.append("-");
                sb.append(format4);
                sb.append(str3);
                sb.append(str);
            } else if (k() && !l() && m()) {
                throw new IllegalStateException(ezvcard.b.INSTANCE.c(39, new Object[0]));
            } else {
                if (k() && l() && m()) {
                    sb.append(format3);
                    sb.append(str3);
                    sb.append(format4);
                    sb.append(str3);
                    sb.append(str);
                }
            }
            if (n()) {
                sb.append(this.f5584d.a(z));
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f5583c) + 31) * 31) + (this.f5584d == null ? 0 : this.f5584d.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartialDate partialDate = (PartialDate) obj;
        if (!Arrays.equals(this.f5583c, partialDate.f5583c)) {
            return false;
        }
        if (this.f5584d == null) {
            if (partialDate.f5584d != null) {
                return false;
            }
        } else if (!this.f5584d.equals(partialDate.f5584d)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f5587a;

        /* renamed from: b  reason: collision with root package name */
        private Integer[] f5588b;

        public b(String str, Integer... numArr) {
            this.f5587a = Pattern.compile('^' + str + '$');
            this.f5588b = numArr;
        }

        public boolean a(a aVar, String str) {
            String group;
            Matcher matcher = this.f5587a.matcher(str);
            if (!matcher.find()) {
                return false;
            }
            Integer num = null;
            Integer num2 = null;
            boolean z = false;
            for (int i = 0; i < this.f5588b.length; i++) {
                Integer num3 = this.f5588b[i];
                if (num3 != null && (group = matcher.group(i + 1)) != null) {
                    boolean startsWith = group.startsWith("+");
                    if (startsWith) {
                        group = group.substring(1);
                    }
                    int parseInt = Integer.parseInt(group);
                    if (num3.intValue() == 6) {
                        num = Integer.valueOf(parseInt);
                        z = startsWith;
                    } else if (num3.intValue() == 7) {
                        num2 = Integer.valueOf(parseInt);
                    } else {
                        aVar.f5585a[num3.intValue()] = Integer.valueOf(parseInt);
                    }
                }
            }
            if (num != null) {
                if (num2 == null) {
                    num2 = 0;
                }
                aVar.f5586b = new UtcOffset(z, num.intValue(), num2.intValue());
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Integer[] f5585a = new Integer[6];

        /* renamed from: b  reason: collision with root package name */
        private UtcOffset f5586b;

        public PartialDate a() {
            if (this.f5585a[0] != null && this.f5585a[1] == null && this.f5585a[2] != null) {
                throw ezvcard.b.INSTANCE.d(38, new Object[0]);
            }
            if (this.f5585a[3] != null && this.f5585a[4] == null && this.f5585a[5] != null) {
                throw ezvcard.b.INSTANCE.d(39, new Object[0]);
            }
            return new PartialDate(this.f5585a, this.f5586b);
        }
    }
}
