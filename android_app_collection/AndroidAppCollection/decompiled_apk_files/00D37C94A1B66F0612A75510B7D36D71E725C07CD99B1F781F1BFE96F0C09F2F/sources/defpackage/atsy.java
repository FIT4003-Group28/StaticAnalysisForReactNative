package defpackage;
/* compiled from: PG */
/* renamed from: atsy  reason: default package */
/* loaded from: classes2.dex */
public final class atsy implements aajq {
    public static final aajr a = new atsx();
    private final atsz b;

    public atsy(atsz atszVar) {
        this.b = atszVar;
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
        return new atsw(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atsy) && this.b.equals(((atsy) obj).b);
    }

    public Long getBytesDownloaded() {
        return Long.valueOf(this.b.f);
    }

    public avyq getDownloadState() {
        avyq b = avyq.b(this.b.e);
        return b == null ? avyq.DOWNLOAD_STATE_UNKNOWN : b;
    }

    public Long getTotalBytes() {
        return Long.valueOf(this.b.g);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("OfflineVideoStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
