package defpackage;
/* compiled from: PG */
/* renamed from: arhk  reason: default package */
/* loaded from: classes2.dex */
public final class arhk implements aajq {
    public static final aajr a = new arhj();
    public final arhl b;

    public arhk(arhl arhlVar) {
        this.b = arhlVar;
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
        return new arhi(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof arhk) && this.b.equals(((arhk) obj).b);
    }

    public String getBadgeText() {
        return this.b.d;
    }

    public Boolean getIsVisible() {
        return Boolean.valueOf(this.b.e);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("IconBadgeEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
