package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avkl  reason: default package */
/* loaded from: classes3.dex */
public final class avkl extends avkq {
    private final dcep<dltz> b;

    public avkl(dcep<dltz> dcepVar) {
        if (dcepVar != null) {
            this.b = dcepVar;
            return;
        }
        throw new NullPointerException("Null ongoingFetchTypes");
    }

    @Override // defpackage.avkq
    public final dcep<dltz> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avkq)) {
            return false;
        }
        return this.b.equals(((avkq) obj).a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("FetchState{ongoingFetchTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
