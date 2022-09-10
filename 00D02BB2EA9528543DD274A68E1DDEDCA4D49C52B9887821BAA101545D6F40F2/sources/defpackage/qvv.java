package defpackage;
/* compiled from: PG */
/* renamed from: qvv  reason: default package */
/* loaded from: classes7.dex */
final class qvv extends qvt {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final cjtd d;
    public final cjtd e;
    public final cjtd f;
    private final CharSequence g;
    private final cjtd h;

    public qvv(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, @dzsi cjtd cjtdVar3, @dzsi cjtd cjtdVar4) {
        if (charSequence != null) {
            this.a = charSequence;
            if (charSequence2 != null) {
                this.b = charSequence2;
                if (charSequence3 != null) {
                    this.c = charSequence3;
                    if (charSequence4 != null) {
                        this.g = charSequence4;
                        this.d = cjtdVar;
                        this.e = cjtdVar2;
                        this.f = cjtdVar3;
                        this.h = cjtdVar4;
                        return;
                    }
                    throw new NullPointerException("Null switcherEditButtonContentDescription");
                }
                throw new NullPointerException("Null switcherConfigureText");
            }
            throw new NullPointerException("Null switcherText");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.qvt
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.qvt
    public final CharSequence e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        cjtd cjtdVar;
        cjtd cjtdVar2;
        cjtd cjtdVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvt) {
            qvt qvtVar = (qvt) obj;
            if (this.a.equals(qvtVar.d()) && this.b.equals(qvtVar.e()) && this.c.equals(qvtVar.f()) && this.g.equals(qvtVar.g()) && this.d.equals(qvtVar.h()) && ((cjtdVar = this.e) != null ? cjtdVar.equals(qvtVar.i()) : qvtVar.i() == null) && ((cjtdVar2 = this.f) != null ? cjtdVar2.equals(qvtVar.j()) : qvtVar.j() == null) && ((cjtdVar3 = this.h) != null ? cjtdVar3.equals(qvtVar.k()) : qvtVar.k() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qvt
    public final CharSequence f() {
        return this.c;
    }

    @Override // defpackage.qvt
    public final CharSequence g() {
        return this.g;
    }

    @Override // defpackage.qvt
    @dzsi
    public final cjtd h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        cjtd cjtdVar = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (cjtdVar == null ? 0 : cjtdVar.hashCode())) * 1000003;
        cjtd cjtdVar2 = this.f;
        int hashCode3 = (hashCode2 ^ (cjtdVar2 == null ? 0 : cjtdVar2.hashCode())) * 1000003;
        cjtd cjtdVar3 = this.h;
        if (cjtdVar3 != null) {
            i = cjtdVar3.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // defpackage.qvt
    @dzsi
    public final cjtd i() {
        return this.e;
    }

    @Override // defpackage.qvt
    @dzsi
    public final cjtd j() {
        return this.f;
    }

    @Override // defpackage.qvt
    @dzsi
    public final cjtd k() {
        return this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.d);
        String valueOf6 = String.valueOf(this.e);
        String valueOf7 = String.valueOf(this.f);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 187 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("Destination{title=");
        sb.append(valueOf);
        sb.append(", switcherText=");
        sb.append(valueOf2);
        sb.append(", switcherConfigureText=");
        sb.append(valueOf3);
        sb.append(", switcherEditButtonContentDescription=");
        sb.append(valueOf4);
        sb.append(", titleUe3Params=");
        sb.append(valueOf5);
        sb.append(", switcherUe3Params=");
        sb.append(valueOf6);
        sb.append(", switcherConfigureUe3Params=");
        sb.append(valueOf7);
        sb.append(", switcherEditUe3Params=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
