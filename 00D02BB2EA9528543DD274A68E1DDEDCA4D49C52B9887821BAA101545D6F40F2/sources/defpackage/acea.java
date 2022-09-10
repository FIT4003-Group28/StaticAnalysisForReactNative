package defpackage;
/* compiled from: PG */
/* renamed from: acea  reason: default package */
/* loaded from: classes2.dex */
public final class acea extends aceh {
    private final String a;
    private final dwfl b;
    private final dspd c;
    private final dbsg<Integer> d;
    private final int e;

    public acea(String str, dwfl dwflVar, dspd dspdVar, dbsg<Integer> dbsgVar, int i) {
        if (str != null) {
            this.a = str;
            if (dwflVar != null) {
                this.b = dwflVar;
                if (dspdVar != null) {
                    this.c = dspdVar;
                    this.d = dbsgVar;
                    this.e = i;
                    return;
                }
                throw new NullPointerException("Null semanticFilterToken");
            }
            throw new NullPointerException("Null photo");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.aceh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aceh
    public final dwfl b() {
        return this.b;
    }

    @Override // defpackage.aceh
    public final dspd c() {
        return this.c;
    }

    @Override // defpackage.aceh
    public final dbsg<Integer> d() {
        return this.d;
    }

    @Override // defpackage.aceh
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aceh) {
            aceh acehVar = (aceh) obj;
            if (this.a.equals(acehVar.a()) && this.b.equals(acehVar.b()) && this.c.equals(acehVar.c()) && this.d.equals(acehVar.d()) && this.e == acehVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dwfl dwflVar = this.b;
        int i = dwflVar.bC;
        if (i == 0) {
            i = dsst.a.b(dwflVar).c(dwflVar);
            dwflVar.bC = i;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(Integer.toString(this.e - 1));
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 78 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("IntentPivot{title=");
        sb.append(str);
        sb.append(", photo=");
        sb.append(valueOf);
        sb.append(", semanticFilterToken=");
        sb.append(valueOf2);
        sb.append(", pivotTypeId=");
        sb.append(valueOf3);
        sb.append(", presentation=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
