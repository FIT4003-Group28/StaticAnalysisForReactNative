package defpackage;
/* compiled from: PG */
/* renamed from: asys  reason: default package */
/* loaded from: classes2.dex */
public final class asys {
    public final asyw a;
    private final aajl b;

    public asys(asyw asywVar, aajl aajlVar) {
        this.a = asywVar;
        this.b = aajlVar;
    }

    public final asyq a() {
        asyw asywVar = this.a;
        boolean z = true;
        aajj b = this.b.b(asywVar.b == 1 ? (String) asywVar.c : "");
        if (b != null && !(b instanceof asyq)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of MainRecommendedDownloadVideoEntityModel, key=video");
        return (asyq) b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asys) && this.a.equals(((asys) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("ItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
