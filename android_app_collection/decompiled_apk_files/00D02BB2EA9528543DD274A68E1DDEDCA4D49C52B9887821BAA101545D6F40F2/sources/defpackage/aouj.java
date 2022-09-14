package defpackage;
/* compiled from: PG */
/* renamed from: aouj  reason: default package */
/* loaded from: classes2.dex */
public enum aouj implements dsrb {
    NONE_OPTION(0),
    MAYBE(1),
    FORCE(2);
    
    public final int d;

    aouj(int i) {
        this.d = i;
    }

    public static aouj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAYBE;
            }
            if (i == 2) {
                return FORCE;
            }
            return null;
        }
        return NONE_OPTION;
    }

    public static dsrd c() {
        return aoui.a;
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
