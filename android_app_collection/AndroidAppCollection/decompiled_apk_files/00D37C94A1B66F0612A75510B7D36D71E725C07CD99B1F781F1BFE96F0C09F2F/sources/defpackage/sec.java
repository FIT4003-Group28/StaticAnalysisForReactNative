package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: sec  reason: default package */
/* loaded from: classes4.dex */
public final class sec extends sdv {
    private final int[] b;

    public sec() {
        int[] iArr = {1, 2, 3, 4, 6, 12};
        sho.g(iArr, "allowedTickIncrements");
        sho.a(true, "Must have at least one increment option in allowedTickIncrements");
        for (int i = 0; i < 6; i++) {
            sho.a(iArr[i] > 0, "increment must be >= 1 for allowedTickIncrements");
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sdv
    public final long a(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.add(2, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.sdv
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(2, -(calendar.get(2) % i));
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.see
    public final int[] g() {
        return this.b;
    }
}
