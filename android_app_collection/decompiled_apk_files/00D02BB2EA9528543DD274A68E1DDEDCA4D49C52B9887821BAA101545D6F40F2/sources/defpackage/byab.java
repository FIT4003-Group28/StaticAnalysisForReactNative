package defpackage;
/* compiled from: PG */
/* renamed from: byab  reason: default package */
/* loaded from: classes4.dex */
final class byab extends byad {
    private final String a;
    private final cqkp b;

    public byab(String str, cqkp cqkpVar) {
        if (str != null) {
            this.a = str;
            if (cqkpVar != null) {
                this.b = cqkpVar;
                return;
            }
            throw new NullPointerException("Null viewModel");
        }
        throw new NullPointerException("Null iconUrl");
    }

    @Override // defpackage.byad
    public final String a() {
        return this.a;
    }

    @Override // defpackage.byad
    public final cqkp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byad) {
            byad byadVar = (byad) obj;
            if (this.a.equals(byadVar.a()) && this.b.equals(byadVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(valueOf).length());
        sb.append("FetchedIcon{iconUrl=");
        sb.append(str);
        sb.append(", viewModel=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
