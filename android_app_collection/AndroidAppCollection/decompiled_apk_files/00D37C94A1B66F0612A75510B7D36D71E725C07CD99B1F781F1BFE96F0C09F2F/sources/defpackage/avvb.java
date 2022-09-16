package defpackage;
/* compiled from: PG */
/* renamed from: avvb  reason: default package */
/* loaded from: classes2.dex */
public final class avvb implements aajq {
    public static final aajr a = new avva();
    private final avvc b;

    public avvb(avvc avvcVar) {
        this.b = avvcVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final avuz e() {
        return new avuz(this.b.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof avvb) && this.b.equals(((avvb) obj).b);
    }

    public Integer getNumVideosCompleted() {
        return Integer.valueOf(this.b.h);
    }

    public Integer getNumVideosFailed() {
        return Integer.valueOf(this.b.g);
    }

    public Integer getNumVideosInProgress() {
        return Integer.valueOf(this.b.f);
    }

    public Long getTimestampMs() {
        return Long.valueOf(this.b.i);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public Float getUploadProgress() {
        return Float.valueOf(this.b.e);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("UploadStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
