package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubg  reason: default package */
/* loaded from: classes5.dex */
public final class cubg extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.BOLD;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.BOLD == cuhqVar.b() && cuhqVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(21);
        sb.append("TextStyle{bold=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
