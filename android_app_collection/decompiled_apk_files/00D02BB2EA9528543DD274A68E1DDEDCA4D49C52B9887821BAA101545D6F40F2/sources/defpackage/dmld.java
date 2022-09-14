package defpackage;

import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmld  reason: default package */
/* loaded from: classes.dex */
public final class dmld {
    private final Calendar a = Calendar.getInstance();

    public final synchronized boolean a(dqot dqotVar, int i) {
        dpol dpolVar;
        this.a.setTimeInMillis(TimeUnit.SECONDS.toMillis(i));
        this.a.setTimeZone(new SimpleTimeZone((int) TimeUnit.MINUTES.toMillis(dqotVar.b), ""));
        Calendar calendar = this.a;
        int seconds = ((int) TimeUnit.HOURS.toSeconds(calendar.get(11))) + ((int) TimeUnit.MINUTES.toSeconds(calendar.get(12))) + calendar.get(13);
        for (dqop dqopVar : dqotVar.a) {
            switch (this.a.get(7)) {
                case 1:
                    dpolVar = dpol.SUNDAY;
                    break;
                case 2:
                    dpolVar = dpol.MONDAY;
                    break;
                case 3:
                    dpolVar = dpol.TUESDAY;
                    break;
                case 4:
                    dpolVar = dpol.WEDNESDAY;
                    break;
                case 5:
                    dpolVar = dpol.THURSDAY;
                    break;
                case 6:
                    dpolVar = dpol.FRIDAY;
                    break;
                case 7:
                    dpolVar = dpol.SATURDAY;
                    break;
                default:
                    dpolVar = dpol.DAY_OF_WEEK_UNSPECIFIED;
                    break;
            }
            if (!new dsrh(dqopVar.c, dqop.d).contains(dpolVar) && seconds >= dqopVar.a && seconds < dqopVar.b) {
                return true;
            }
        }
        return false;
    }
}
