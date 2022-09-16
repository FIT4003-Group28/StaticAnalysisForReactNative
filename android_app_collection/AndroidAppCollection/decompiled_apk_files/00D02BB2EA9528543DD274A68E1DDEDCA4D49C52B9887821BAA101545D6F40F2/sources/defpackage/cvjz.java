package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvjz  reason: default package */
/* loaded from: classes5.dex */
public final class cvjz extends cvkh {
    private final Long a;
    private final Integer b;
    private final byte[] c;

    public cvjz(Long l, Integer num, byte[] bArr) {
        this.a = l;
        this.b = num;
        this.c = bArr;
    }

    @Override // defpackage.cvkh
    public final Long a() {
        return this.a;
    }

    @Override // defpackage.cvkh
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cvkh
    public final byte[] c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkh) {
            cvkh cvkhVar = (cvkh) obj;
            if (this.a.equals(cvkhVar.a()) && this.b.equals(cvkhVar.b())) {
                if (Arrays.equals(this.c, cvkhVar instanceof cvjz ? ((cvjz) cvkhVar).c : cvkhVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length());
        sb.append("ChimeTaskData{id=");
        sb.append(valueOf);
        sb.append(", jobType=");
        sb.append(valueOf2);
        sb.append(", payload=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
