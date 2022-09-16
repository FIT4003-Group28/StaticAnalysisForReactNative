package defpackage;
/* compiled from: PG */
/* renamed from: aqoi  reason: default package */
/* loaded from: classes2.dex */
public final class aqoi implements aajq {
    public static final aajr a = new aqoh();
    private final aajl b;
    private final aqoj c;

    public aqoi(aqoj aqojVar, aajl aajlVar) {
        this.c = aqojVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getOfflineFutureUnplayableInfoModel().a());
        getOnTapCommandOverrideDataModel();
        amvlVar.j(atqq.b());
        return amvlVar.g();
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
        return new aqog(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqoi) && this.c.equals(((aqoi) obj).c);
    }

    public Float getDownloadProgress() {
        return Float.valueOf(this.c.f);
    }

    public avyq getDownloadState() {
        avyq b = avyq.b(this.c.e);
        return b == null ? avyq.DOWNLOAD_STATE_UNKNOWN : b;
    }

    public String getDownloadStatusMessage() {
        return this.c.h;
    }

    public Boolean getIsFutureUnplayable() {
        return Boolean.valueOf(this.c.k);
    }

    public Boolean getIsPartiallyPlayable() {
        return Boolean.valueOf(this.c.i);
    }

    public Long getLastUpdatedTimestampSeconds() {
        return Long.valueOf(this.c.m);
    }

    public atqu getOfflineFutureUnplayableInfo() {
        atqu atquVar = this.c.l;
        return atquVar == null ? atqu.a : atquVar;
    }

    public atqs getOfflineFutureUnplayableInfoModel() {
        atqu atquVar = this.c.l;
        if (atquVar == null) {
            atquVar = atqu.a;
        }
        return atqs.b(atquVar).a(this.b);
    }

    public atqt getOnTapCommandOverrideData() {
        atqt atqtVar = this.c.n;
        return atqtVar == null ? atqt.a : atqtVar;
    }

    public atqq getOnTapCommandOverrideDataModel() {
        atqt atqtVar = this.c.n;
        if (atqtVar == null) {
            atqtVar = atqt.a;
        }
        return atqq.a(atqtVar).a();
    }

    public Float getPreviousDownloadProgress() {
        return Float.valueOf(this.c.g);
    }

    public Boolean getShowDownloadBadge() {
        return Boolean.valueOf(this.c.j);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("DownloadStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
