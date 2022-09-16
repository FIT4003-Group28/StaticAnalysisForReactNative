package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahdk  reason: default package */
/* loaded from: classes.dex */
public final class ahdk {
    public final String a;
    private final String b;
    private final byte[] c;
    private final byte[] d;
    private final int e;

    public ahdk(String str, String str2, int i, byte[] bArr) {
        this.b = str;
        if (str2 != null) {
            this.a = str2;
            this.e = i;
            this.c = bArr;
            this.d = null;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahdk) {
            ahdk ahdkVar = (ahdk) obj;
            if (this.b.equals(ahdkVar.b) && this.a.equals(ahdkVar.a) && this.e == ahdkVar.e) {
                boolean z = ahdkVar instanceof ahdk;
                if (Arrays.equals(this.c, z ? ahdkVar.c : ahdkVar.c)) {
                    if (z) {
                        byte[] bArr = ahdkVar.d;
                    }
                    if (Arrays.equals((byte[]) null, (byte[]) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.e) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ Arrays.hashCode((byte[]) null);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String num = Integer.toString(this.e - 1);
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString((byte[]) null);
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(num).length();
        StringBuilder sb = new StringBuilder(length + 111 + length2 + length3 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("OfflinePlayerRequestParams{identityId=");
        sb.append(str);
        sb.append(", videoId=");
        sb.append(str2);
        sb.append(", offlineModeType=");
        sb.append(num);
        sb.append(", trackingParams=");
        sb.append(arrays);
        sb.append(", offlineSharingWrappedKey=");
        sb.append(arrays2);
        sb.append("}");
        return sb.toString();
    }

    public ahdk() {
    }
}
