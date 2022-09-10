package defpackage;
/* compiled from: PG */
/* renamed from: ahap  reason: default package */
/* loaded from: classes2.dex */
final class ahap extends ahgy {
    public final int a;
    public final String b;
    public final int c;
    public final cqss d;
    private final baab h;
    private final int i;
    private final cqss j;
    private final cqss k;

    public ahap(baab baabVar, int i, @dzsi String str, int i2, int i3, cqss cqssVar, cqss cqssVar2, cqss cqssVar3) {
        if (baabVar != null) {
            this.h = baabVar;
            this.a = i;
            this.b = str;
            this.c = i2;
            this.i = i3;
            this.d = cqssVar;
            this.j = cqssVar2;
            this.k = cqssVar3;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.ahgy
    public final baab a() {
        return this.h;
    }

    @Override // defpackage.ahgy
    public final int b() {
        return this.a;
    }

    @Override // defpackage.ahgy
    @dzsi
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ahgy
    public final int d() {
        return this.c;
    }

    @Override // defpackage.ahgy
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahgy) {
            ahgy ahgyVar = (ahgy) obj;
            if (this.h.equals(ahgyVar.a()) && this.a == ahgyVar.b() && ((str = this.b) != null ? str.equals(ahgyVar.c()) : ahgyVar.c() == null) && this.c == ahgyVar.d() && this.i == ahgyVar.e() && this.d.equals(ahgyVar.f()) && this.j.equals(ahgyVar.g()) && this.k.equals(ahgyVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ahgy
    public final cqss f() {
        return this.d;
    }

    @Override // defpackage.ahgy
    public final cqss g() {
        return this.j;
    }

    @Override // defpackage.ahgy
    public final cqss h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (((this.h.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003;
        String str = this.b;
        return ((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        int i3 = this.i;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.j);
        String valueOf4 = String.valueOf(this.k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 170 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SavedListType{type=");
        sb.append(valueOf);
        sb.append(", nameResourceId=");
        sb.append(i);
        sb.append(", customName=");
        sb.append(str);
        sb.append(", iconResourceId=");
        sb.append(i2);
        sb.append(", chipIconResourceId=");
        sb.append(i3);
        sb.append(", highlightColor=");
        sb.append(valueOf2);
        sb.append(", backgroundColor=");
        sb.append(valueOf3);
        sb.append(", strokeColor=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
