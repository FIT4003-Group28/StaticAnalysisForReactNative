package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amso  reason: default package */
/* loaded from: classes2.dex */
public final class amso extends amuk {
    private final String a;
    private final jhk b;
    private final String c;

    public amso(String str, jhk jhkVar, String str2) {
        if (str != null) {
            this.a = str;
            this.b = jhkVar;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null token");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.amuk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.amuk
    public final jhk b() {
        return this.b;
    }

    @Override // defpackage.amuk
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amuk) {
            amuk amukVar = (amuk) obj;
            if (this.a.equals(amukVar.a()) && this.b.equals(amukVar.b()) && this.c.equals(amukVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(valueOf).length() + str2.length());
        sb.append("ServiceProvider{name=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", token=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
