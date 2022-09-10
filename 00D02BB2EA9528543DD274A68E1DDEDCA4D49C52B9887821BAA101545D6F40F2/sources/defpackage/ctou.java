package defpackage;
/* compiled from: PG */
/* renamed from: ctou  reason: default package */
/* loaded from: classes5.dex */
public final class ctou extends ctoz {
    private final cugu a;

    public ctou(cugu cuguVar) {
        this.a = cuguVar;
    }

    @Override // defpackage.ctrf
    public final int b() {
        return 1;
    }

    @Override // defpackage.ctoz, defpackage.ctrf
    public final cugu c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctrf) {
            ctrf ctrfVar = (ctrf) obj;
            if (ctrfVar.b() == 1 && this.a.equals(ctrfVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("OneOfType{message=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
