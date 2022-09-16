package defpackage;
/* compiled from: PG */
/* renamed from: hld  reason: default package */
/* loaded from: classes3.dex */
public final class hld {
    public final ampq a;
    public final azqb b;
    public final boolean c;

    public hld() {
    }

    public hld(ampq ampqVar, azqb azqbVar, boolean z) {
        this.a = ampqVar;
        this.b = azqbVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hld) {
            hld hldVar = (hld) obj;
            if (this.a.equals(hldVar.a) && this.b.equals(hldVar.b) && this.c == hldVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87 + String.valueOf(valueOf2).length());
        sb.append("CarouselThumbnailViewData{videoDurationMs=");
        sb.append(valueOf);
        sb.append(", thumbnailBitmapProvider=");
        sb.append(valueOf2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
