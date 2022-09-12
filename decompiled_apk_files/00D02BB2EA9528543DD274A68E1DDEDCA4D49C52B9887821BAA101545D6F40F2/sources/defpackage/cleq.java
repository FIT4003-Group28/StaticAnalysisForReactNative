package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cleq  reason: default package */
/* loaded from: classes5.dex */
public final class cleq {
    public final clct a;
    public final byte[] b;

    public cleq(clct clctVar, byte[] bArr) {
        if (bArr != null) {
            this.a = clctVar;
            this.b = bArr;
            return;
        }
        throw new NullPointerException("bytes is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cleq)) {
            return false;
        }
        cleq cleqVar = (cleq) obj;
        if (this.a.equals(cleqVar.a)) {
            return Arrays.equals(this.b, cleqVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("EncodedPayload{encoding=");
        sb.append(valueOf);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
