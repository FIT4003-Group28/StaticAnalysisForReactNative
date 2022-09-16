package defpackage;
/* compiled from: PG */
/* renamed from: drcs  reason: default package */
/* loaded from: classes6.dex */
public enum drcs implements dsrb {
    UNKNOWN_SHARING_STATE(0),
    PRIVATE(1),
    SHARED(2),
    PUBLISHED(3),
    GROUP(4);
    
    public final int f;

    drcs(int i) {
        this.f = i;
    }

    public static drcs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return SHARED;
            }
            if (i == 3) {
                return PUBLISHED;
            }
            if (i == 4) {
                return GROUP;
            }
            return null;
        }
        return UNKNOWN_SHARING_STATE;
    }

    public static dsrd c() {
        return drcr.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
