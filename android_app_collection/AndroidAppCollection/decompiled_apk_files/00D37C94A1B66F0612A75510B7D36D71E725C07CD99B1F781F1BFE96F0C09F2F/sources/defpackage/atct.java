package defpackage;
/* compiled from: PG */
/* renamed from: atct  reason: default package */
/* loaded from: classes2.dex */
public enum atct implements aopm {
    MDX_NOTIFICATION_GEL_TYPE_UNKNOWN(0),
    MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN(1),
    MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN(2);
    
    public final int d;

    atct(int i) {
        this.d = i;
    }

    public static aopo a() {
        return atck.h;
    }

    public static atct b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_SINGLE_SCREEN;
            }
            if (i == 2) {
                return MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN;
            }
            return null;
        }
        return MDX_NOTIFICATION_GEL_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
