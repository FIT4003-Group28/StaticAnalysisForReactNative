package defpackage;
/* compiled from: PG */
/* renamed from: bvhx  reason: default package */
/* loaded from: classes4.dex */
final class bvhx extends bvik {
    private final dwfl a;
    private final CharSequence b;

    public bvhx(dwfl dwflVar) {
        if (dwflVar != null) {
            this.a = dwflVar;
            this.b = "";
            return;
        }
        throw new NullPointerException("Null image");
    }

    @Override // defpackage.bvik
    public final dwfl a() {
        return this.a;
    }

    @Override // defpackage.bvik
    public final CharSequence b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvik) {
            bvik bvikVar = (bvik) obj;
            if (this.a.equals(bvikVar.a()) && this.b.equals(bvikVar.b())) {
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
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        CharSequence charSequence = this.b;
        String str = (String) charSequence;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + str.length());
        sb.append("ImageWithTalkbackMessage{image=");
        sb.append(valueOf);
        sb.append(", talkbackMessage=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
