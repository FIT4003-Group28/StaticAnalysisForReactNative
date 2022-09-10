package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: angh  reason: default package */
/* loaded from: classes2.dex */
public final class angh extends anhd {
    private final dwfl a;

    public angh(dwfl dwflVar) {
        if (dwflVar != null) {
            this.a = dwflVar;
            return;
        }
        throw new NullPointerException("Null photo");
    }

    @Override // defpackage.anhd
    public final dwfl a() {
        return this.a;
    }

    @Override // defpackage.anhd
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anhd) {
            anhd anhdVar = (anhd) obj;
            if (anhdVar.b() == 1 && this.a.equals(anhdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dwfl dwflVar = this.a;
        int i = dwflVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwflVar).c(dwflVar);
            dwflVar.bC = i;
        }
        return (-722379962) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(62 + String.valueOf(valueOf).length());
        sb.append("ReceiptActionRequest{action=");
        sb.append("MARK_PHOTO_AS_NOT_RECEIPT");
        sb.append(", photo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
