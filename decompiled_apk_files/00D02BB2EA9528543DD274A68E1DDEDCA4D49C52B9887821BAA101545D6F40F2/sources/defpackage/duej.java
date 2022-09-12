package defpackage;
/* compiled from: PG */
/* renamed from: duej  reason: default package */
/* loaded from: classes6.dex */
public enum duej implements dsrb {
    UNKNOWN_CONTAINER(0),
    PROFILE(1),
    CONTACT(2),
    CIRCLE(3),
    PLACE(4),
    ACCOUNT(5),
    EXTERNAL_ACCOUNT(6),
    DOMAIN_PROFILE(7),
    DOMAIN_CONTACT(8),
    DEVICE_CONTACT(9),
    GOOGLE_GROUP(10),
    AFFINITY(11),
    RAW_DEVICE_CONTACT(13),
    CONTACT_ANNOTATION(14),
    DELEGATED_CONTACT(15);
    
    public final int p;

    duej(int i) {
        this.p = i;
    }

    public static duej b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTAINER;
            case 1:
                return PROFILE;
            case 2:
                return CONTACT;
            case 3:
                return CIRCLE;
            case 4:
                return PLACE;
            case 5:
                return ACCOUNT;
            case 6:
                return EXTERNAL_ACCOUNT;
            case 7:
                return DOMAIN_PROFILE;
            case 8:
                return DOMAIN_CONTACT;
            case 9:
                return DEVICE_CONTACT;
            case 10:
                return GOOGLE_GROUP;
            case 11:
                return AFFINITY;
            case 12:
            default:
                return null;
            case 13:
                return RAW_DEVICE_CONTACT;
            case 14:
                return CONTACT_ANNOTATION;
            case 15:
                return DELEGATED_CONTACT;
        }
    }

    public static dsrd c() {
        return duei.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
