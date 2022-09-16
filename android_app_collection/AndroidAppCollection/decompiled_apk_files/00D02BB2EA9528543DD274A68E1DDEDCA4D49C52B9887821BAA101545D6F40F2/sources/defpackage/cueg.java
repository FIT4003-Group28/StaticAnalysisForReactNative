package defpackage;
/* compiled from: PG */
/* renamed from: cueg  reason: default package */
/* loaded from: classes5.dex */
final class cueg extends cuhx {
    private final cuhv a;

    public cueg(cuhv cuhvVar) {
        this.a = cuhvVar;
    }

    @Override // defpackage.cuhx
    public final cuhv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuhx)) {
            return false;
        }
        return this.a.equals(((cuhx) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("RichTextContentModel{content=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
