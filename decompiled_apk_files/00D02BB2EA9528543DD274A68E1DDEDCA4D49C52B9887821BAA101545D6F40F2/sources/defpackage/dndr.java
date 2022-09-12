package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dndr  reason: default package */
/* loaded from: classes.dex */
public enum dndr implements dsrb {
    UNKNOWN_ALIAS_TYPE(-1),
    HOME(0),
    WORK(1),
    CONTACT(2),
    NICKNAME(3),
    INFERRED_HOME(4),
    INFERRED_WORK(5);
    
    public final int h;

    dndr(int i2) {
        this.h = i2;
    }

    public static dndr b(int i2) {
        switch (i2) {
            case -1:
                return UNKNOWN_ALIAS_TYPE;
            case 0:
                return HOME;
            case 1:
                return WORK;
            case 2:
                return CONTACT;
            case 3:
                return NICKNAME;
            case 4:
                return INFERRED_HOME;
            case 5:
                return INFERRED_WORK;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dndq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
