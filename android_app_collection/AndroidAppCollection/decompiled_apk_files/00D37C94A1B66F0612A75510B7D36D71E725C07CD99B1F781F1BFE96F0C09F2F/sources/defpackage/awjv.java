package defpackage;
/* compiled from: PG */
/* renamed from: awjv  reason: default package */
/* loaded from: classes2.dex */
public final class awjv implements aajq {
    public static final aajr a = new awju();
    private final awjw b;

    public awjv(awjw awjwVar) {
        this.b = awjwVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        awjw awjwVar = this.b;
        if ((awjwVar.c & 4) != 0) {
            amvlVar.c(awjwVar.e);
        }
        awjw awjwVar2 = this.b;
        if ((awjwVar2.c & 8) != 0) {
            amvlVar.c(awjwVar2.f);
        }
        return amvlVar.g();
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
        return new awjt(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awjv) && this.b.equals(((awjv) obj).b);
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
        sb.append("YtMainDownloadsLibraryEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
