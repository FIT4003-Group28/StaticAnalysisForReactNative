package defpackage;
/* compiled from: PG */
/* renamed from: zgk  reason: default package */
/* loaded from: classes7.dex */
final class zgk extends zol {
    public final int a;
    public final String b;
    public final cqix<?> c;
    public final ddho d;
    public final jhk e;

    public zgk(int i, String str, cqix<?> cqixVar, ddho ddhoVar, @dzsi jhk jhkVar) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = cqixVar;
            this.d = ddhoVar;
            this.e = jhkVar;
            return;
        }
        throw new NullPointerException("Null headline");
    }

    @Override // defpackage.zol
    public final int a() {
        return this.a;
    }

    @Override // defpackage.zol
    public final String b() {
        return this.b;
    }

    @Override // defpackage.zol
    public final cqix<?> c() {
        return this.c;
    }

    @Override // defpackage.zol
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.zol
    @dzsi
    public final jhk e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        jhk jhkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zol) {
            zol zolVar = (zol) obj;
            if (this.a == zolVar.a() && this.b.equals(zolVar.b()) && this.c.equals(zolVar.c()) && this.d.equals(zolVar.d()) && ((jhkVar = this.e) != null ? jhkVar.equals(zolVar.e()) : zolVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        jhk jhkVar = this.e;
        return hashCode ^ (jhkVar == null ? 0 : jhkVar.hashCode());
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("NonTaxiSubTab{tripIndex=");
        sb.append(i);
        sb.append(", headline=");
        sb.append(str);
        sb.append(", content=");
        sb.append(valueOf);
        sb.append(", subTabVisualElementType=");
        sb.append(valueOf2);
        sb.append(", icon=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
