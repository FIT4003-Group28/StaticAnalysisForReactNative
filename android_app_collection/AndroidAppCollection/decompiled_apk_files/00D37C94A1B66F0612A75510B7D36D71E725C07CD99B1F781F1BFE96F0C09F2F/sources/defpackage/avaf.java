package defpackage;
/* compiled from: PG */
/* renamed from: avaf  reason: default package */
/* loaded from: classes2.dex */
public final class avaf implements aajq {
    public static final aajr a = new avae();
    private final avag b;

    public avaf(avag avagVar) {
        this.b = avagVar;
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
        return new avad(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avaf) && this.b.equals(((avaf) obj).b);
    }

    public asux getConnectionState() {
        asux b = asux.b(this.b.d);
        return b == null ? asux.LIVESTREAM_CONNECTION_STATE_UNKNOWN : b;
    }

    public Boolean getHidden() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getMuted() {
        return Boolean.valueOf(this.b.f);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("StreamStatusDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
