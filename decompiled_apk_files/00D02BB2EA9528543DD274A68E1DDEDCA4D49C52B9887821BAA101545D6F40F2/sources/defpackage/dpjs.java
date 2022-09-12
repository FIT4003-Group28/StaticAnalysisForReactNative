package defpackage;
/* compiled from: PG */
/* renamed from: dpjs  reason: default package */
/* loaded from: classes6.dex */
public enum dpjs implements dsrb {
    ENTITY_TYPE_MY_LOCATION(0),
    ENTITY_TYPE_HOME(1),
    ENTITY_TYPE_WORK(2),
    ENTITY_TYPE_AD(3),
    ENTITY_TYPE_DEFAULT(4),
    ENTITY_TYPE_NICKNAME(5),
    ENTITY_TYPE_CONTACT(6);
    
    public final int h;

    dpjs(int i2) {
        this.h = i2;
    }

    public static dpjs b(int i2) {
        switch (i2) {
            case 0:
                return ENTITY_TYPE_MY_LOCATION;
            case 1:
                return ENTITY_TYPE_HOME;
            case 2:
                return ENTITY_TYPE_WORK;
            case 3:
                return ENTITY_TYPE_AD;
            case 4:
                return ENTITY_TYPE_DEFAULT;
            case 5:
                return ENTITY_TYPE_NICKNAME;
            case 6:
                return ENTITY_TYPE_CONTACT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpjr.a;
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
