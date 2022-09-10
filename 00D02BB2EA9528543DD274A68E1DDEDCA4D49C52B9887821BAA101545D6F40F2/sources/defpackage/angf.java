package defpackage;
/* compiled from: PG */
/* renamed from: angf  reason: default package */
/* loaded from: classes2.dex */
public final class angf<D> extends angs<D> {
    public final angr a;
    private final dbsg<D> b;

    public angf(dbsg<D> dbsgVar, angr angrVar) {
        if (dbsgVar != null) {
            this.b = dbsgVar;
            if (angrVar != null) {
                this.a = angrVar;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null optionalData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.angs
    public final dbsg<D> a() {
        return this.b;
    }

    @Override // defpackage.angs
    public final angr b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof angs) {
            angs angsVar = (angs) obj;
            if (this.b.equals(angsVar.a()) && this.a.equals(angsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("Snapshot{optionalData=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
