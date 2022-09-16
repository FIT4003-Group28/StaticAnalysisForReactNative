package defpackage;
/* compiled from: PG */
/* renamed from: kfa  reason: default package */
/* loaded from: classes3.dex */
public final class kfa {
    public final boolean a;
    public final kew b;

    public kfa() {
    }

    public kfa(kew kewVar, boolean z) {
        this.b = kewVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfa) {
            kfa kfaVar = (kfa) obj;
            if (this.b.equals(kfaVar.b) && this.a == kfaVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("StateTransition{midUiAction=");
        sb.append(valueOf);
        sb.append(", shouldAnimate=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
