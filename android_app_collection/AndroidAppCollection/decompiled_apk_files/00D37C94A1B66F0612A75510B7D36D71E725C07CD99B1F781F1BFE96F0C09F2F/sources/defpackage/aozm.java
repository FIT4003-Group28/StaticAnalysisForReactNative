package defpackage;
/* compiled from: PG */
/* renamed from: aozm  reason: default package */
/* loaded from: classes.dex */
public final class aozm implements aajq {
    public static final aajr a = new aozk();
    public final aajl b;
    public final aozn c;

    public aozm(aozn aoznVar, aajl aajlVar) {
        this.c = aoznVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aozn aoznVar = this.c;
        if ((aoznVar.c & 2) != 0) {
            amvlVar.c(aoznVar.e);
        }
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
        return new aozl(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aozm) && this.c.equals(((aozm) obj).c);
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
        sb.append("AdPlaybackDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
