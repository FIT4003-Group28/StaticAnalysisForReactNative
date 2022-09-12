package defpackage;
/* compiled from: PG */
/* renamed from: bcoy  reason: default package */
/* loaded from: classes3.dex */
final class bcoy extends bcpb {
    private final bcpa a;

    public bcoy(bcpa bcpaVar) {
        if (bcpaVar != null) {
            this.a = bcpaVar;
            return;
        }
        throw new NullPointerException("Null intentAction");
    }

    @Override // defpackage.bcpb
    public final bcpa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcpb)) {
            return false;
        }
        return this.a.equals(((bcpb) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("PhotoPickTakeActivityResult{intentAction=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
