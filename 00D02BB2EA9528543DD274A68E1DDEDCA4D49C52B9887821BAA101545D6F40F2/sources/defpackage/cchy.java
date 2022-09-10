package defpackage;
/* compiled from: PG */
/* renamed from: cchy  reason: default package */
/* loaded from: classes4.dex */
public final class cchy extends ccih {
    public final btlu a;
    private final String c;
    private final boolean d;

    public cchy(btlu btluVar, String str, boolean z) {
        if (btluVar != null) {
            this.a = btluVar;
            if (str != null) {
                this.c = str;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null getAvatarUrl");
        }
        throw new NullPointerException("Null getGmmAccount");
    }

    @Override // defpackage.ccih
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ccih
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ccih
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccih) {
            ccih ccihVar = (ccih) obj;
            if (this.a.equals(ccihVar.a()) && this.c.equals(ccihVar.b()) && this.d == ccihVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80 + str.length());
        sb.append("NewAvatarEvent{getGmmAccount=");
        sb.append(valueOf);
        sb.append(", getAvatarUrl=");
        sb.append(str);
        sb.append(", wasCausedByLoginStatusEvent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
