package j$.time.temporal;

import j$.time.DayOfWeek;
/* loaded from: classes5.dex */
public abstract class TemporalAdjusters {
    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda1
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$nextOrSame$10(value, temporal);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$nextOrSame$10(int i, Temporal temporal) {
        int i2 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return temporal;
        }
        int i3 = i2 - i;
        return temporal.mo382plus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        final int value = dayOfWeek.getValue();
        return new TemporalAdjuster() { // from class: j$.time.temporal.TemporalAdjusters$$ExternalSyntheticLambda3
            @Override // j$.time.temporal.TemporalAdjuster
            public final Temporal adjustInto(Temporal temporal) {
                return TemporalAdjusters.lambda$previousOrSame$12(value, temporal);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Temporal lambda$previousOrSame$12(int i, Temporal temporal) {
        int i2 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return temporal;
        }
        int i3 = i - i2;
        return temporal.mo381minus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
    }
}
