package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cudw  reason: default package */
/* loaded from: classes5.dex */
final class cudw extends cugl {
    private final String a;
    private final byte[] b;

    public cudw(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.cugl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cugl
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugl) {
            cugl cuglVar = (cugl) obj;
            if (this.a.equals(cuglVar.a())) {
                if (Arrays.equals(this.b, cuglVar instanceof cudw ? ((cudw) cuglVar).b : cuglVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(arrays).length());
        sb.append("CustomMessage{type=");
        sb.append(str);
        sb.append(", content=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
