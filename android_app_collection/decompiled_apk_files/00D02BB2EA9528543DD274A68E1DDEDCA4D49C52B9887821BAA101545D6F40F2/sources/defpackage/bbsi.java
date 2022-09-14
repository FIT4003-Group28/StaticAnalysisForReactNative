package defpackage;
/* compiled from: PG */
/* renamed from: bbsi  reason: default package */
/* loaded from: classes3.dex */
final class bbsi extends bbtq {
    private final ddho d;
    private final ddho e;
    private final ddho f;
    private final ddho g;
    private final ddho h;

    public bbsi(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5) {
        this.d = ddhoVar;
        this.e = ddhoVar2;
        this.f = ddhoVar3;
        this.g = ddhoVar4;
        this.h = ddhoVar5;
    }

    @Override // defpackage.bbtq
    public final ddho a() {
        return this.d;
    }

    @Override // defpackage.bbtq
    public final ddho b() {
        return this.e;
    }

    @Override // defpackage.bbtq
    public final ddho c() {
        return this.f;
    }

    @Override // defpackage.bbtq
    public final ddho d() {
        return this.g;
    }

    @Override // defpackage.bbtq
    public final ddho e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbtq) {
            bbtq bbtqVar = (bbtq) obj;
            if (this.d.equals(bbtqVar.a()) && this.e.equals(bbtqVar.b()) && this.f.equals(bbtqVar.c()) && this.g.equals(bbtqVar.d()) && this.h.equals(bbtqVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("LightboxPlaceTileVeTypes{placeTileVeType=");
        sb.append(valueOf);
        sb.append(", staticMapVeType=");
        sb.append(valueOf2);
        sb.append(", directionsButtonVeType=");
        sb.append(valueOf3);
        sb.append(", allPhotosButtonVeType=");
        sb.append(valueOf4);
        sb.append(", saveButtonVeType=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
