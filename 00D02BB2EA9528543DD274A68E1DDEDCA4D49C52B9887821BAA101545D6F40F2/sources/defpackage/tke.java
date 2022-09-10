package defpackage;
/* compiled from: PG */
/* renamed from: tke  reason: default package */
/* loaded from: classes7.dex */
class tke extends tkj {
    public final btlu a;
    public final tlv b;
    public final int c;
    public final tkn d;

    public tke(btlu btluVar, tlv tlvVar, int i, tkn tknVar) {
        if (btluVar != null) {
            this.a = btluVar;
            if (tlvVar != null) {
                this.b = tlvVar;
                this.c = i;
                this.d = tknVar;
                return;
            }
            throw new NullPointerException("Null group");
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.tkj
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.tkj
    public final tlv b() {
        return this.b;
    }

    @Override // defpackage.tkj
    public final int c() {
        return this.c;
    }

    @Override // defpackage.tkj
    public final tkn d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkj) {
            tkj tkjVar = (tkj) obj;
            if (this.a.equals(tkjVar.a()) && this.b.equals(tkjVar.b()) && this.c == tkjVar.c() && this.d.equals(tkjVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MapRenderingContext{account=");
        sb.append(valueOf);
        sb.append(", group=");
        sb.append(valueOf2);
        sb.append(", originalTripIndex=");
        sb.append(i);
        sb.append(", focusContext=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
