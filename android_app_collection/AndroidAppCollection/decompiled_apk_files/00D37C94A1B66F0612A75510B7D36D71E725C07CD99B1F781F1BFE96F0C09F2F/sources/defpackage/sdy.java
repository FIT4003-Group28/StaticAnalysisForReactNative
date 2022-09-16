package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: sdy  reason: default package */
/* loaded from: classes4.dex */
public final class sdy extends sdv {
    private final int[] b;

    public sdy() {
        int[] iArr = {1, 2, 3, 7};
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
        calendar.add(5, i);
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.sdv
    protected final long c(Calendar calendar, long j, int i) {
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, -((calendar.get(5) - 1) % i));
        return calendar.getTimeInMillis();
    }

    @Override // defpackage.see
    public final int[] g() {
        return this.b;
    }
}
