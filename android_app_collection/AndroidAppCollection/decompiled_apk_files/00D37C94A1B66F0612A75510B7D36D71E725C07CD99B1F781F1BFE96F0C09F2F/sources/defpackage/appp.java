package defpackage;
/* compiled from: PG */
/* renamed from: appp  reason: default package */
/* loaded from: classes2.dex */
public final class appp implements aajq {
    public static final aajr a = new appo();
    private final appq b;

    public appp(appq appqVar) {
        this.b = appqVar;
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
        return new appn(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof appp) && this.b.equals(((appp) obj).b);
    }

    public String getCaptionPath() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("CaptionTrackEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
