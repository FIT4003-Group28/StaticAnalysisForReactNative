package defpackage;
/* compiled from: PG */
/* renamed from: dltz  reason: default package */
/* loaded from: classes6.dex */
public enum dltz implements dsrb {
    AUTOMATIC(0),
    MANUAL(1),
    DYNAMIC(2);
    
    public final int d;

    dltz(int i) {
        this.d = i;
    }

    public static dltz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MANUAL;
            }
            if (i == 2) {
                return DYNAMIC;
            }
            return null;
        }
        return AUTOMATIC;
    }

    public static dsrd c() {
        return dlty.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
