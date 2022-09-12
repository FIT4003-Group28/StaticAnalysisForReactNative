package defpackage;
/* compiled from: PG */
/* renamed from: byjw  reason: default package */
/* loaded from: classes4.dex */
public enum byjw {
    WAITING_TO_REQUEST,
    LOADING,
    ERROR_OFFLINE,
    ERROR_LOCATION_DISABLED,
    ERROR_GENERIC,
    SUCCESS;

    public final boolean a() {
        return this == WAITING_TO_REQUEST || this == LOADING;
    }
}
