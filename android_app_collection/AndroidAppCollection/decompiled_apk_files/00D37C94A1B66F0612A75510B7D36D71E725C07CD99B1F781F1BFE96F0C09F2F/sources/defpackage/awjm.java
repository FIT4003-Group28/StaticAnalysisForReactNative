package defpackage;
/* compiled from: PG */
/* renamed from: awjm  reason: default package */
/* loaded from: classes2.dex */
public final class awjm implements aajq {
    public static final aajr a = new awjl();
    private final aajl b;
    private final awjn c;

    public awjm(awjn awjnVar, aajl aajlVar) {
        this.c = awjnVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        awjn awjnVar = this.c;
        if ((awjnVar.c & 4) != 0) {
            amvlVar.c(awjnVar.e);
        }
        if (this.c.f.size() > 0) {
            amvlVar.j(this.c.f);
        }
        return amvlVar.g();
    }

    public final awkg b() {
        aajj b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awkg)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainPlaylistEntityModel, key=playlist");
        return (awkg) b;
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
        return new awjk(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awjm) && this.c.equals(((awjm) obj).c);
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.g);
    }

    public Long getLastSyncedTimestampMillis() {
        return Long.valueOf(this.c.h);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("YtMainDownloadedPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
