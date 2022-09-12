package defpackage;

import defpackage.bwhv;
/* compiled from: PG */
/* renamed from: bwdf  reason: default package */
/* loaded from: classes4.dex */
final class bwdf<V extends bwhv> extends bwdp<V> {
    private final V a;
    private final bwgr<V> b;

    public bwdf(V v, bwgr<V> bwgrVar) {
        if (v != null) {
            this.a = v;
            this.b = bwgrVar;
            return;
        }
        throw new NullPointerException("Null viewModel");
    }

    @Override // defpackage.bwdp
    public final V a() {
        return this.a;
    }

    @Override // defpackage.bwdp
    public final bwgr<V> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwdp) {
            bwdp bwdpVar = (bwdp) obj;
            if (this.a.equals(bwdpVar.a()) && this.b.equals(bwdpVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("SendKitAutocompleteBarFooter{viewModel=");
        sb.append(valueOf);
        sb.append(", layout=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
