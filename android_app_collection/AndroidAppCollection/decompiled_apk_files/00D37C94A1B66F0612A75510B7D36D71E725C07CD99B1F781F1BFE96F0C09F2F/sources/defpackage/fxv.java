package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxv  reason: default package */
/* loaded from: classes3.dex */
public final class fxv extends fxq {
    private final fxr a;
    private final fxr b;

    public fxv(fxr fxrVar, fxr fxrVar2) {
        if (fxrVar != null) {
            this.a = fxrVar;
            if (fxrVar2 != null) {
                this.b = fxrVar2;
                return;
            }
            throw new NullPointerException("Null toState");
        }
        throw new NullPointerException("Null currentState");
    }

    @Override // defpackage.fxq
    public fxr b() {
        return this.a;
    }

    @Override // defpackage.fxq
    public fxr c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fxq) {
            fxq fxqVar = (fxq) obj;
            if (this.a.equals(fxqVar.b()) && this.b.equals(fxqVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("ActiveStateChangedEvent{currentState=");
        sb.append(valueOf);
        sb.append(", toState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
