package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubm  reason: default package */
/* loaded from: classes5.dex */
public final class cubm extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.STRIKETHROUGH;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.STRIKETHROUGH == cuhqVar.b() && cuhqVar.i()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean i() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("TextStyle{strikethrough=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
