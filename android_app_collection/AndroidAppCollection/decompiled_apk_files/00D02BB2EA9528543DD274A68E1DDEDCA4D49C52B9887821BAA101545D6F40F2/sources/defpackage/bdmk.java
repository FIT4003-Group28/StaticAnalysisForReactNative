package defpackage;

import android.content.Context;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdmk  reason: default package */
/* loaded from: classes3.dex */
public final class bdmk {
    public final Comparator<bbtj> a = new bdmj();
    public final Executor b;
    private final Context c;

    public bdmk(gga ggaVar, Executor executor) {
        this.c = ggaVar;
        this.b = executor;
        executor.execute(new Runnable(this) { // from class: bdmh
            private final bdmk a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(null);
            }
        });
    }

    @dzsi
    public static Long a(bbtj bbtjVar) {
        Long b = bbtjVar.q().b();
        if (b != null) {
            return b;
        }
        Date k = bbtjVar.k();
        if (k != null) {
            return Long.valueOf(k.getTime());
        }
        return null;
    }

    public final String b(@dzsi Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            calendar.setTimeInMillis(0L);
        }
        return bvsk.b(this.c, calendar, 16);
    }
}
