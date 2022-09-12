package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brcx  reason: default package */
/* loaded from: classes4.dex */
public final class brcx extends brcy {
    public final String a;
    public final String b;
    public final String c;
    public final dcep<Integer> d;
    public final dcep<Integer> e;

    public brcx(String str, String str2, String str3, dcep<Integer> dcepVar, dcep<Integer> dcepVar2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (str3 != null) {
                this.c = str3;
                if (dcepVar != null) {
                    this.d = dcepVar;
                    if (dcepVar2 != null) {
                        this.e = dcepVar2;
                        return;
                    }
                    throw new NullPointerException("Null selectedConnectors");
                }
                throw new NullPointerException("Null defaultConnectors");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.brcy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.brcy
    public final String b() {
        return this.b;
    }

    @Override // defpackage.brcy
    public final String c() {
        return this.c;
    }

    @Override // defpackage.brcy
    public final dcep<Integer> d() {
        return this.d;
    }

    @Override // defpackage.brcy
    public final dcep<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brcy) {
            brcy brcyVar = (brcy) obj;
            if (this.a.equals(brcyVar.a()) && this.b.equals(brcyVar.b()) && this.c.equals(brcyVar.c()) && this.d.equals(brcyVar.d()) && this.e.equals(brcyVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int length = str.length();
        int length2 = str2.length();
        int length3 = str3.length();
        StringBuilder sb = new StringBuilder(length + 74 + length2 + length3 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("EvProfile{id=");
        sb.append(str);
        sb.append(", androidId=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", defaultConnectors=");
        sb.append(valueOf);
        sb.append(", selectedConnectors=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
