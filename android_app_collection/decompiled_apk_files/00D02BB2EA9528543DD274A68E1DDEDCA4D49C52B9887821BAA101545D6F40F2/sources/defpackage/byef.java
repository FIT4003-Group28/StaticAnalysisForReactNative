package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byef  reason: default package */
/* loaded from: classes4.dex */
public final class byef implements Comparable<byef>, Serializable {
    public static final dcqe a = dcqe.c("byef");
    private static final Calendar g = Calendar.getInstance();
    public final byea b;
    public byea c;
    public final TimeZone d;
    public final Calendar e;
    public Calendar f;

    private byef(byea byeaVar, dgsj dgsjVar, TimeZone timeZone) {
        this.b = byeaVar;
        this.d = timeZone;
        dgsf dgsfVar = dgsjVar.d;
        Calendar r = r(dgsfVar == null ? dgsf.i : dgsfVar, timeZone);
        this.e = r;
        dgsf dgsfVar2 = dgsjVar.e;
        Calendar r2 = r(dgsfVar2 == null ? dgsf.i : dgsfVar2, timeZone);
        this.f = r2;
        this.c = (r2.compareTo(r) < 0 || q(r, this.f)) ? byeaVar.c() : byeaVar;
    }

    public static byef a(byea byeaVar, TimeZone timeZone, int i, int i2, int i3, int i4) {
        dgsg bZ = dgsj.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar = (dgsj) bZ.b;
        dgsjVar.b = 2;
        dgsjVar.a |= 1;
        dgsa bZ2 = dgsf.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgsf dgsfVar = (dgsf) bZ2.b;
        int i5 = dgsfVar.a | 4;
        dgsfVar.a = i5;
        dgsfVar.d = i;
        dgsfVar.a = i5 | 2;
        dgsfVar.c = i2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar2 = (dgsj) bZ.b;
        dgsf bK = bZ2.bK();
        bK.getClass();
        dgsjVar2.d = bK;
        dgsjVar2.a |= 8;
        dgsa bZ3 = dgsf.i.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dgsf dgsfVar2 = (dgsf) bZ3.b;
        int i6 = dgsfVar2.a | 4;
        dgsfVar2.a = i6;
        dgsfVar2.d = i3;
        dgsfVar2.a = i6 | 2;
        dgsfVar2.c = i4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar3 = (dgsj) bZ.b;
        dgsf bK2 = bZ3.bK();
        bK2.getClass();
        dgsjVar3.e = bK2;
        dgsjVar3.a |= 16;
        return new byef(byeaVar, bZ.bK(), timeZone);
    }

    public static List<byef> b(dgsj dgsjVar, dgsj dgsjVar2, TimeZone timeZone) {
        dgsf dgsfVar = dgsjVar.d;
        if (dgsfVar == null) {
            dgsfVar = dgsf.i;
        }
        dgsf dgsfVar2 = dgsjVar.e;
        if (dgsfVar2 == null) {
            dgsfVar2 = dgsf.i;
        }
        ArrayList<byea> a2 = dchl.a();
        int i = dgsfVar.e;
        int i2 = dgsfVar2.e;
        if (i == i2) {
            a2.add(byea.a(i % 7));
        } else {
            if (i2 < i) {
                i2 += 7;
            }
            while (i < i2) {
                a2.add(byea.a(i % 7));
                i++;
            }
        }
        ArrayList g2 = dchl.g(a2.size());
        for (byea byeaVar : a2) {
            g2.add(new byef(byeaVar, dgsjVar2, timeZone));
        }
        return g2;
    }

    public static List<byef> c(dgsj dgsjVar, TimeZone timeZone) {
        byea[] values = byea.values();
        ArrayList g2 = dchl.g(values.length);
        for (byea byeaVar : values) {
            g2.add(new byef(byeaVar, dgsjVar, timeZone));
        }
        return g2;
    }

    public static List<byef> d(dgsj dgsjVar, TimeZone timeZone) {
        dgsg bZ = dgsj.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar2 = (dgsj) bZ.b;
        dgsjVar2.b = 2;
        dgsjVar2.a |= 1;
        dgsa bZ2 = dgsf.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgsf dgsfVar = (dgsf) bZ2.b;
        int i = dgsfVar.a | 4;
        dgsfVar.a = i;
        dgsfVar.d = 0;
        dgsfVar.a = i | 2;
        dgsfVar.c = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar3 = (dgsj) bZ.b;
        dgsf bK = bZ2.bK();
        bK.getClass();
        dgsjVar3.d = bK;
        dgsjVar3.a |= 8;
        dgsa bZ3 = dgsf.i.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dgsf dgsfVar2 = (dgsf) bZ3.b;
        int i2 = dgsfVar2.a | 4;
        dgsfVar2.a = i2;
        dgsfVar2.d = 0;
        dgsfVar2.a = 2 | i2;
        dgsfVar2.c = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsj dgsjVar4 = (dgsj) bZ.b;
        dgsf bK2 = bZ3.bK();
        bK2.getClass();
        dgsjVar4.e = bK2;
        dgsjVar4.a |= 16;
        return b(dgsjVar, bZ.bK(), timeZone);
    }

    private static Calendar p(int i, int i2, TimeZone timeZone, boolean z) {
        Calendar calendar;
        if (z) {
            calendar = Calendar.getInstance();
        } else {
            calendar = g;
        }
        calendar.clear();
        calendar.setTimeZone(timeZone);
        calendar.set(1, 1971);
        calendar.set(11, i);
        calendar.set(12, i2);
        return calendar;
    }

    private static boolean q(Calendar calendar, Calendar calendar2) {
        return calendar.get(11) == calendar2.get(11) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == 0 && calendar.get(12) == 0;
    }

    private static Calendar r(dgsf dgsfVar, TimeZone timeZone) {
        return p(dgsfVar.d % 24, dgsfVar.c, timeZone, true);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public final int compareTo(byef byefVar) {
        byea byeaVar = this.b;
        byea byeaVar2 = byefVar.b;
        if (byeaVar == byeaVar2) {
            return this.e.compareTo(byefVar.e);
        }
        return byeaVar.compareTo(byeaVar2);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof byef) {
            byef byefVar = (byef) obj;
            if (dbsd.a(this.b, byefVar.b) && dbsd.a(this.c, byefVar.c) && dbsd.a(this.d, byefVar.d) && dbsd.a(this.e, byefVar.e) && dbsd.a(this.f, byefVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return q(this.e, this.f);
    }

    public final boolean g(byef byefVar) {
        if (byefVar.e.get(11) != 0 || this.f.get(11) != 0 || byefVar.e.get(12) != 0 || this.f.get(12) != 0 || !byefVar.b.equals(this.b.c()) || byefVar.f.get(11) > 12 || f() || byefVar.f()) {
            return false;
        }
        this.f = byefVar.f;
        this.c = byefVar.c;
        return true;
    }

    public final boolean h(Calendar calendar) {
        byea b = byea.b(calendar.get(7));
        Calendar o = o(calendar);
        byea byeaVar = this.b;
        if (byeaVar == this.c) {
            return byeaVar.equals(b) && this.e.compareTo(o) <= 0 && this.f.compareTo(o) > 0;
        } else if (byeaVar.equals(b) && this.e.compareTo(o) <= 0) {
            return true;
        } else {
            return this.c.equals(b) && this.f.compareTo(o) > 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f});
    }

    public final int i(Calendar calendar) {
        int timeInMillis = ((this.b.h - calendar.get(7)) * 1440) + (((int) (this.e.getTimeInMillis() - o(calendar).getTimeInMillis())) / 60000);
        return timeInMillis < 0 ? timeInMillis + 10080 : timeInMillis;
    }

    public final int j(Calendar calendar) {
        if (!h(calendar)) {
            return -1;
        }
        int i = calendar.get(7);
        int timeInMillis = ((int) (this.f.getTimeInMillis() - o(calendar).getTimeInMillis())) / 60000;
        return i != this.c.h ? timeInMillis + 1440 : timeInMillis;
    }

    public final CharSequence k(Context context) {
        return bvtb.k(context, TimeUnit.MILLISECONDS.toSeconds(this.f.getTimeInMillis()), this.d);
    }

    public final CharSequence l(Context context) {
        return bvtb.k(context, TimeUnit.MILLISECONDS.toSeconds(this.e.getTimeInMillis()), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        return this.f.get(11) == 0 && this.f.get(12) == 0;
    }

    public final boolean n() {
        return this.c != this.b && !m();
    }

    public final Calendar o(Calendar calendar) {
        dbsk.m(calendar.getTimeZone().equals(this.d), "Calendar must have same time zone as this TimeInterval.");
        return p(calendar.get(11), calendar.get(12), this.d, false);
    }

    public final String toString() {
        DateFormat timeInstance = DateFormat.getTimeInstance(3);
        timeInstance.setTimeZone(this.d);
        return String.format("%s – %s", timeInstance.format(this.e.getTime()), timeInstance.format(this.f.getTime()));
    }
}
