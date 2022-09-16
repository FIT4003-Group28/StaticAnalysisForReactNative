package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: sea  reason: default package */
/* loaded from: classes4.dex */
public final class sea extends sdv {
    private final int[] b;

    public sea() {
        int[] iArr = {1, 2, 3, 4, 6, 12, 24};
        sho.g(iArr, "allowedTickIncrements");
        sho.a(true, "Must have at least one increment option in allowedTickIncrements");
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            sho.a(i2 > 0 && i2 <= 24, "increment must be between 1 and 24 inclusive for allowedTickIncrements");
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sdv
    public final long a(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.add(11, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.sdv
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        int i2 = 0;
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(11, 0);
        calendar2.add(5, 1);
        int timeInMillis = (((int) (calendar2.getTimeInMillis() - calendar.getTimeInMillis())) / 3600000) % i;
        if (timeInMillis != 0) {
            i2 = i - timeInMillis;
        }
        calendar.add(11, -i2);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.see
    public final int[] g() {
        return this.b;
    }
}
