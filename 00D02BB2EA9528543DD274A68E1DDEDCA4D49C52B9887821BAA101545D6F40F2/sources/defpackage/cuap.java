package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuap  reason: default package */
/* loaded from: classes5.dex */
public final class cuap extends cuar {
    private final String a;

    public cuap(String str) {
        this.a = str;
    }

    @Override // defpackage.cugm
    public final int a() {
        return 2;
    }

    @Override // defpackage.cuar, defpackage.cugm
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cugm) {
            cugm cugmVar = (cugm) obj;
            if (cugmVar.a() == 2 && this.a.equals(cugmVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 21);
        sb.append("MessageContent{text=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
