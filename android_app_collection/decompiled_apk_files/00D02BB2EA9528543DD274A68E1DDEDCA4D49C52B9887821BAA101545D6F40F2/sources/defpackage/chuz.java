package defpackage;
/* compiled from: PG */
/* renamed from: chuz  reason: default package */
/* loaded from: classes4.dex */
public enum chuz implements dsrb {
    CHECK_BACK_LATER(0),
    GOOGLE_PHOTO_AUTO_BACKUP(1),
    RATE_BEFORE_REVIEW(2),
    UPLOAD_PHOTO_BEFORE_TAG(3),
    CREATE_NEW_LIST(4),
    UPLOAD_PHOTO_BEFORE_TAG_V2(5),
    MODERATE_EDIT(6);
    
    public final int h;

    chuz(int i2) {
        this.h = i2;
    }

    public static chuz b(int i2) {
        switch (i2) {
            case 0:
                return CHECK_BACK_LATER;
            case 1:
                return GOOGLE_PHOTO_AUTO_BACKUP;
            case 2:
                return RATE_BEFORE_REVIEW;
            case 3:
                return UPLOAD_PHOTO_BEFORE_TAG;
            case 4:
                return CREATE_NEW_LIST;
            case 5:
                return UPLOAD_PHOTO_BEFORE_TAG_V2;
            case 6:
                return MODERATE_EDIT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return chuy.a;
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
