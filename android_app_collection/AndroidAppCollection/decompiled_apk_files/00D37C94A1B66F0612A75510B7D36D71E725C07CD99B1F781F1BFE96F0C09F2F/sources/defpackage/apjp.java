package defpackage;
/* compiled from: PG */
/* renamed from: apjp  reason: default package */
/* loaded from: classes.dex */
public final class apjp implements aajq {
    public static final aajr a = new apjn();
    private final apjq b;

    public apjp(apjq apjqVar) {
        this.b = apjqVar;
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
        return new apjo(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof apjp) && this.b.equals(((apjp) obj).b);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public apjr getVisibilityState() {
        apjr b = apjr.b(this.b.d);
        return b == null ? apjr.AUTOTAG_VISIBILITY_STATE_UNSPECIFIED : b;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("AutotagVisibilityStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
