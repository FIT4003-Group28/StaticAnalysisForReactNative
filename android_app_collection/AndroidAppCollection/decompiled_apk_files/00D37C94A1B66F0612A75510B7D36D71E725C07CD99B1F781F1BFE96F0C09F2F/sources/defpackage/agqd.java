package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: agqd  reason: default package */
/* loaded from: classes.dex */
public final class agqd {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final boolean h;

    public agqd(String str, int i, String str2, int i2, int i3, byte[] bArr, byte[] bArr2, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
            this.e = i3;
            this.f = bArr;
            this.g = bArr2;
            this.h = z;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agqd) {
            agqd agqdVar = (agqd) obj;
            if (this.a.equals(agqdVar.a) && this.b == agqdVar.b && ((str = this.c) != null ? str.equals(agqdVar.c) : agqdVar.c == null) && this.d == agqdVar.d && this.e == agqdVar.e) {
                if (Arrays.equals(this.f, agqdVar instanceof agqd ? agqdVar.f : agqdVar.f) && Arrays.equals(this.g, agqdVar.g) && this.h == agqdVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return ((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String arrays = Arrays.toString(this.f);
        String arrays2 = Arrays.toString(this.g);
        boolean z = this.h;
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("OfflineHash{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", storageId=");
        sb.append(str2);
        sb.append(", merkleLevel=");
        sb.append(i2);
        sb.append(", blockIndex=");
        sb.append(i3);
        sb.append(", digest=");
        sb.append(arrays);
        sb.append(", hashState=");
        sb.append(arrays2);
        sb.append(", matchesBytesOnDisk=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public agqd() {
    }
}
