package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxcm  reason: default package */
/* loaded from: classes5.dex */
public final class cxcm extends cxcq {
    private final int a;

    public cxcm(int i) {
        this.a = i;
    }

    @Override // defpackage.cxcq, defpackage.cwuw
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxcq)) {
            return false;
        }
        int i = this.a;
        if (i != ((cxcq) obj).b()) {
            z = false;
        }
        if (i == 0) {
            throw null;
        }
        return z;
    }

    public final int hashCode() {
        int i = this.a;
        cwux.b(i);
        return i ^ 1000003;
    }

    public final String toString() {
        String a = cwux.a(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 37);
        sb.append("StrictModeConfigurations{enablement=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
