package defpackage;
/* compiled from: PG */
/* renamed from: kae  reason: default package */
/* loaded from: classes3.dex */
final class kae extends kak {
    private final kao a;
    private final kaj b;

    public kae(kao kaoVar, kaj kajVar) {
        if (kaoVar != null) {
            this.a = kaoVar;
            if (kajVar != null) {
                this.b = kajVar;
                return;
            }
            throw new NullPointerException("Null interruptionContext");
        }
        throw new NullPointerException("Null interruptionEvent");
    }

    @Override // defpackage.kak
    public kaj a() {
        return this.b;
    }

    @Override // defpackage.kak
    public kao b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kak) {
            kak kakVar = (kak) obj;
            if (this.a.equals(kakVar.b()) && this.b.equals(kakVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("LoggableInterruptionEvent{interruptionEvent=");
        sb.append(valueOf);
        sb.append(", interruptionContext=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
