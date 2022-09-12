package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: awcw  reason: default package */
/* loaded from: classes3.dex */
final class awcw extends awcx {
    public final byte[] a;
    private final byte[] b;

    public awcw(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.a = bArr;
            if (bArr2 != null) {
                this.b = bArr2;
                return;
            }
            throw new NullPointerException("Null responseContext");
        }
        throw new NullPointerException("Null tactileResponse");
    }

    @Override // defpackage.awcx
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.awcx
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awcx) {
            awcx awcxVar = (awcx) obj;
            boolean z = awcxVar instanceof awcw;
            if (Arrays.equals(this.a, z ? ((awcw) awcxVar).a : awcxVar.a())) {
                if (Arrays.equals(this.b, z ? ((awcw) awcxVar).b : awcxVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 57 + String.valueOf(arrays2).length());
        sb.append("SearchBackendResponse{tactileResponse=");
        sb.append(arrays);
        sb.append(", responseContext=");
        sb.append(arrays2);
        sb.append("}");
        return sb.toString();
    }
}
