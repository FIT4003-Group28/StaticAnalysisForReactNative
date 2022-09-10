package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctow  reason: default package */
/* loaded from: classes5.dex */
public final class ctow extends ctoz {
    private final ctqy a;

    public ctow(ctqy ctqyVar) {
        this.a = ctqyVar;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 2;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final ctqy e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 2 && this.a.equals(ctrfVar.e())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("OneOfType{push=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
