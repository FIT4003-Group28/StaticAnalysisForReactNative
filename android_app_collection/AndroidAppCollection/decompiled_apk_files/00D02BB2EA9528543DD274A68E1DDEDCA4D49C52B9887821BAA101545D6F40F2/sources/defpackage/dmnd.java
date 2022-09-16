package defpackage;
/* compiled from: PG */
/* renamed from: dmnd  reason: default package */
/* loaded from: classes6.dex */
public enum dmnd implements dsrb {
    TEXTURE_UNKNOWN(0),
    TEXTURE_UV_MAPPED(1),
    TEXTURE_PATTERN(2),
    TEXTURE_GRAIN(3);
    
    private final int e;

    dmnd(int i) {
        this.e = i;
    }

    public static dmnd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TEXTURE_UV_MAPPED;
            }
            if (i == 2) {
                return TEXTURE_PATTERN;
            }
            if (i == 3) {
                return TEXTURE_GRAIN;
            }
            return null;
        }
        return TEXTURE_UNKNOWN;
    }

    public static dsrd c() {
        return dmnc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
