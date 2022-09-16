package defpackage;
/* compiled from: PG */
/* renamed from: apjw  reason: default package */
/* loaded from: classes.dex */
public final class apjw implements aajq {
    public static final aajr a = new apju();
    private final apjx b;

    public apjw(apjx apjxVar) {
        this.b = apjxVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final apjv e() {
        return new apjv(this.b.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof apjw) && this.b.equals(((apjw) obj).b);
    }

    public apsx getStatus() {
        apsx b = apsx.b(this.b.d);
        return b == null ? apsx.CHANNEL_STATUS_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("AvatarRowChannelStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
