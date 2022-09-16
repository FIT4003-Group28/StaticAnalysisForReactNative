package defpackage;
/* compiled from: PG */
/* renamed from: hkw  reason: default package */
/* loaded from: classes3.dex */
public final class hkw {
    public final amuk a;
    public final ampq b;

    public hkw() {
    }

    public hkw(amuk amukVar, ampq ampqVar) {
        this.a = amukVar;
        this.b = ampqVar;
    }

    public static hkv a() {
        hkv hkvVar = new hkv(null);
        hkvVar.a = amon.a;
        return hkvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkw) {
            hkw hkwVar = (hkw) obj;
            if (amxp.v(this.a, hkwVar.a) && this.b.equals(hkwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("CarouselThumbnailRecyclerViewData{thumbnailList=");
        sb.append(valueOf);
        sb.append(", selectedIndex=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
