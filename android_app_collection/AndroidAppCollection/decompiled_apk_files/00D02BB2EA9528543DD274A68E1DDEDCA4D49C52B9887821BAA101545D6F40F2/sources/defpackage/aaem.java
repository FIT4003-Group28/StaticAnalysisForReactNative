package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aaem  reason: default package */
/* loaded from: classes2.dex */
public final class aaem extends cqiw<cqkp> {
    @Override // defpackage.cqiw
    protected final void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEEE", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, calendar.getFirstDayOfWeek());
        for (int i2 = 1; i2 <= 7; i2++) {
            cqivVar.a(new aael(), new aaej(simpleDateFormat.format(calendar.getTime())));
            calendar.add(7, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        return cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.bv(3), cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), cqgr.ck(C()));
    }
}
