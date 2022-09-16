package defpackage;
/* compiled from: PG */
/* renamed from: cudl  reason: default package */
/* loaded from: classes5.dex */
public final class cudl extends cugb {
    public final cugu a;

    public cudl(cugu cuguVar) {
        this.a = cuguVar;
    }

    @Override // defpackage.cugb
    public final cugu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cugb)) {
            return false;
        }
        return this.a.equals(((cugb) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("DraftMessage{message=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
