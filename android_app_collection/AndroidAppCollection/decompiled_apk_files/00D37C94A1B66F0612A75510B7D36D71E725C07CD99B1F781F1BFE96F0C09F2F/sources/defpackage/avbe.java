package defpackage;
/* compiled from: PG */
/* renamed from: avbe  reason: default package */
/* loaded from: classes2.dex */
public final class avbe implements aajq {
    public static final aajr a = new avbd();
    private final avbf b;

    public avbe(avbf avbfVar) {
        this.b = avbfVar;
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
        return new avbc(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avbe) && this.b.equals(((avbe) obj).b);
    }

    public avbg getState() {
        avbg b = avbg.b(this.b.d);
        return b == null ? avbg.SUBSCRIPTION_NOTIFICATION_SETTING_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("SubscriptionNotificationSettingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
