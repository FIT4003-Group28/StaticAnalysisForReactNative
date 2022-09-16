package defpackage;
/* compiled from: PG */
/* renamed from: bzcp  reason: default package */
/* loaded from: classes4.dex */
public final class bzcp extends bzcw {
    private final bzdg b;
    private final String c;

    public bzcp(bzdg bzdgVar, String str) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            if (str != null) {
                this.c = str;
                return;
            }
            throw new NullPointerException("Null errorMessage");
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    @Override // defpackage.bzcw
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzcw) {
            bzcw bzcwVar = (bzcw) obj;
            if (this.b.equals(bzcwVar.b()) && this.c.equals(bzcwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + str.length());
        sb.append("ErrorEndState{stage=");
        sb.append(valueOf);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
