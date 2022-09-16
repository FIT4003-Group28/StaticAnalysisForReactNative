package defpackage;
/* compiled from: PG */
/* renamed from: awjr  reason: default package */
/* loaded from: classes2.dex */
public final class awjr implements aajq {
    public static final aajr a = new awjq();
    private final aajl b;
    private final awjs c;

    public awjr(awjs awjsVar, aajl aajlVar) {
        this.c = awjsVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        awjs awjsVar = this.c;
        if ((awjsVar.c & 4) != 0) {
            amvlVar.c(awjsVar.e);
        }
        awjs awjsVar2 = this.c;
        if ((awjsVar2.c & 8) != 0) {
            amvlVar.c(awjsVar2.f);
        }
        awjs awjsVar3 = this.c;
        if ((awjsVar3.c & 16) != 0) {
            amvlVar.c(awjsVar3.g);
        }
        return amvlVar.g();
    }

    public final atss b() {
        aajj b = this.b.b(this.c.g);
        boolean z = true;
        if (b != null && !(b instanceof atss)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (atss) b;
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
        return new awjp(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awjr) && this.c.equals(((awjr) obj).c);
    }

    public final atyp f() {
        aajj b = this.b.b(this.c.f);
        boolean z = true;
        if (b != null && !(b instanceof atyp)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (atyp) b;
    }

    public final awkx g() {
        aajj b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awkx)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (awkx) b;
    }

    public Long getAddedTimestampMillis() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("YtMainDownloadedVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
