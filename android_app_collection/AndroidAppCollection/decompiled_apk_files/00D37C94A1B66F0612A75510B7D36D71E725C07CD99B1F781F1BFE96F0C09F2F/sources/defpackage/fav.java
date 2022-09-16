package defpackage;
/* compiled from: PG */
/* renamed from: fav  reason: default package */
/* loaded from: classes3.dex */
public final class fav {
    public final int a;
    public final amuk b;

    public fav(int i, amuk amukVar) {
        this.a = i;
        if (amukVar != null) {
            this.b = amukVar;
            return;
        }
        throw new NullPointerException("Null downloadedEntities");
    }

    public static fav a(int i, amuk amukVar) {
        return new fav(i, amukVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fav) {
            fav favVar = (fav) obj;
            if (this.a == favVar.a && amxp.v(this.b, favVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70);
        sb.append("DownloadsDataResponse{downloadsCount=");
        sb.append(i);
        sb.append(", downloadedEntities=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public fav() {
    }
}
