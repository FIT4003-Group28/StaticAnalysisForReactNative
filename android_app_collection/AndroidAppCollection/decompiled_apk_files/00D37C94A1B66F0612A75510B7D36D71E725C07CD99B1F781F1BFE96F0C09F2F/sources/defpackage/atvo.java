package defpackage;
/* compiled from: PG */
/* renamed from: atvo  reason: default package */
/* loaded from: classes2.dex */
public enum atvo implements aopm {
    INVALID(0),
    ADDRESS_BOOK(1),
    NOTIFICATIONS(2),
    SEND_SMS(3),
    FINE_LOCATION(4),
    GET_ACCOUNTS(5),
    IOS_FINE_LOCATION_WHEN_IN_USE(6),
    IOS_FINE_LOCATION_ALWAYS_ON(7),
    WRITE_EXTERNAL_STORAGE(8),
    READ_MEDIA_AUDIO(9),
    ANDROID_CAMERA(10),
    IOS_CAMERA(11);
    
    public final int m;

    atvo(int i) {
        this.m = i;
    }

    public static aopo a() {
        return atti.g;
    }

    public static atvo b(int i) {
        switch (i) {
            case 0:
                return INVALID;
            case 1:
                return ADDRESS_BOOK;
            case 2:
                return NOTIFICATIONS;
            case 3:
                return SEND_SMS;
            case 4:
                return FINE_LOCATION;
            case 5:
                return GET_ACCOUNTS;
            case 6:
                return IOS_FINE_LOCATION_WHEN_IN_USE;
            case 7:
                return IOS_FINE_LOCATION_ALWAYS_ON;
            case 8:
                return WRITE_EXTERNAL_STORAGE;
            case 9:
                return READ_MEDIA_AUDIO;
            case 10:
                return ANDROID_CAMERA;
            case 11:
                return IOS_CAMERA;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
