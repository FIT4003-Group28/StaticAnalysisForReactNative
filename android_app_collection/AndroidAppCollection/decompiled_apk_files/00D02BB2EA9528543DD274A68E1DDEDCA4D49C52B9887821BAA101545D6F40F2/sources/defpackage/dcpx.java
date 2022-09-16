package defpackage;
/* compiled from: PG */
/* renamed from: dcpx  reason: default package */
/* loaded from: classes.dex */
public abstract class dcpx extends dcpn {
    private static char[] d(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    @Override // defpackage.dcpn
    public String a(String str) {
        throw null;
    }

    protected abstract char[] b(int i);

    protected int c(CharSequence charSequence, int i, int i2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str, int i) {
        int length = str.length();
        char[] a = dcpp.a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            dbsk.s(str);
            if (i < length) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                char c = charAt;
                if (charAt >= 55296) {
                    c = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            String valueOf = String.valueOf(str);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 88);
                            sb.append("Unexpected low surrogate character '");
                            sb.append(charAt);
                            sb.append("' with value ");
                            sb.append((int) charAt);
                            sb.append(" at index ");
                            sb.append(i4 - 1);
                            sb.append(" in '");
                            sb.append(valueOf);
                            sb.append("'");
                            throw new IllegalArgumentException(sb.toString());
                        } else if (i4 == length) {
                            c = -charAt;
                        } else {
                            char charAt2 = str.charAt(i4);
                            if (Character.isLowSurrogate(charAt2)) {
                                c = Character.toCodePoint(charAt, charAt2);
                            } else {
                                String valueOf2 = String.valueOf(str);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 89);
                                sb2.append("Expected low surrogate but got char '");
                                sb2.append(charAt2);
                                sb2.append("' with value ");
                                sb2.append((int) charAt2);
                                sb2.append(" at index ");
                                sb2.append(i4);
                                sb2.append(" in '");
                                sb2.append(valueOf2);
                                sb2.append("'");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                }
                if (c >= 0) {
                    char[] b = b(c);
                    int i5 = 1;
                    if (true == Character.isSupplementaryCodePoint(c)) {
                        i5 = 2;
                    }
                    int i6 = i5 + i;
                    if (b != null) {
                        int i7 = i - i2;
                        int i8 = i3 + i7;
                        int length2 = b.length;
                        int i9 = i8 + length2;
                        if (a.length < i9) {
                            a = d(a, i3, i9 + (length - i) + 32);
                        }
                        if (i7 > 0) {
                            str.getChars(i2, i, a, i3);
                            i3 = i8;
                        }
                        if (length2 > 0) {
                            System.arraycopy(b, 0, a, i3, length2);
                            i3 += length2;
                        }
                        i2 = i6;
                    }
                    i = c(str, i6, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i10 = length - i2;
        if (i10 > 0) {
            int i11 = i10 + i3;
            if (a.length < i11) {
                a = d(a, i3, i11);
            }
            str.getChars(i2, length, a, i3);
            i3 = i11;
        }
        return new String(a, 0, i3);
    }
}
