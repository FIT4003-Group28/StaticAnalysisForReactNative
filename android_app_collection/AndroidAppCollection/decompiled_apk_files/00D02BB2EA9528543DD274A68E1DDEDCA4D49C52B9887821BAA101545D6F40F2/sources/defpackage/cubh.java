package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubh  reason: default package */
/* loaded from: classes5.dex */
public final class cubh extends cubs {
    private final int a;

    public cubh(int i) {
        this.a = i;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.COLOR;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.COLOR == cuhqVar.b() && this.a == cuhqVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("TextStyle{color=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
