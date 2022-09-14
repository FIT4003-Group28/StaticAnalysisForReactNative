package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzks  reason: default package */
/* loaded from: classes4.dex */
public final class bzks {
    private static final long a = TimeUnit.HOURS.toSeconds(1);
    private static final long b = TimeUnit.MINUTES.toSeconds(1);
    private static final dbuj<bzko, DateFormat> g = dbuo.a().e();
    private final Application c;
    private final bzkw d;
    private final bzle e;
    private final cklv f;

    public bzks(Application application, bzkw bzkwVar, bzle bzleVar, cklv cklvVar) {
        this.c = application;
        this.d = bzkwVar;
        this.e = bzleVar;
        this.f = cklvVar;
    }

    private static dbsg<String> A(dcdc<dpce> dcdcVar) {
        return dbsg.j(alcf.l(dcdcVar)).d(dbsg.j(alcf.n(dcdcVar)));
    }

    static dpce b(String str, String str2) {
        dpcb bZ = dpce.f.bZ();
        douk bZ2 = doul.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doul doulVar = (doul) bZ2.b;
        int i = doulVar.a | 1;
        doulVar.a = i;
        doulVar.b = "!";
        str.getClass();
        int i2 = i | 4;
        doulVar.a = i2;
        doulVar.d = str;
        str2.getClass();
        doulVar.a = i2 | 8;
        doulVar.e = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar = (dpce) bZ.b;
        doul bK = bZ2.bK();
        bK.getClass();
        dpceVar.c = bK;
        dpceVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar2 = (dpce) bZ.b;
        dpceVar2.b = 5;
        dpceVar2.a |= 1;
        return bZ.bK();
    }

    public static dcdc<dpce> d(bzlh bzlhVar) {
        return bzlhVar.a().a();
    }

    public static boolean f(bzlh bzlhVar, bzkr bzkrVar) {
        return bzlhVar.a().c().a() || l(bzlhVar, bzkrVar);
    }

    static final dpce g(String str) {
        dpcb bZ = dpce.f.bZ();
        douk bZ2 = doul.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doul doulVar = (doul) bZ2.b;
        int i = doulVar.a | 1;
        doulVar.a = i;
        doulVar.b = ".";
        str.getClass();
        int i2 = i | 4;
        doulVar.a = i2;
        doulVar.d = str;
        str.getClass();
        doulVar.a = i2 | 8;
        doulVar.e = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar = (dpce) bZ.b;
        doul bK = bZ2.bK();
        bK.getClass();
        dpceVar.c = bK;
        dpceVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpce dpceVar2 = (dpce) bZ.b;
        dpceVar2.b = 5;
        dpceVar2.a |= 1;
        return bZ.bK();
    }

    private final bzky i(dcdc<bzlh> dcdcVar, dbsg<Locale> dbsgVar, bzjj bzjjVar, long j, dbsg<bzhn> dbsgVar2, List<bzjd> list, bzkr bzkrVar) {
        RemoteViews remoteViews;
        int i;
        RemoteViews remoteViews2;
        boolean z;
        boolean z2;
        dbsg i2;
        dbsk.a(!dcdcVar.isEmpty());
        dbsk.a(!dcdcVar.isEmpty());
        RemoteViews y = y(R.layout.transit_station_two_departures);
        if (dbsgVar2.a()) {
            bzhm b2 = bzhm.b(dbsgVar2.b().b);
            if (b2 == null) {
                b2 = bzhm.UNKNOWN_PLACE;
            }
            if (b2 == bzhm.HOME) {
                y.setTextViewText(R.id.transit_station_departures_text, z(dbsgVar).getString(R.string.COMMUTE_DEPARTURES_TO_HOME));
            } else {
                bzhm b3 = bzhm.b(dbsgVar2.b().b);
                if (b3 == null) {
                    b3 = bzhm.UNKNOWN_PLACE;
                }
                if (b3 == bzhm.WORK) {
                    y.setTextViewText(R.id.transit_station_departures_text, z(dbsgVar).getString(R.string.COMMUTE_DEPARTURES_TO_WORK));
                } else if (!dbsgVar2.b().c.isEmpty()) {
                    y.setTextViewText(R.id.transit_station_departures_text, z(dbsgVar).getString(R.string.COMMUTE_DEPARTURES_TO_DESTINATION, dbsgVar2.b().c));
                }
            }
        } else {
            y.setTextViewText(R.id.transit_station_departures_text, z(dbsgVar).getString(R.string.TRANSIT_STATION_DEPARTURES));
        }
        y.setTextViewText(R.id.transit_station_name, z(dbsgVar).getString(R.string.TRANSIT_STATION_FROM, bzjjVar.b));
        if (dcdcVar.size() == 1) {
            i = 0;
            remoteViews = y;
            p(dbsgVar, y, dcdcVar.get(0), j, R.id.transit_line_2_info, R.id.transit_line_2_icon, R.id.transit_line_2_disruption_icon, R.id.transit_line_2_crowdedness_icon, bzkrVar);
        } else {
            remoteViews = y;
            i = 0;
            p(dbsgVar, remoteViews, dcdcVar.get(0), j, R.id.transit_line_1_info, R.id.transit_line_1_icon, R.id.transit_line_1_disruption_icon, R.id.transit_line_1_crowdedness_icon, bzkrVar);
            p(dbsgVar, remoteViews, dcdcVar.get(1), j, R.id.transit_line_2_info, R.id.transit_line_2_icon, R.id.transit_line_2_disruption_icon, R.id.transit_line_2_crowdedness_icon, bzkrVar);
        }
        if (!bzkrVar.g()) {
            remoteViews2 = remoteViews;
            if (!bzjjVar.e.isEmpty()) {
                remoteViews2.setViewVisibility(R.id.transit_station_disruption_icon, i);
                remoteViews2.setImageViewBitmap(R.id.transit_station_disruption_icon, bzkw.a(u(dbsgVar, bzjjVar.e)));
            }
        } else if (!list.isEmpty()) {
            remoteViews2 = remoteViews;
            remoteViews2.setViewVisibility(R.id.alerts_summary_icon, i);
            remoteViews2.setImageViewBitmap(R.id.alerts_summary_icon, bzkw.b(this.c, cqrt.f(bzkv.e(list))));
            if (list.isEmpty()) {
                i2 = dbpy.a;
            } else if (list.size() == 1) {
                String str = list.get(i).d;
                if (str.isEmpty()) {
                    i2 = dbpy.a;
                } else {
                    Resources z3 = z(dbsgVar);
                    Object[] objArr = new Object[1];
                    objArr[i] = str;
                    i2 = dbsg.i(z3.getString(R.string.ACCESSIBILITY_TRANSIT_NOTIFICATION_SINGLE_ALERT_WITH_SUMMARY, objArr));
                }
            } else {
                i2 = dbsg.i(z(dbsgVar).getString(R.string.ACCESSIBILITY_TRANSIT_NOTIFICATION_MULTIPLE_ALERTS));
            }
            if (i2.a()) {
                remoteViews2.setContentDescription(R.id.alerts_summary_icon, (CharSequence) i2.b());
            }
        } else {
            remoteViews2 = remoteViews;
        }
        int size = dcdcVar.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            z4 |= m(dcdcVar.get(i3), bzkrVar);
        }
        if (!bzkrVar.g()) {
            z = true;
            z2 = !bzjjVar.e.isEmpty();
            int size2 = dcdcVar.size();
            for (int i4 = 0; i4 < size2; i4++) {
                z2 |= !dcdcVar.get(i4).d().isEmpty();
            }
        } else {
            z = true;
            z2 = !list.isEmpty();
        }
        bzkx f = bzky.f();
        ((bzka) f).a = remoteViews2;
        if (z != z4) {
            z = false;
        }
        f.c(z);
        f.b(z2);
        bzky a2 = f.a();
        RemoteViews x = x();
        x.addView(R.id.transit_notification_two_departures, a2.a());
        x.setViewVisibility(R.id.transit_notification_two_departures, i);
        bzkx f2 = bzky.f();
        bzka bzkaVar = (bzka) f2;
        bzkaVar.a = x;
        f2.b(a2.c());
        f2.c(a2.b());
        if (!dcdcVar.get(i).b().isEmpty()) {
            if ((dcdcVar.get(i).b().get(i).a & 16) != 0) {
                bzkaVar.b = dbsg.i(dcdcVar.get(i).b().get(i).f);
            }
            if ((dcdcVar.get(i).b().get(i).a & 32) != 0) {
                bzkaVar.c = dbsg.i(dcdcVar.get(i).b().get(i).g);
            }
        }
        return f2.a();
    }

    private static long j(long j) {
        double d = j;
        Double.isNaN(d);
        return (long) Math.ceil(d / 60.0d);
    }

    private static boolean k(bzjh bzjhVar, bzkr bzkrVar) {
        return (bzjhVar.a & 2) != 0 && bzkrVar.e();
    }

    private static boolean l(bzlh bzlhVar, bzkr bzkrVar) {
        return !bzlhVar.b().isEmpty() && k(bzlhVar.b().get(0), bzkrVar);
    }

    private static boolean m(bzlh bzlhVar, bzkr bzkrVar) {
        return l(bzlhVar, bzkrVar) && bzlhVar.d().isEmpty();
    }

    private static boolean n(bzlh bzlhVar, bzkr bzkrVar) {
        return bzlhVar.b().size() == 1 || bzkrVar.c();
    }

    private static boolean o(bzkr bzkrVar, bzjh bzjhVar) {
        if (bzkrVar.f()) {
            dpjb dpjbVar = bzjhVar.h;
            if (dpjbVar == null) {
                dpjbVar = dpjb.e;
            }
            return (dpjbVar.a & 2) != 0;
        }
        return false;
    }

    private final void p(dbsg<Locale> dbsgVar, RemoteViews remoteViews, bzlh bzlhVar, long j, int i, int i2, int i3, int i4, bzkr bzkrVar) {
        Bitmap a2 = this.e.a(bzlhVar.a().a());
        if (a2 != null) {
            remoteViews.setImageViewBitmap(i2, a2);
        }
        dbsg<String> A = A(bzlhVar.a().a());
        if (A.a()) {
            remoteViews.setContentDescription(i2, A.b());
        }
        if (bzlhVar.c().a()) {
            remoteViews.setTextViewText(i, z(dbsgVar).getString(R.string.TRANSIT_LINE_FREQUENCY_DEPARTURE_DOUBLE_CHIP, Long.valueOf(j(bzlhVar.c().b().longValue()))));
        } else {
            bzjh bzjhVar = bzlhVar.b().get(0);
            CharSequence B = B(dbsgVar, j, bzjhVar.b, bzkrVar.k(), bzkrVar);
            if (m(bzlhVar, bzkrVar)) {
                int a3 = bzjg.a(bzjhVar.c);
                if (a3 == 0) {
                    a3 = 1;
                }
                B = h(B, a3);
            }
            remoteViews.setTextViewText(i, B);
            if (m(bzlhVar, bzkrVar) && o(bzkrVar, bzjhVar)) {
                remoteViews.setViewVisibility(i4, 0);
                remoteViews.setImageViewBitmap(i4, q(bzjhVar));
                String r = r(bzjhVar);
                if (r != null) {
                    remoteViews.setContentDescription(i4, r);
                }
            }
        }
        if (bzlhVar.d().isEmpty() || bzkrVar.g()) {
            return;
        }
        remoteViews.setViewVisibility(i3, 0);
        TextView textView = new TextView(this.c);
        alcb d = this.d.d(textView);
        d.h = 0;
        alcc a4 = d.a();
        Iterator<bzjd> it = bzlhVar.d().iterator();
        while (true) {
            if (it.hasNext()) {
                bzjc b2 = bzjc.b(it.next().f);
                if (b2 == null) {
                    b2 = bzjc.UNKNOWN;
                }
                if (b2 == bzjc.ALERT) {
                    textView.setText(a4.c(g(z(dbsgVar).getString(R.color.quantum_googred500))));
                    break;
                }
            } else {
                textView.setText(a4.c(g(z(dbsgVar).getString(R.color.quantum_amber500))));
                break;
            }
        }
        remoteViews.setImageViewBitmap(i3, bzkw.a(textView));
        if (bzlhVar.d().size() == 1) {
            remoteViews.setTextViewText(i, z(dbsgVar).getString(R.string.TRANSIT_LINE_SINGLE_ALERT));
        } else {
            remoteViews.setTextViewText(i, z(dbsgVar).getString(R.string.TRANSIT_LINE_ONE_ALERTS, Integer.valueOf(bzlhVar.d().size())));
        }
    }

    private final Bitmap q(bzjh bzjhVar) {
        Application application = this.c;
        dpjb dpjbVar = bzjhVar.h;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        dpzb dpzbVar = dpjbVar.c;
        if (dpzbVar == null) {
            dpzbVar = dpzb.d;
        }
        dpyy b2 = dpyy.b(dpzbVar.c);
        if (b2 == null) {
            b2 = dpyy.OCCUPANCY_RATE_UNKNOWN;
        }
        return bzkw.b(application, xkn.b(b2));
    }

    private final String r(bzjh bzjhVar) {
        dpjb dpjbVar = bzjhVar.h;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        dpzb dpzbVar = dpjbVar.c;
        if (dpzbVar == null) {
            dpzbVar = dpzb.d;
        }
        return xkn.d(dpzbVar, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.bzky s(final defpackage.dbsg<java.util.Locale> r19, defpackage.bzlh r20, long r21, android.widget.TextView r23, defpackage.alcc r24, final defpackage.bzkr r25) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzks.s(dbsg, bzlh, long, android.widget.TextView, alcc, bzkr):bzky");
    }

    private final void t(dbsg<Locale> dbsgVar, RemoteViews remoteViews, bzjh bzjhVar, bzkr bzkrVar) {
        if (o(bzkrVar, bzjhVar)) {
            remoteViews.setViewVisibility(R.id.transit_line_crowdedness_icon, 0);
            remoteViews.setImageViewBitmap(R.id.transit_line_crowdedness_icon, q(bzjhVar));
            remoteViews.setViewVisibility(R.id.transit_line_context_padding, 0);
            String r = r(bzjhVar);
            if (r != null) {
                remoteViews.setContentDescription(R.id.transit_line_crowdedness_icon, r);
            }
        } else {
            int a2 = bzjg.a(bzjhVar.c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 1) {
                remoteViews.setTextViewText(R.id.transit_station_next_departure, z(dbsgVar).getString(R.string.TRANSIT_DEPARTURE_CONTEXT_ON_TIME));
            } else if (i == 2) {
                double d = bzjhVar.b - bzjhVar.d;
                Double.isNaN(d);
                double d2 = d / 60.0d;
                if (d2 > dcyn.a) {
                    remoteViews.setTextViewText(R.id.transit_station_next_departure, z(dbsgVar).getString(R.string.TRANSIT_DEPARTURE_CONTEXT_LATE, Long.valueOf((long) Math.ceil(d2))));
                } else {
                    remoteViews.setTextViewText(R.id.transit_station_next_departure, z(dbsgVar).getString(R.string.TRANSIT_DEPARTURE_CONTEXT_EARLY, Long.valueOf((long) Math.ceil(-d2))));
                }
            } else if (i == 3) {
                remoteViews.setTextViewText(R.id.transit_station_next_departure, z(dbsgVar).getString(R.string.TRANSIT_DEPARTURE_CONTEXT_CANCELED));
            }
        }
        remoteViews.setViewVisibility(R.id.transit_station_next_departure_container, 0);
        remoteViews.setViewVisibility(R.id.transit_line_context_right_arrow, 8);
    }

    private final TextView u(dbsg<Locale> dbsgVar, List<bzjd> list) {
        TextView textView = new TextView(this.c);
        alcb d = this.d.d(textView);
        d.h = 0;
        textView.setText(d.a().c(c(dbsgVar, list)));
        return textView;
    }

    private final CharSequence v(dbsg<Locale> dbsgVar, long j) {
        return j > 0 ? z(dbsgVar).getString(R.string.TRANSIT_LINE_ONE_DEPARTURE, Long.valueOf(j)) : z(dbsgVar).getString(R.string.TRANSIT_LINE_ONE_DEPARTURE_NOW);
    }

    private final CharSequence w(dbsg<Locale> dbsgVar, CharSequence charSequence) {
        String string = z(dbsgVar).getString(R.string.TRANSIT_LINE_DEPARTURE_CONJUNCTION);
        int indexOf = TextUtils.indexOf(charSequence, string);
        if (indexOf == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(this.c, R.style.TransitNotificationConjunction), indexOf, string.length() + indexOf, 33);
        return spannableString;
    }

    private final RemoteViews x() {
        RemoteViews y = y(R.layout.transit_station_notification);
        y.removeAllViews(R.id.transit_notification_lines);
        y.removeAllViews(R.id.transit_notification_disruptions);
        y.removeAllViews(R.id.transit_notification_two_departures);
        y.setViewVisibility(R.id.alerts_summary_icon, 8);
        y.setViewVisibility(R.id.transit_notification_two_departures, 8);
        y.setViewVisibility(R.id.transit_notification_divider, 8);
        y.setViewVisibility(R.id.transit_notification_disruptions, 4);
        y.setViewVisibility(R.id.transit_notification_expanded_form_station_name, 8);
        return y;
    }

    private final RemoteViews y(int i) {
        return new RemoteViews(this.c.getPackageName(), i);
    }

    private final Resources z(dbsg<Locale> dbsgVar) {
        return this.f.a(dbsgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bzkj a(defpackage.bzjj r25, defpackage.dcdc<defpackage.bzlh> r26, long r27, defpackage.dbsg<defpackage.bzhn> r29, int r30, final defpackage.bzkr r31, long r32) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzks.a(bzjj, dcdc, long, dbsg, int, bzkr, long):bzkj");
    }

    final dpce c(dbsg<Locale> dbsgVar, List<bzjd> list) {
        for (bzjd bzjdVar : list) {
            bzjc b2 = bzjc.b(bzjdVar.f);
            if (b2 == null) {
                b2 = bzjc.UNKNOWN;
            }
            if (b2 == bzjc.ALERT) {
                return b(z(dbsgVar).getString(R.color.quantum_googred500), z(dbsgVar).getString(R.color.quantum_greywhite1000));
            }
        }
        return b(z(dbsgVar).getString(R.color.quantum_amber500), z(dbsgVar).getString(R.color.quantum_greyblack1000));
    }

    public final CharSequence e(final dbsg<Locale> dbsgVar, long j, final bzkr bzkrVar) {
        try {
            return g.c(new bzjx(dbsgVar, bzkrVar.i(), bzkrVar.j()), new Callable(dbsgVar, bzkrVar) { // from class: bzkm
                private final dbsg a;
                private final bzkr b;

                {
                    this.a = dbsgVar;
                    this.b = bzkrVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String a2;
                    dbsg dbsgVar2 = this.a;
                    bzkr bzkrVar2 = this.b;
                    bzlf i = bzkrVar2.i();
                    int j2 = bzkrVar2.j();
                    int i2 = j2 - 1;
                    if (j2 == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        a2 = i.a();
                    } else if (i2 == 1) {
                        a2 = i.b();
                    } else {
                        String a3 = bzkh.a(j2);
                        StringBuilder sb = new StringBuilder(a3.length() + 30);
                        sb.append("Unexpected hour display mode: ");
                        sb.append(a3);
                        throw new RuntimeException(sb.toString());
                    }
                    boolean contains = a2.contains(";");
                    String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern((Locale) dbsgVar2.c(Locale.getDefault()), a2.replace(";", ""));
                    if (contains) {
                        bestDateTimePattern = bestDateTimePattern.replaceAll(" a+", "");
                    }
                    return new SimpleDateFormat(bestDateTimePattern);
                }
            }).format(Long.valueOf(j * 1000));
        } catch (ExecutionException e) {
            throw new RuntimeException("Unable to get DateFormat for commute notification", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence h(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r7)
            int r8 = r8 + (-1)
            r1 = 1
            r2 = 0
            if (r8 == r1) goto L28
            r3 = 2
            if (r8 == r3) goto L1e
            r3 = 3
            if (r8 == r3) goto L12
            return r7
        L12:
            android.app.Application r7 = r6.c
            r8 = 2131099799(0x7f060097, float:1.7811961E38)
            int r7 = defpackage.akm.c(r7, r8)
            r8 = 1
            r3 = 0
            goto L33
        L1e:
            android.app.Application r7 = r6.c
            r8 = 2131099800(0x7f060098, float:1.7811963E38)
            int r7 = defpackage.akm.c(r7, r8)
            goto L31
        L28:
            android.app.Application r7 = r6.c
            r8 = 2131099801(0x7f060099, float:1.7811965E38)
            int r7 = defpackage.akm.c(r7, r8)
        L31:
            r8 = 0
            r3 = 1
        L33:
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r7)
            int r7 = r0.length()
            r5 = 33
            r0.setSpan(r4, r2, r7, r5)
            if (r8 == 0) goto L4f
            android.text.style.StrikethroughSpan r7 = new android.text.style.StrikethroughSpan
            r7.<init>()
            int r8 = r0.length()
            r0.setSpan(r7, r2, r8, r5)
        L4f:
            if (r3 == 0) goto L5d
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r7.<init>(r1)
            int r8 = r0.length()
            r0.setSpan(r7, r2, r8, r5)
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzks.h(java.lang.CharSequence, int):java.lang.CharSequence");
    }

    private final CharSequence B(dbsg<Locale> dbsgVar, long j, long j2, int i, bzkr bzkrVar) {
        if (i != 0) {
            if (i != 1) {
                return e(dbsgVar, j2, bzkrVar);
            }
            return v(dbsgVar, TimeUnit.SECONDS.toMinutes(j2) - TimeUnit.SECONDS.toMinutes(j));
        }
        throw null;
    }
}
