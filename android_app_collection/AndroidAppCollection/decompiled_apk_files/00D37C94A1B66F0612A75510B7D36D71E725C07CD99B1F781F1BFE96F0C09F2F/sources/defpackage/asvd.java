package defpackage;
/* compiled from: PG */
/* renamed from: asvd  reason: default package */
/* loaded from: classes2.dex */
public final class asvd implements aajq {
    public static final aajr a = new asvc();
    public final asve b;

    public asvd(asve asveVar) {
        this.b = asveVar;
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
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new asvb(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asvd) && this.b.equals(((asvd) obj).b);
    }

    public Long getImageFetchedTimestampMs() {
        return Long.valueOf(this.b.f);
    }

    public String getLocalImageUrl() {
        return this.b.e;
    }

    public String getRemoteImageUrl() {
        return this.b.d;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("LocalImageEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
