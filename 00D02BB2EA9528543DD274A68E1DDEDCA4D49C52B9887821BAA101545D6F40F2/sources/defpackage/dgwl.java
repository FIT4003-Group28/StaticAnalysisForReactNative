package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* compiled from: PG */
/* renamed from: dgwl  reason: default package */
/* loaded from: classes6.dex */
final class dgwl extends dgtl<Calendar> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ Calendar a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        dgxeVar.c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (dgxeVar.q() != 4) {
            String g = dgxeVar.g();
            int m = dgxeVar.m();
            if ("year".equals(g)) {
                i = m;
            } else if ("month".equals(g)) {
                i2 = m;
            } else if ("dayOfMonth".equals(g)) {
                i3 = m;
            } else if ("hourOfDay".equals(g)) {
                i4 = m;
            } else if ("minute".equals(g)) {
                i5 = m;
            } else if ("second".equals(g)) {
                i6 = m;
            }
        }
        dgxeVar.d();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, Calendar calendar) {
        Calendar calendar2 = calendar;
        if (calendar2 == null) {
            dgxgVar.f();
            return;
        }
        dgxgVar.b();
        dgxgVar.e("year");
        dgxgVar.g(calendar2.get(1));
        dgxgVar.e("month");
        dgxgVar.g(calendar2.get(2));
        dgxgVar.e("dayOfMonth");
        dgxgVar.g(calendar2.get(5));
        dgxgVar.e("hourOfDay");
        dgxgVar.g(calendar2.get(11));
        dgxgVar.e("minute");
        dgxgVar.g(calendar2.get(12));
        dgxgVar.e("second");
        dgxgVar.g(calendar2.get(13));
        dgxgVar.d();
    }
}
