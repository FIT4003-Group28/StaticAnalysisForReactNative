package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubq  reason: default package */
/* loaded from: classes5.dex */
public final class cubq extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.UNDERLINE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.UNDERLINE == cuhqVar.b() && cuhqVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean m() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("TextStyle{underline=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
