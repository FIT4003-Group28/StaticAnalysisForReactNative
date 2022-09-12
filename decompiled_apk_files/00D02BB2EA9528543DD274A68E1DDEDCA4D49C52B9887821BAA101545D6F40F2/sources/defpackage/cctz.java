package defpackage;
/* compiled from: PG */
/* renamed from: cctz  reason: default package */
/* loaded from: classes4.dex */
public final class cctz extends ccud {
    public final boolean a;
    public final boolean b;
    public final cqrp c;

    public cctz(boolean z, boolean z2, cqrp cqrpVar) {
        this.a = z;
        this.b = z2;
        this.c = cqrpVar;
    }

    @Override // defpackage.ccud
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ccud
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ccud
    public final cqrp c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccud) {
            ccud ccudVar = (ccud) obj;
            if (this.a == ccudVar.a() && this.b == ccudVar.b() && this.c.equals(ccudVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c.a;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("CarouselProperties{useItemPadding=");
        sb.append(z);
        sb.append(", isReadOnly=");
        sb.append(z2);
        sb.append(", height=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
