package defpackage;
/* compiled from: PG */
/* renamed from: cuca  reason: default package */
/* loaded from: classes5.dex */
final class cuca extends cucb {
    private final ctyb a;

    public cuca(ctyb ctybVar) {
        this.a = ctybVar;
    }

    @Override // defpackage.cuij
    public final int b() {
        return 2;
    }

    @Override // defpackage.cucb, defpackage.cuij
    public final ctyb d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuij) {
            cuij cuijVar = (cuij) obj;
            if (cuijVar.b() == 2 && this.a.equals(cuijVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("LighterVisualElementMetadata{suggestionChip=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
