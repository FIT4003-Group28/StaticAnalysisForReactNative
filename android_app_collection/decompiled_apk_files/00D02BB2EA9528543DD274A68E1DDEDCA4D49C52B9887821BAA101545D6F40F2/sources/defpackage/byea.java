package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byea  reason: default package */
/* loaded from: classes4.dex */
public enum byea {
    MONDAY(2, 2, R.string.MONDAY, R.string.MONDAY_SHORT),
    TUESDAY(3, 3, R.string.TUESDAY, R.string.TUESDAY_SHORT),
    WEDNESDAY(4, 4, R.string.WEDNESDAY, R.string.WEDNESDAY_SHORT),
    THURSDAY(5, 5, R.string.THURSDAY, R.string.THURSDAY_SHORT),
    FRIDAY(6, 6, R.string.FRIDAY, R.string.FRIDAY_SHORT),
    SATURDAY(7, 7, R.string.SATURDAY, R.string.SATURDAY_SHORT),
    SUNDAY(1, 1, R.string.SUNDAY, R.string.SUNDAY_SHORT);
    
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    byea(int i, int i2, int i3, int i4) {
        this.k = i;
        this.h = i2;
        this.i = i4;
        this.j = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byea a(int i) {
        byea[] values;
        for (byea byeaVar : values()) {
            int i2 = byeaVar.k;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == i) {
                return byeaVar;
            }
        }
        throw new IllegalArgumentException(String.format("Cannot find DayOfWeek for %d", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byea b(int i) {
        byea[] values;
        for (byea byeaVar : values()) {
            if (byeaVar.h == i) {
                return byeaVar;
            }
        }
        throw new IllegalArgumentException(String.format("Cannot find DayOfWeek for %d", Integer.valueOf(i)));
    }

    public final byea c() {
        int i = this.k;
        if (i != 0) {
            return a(i % 7);
        }
        throw null;
    }
}
