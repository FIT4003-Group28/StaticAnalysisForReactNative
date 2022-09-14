package defpackage;
/* compiled from: PG */
/* renamed from: djeu  reason: default package */
/* loaded from: classes6.dex */
public enum djeu implements dsrb {
    UNKNOWN_ICON(0),
    SHARE(1);
    
    private final int c;

    djeu(int i) {
        this.c = i;
    }

    public static djeu b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SHARE;
            }
            return null;
        }
        return UNKNOWN_ICON;
    }

    public static dsrd c() {
        return djet.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
