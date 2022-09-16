package defpackage;
/* compiled from: PG */
/* renamed from: awji  reason: default package */
/* loaded from: classes2.dex */
public final class awji implements aajq {
    public static final aajr a = new awjh();
    public final awjj b;
    private final aajl c;

    public awji(awjj awjjVar, aajl aajlVar) {
        this.b = awjjVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getAvatarModel().a());
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
        return new awjg(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awji) && this.b.equals(((awji) obj).b);
    }

    public avhn getAvatar() {
        avhn avhnVar = this.b.g;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getAvatarModel() {
        avhn avhnVar = this.b.g;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.c);
    }

    public String getChannelId() {
        return this.b.e;
    }

    public String getTitle() {
        return this.b.f;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("YtMainChannelEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
