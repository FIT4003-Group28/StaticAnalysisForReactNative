package defpackage;
/* compiled from: PG */
/* renamed from: bkoz  reason: default package */
/* loaded from: classes3.dex */
public final class bkoz extends bkpe {
    private final cdjd a;
    private final boolean b;

    public bkoz(cdjd cdjdVar, boolean z) {
        if (cdjdVar != null) {
            this.a = cdjdVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null post");
    }

    @Override // defpackage.bkpe
    public final cdjd a() {
        return this.a;
    }

    @Override // defpackage.bkpe
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkpe) {
            bkpe bkpeVar = (bkpe) obj;
            if (this.a.equals(bkpeVar.a()) && this.b == bkpeVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("PlaceReviewChangedEvent{post=");
        sb.append(valueOf);
        sb.append(", isThumbsUpOnly=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
