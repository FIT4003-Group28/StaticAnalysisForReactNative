package defpackage;
/* compiled from: PG */
/* renamed from: zgl  reason: default package */
/* loaded from: classes7.dex */
final class zgl extends zpa {
    public final cqtd a;
    public final String b;

    public zgl(cqtd cqtdVar, String str) {
        this.a = cqtdVar;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null dataElementReference");
    }

    @Override // defpackage.zpa
    public final cqtd a() {
        return this.a;
    }

    @Override // defpackage.zpa
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpa) {
            zpa zpaVar = (zpa) obj;
            if (this.a.equals(zpaVar.a()) && this.b.equals(zpaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + str.length());
        sb.append("NoticeInfo{icon=");
        sb.append(valueOf);
        sb.append(", dataElementReference=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
