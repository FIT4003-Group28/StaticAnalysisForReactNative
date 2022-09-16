package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: seg  reason: default package */
/* loaded from: classes4.dex */
public final class seg extends sdv {
    private final int[] b;

    public seg() {
        int[] iArr = {1, 2, 3, 4};
        sho.g(iArr, "allowedTickIncrements");
        sho.a(true, "Must have at least one increment option in allowedTickIncrements");
        for (int i = 0; i < 4; i++) {
            sho.a(iArr[i] > 0, "increment must be > 0 for allowedTickIncrements");
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sdv
    public final long a(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.add(3, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.sdv
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(3, -(calendar.get(3) % i));
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.see
    public final int[] g() {
        return this.b;
    }
}
