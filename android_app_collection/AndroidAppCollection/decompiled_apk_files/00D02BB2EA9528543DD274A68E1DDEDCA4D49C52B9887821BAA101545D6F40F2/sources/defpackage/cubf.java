package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubf  reason: default package */
/* loaded from: classes5.dex */
public final class cubf extends cubs {
    private final int a;

    public cubf(int i) {
        this.a = i;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.BACKGROUND_COLOR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.BACKGROUND_COLOR == cuhqVar.b() && this.a == cuhqVar.a()) {
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
        StringBuilder sb = new StringBuilder(38);
        sb.append("TextStyle{backgroundColor=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
