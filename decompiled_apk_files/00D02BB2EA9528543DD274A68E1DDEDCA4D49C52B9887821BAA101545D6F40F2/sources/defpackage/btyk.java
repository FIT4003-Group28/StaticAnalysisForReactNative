package defpackage;
/* compiled from: PG */
/* renamed from: btyk  reason: default package */
/* loaded from: classes.dex */
public enum btyk implements dsrb {
    UNKNOWN(0),
    GMM_SERVER(1),
    PAINT(2),
    CHIME(3),
    NAV_SDK_USAGE_SERVER(4),
    HTTP(5);
    
    private final int g;

    btyk(int i) {
        this.g = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
