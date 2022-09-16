package defpackage;
/* compiled from: PG */
/* renamed from: atoy  reason: default package */
/* loaded from: classes2.dex */
public final class atoy implements aajq {
    public static final aajr a = new atox();
    private final atoz b;

    public atoy(atoz atozVar) {
        this.b = atozVar;
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
        return this.b.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new atow(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atoy) && this.b.equals(((atoy) obj).b);
    }

    public atpa getState() {
        atpa b = atpa.b(this.b.e);
        return b == null ? atpa.NOTIFICATION_OS_SETTING_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("NotificationOsSettingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
