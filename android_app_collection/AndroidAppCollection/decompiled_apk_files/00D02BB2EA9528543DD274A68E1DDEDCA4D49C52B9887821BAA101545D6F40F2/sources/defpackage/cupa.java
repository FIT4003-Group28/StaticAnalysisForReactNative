package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cupa  reason: default package */
/* loaded from: classes5.dex */
public final class cupa extends cuqa {
    public final String a;
    public final dbsg<cugd> b;
    public final ctzl c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;

    public cupa(String str, dbsg<cugd> dbsgVar, ctzl ctzlVar, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = dbsgVar;
        this.c = ctzlVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = z;
    }

    @Override // defpackage.cuqa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cuqa
    public final dbsg<cugd> b() {
        return this.b;
    }

    @Override // defpackage.cuqa
    public final ctzl c() {
        return this.c;
    }

    @Override // defpackage.cuqa
    public final int d() {
        return this.d;
    }

    @Override // defpackage.cuqa
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuqa) {
            cuqa cuqaVar = (cuqa) obj;
            if (this.a.equals(cuqaVar.a()) && this.b.equals(cuqaVar.b()) && this.c.equals(cuqaVar.c()) && this.d == cuqaVar.d() && this.e == cuqaVar.e() && this.f == cuqaVar.f() && this.g == cuqaVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuqa
    public final int f() {
        return this.f;
    }

    @Override // defpackage.cuqa
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.cuqa
    public final cupz h() {
        return new cuoz(this);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        boolean z = this.g;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 136 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RichCardButton{text=");
        sb.append(str);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append(", textColor=");
        sb.append(i);
        sb.append(", backgroundColor=");
        sb.append(i2);
        sb.append(", borderColor=");
        sb.append(i3);
        sb.append(", enabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
