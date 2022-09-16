package defpackage;
/* compiled from: PG */
/* renamed from: cdsj  reason: default package */
/* loaded from: classes4.dex */
final class cdsj extends cdtv {
    private final cebg a;
    private final cebf b;
    private final int c;

    public cdsj(cebg cebgVar, cebf cebfVar, int i) {
        if (cebgVar != null) {
            this.a = cebgVar;
            this.b = cebfVar;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null thumbsListViewModel");
    }

    @Override // defpackage.cdtv
    public final cebg a() {
        return this.a;
    }

    @Override // defpackage.cdtv
    public final cebf b() {
        return this.b;
    }

    @Override // defpackage.cdtv
    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdtv) {
            cdtv cdtvVar = (cdtv) obj;
            if (this.a.equals(cdtvVar.a()) && this.b.equals(cdtvVar.b()) && this.c == cdtvVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
        sb.append("PhotoViewModelImpl{thumbsListViewModel=");
        sb.append(valueOf);
        sb.append(", thumbViewModel=");
        sb.append(valueOf2);
        sb.append(", thumbIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
