package defpackage;
/* compiled from: PG */
/* renamed from: czaq  reason: default package */
/* loaded from: classes5.dex */
final class czaq extends czau {
    private final String a;
    private final cywi b;
    private final int c;

    public czaq(String str, cywi cywiVar, int i) {
        this.a = str;
        this.b = cywiVar;
        this.c = i;
    }

    @Override // defpackage.czau
    public final String a() {
        return this.a;
    }

    @Override // defpackage.czau
    public final cywi b() {
        return this.b;
    }

    @Override // defpackage.czau
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czau) {
            czau czauVar = (czau) obj;
            if (this.a.equals(czauVar.a()) && this.b.equals(czauVar.b()) && this.c == czauVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54 + String.valueOf(valueOf).length());
        sb.append("PersonResponse{personId=");
        sb.append(str);
        sb.append(", person=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
