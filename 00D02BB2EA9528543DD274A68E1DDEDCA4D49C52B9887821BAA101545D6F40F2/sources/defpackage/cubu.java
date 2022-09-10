package defpackage;
/* compiled from: PG */
/* renamed from: cubu  reason: default package */
/* loaded from: classes5.dex */
public final class cubu extends cucb {
    private final ctyd a;

    public cubu(ctyd ctydVar) {
        this.a = ctydVar;
    }

    @Override // defpackage.cucb, defpackage.cuij
    public final ctyd a() {
        return this.a;
    }

    @Override // defpackage.cuij
    public final int b() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuij) {
            cuij cuijVar = (cuij) obj;
            if (cuijVar.b() == 7 && this.a.equals(cuijVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("LighterVisualElementMetadata{customWebViewLog=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
