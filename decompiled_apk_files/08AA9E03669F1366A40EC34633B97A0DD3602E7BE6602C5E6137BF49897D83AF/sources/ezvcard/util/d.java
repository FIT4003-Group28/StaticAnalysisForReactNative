package ezvcard.util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* compiled from: DataUri.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5615c;

    private d(String str, byte[] bArr, String str2) {
        this.f5615c = str == null ? "" : str.toLowerCase();
        this.f5613a = bArr;
        this.f5614b = str2;
    }

    public static d a(String str) {
        String str2;
        if (str.length() < "data:".length() || !str.substring(0, "data:".length()).equalsIgnoreCase("data:")) {
            throw ezvcard.b.INSTANCE.d(18, "data:");
        }
        int length = "data:".length();
        int length2 = "data:".length();
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (true) {
            if (length2 >= str.length()) {
                str2 = null;
                break;
            }
            char charAt = str.charAt(length2);
            if (charAt == ';') {
                String substring = str.substring(length, length2);
                if (str3 == null) {
                    str3 = substring.toLowerCase();
                } else if (substring.toLowerCase().startsWith("charset=")) {
                    str4 = substring.substring(substring.indexOf(61) + 1);
                } else if ("base64".equalsIgnoreCase(substring)) {
                    z = true;
                }
                length = length2 + 1;
            } else if (charAt == ',') {
                String substring2 = str.substring(length, length2);
                if (str3 == null) {
                    str3 = substring2.toLowerCase();
                } else if (substring2.toLowerCase().startsWith("charset=")) {
                    str4 = substring2.substring(substring2.indexOf(61) + 1);
                } else if ("base64".equalsIgnoreCase(substring2)) {
                    z = true;
                }
                str2 = str.substring(length2 + 1);
            }
            length2++;
        }
        if (str2 == null) {
            throw ezvcard.b.INSTANCE.d(20, new Object[0]);
        }
        if (z) {
            byte[] a2 = ezvcard.util.a.a.a.a.a.a.a(str2.replaceAll("\\s", ""));
            if (str4 != null) {
                try {
                    str2 = new String(a2, str4);
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException(ezvcard.b.INSTANCE.c(43, str4), e);
                }
            } else {
                bArr = a2;
                str2 = null;
            }
        }
        return new d(str3, bArr, str2);
    }

    public byte[] a() {
        return this.f5613a;
    }

    public String b() {
        return this.f5615c;
    }

    public String toString() {
        return b(null);
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("data:");
        sb.append(this.f5615c);
        if (this.f5613a != null) {
            sb.append(";base64,");
            sb.append(ezvcard.util.a.a.a.a.a.a.a(this.f5613a));
        } else if (this.f5614b == null) {
            sb.append(',');
        } else if (str == null) {
            sb.append(',');
            sb.append(this.f5614b);
        } else {
            try {
                byte[] bytes = this.f5614b.getBytes(str);
                sb.append(";charset=");
                sb.append(str);
                sb.append(";base64,");
                sb.append(ezvcard.util.a.a.a.a.a.a.a(bytes));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(ezvcard.b.INSTANCE.c(44, str), e);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return ((((this.f5615c.hashCode() + 31) * 31) + Arrays.hashCode(this.f5613a)) * 31) + (this.f5614b == null ? 0 : this.f5614b.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f5615c.equals(dVar.f5615c) || !Arrays.equals(this.f5613a, dVar.f5613a)) {
            return false;
        }
        if (this.f5614b == null) {
            if (dVar.f5614b != null) {
                return false;
            }
        } else if (!this.f5614b.equals(dVar.f5614b)) {
            return false;
        }
        return true;
    }
}
