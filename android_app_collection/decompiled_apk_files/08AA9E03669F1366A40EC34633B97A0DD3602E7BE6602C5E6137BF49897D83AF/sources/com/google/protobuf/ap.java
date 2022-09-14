package com.google.protobuf;

import com.google.protobuf.ar;
import com.google.protobuf.at;
import com.google.protobuf.j;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: TextFormat.java */
/* loaded from: classes.dex */
public final class ap {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4354a = Logger.getLogger(ap.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final c f4355b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final c f4356c = new c().a(true);

    /* renamed from: d  reason: collision with root package name */
    private static final c f4357d = new c().b(false);
    private static final b e = b.a().a();

    private static boolean a(byte b2) {
        return 48 <= b2 && b2 <= 55;
    }

    private static boolean b(byte b2) {
        return (48 <= b2 && b2 <= 57) || (97 <= b2 && b2 <= 102) || (65 <= b2 && b2 <= 70);
    }

    private static int c(byte b2) {
        return (48 > b2 || b2 > 57) ? (97 > b2 || b2 > 122) ? (b2 - 65) + 10 : (b2 - 97) + 10 : b2 - 48;
    }

    private ap() {
    }

    public static void a(af afVar, Appendable appendable) {
        f4355b.a(afVar, new d(appendable));
    }

    public static void a(at atVar, Appendable appendable) {
        f4355b.a(atVar, new d(appendable));
    }

    public static String a(af afVar) {
        try {
            StringBuilder sb = new StringBuilder();
            a(afVar, sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String a(at atVar) {
        try {
            StringBuilder sb = new StringBuilder();
            a(atVar, sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, Object obj, d dVar) {
        int a2 = ay.a(i);
        if (a2 != 5) {
            switch (a2) {
                case 0:
                    dVar.a(a(((Long) obj).longValue()));
                    return;
                case 1:
                    dVar.a(String.format(null, "0x%016x", (Long) obj));
                    return;
                case 2:
                    dVar.a("\"");
                    dVar.a(a((f) obj));
                    dVar.a("\"");
                    return;
                case 3:
                    f4355b.a((at) obj, dVar);
                    return;
                default:
                    throw new IllegalArgumentException("Bad tag: " + i);
            }
        }
        dVar.a(String.format(null, "0x%08x", (Integer) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormat.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f4368a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4369b;

        private c() {
            this.f4368a = false;
            this.f4369b = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(boolean z) {
            this.f4368a = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c b(boolean z) {
            this.f4369b = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(af afVar, d dVar) {
            for (Map.Entry<j.f, Object> entry : afVar.getAllFields().entrySet()) {
                a(entry.getKey(), entry.getValue(), dVar);
            }
            a(afVar.getUnknownFields(), dVar);
        }

        private void a(j.f fVar, Object obj, d dVar) {
            if (fVar.p()) {
                for (Object obj2 : (List) obj) {
                    b(fVar, obj2, dVar);
                }
                return;
            }
            b(fVar, obj, dVar);
        }

        private void b(j.f fVar, Object obj, d dVar) {
            if (fVar.u()) {
                dVar.a("[");
                if (fVar.v().e().d() && fVar.i() == j.f.b.MESSAGE && fVar.o() && fVar.x() == fVar.y()) {
                    dVar.a(fVar.y().c());
                } else {
                    dVar.a(fVar.c());
                }
                dVar.a("]");
            } else if (fVar.i() == j.f.b.GROUP) {
                dVar.a(fVar.y().b());
            } else {
                dVar.a(fVar.b());
            }
            if (fVar.g() == j.f.a.MESSAGE) {
                if (this.f4368a) {
                    dVar.a(" { ");
                } else {
                    dVar.a(" {\n");
                    dVar.a();
                }
            } else {
                dVar.a(": ");
            }
            c(fVar, obj, dVar);
            if (fVar.g() == j.f.a.MESSAGE) {
                if (this.f4368a) {
                    dVar.a("} ");
                    return;
                }
                dVar.b();
                dVar.a("}\n");
            } else if (this.f4368a) {
                dVar.a(" ");
            } else {
                dVar.a("\n");
            }
        }

        private void c(j.f fVar, Object obj, d dVar) {
            String replace;
            switch (fVar.i()) {
                case INT32:
                case SINT32:
                case SFIXED32:
                    dVar.a(((Integer) obj).toString());
                    return;
                case INT64:
                case SINT64:
                case SFIXED64:
                    dVar.a(((Long) obj).toString());
                    return;
                case BOOL:
                    dVar.a(((Boolean) obj).toString());
                    return;
                case FLOAT:
                    dVar.a(((Float) obj).toString());
                    return;
                case DOUBLE:
                    dVar.a(((Double) obj).toString());
                    return;
                case UINT32:
                case FIXED32:
                    dVar.a(ap.a(((Integer) obj).intValue()));
                    return;
                case UINT64:
                case FIXED64:
                    dVar.a(ap.a(((Long) obj).longValue()));
                    return;
                case STRING:
                    dVar.a("\"");
                    if (this.f4369b) {
                        replace = aq.a((String) obj);
                    } else {
                        replace = ap.a((String) obj).replace("\n", "\\n");
                    }
                    dVar.a(replace);
                    dVar.a("\"");
                    return;
                case BYTES:
                    dVar.a("\"");
                    if (obj instanceof f) {
                        dVar.a(ap.a((f) obj));
                    } else {
                        dVar.a(ap.a((byte[]) obj));
                    }
                    dVar.a("\"");
                    return;
                case ENUM:
                    dVar.a(((j.e) obj).b());
                    return;
                case MESSAGE:
                case GROUP:
                    a((ab) obj, dVar);
                    return;
                default:
                    return;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(at atVar, d dVar) {
            for (Map.Entry<Integer, at.b> entry : atVar.d().entrySet()) {
                int intValue = entry.getKey().intValue();
                at.b value = entry.getValue();
                a(intValue, 0, value.b(), dVar);
                a(intValue, 5, value.c(), dVar);
                a(intValue, 1, value.d(), dVar);
                a(intValue, 2, value.e(), dVar);
                for (at atVar2 : value.f()) {
                    dVar.a(entry.getKey().toString());
                    if (this.f4368a) {
                        dVar.a(" { ");
                    } else {
                        dVar.a(" {\n");
                        dVar.a();
                    }
                    a(atVar2, dVar);
                    if (this.f4368a) {
                        dVar.a("} ");
                    } else {
                        dVar.b();
                        dVar.a("}\n");
                    }
                }
            }
        }

        private void a(int i, int i2, List<?> list, d dVar) {
            for (Object obj : list) {
                dVar.a(String.valueOf(i));
                dVar.a(": ");
                ap.b(i2, obj, dVar);
                dVar.a(this.f4368a ? " " : "\n");
            }
        }
    }

    public static String a(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(i & 4294967295L);
    }

    public static String a(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f4370a;

        /* renamed from: b  reason: collision with root package name */
        private final StringBuilder f4371b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4372c;

        private d(Appendable appendable) {
            this.f4371b = new StringBuilder();
            this.f4372c = true;
            this.f4370a = appendable;
        }

        public void a() {
            this.f4371b.append("  ");
        }

        public void b() {
            int length = this.f4371b.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.f4371b.delete(length - 2, length);
        }

        public void a(CharSequence charSequence) {
            int length = charSequence.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '\n') {
                    int i3 = i2 + 1;
                    b(charSequence.subSequence(i, i3));
                    this.f4372c = true;
                    i = i3;
                }
            }
            b(charSequence.subSequence(i, length));
        }

        private void b(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return;
            }
            if (this.f4372c) {
                this.f4372c = false;
                this.f4370a.append(this.f4371b);
            }
            this.f4370a.append(charSequence);
        }
    }

    /* compiled from: TextFormat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f4359a;

        /* renamed from: b  reason: collision with root package name */
        private final EnumC0078b f4360b;

        /* renamed from: c  reason: collision with root package name */
        private ar.a f4361c;

        /* compiled from: TextFormat.java */
        /* renamed from: com.google.protobuf.ap$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0078b {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        private b(boolean z, EnumC0078b enumC0078b, ar.a aVar) {
            this.f4359a = z;
            this.f4360b = enumC0078b;
            this.f4361c = aVar;
        }

        public static a a() {
            return new a();
        }

        /* compiled from: TextFormat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f4362a = false;

            /* renamed from: b  reason: collision with root package name */
            private EnumC0078b f4363b = EnumC0078b.ALLOW_SINGULAR_OVERWRITES;

            /* renamed from: c  reason: collision with root package name */
            private ar.a f4364c = null;

            public b a() {
                return new b(this.f4362a, this.f4363b, this.f4364c);
            }
        }
    }

    public static String a(f fVar) {
        return aq.a(fVar);
    }

    public static String a(byte[] bArr) {
        return aq.a(bArr);
    }

    public static f a(CharSequence charSequence) {
        int i;
        int i2;
        f a2 = f.a(charSequence.toString());
        byte[] bArr = new byte[a2.b()];
        int i3 = 0;
        int i4 = 0;
        while (i3 < a2.b()) {
            byte a3 = a2.a(i3);
            if (a3 == 92) {
                i3++;
                if (i3 < a2.b()) {
                    byte a4 = a2.a(i3);
                    if (a(a4)) {
                        int c2 = c(a4);
                        int i5 = i3 + 1;
                        if (i5 < a2.b() && a(a2.a(i5))) {
                            c2 = (c2 * 8) + c(a2.a(i5));
                            i3 = i5;
                        }
                        int i6 = i3 + 1;
                        if (i6 < a2.b() && a(a2.a(i6))) {
                            c2 = (c2 * 8) + c(a2.a(i6));
                            i3 = i6;
                        }
                        i = i4 + 1;
                        bArr[i4] = (byte) c2;
                    } else {
                        if (a4 == 34) {
                            i2 = i4 + 1;
                            bArr[i4] = 34;
                        } else if (a4 == 39) {
                            i2 = i4 + 1;
                            bArr[i4] = 39;
                        } else if (a4 == 92) {
                            i2 = i4 + 1;
                            bArr[i4] = 92;
                        } else if (a4 == 102) {
                            i2 = i4 + 1;
                            bArr[i4] = 12;
                        } else if (a4 == 110) {
                            i2 = i4 + 1;
                            bArr[i4] = 10;
                        } else if (a4 == 114) {
                            i2 = i4 + 1;
                            bArr[i4] = 13;
                        } else if (a4 == 116) {
                            i2 = i4 + 1;
                            bArr[i4] = 9;
                        } else if (a4 == 118) {
                            i2 = i4 + 1;
                            bArr[i4] = 11;
                        } else if (a4 != 120) {
                            switch (a4) {
                                case 97:
                                    i2 = i4 + 1;
                                    bArr[i4] = 7;
                                    break;
                                case 98:
                                    i2 = i4 + 1;
                                    bArr[i4] = 8;
                                    break;
                                default:
                                    throw new a("Invalid escape sequence: '\\" + ((char) a4) + '\'');
                            }
                        } else {
                            i3++;
                            if (i3 < a2.b() && b(a2.a(i3))) {
                                int c3 = c(a2.a(i3));
                                int i7 = i3 + 1;
                                if (i7 < a2.b() && b(a2.a(i7))) {
                                    c3 = (c3 * 16) + c(a2.a(i7));
                                    i3 = i7;
                                }
                                i = i4 + 1;
                                bArr[i4] = (byte) c3;
                            } else {
                                throw new a("Invalid escape sequence: '\\x' with no digits");
                            }
                        }
                        i4 = i2;
                        i3++;
                    }
                } else {
                    throw new a("Invalid escape sequence: '\\' at end of string.");
                }
            } else {
                i = i4 + 1;
                bArr[i4] = a3;
            }
            i4 = i;
            i3++;
        }
        if (bArr.length == i4) {
            return f.b(bArr);
        }
        return f.a(bArr, 0, i4);
    }

    /* compiled from: TextFormat.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public static String a(String str) {
        return aq.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(String str) {
        return (int) a(str, true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(String str) {
        return (int) a(str, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(String str) {
        return a(str, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(String str) {
        return a(str, false, true);
    }

    private static long a(String str, boolean z, boolean z2) {
        int i = 0;
        boolean z3 = true;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else if (!z) {
            throw new NumberFormatException("Number must be positive: " + str);
        } else {
            i = 1;
        }
        int i2 = 10;
        if (str.startsWith("0x", i)) {
            i += 2;
            i2 = 16;
        } else if (str.startsWith("0", i)) {
            i2 = 8;
        }
        String substring = str.substring(i);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i2);
            if (z3) {
                parseLong = -parseLong;
            }
            if (z2) {
                return parseLong;
            }
            if (z) {
                if (parseLong <= 2147483647L && parseLong >= -2147483648L) {
                    return parseLong;
                }
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            } else if (parseLong < 4294967296L && parseLong >= 0) {
                return parseLong;
            } else {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
            }
        }
        BigInteger bigInteger = new BigInteger(substring, i2);
        if (z3) {
            bigInteger = bigInteger.negate();
        }
        if (!z2) {
            if (z) {
                if (bigInteger.bitLength() > 31) {
                    throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 32) {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
            }
        } else if (z) {
            if (bigInteger.bitLength() > 63) {
                throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 64) {
            throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }
}
