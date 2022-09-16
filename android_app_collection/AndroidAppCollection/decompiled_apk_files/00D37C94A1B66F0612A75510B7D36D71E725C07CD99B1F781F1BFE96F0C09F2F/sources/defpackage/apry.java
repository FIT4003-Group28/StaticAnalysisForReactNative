package defpackage;
/* compiled from: PG */
/* renamed from: apry  reason: default package */
/* loaded from: classes2.dex */
public final class apry implements aajq {
    public static final aajr a = new aprx();
    private final aajl b;
    private final aprz c;

    public apry(aprz aprzVar, aajl aajlVar) {
        this.c = aprzVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getAvatarModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aprw(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof apry) && this.c.equals(((apry) obj).c);
    }

    public avhn getAvatar() {
        avhn avhnVar = this.c.f;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getAvatarModel() {
        avhn avhnVar = this.c.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public String getChannelId() {
        return this.c.d;
    }

    public Integer getSubscriberCount() {
        return Integer.valueOf(this.c.h);
    }

    public String getTitle() {
        return this.c.e;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public Integer getVideoCount() {
        return Integer.valueOf(this.c.g);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("ChannelEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
