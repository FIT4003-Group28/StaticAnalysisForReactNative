package defpackage;
/* compiled from: PG */
/* renamed from: ult  reason: default package */
/* loaded from: classes4.dex */
public final class ult {
    public final ujx a;
    public final uky b;
    public final Class c;
    public final boolean d;
    public final uox e;
    public final zgd f;

    public ult() {
    }

    public ult(ujx ujxVar, zgd zgdVar, uky ukyVar, Class cls, boolean z, uox uoxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ujxVar;
        this.f = zgdVar;
        this.b = ukyVar;
        this.c = cls;
        this.d = z;
        this.e = uoxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ult) {
            ult ultVar = (ult) obj;
            if (this.a.equals(ultVar.a) && this.f.equals(ultVar.f) && this.b.equals(ultVar.b) && this.c.equals(ultVar.c) && this.d == ultVar.d && this.e.equals(ultVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 132 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AccountManagementSpec{avatarImageLoader=");
        sb.append(valueOf);
        sb.append(", accountConverter=");
        sb.append(valueOf2);
        sb.append(", accountsModel=");
        sb.append(valueOf3);
        sb.append(", accountClass=");
        sb.append(valueOf4);
        sb.append(", allowRings=");
        sb.append(z);
        sb.append(", oneGoogleEventLogger=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
