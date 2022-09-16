package defpackage;
/* compiled from: PG */
/* renamed from: aali  reason: default package */
/* loaded from: classes.dex */
public enum aali {
    REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP(16),
    REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP(17),
    REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED(18),
    REASON_CLIENT_OFFLINE_INACTIVE_USER(19),
    REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY(23);
    
    public final int f;

    aali(int i) {
        this.f = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f);
    }
}
