package defpackage;
/* compiled from: PG */
/* renamed from: aprk  reason: default package */
/* loaded from: classes2.dex */
public final class aprk implements aajq {
    public static final aajr a = new aprj();
    public final aprl b;

    public aprk(aprl aprlVar) {
        this.b = aprlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new apri(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aprk) && this.b.equals(((aprk) obj).b);
    }

    public String getBlobEncryptionId() {
        return this.b.i;
    }

    public String getClientPhotoFilePath() {
        return this.b.h;
    }

    public String getErrorMessage() {
        return this.b.f;
    }

    public Boolean getIsCreateChannelLoading() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getIsEditNameOntapDisabled() {
        return Boolean.valueOf(this.b.l);
    }

    public Boolean getIsNameTooLongMessageOn() {
        return Boolean.valueOf(this.b.k);
    }

    public Boolean getIsWaitMessageOn() {
        return Boolean.valueOf(this.b.j);
    }

    public atxd getPhotoUploadStatus() {
        atxd b = atxd.b(this.b.g);
        return b == null ? atxd.PHOTO_UPLOAD_STATUS_UNSPECIFIED : b;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("ChannelCreationFormStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
