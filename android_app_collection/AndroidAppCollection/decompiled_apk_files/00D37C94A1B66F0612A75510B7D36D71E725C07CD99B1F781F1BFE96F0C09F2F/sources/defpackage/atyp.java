package defpackage;
/* compiled from: PG */
/* renamed from: atyp  reason: default package */
/* loaded from: classes2.dex */
public final class atyp implements aajq {
    public static final aajr a = new atyo();
    public final aajl b;
    public final atyq c;

    public atyp(atyq atyqVar, aajl aajlVar) {
        this.c = atyqVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        atyq atyqVar = this.c;
        if ((atyqVar.c & 32) != 0) {
            amvlVar.c(atyqVar.i);
        }
        if (this.c.j.size() > 0) {
            amvlVar.j(this.c.j);
        }
        atyq atyqVar2 = this.c;
        if ((atyqVar2.c & 64) != 0) {
            amvlVar.c(atyqVar2.k);
        }
        atyq atyqVar3 = this.c;
        if ((atyqVar3.c & 128) != 0) {
            amvlVar.c(atyqVar3.l);
        }
        return amvlVar.g();
    }

    public final aqqv b() {
        aajj b = this.b.b(this.c.k);
        boolean z = true;
        if (b != null && !(b instanceof aqqv)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of DrmLicenseEntityModel, key=drmLicense");
        return (aqqv) b;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new atyn(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atyp) && this.c.equals(((atyp) obj).c);
    }

    public final atss f() {
        aajj b = this.b.b(this.c.l);
        boolean z = true;
        if (b != null && !(b instanceof atss)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (atss) b;
    }

    public final avkp g() {
        aajj b = this.b.b(this.c.i);
        boolean z = true;
        if (b != null && !(b instanceof avkp)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of TransferEntityModel, key=transfer");
        return (avkp) b;
    }

    public aoob getPlayerResponseBytes() {
        return this.c.e;
    }

    public String getPlayerResponseJson() {
        return this.c.f;
    }

    public Long getPlayerResponseTimestamp() {
        return Long.valueOf(this.c.g);
    }

    public Long getStreamDownloadTimestampSeconds() {
        return Long.valueOf(this.c.h);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public final boolean h() {
        return (this.c.c & 2) != 0;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("PlaybackDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
