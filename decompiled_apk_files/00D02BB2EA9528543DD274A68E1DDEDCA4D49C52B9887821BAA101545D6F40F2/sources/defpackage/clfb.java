package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clfb  reason: default package */
/* loaded from: classes5.dex */
public final class clfb extends clfg {
    public final Iterable<cles> a;
    public final byte[] b;

    public clfb(Iterable<cles> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // defpackage.clfg
    public final Iterable<cles> a() {
        return this.a;
    }

    @Override // defpackage.clfg
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clfg) {
            clfg clfgVar = (clfg) obj;
            if (this.a.equals(clfgVar.a())) {
                if (Arrays.equals(this.b, clfgVar instanceof clfb ? ((clfb) clfgVar).b : clfgVar.b())) {
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
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(arrays).length());
        sb.append("BackendRequest{events=");
        sb.append(valueOf);
        sb.append(", extras=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
