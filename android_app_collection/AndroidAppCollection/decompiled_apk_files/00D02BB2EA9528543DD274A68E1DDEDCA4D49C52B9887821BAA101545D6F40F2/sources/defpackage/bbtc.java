package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbtc  reason: default package */
/* loaded from: classes3.dex */
public final class bbtc extends bbvh {
    public final ilo a;
    public final dbsg<dgpu> b;
    public final dbsg<crtr> c;

    public bbtc(ilo iloVar, dbsg<dgpu> dbsgVar, dbsg<crtr> dbsgVar2) {
        this.a = iloVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.bbvh
    public final ilo a() {
        return this.a;
    }

    @Override // defpackage.bbvh
    public final dbsg<dgpu> b() {
        return this.b;
    }

    @Override // defpackage.bbvh
    public final dbsg<crtr> c() {
        return this.c;
    }

    @Override // defpackage.bbvh
    public final bbvg d() {
        return new bbtb(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbvh) {
            bbvh bbvhVar = (bbvh) obj;
            if (this.a.equals(bbvhVar.a()) && this.b.equals(bbvhVar.b()) && this.c.equals(bbvhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UploadLocationOption{placemark=");
        sb.append(valueOf);
        sb.append(", shareTarget=");
        sb.append(valueOf2);
        sb.append(", placeConfidence=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
