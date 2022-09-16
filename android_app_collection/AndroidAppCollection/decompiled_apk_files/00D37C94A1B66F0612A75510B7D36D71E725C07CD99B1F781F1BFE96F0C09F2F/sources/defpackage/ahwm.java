package defpackage;
/* compiled from: PG */
/* renamed from: ahwm  reason: default package */
/* loaded from: classes.dex */
public final class ahwm {
    public final CharSequence a;
    private final arhr b;

    public ahwm() {
    }

    public ahwm(CharSequence charSequence, arhr arhrVar) {
        this.a = charSequence;
        this.b = arhrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwm) {
            ahwm ahwmVar = (ahwm) obj;
            if (this.a.equals(ahwmVar.a) && this.b.equals(ahwmVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("DefaultMarkerDecoration{label=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
