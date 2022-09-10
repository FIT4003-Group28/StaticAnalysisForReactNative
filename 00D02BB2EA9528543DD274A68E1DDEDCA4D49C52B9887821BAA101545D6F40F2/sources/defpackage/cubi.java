package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubi  reason: default package */
/* loaded from: classes5.dex */
public final class cubi extends cubs {
    private final int a;

    public cubi(int i) {
        this.a = i;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.HORIZONTAL_ALIGNMENT;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.HORIZONTAL_ALIGNMENT == cuhqVar.b() && this.a == cuhqVar.e()) {
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
        StringBuilder sb = new StringBuilder(42);
        sb.append("TextStyle{horizontalAlignment=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
