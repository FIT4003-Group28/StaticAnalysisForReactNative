package defpackage;
/* compiled from: PG */
/* renamed from: awkp  reason: default package */
/* loaded from: classes2.dex */
public final class awkp implements aajq {
    public static final aajr a = new awko();
    private final aajl b;
    private final awkq c;

    public awkp(awkq awkqVar, aajl aajlVar) {
        this.c = awkqVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        awkq awkqVar = this.c;
        if ((awkqVar.c & 4) != 0) {
            amvlVar.c(awkqVar.e);
        }
        awkq awkqVar2 = this.c;
        if ((awkqVar2.c & 8) != 0) {
            amvlVar.c(awkqVar2.f);
        }
        return amvlVar.g();
    }

    public final awkx b() {
        aajj b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awkx)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=videoEntity");
        return (awkx) b;
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
        return new awkn(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awkp) && this.c.equals(((awkp) obj).c);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("YtMainPlaylistVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
