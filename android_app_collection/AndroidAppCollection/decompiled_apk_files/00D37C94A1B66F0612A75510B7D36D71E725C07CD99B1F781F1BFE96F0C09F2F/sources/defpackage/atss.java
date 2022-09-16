package defpackage;
/* compiled from: PG */
/* renamed from: atss  reason: default package */
/* loaded from: classes2.dex */
public final class atss implements aajq {
    public static final aajr a = new atsr();
    public final atst b;
    private final aajl c;

    public atss(atst atstVar, aajl aajlVar) {
        this.b = atstVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getOfflineFutureUnplayableInfoModel().a());
        getOnTapCommandOverrideDataModel();
        amvlVar.j(atqq.b());
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
        return new atsq(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atss) && this.b.equals(((atss) obj).b);
    }

    public atsp getAction() {
        atsp b = atsp.b(this.b.e);
        return b == null ? atsp.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN : b;
    }

    public Long getExpirationTimestamp() {
        return Long.valueOf(this.b.f);
    }

    public Long getLastUpdatedTimestampSeconds() {
        return Long.valueOf(this.b.i);
    }

    public atqu getOfflineFutureUnplayableInfo() {
        atqu atquVar = this.b.h;
        return atquVar == null ? atqu.a : atquVar;
    }

    public atqs getOfflineFutureUnplayableInfoModel() {
        atqu atquVar = this.b.h;
        if (atquVar == null) {
            atquVar = atqu.a;
        }
        return atqs.b(atquVar).a(this.c);
    }

    public aoob getOfflineStateBytes() {
        return this.b.g;
    }

    public String getOfflineToken() {
        return this.b.l;
    }

    public atqt getOnTapCommandOverrideData() {
        atqt atqtVar = this.b.j;
        return atqtVar == null ? atqt.a : atqtVar;
    }

    public atqq getOnTapCommandOverrideDataModel() {
        atqt atqtVar = this.b.j;
        if (atqtVar == null) {
            atqtVar = atqt.a;
        }
        return atqq.a(atqtVar).a();
    }

    public String getShortMessageForDisabledAction() {
        return this.b.k;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("OfflineVideoPolicyEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
