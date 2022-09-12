package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anea  reason: default package */
/* loaded from: classes2.dex */
public final class anea extends aneh {
    private final akqq a;
    private final cjqm b;

    public anea(akqq akqqVar, cjqm cjqmVar) {
        this.a = akqqVar;
        if (cjqmVar != null) {
            this.b = cjqmVar;
            return;
        }
        throw new NullPointerException("Null loggedInteraction");
    }

    @Override // defpackage.aneh
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.aneh
    public final cjqm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aneh) {
            aneh anehVar = (aneh) obj;
            if (this.a.equals(anehVar.a()) && this.b.equals(anehVar.b())) {
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
        sb.append("MapPointResult{position=");
        sb.append(valueOf);
        sb.append(", loggedInteraction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
