package defpackage;
/* compiled from: PG */
/* renamed from: dxhz  reason: default package */
/* loaded from: classes6.dex */
public enum dxhz {
    CODE("code"),
    TOKEN("token"),
    ERROR("error"),
    EMPTY("empty"),
    UNKNOWN("unknown");
    
    public final String f;

    dxhz(String str) {
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
