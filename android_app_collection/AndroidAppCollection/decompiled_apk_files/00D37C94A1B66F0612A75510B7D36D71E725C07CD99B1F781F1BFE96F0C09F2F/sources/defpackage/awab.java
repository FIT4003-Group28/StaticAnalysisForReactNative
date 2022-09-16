package defpackage;
/* compiled from: PG */
/* renamed from: awab  reason: default package */
/* loaded from: classes2.dex */
public final class awab implements aajq {
    public static final aajr a = new awaa();
    private final awac b;

    public awab(awac awacVar) {
        this.b = awacVar;
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
        return new avzz(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awab) && this.b.equals(((awab) obj).b);
    }

    public Long getLastPlaybackPositionSeconds() {
        return Long.valueOf(this.b.f);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getVideoId() {
        return this.b.e;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("VideoPlaybackPositionEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
