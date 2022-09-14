package defpackage;

import android.content.Context;
import android.icu.text.DateIntervalFormat;
import android.icu.util.DateInterval;
import android.os.Build;
import android.text.format.DateFormat;
import com.google.android.apps.maps.R;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cbbd  reason: default package */
/* loaded from: classes4.dex */
public final class cbbd implements cbbc {
    private final dcdc<String> a;
    private final Context b;

    public cbbd(Context context) {
        this.b = context;
        this.a = dcdc.j(context.getString(R.string.FIRST_WEEK_OF_MONTH), context.getString(R.string.SECOND_WEEK_OF_MONTH), context.getString(R.string.THIRD_WEEK_OF_MONTH), context.getString(R.string.FOURTH_WEEK_OF_MONTH), context.getString(R.string.FIFTH_WEEK_OF_MONTH));
    }

    private static long j(dqjj dqjjVar) {
        int i = dqjjVar.b;
        if (i == 0) {
            i = dqjjVar.c == 0 ? 24 : 0;
        }
        dpvh bZ = dpvi.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar = (dpvi) bZ.b;
        int i2 = dpviVar.a | 8;
        dpviVar.a = i2;
        dpviVar.e = i;
        int i3 = dqjjVar.c;
        dpviVar.a = i2 | 16;
        dpviVar.f = i3;
        return l(bZ.bK(), false).getTime() / 1000;
    }

    private static String k(String str, dpol dpolVar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Integer e = cbpy.e(dpolVar);
        if (e == null) {
            return "";
        }
        calendar.set(7, e.intValue());
        return simpleDateFormat.format(calendar.getTime());
    }

    private static Date l(dpvi dpviVar, boolean z) {
        Date time;
        Calendar calendar = Calendar.getInstance();
        synchronized (calendar) {
            if (z) {
                calendar.set(dpviVar.b, dpviVar.c - 1, dpviVar.d);
            }
            calendar.set(11, dpviVar.e);
            calendar.set(12, dpviVar.f);
            calendar.set(13, 0);
            time = calendar.getTime();
        }
        return time;
    }

    private static long m(dpvi dpviVar) {
        long timeInMillis;
        Calendar calendar = Calendar.getInstance();
        synchronized (calendar) {
            calendar.set(dpviVar.b, dpviVar.c - 1, dpviVar.d);
            timeInMillis = calendar.getTimeInMillis();
        }
        return timeInMillis;
    }

    private final String n(Date date) {
        return DateFormat.getTimeFormat(this.b).format(date);
    }

    @Override // defpackage.cbbc
    public final String a(dpvi dpviVar) {
        return n(l(dpviVar, false));
    }

    @Override // defpackage.cbbc
    public final String b(dqjj dqjjVar) {
        dpvh bZ = dpvi.g.bZ();
        int i = dqjjVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpvi dpviVar = (dpvi) bZ.b;
        int i2 = dpviVar.a | 8;
        dpviVar.a = i2;
        dpviVar.e = i;
        int i3 = dqjjVar.c;
        dpviVar.a = i2 | 16;
        dpviVar.f = i3;
        return n(l(bZ.bK(), false));
    }

    @Override // defpackage.cbbc
    public final String c(dqjj dqjjVar, @dzsi dqjj dqjjVar2) {
        long j;
        Context context = this.b;
        long j2 = j(dqjjVar);
        if (dqjjVar2 != null) {
            j = j(dqjjVar2);
        } else {
            j = j(dqjjVar);
        }
        return bvtb.n(context, j2, j, TimeZone.getDefault(), false);
    }

    @Override // defpackage.cbbc
    public final String d(dpol dpolVar) {
        return k("EEE", dpolVar);
    }

    @Override // defpackage.cbbc
    public final String e(dpol dpolVar) {
        return k("EEEE", dpolVar);
    }

    @Override // defpackage.cbbc
    public final String f(dcdc<dpol> dcdcVar) {
        if (dcdcVar.isEmpty()) {
            return "";
        }
        if (dcdcVar.size() == 1) {
            return d(dcdcVar.get(0));
        }
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dpol dpolVar = dcdcVar.get(i);
            if (!hashSet.contains(dpolVar)) {
                hashSet.add(dpolVar);
                dccxVar.g(dpolVar);
            }
        }
        dcdc f = dccxVar.f();
        for (int i2 = 0; i2 < f.size() - 1; i2++) {
            sb.append(d(dcdcVar.get(i2)));
            if (i2 < dcdcVar.size() - 2) {
                sb.append(this.b.getString(R.string.COMMA_DELIMITER));
            }
        }
        return this.b.getString(R.string.MULTIPLE_ITEM_LIST_FORMAT, sb, d((dpol) dcft.s(dcdcVar)));
    }

    @Override // defpackage.cbbc
    public final String g(dcdc<Integer> dcdcVar) {
        dccx dccxVar = new dccx();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dccxVar.g(this.a.get(dcdcVar.get(i).intValue() - 1));
        }
        dcdc f = dccxVar.f();
        if (f.size() == 1) {
            return (String) f.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < f.size() - 1; i2++) {
            sb.append((String) f.get(i2));
            if (i2 < f.size() - 2) {
                sb.append(this.b.getString(R.string.COMMA_DELIMITER));
            }
        }
        return this.b.getString(R.string.MULTIPLE_ITEM_LIST_FORMAT, sb, dcft.s(f));
    }

    @Override // defpackage.cbbc
    public final String h(dpvi dpviVar, dpvi dpviVar2) {
        if (Build.VERSION.SDK_INT >= 24) {
            DateInterval dateInterval = new DateInterval(m(dpviVar), m(dpviVar2));
            DateIntervalFormat dateIntervalFormat = DateIntervalFormat.getInstance("yMMMd");
            StringBuffer stringBuffer = new StringBuffer();
            dateIntervalFormat.format(dateInterval, stringBuffer, new FieldPosition(0));
            return stringBuffer.toString();
        }
        String i = i(dpviVar, true);
        String i2 = i(dpviVar2, true);
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3 + String.valueOf(i2).length());
        sb.append(i);
        sb.append(" – ");
        sb.append(i2);
        return sb.toString();
    }

    @Override // defpackage.cbbc
    public final String i(dpvi dpviVar, boolean z) {
        return (String) DateFormat.format(DateFormat.getBestDateTimePattern(this.b.getResources().getConfiguration().locale, true != z ? "MMM d" : "E, MMM d, yyyy"), l(dpviVar, true));
    }
}
