package defpackage;
/* compiled from: PG */
/* renamed from: aqgb  reason: default package */
/* loaded from: classes2.dex */
final class aqgb<T> extends aqgj<T> {
    public final crzm<T> a;
    public final crzp<T> b;

    public aqgb(crzm<T> crzmVar, crzp<T> crzpVar) {
        this.a = crzmVar;
        this.b = crzpVar;
    }

    @Override // defpackage.aqgj
    public final crzm<T> a() {
        return this.a;
    }

    @Override // defpackage.aqgj
    public final crzp<T> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqgj) {
            aqgj aqgjVar = (aqgj) obj;
            if (this.a.equals(aqgjVar.a()) && this.b.equals(aqgjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("ObserverAndState{observableState=");
        sb.append(valueOf);
        sb.append(", observer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
