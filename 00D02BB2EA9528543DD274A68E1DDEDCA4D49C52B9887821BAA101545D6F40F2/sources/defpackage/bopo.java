package defpackage;

import android.app.Activity;
import android.text.format.DateFormat;
import android.view.View;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bopo  reason: default package */
/* loaded from: classes3.dex */
public class bopo implements boqq {
    public static final Calendar a = Calendar.getInstance();
    public final boki b;
    public final Activity c;
    public final SimpleDateFormat d = new SimpleDateFormat(c(true));
    public final SimpleDateFormat e = new SimpleDateFormat(c(false));
    @dzsi
    boph f;
    @dzsi
    public bnys g;
    public String h;
    private final bopj i;
    private final cqkj j;
    private final bomt k;
    @dzsi
    private bopi l;

    public bopo(bopj bopjVar, cqhn cqhnVar, boki bokiVar, Activity activity, cqkj cqkjVar, jmx jmxVar, bomt bomtVar) {
        this.i = bopjVar;
        this.b = bokiVar;
        this.c = activity;
        this.j = cqkjVar;
        this.k = bomtVar;
        this.h = activity.getString(R.string.OPENING_DATE_SELECTION_PROMPT);
    }

    private static String c(boolean z) {
        return DateFormat.getBestDateTimePattern(Locale.getDefault(), true != z ? "MM/yyyy" : "MM/dd/yyyy");
    }

    @Override // defpackage.boqq
    public String a() {
        return this.h;
    }

    @Override // defpackage.boqq
    public cqkl b() {
        View view;
        cqjg cqjgVar;
        jmw.d(this.c, null);
        bomt bomtVar = this.k;
        ges gesVar = bomtVar.a;
        if (gesVar.aD && (view = gesVar.P) != null && (cqjgVar = bomtVar.b) != null) {
            View d = cqkx.d(view, cqjgVar);
            if (d != null) {
                d.clearFocus();
            }
            bomtVar.a();
        }
        if (this.g == null) {
            bopn bopnVar = new bopn(this);
            this.f = bopnVar;
            bopj bopjVar = this.i;
            boki bokiVar = this.b;
            Activity activity = this.c;
            bopm a2 = bopjVar.a.a();
            bopj.a(a2, 1);
            cqhn a3 = bopjVar.b.a();
            bopj.a(a3, 2);
            bopj.a(bokiVar, 3);
            bopj.a(bopnVar, 4);
            bopj.a(activity, 5);
            this.l = new bopi(a2, a3, bokiVar, bopnVar, activity);
            bnys bnysVar = new bnys(this.c, this.j, this.l);
            this.g = bnysVar;
            bnysVar.setOnCancelListener(this.l);
        }
        this.g.show();
        return cqkl.a;
    }
}
