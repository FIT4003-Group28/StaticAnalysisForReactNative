package defpackage;
/* compiled from: PG */
/* renamed from: atcl  reason: default package */
/* loaded from: classes2.dex */
public enum atcl implements aopm {
    DAY_OF_WEEK_UNKNOWN(0),
    DAY_OF_WEEK_SUNDAY(1),
    DAY_OF_WEEK_MONDAY(2),
    DAY_OF_WEEK_TUESDAY(3),
    DAY_OF_WEEK_WEDNESDAY(4),
    DAY_OF_WEEK_THURSDAY(5),
    DAY_OF_WEEK_FRIDAY(6),
    DAY_OF_WEEK_SATURDAY(7);
    
    public final int i;

    atcl(int i) {
        this.i = i;
    }

    public static aopo a() {
        return atck.a;
    }

    public static atcl b(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNKNOWN;
            case 1:
                return DAY_OF_WEEK_SUNDAY;
            case 2:
                return DAY_OF_WEEK_MONDAY;
            case 3:
                return DAY_OF_WEEK_TUESDAY;
            case 4:
                return DAY_OF_WEEK_WEDNESDAY;
            case 5:
                return DAY_OF_WEEK_THURSDAY;
            case 6:
                return DAY_OF_WEEK_FRIDAY;
            case 7:
                return DAY_OF_WEEK_SATURDAY;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
