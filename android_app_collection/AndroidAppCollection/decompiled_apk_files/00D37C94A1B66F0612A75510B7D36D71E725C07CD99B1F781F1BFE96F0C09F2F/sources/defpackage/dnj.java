package defpackage;
/* compiled from: PG */
/* renamed from: dnj  reason: default package */
/* loaded from: classes3.dex */
public enum dnj {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String f;

    dnj(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
