package defpackage;
/* compiled from: PG */
/* renamed from: cuby  reason: default package */
/* loaded from: classes5.dex */
public final class cuby extends cucb {
    private final ctyf a;

    public cuby(ctyf ctyfVar) {
        this.a = ctyfVar;
    }

    @Override // defpackage.cuij
    public final int b() {
        return 8;
    }

    @Override // defpackage.cucb, defpackage.cuij
    public final ctyf c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuij) {
            cuij cuijVar = (cuij) obj;
            if (cuijVar.b() == 8 && this.a.equals(cuijVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("LighterVisualElementMetadata{richCardMessage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
