package defpackage;
/* compiled from: PG */
/* renamed from: asza  reason: default package */
/* loaded from: classes2.dex */
public final class asza implements aajq {
    public static final aajr a = new asyz();
    private final aajl b;
    private final aszb c;

    public asza(aszb aszbVar, aajl aajlVar) {
        this.c = aszbVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aszb aszbVar = this.c;
        if ((aszbVar.c & 4) != 0) {
            amvlVar.c(aszbVar.e);
        }
        return amvlVar.g();
    }

    public final atyp b() {
        aajj b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof atyp)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (atyp) b;
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
        return new asyy(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asza) && this.c.equals(((asza) obj).c);
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.f);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("MainVideoDownloadStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
