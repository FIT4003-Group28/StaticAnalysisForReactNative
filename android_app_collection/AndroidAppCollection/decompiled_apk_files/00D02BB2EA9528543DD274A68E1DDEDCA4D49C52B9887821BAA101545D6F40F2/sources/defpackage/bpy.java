package defpackage;

import android.text.format.Time;
/* compiled from: PG */
/* renamed from: bpy  reason: default package */
/* loaded from: classes4.dex */
public final class bpy {
    public static int a(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new IllegalArgumentException("Argument must be between Calendar.SUNDAY and Calendar.SATURDAY");
        }
    }

    public static int b(int i, int i2) {
        int i3 = 4 - i2;
        if (i3 < 0) {
            i3 += 7;
        }
        Time time = new Time("UTC");
        time.setJulianDay((((i - (2440588 - i3)) / 7) * 7) + 2440585);
        return time.getWeekNumber();
    }
}
