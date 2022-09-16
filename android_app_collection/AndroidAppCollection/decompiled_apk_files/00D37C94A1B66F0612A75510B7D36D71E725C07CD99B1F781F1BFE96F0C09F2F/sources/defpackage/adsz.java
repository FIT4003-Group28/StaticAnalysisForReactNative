package defpackage;
/* compiled from: PG */
/* renamed from: adsz  reason: default package */
/* loaded from: classes.dex */
final class adsz {
    public final adtd a;
    public final Runnable b;

    public adsz() {
    }

    public adsz(adtd adtdVar, Runnable runnable) {
        this.a = adtdVar;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adsz) {
            adsz adszVar = (adsz) obj;
            if (this.a.equals(adszVar.a) && this.b.equals(adszVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("Entry{message=");
        sb.append(valueOf);
        sb.append(", timeoutRunnable=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
