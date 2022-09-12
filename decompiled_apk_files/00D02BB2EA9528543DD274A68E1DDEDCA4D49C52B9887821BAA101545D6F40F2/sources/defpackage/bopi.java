package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import android.widget.NumberPicker;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bopi  reason: default package */
/* loaded from: classes3.dex */
public class bopi implements boqo {
    public static final boolean a = true;
    public static final Calendar b = Calendar.getInstance();
    public final int c;
    public final int d;
    public final cqhn e;
    final bopl f;
    final bopl g;
    final bopl h;
    private final boki i;
    private final List<bopl> j;
    private final jae k;
    private final boph l;
    private final NumberPicker.OnValueChangeListener m = new NumberPicker.OnValueChangeListener(this) { // from class: bopf
        private final bopi a;

        {
            this.a = this;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
            bopl boplVar;
            bopi bopiVar = this.a;
            boolean z = true;
            if (bopiVar.f != null && bopiVar.g != null && bopiVar.h != null && bopiVar.e != null) {
                bopi.b.set(5, 1);
                bopi.b.set(2, bopiVar.g.b().intValue() - 1);
                bopi.b.set(1, bopiVar.h.b().intValue());
                int actualMaximum = bopi.b.getActualMaximum(5);
                bopiVar.f.l(actualMaximum);
                if (bopiVar.f.b().intValue() > actualMaximum) {
                    bopiVar.f.k(actualMaximum);
                }
                cqkx.p(bopiVar.f);
            }
            if (bopiVar.f == null || bopiVar.g == null || (boplVar = bopiVar.h) == null || bopiVar.e == null) {
                return;
            }
            if (boplVar.b().intValue() == bopiVar.d) {
                bopiVar.g.l(bopiVar.c);
                bopl boplVar2 = bopiVar.g;
                if (bopiVar.c != 12) {
                    z = false;
                }
                boplVar2.m(z);
                int intValue = bopiVar.g.b().intValue();
                int i3 = bopiVar.c;
                if (intValue > i3) {
                    bopiVar.g.k(i3);
                }
            } else {
                bopiVar.g.l(12);
                bopiVar.g.m(true);
            }
            cqkx.p(bopiVar.g);
        }
    };

    public bopi(bopm bopmVar, cqhn cqhnVar, boki bokiVar, boph bophVar, Context context) {
        String str;
        this.e = cqhnVar;
        this.i = bokiVar;
        this.l = bophVar;
        this.c = bokiVar.d.a;
        this.d = bokiVar.e.a;
        Calendar calendar = b;
        calendar.set(5, 1);
        calendar.set(2, bokiVar.d.a - 1);
        calendar.set(1, bokiVar.e.a);
        int actualMaximum = calendar.getActualMaximum(5);
        bokh bokhVar = bokiVar.c;
        calendar.set(2, 0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd", Locale.getDefault());
        dccx F = dcdc.F();
        for (int i = 1; i <= 31; i++) {
            Calendar calendar2 = b;
            calendar2.set(5, i);
            F.g(simpleDateFormat.format(calendar2.getTime()));
        }
        this.f = bopmVar.a(bokhVar, F.f(), 1, actualMaximum, true, true, null);
        bokh bokhVar2 = bokiVar.d;
        b.set(5, 1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", Locale.getDefault());
        dccx F2 = dcdc.F();
        for (int i2 = 0; i2 < 12; i2++) {
            Calendar calendar3 = b;
            calendar3.set(2, i2);
            F2.g(simpleDateFormat2.format(calendar3.getTime()));
        }
        dcdc f = F2.f();
        int i3 = this.c;
        this.g = bopmVar.a(bokhVar2, f, 1, i3, Boolean.valueOf(i3 == 12), false, this.m);
        bokh bokhVar3 = bokiVar.e;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy", Locale.getDefault());
        dccx F3 = dcdc.F();
        for (int i4 = 1700; i4 <= this.d; i4++) {
            Calendar calendar4 = b;
            calendar4.set(1, i4);
            F3.g(simpleDateFormat3.format(calendar4.getTime()));
        }
        dcdc f2 = F3.f();
        dcdc f3 = f2.isEmpty() ? dcdc.f(String.valueOf(bokiVar.e.a)) : f2;
        bopl a2 = bopmVar.a(bokhVar3, f3, Integer.parseInt(f3.get(0)), Integer.parseInt(f3.get(f3.size() - 1)), false, false, this.m);
        this.h = a2;
        bopl boplVar = this.f;
        bopl boplVar2 = this.g;
        if (a) {
            str = DateFormat.getBestDateTimePattern(Locale.getDefault(), "ddMMyyyy");
        } else {
            str = new String(DateFormat.getDateFormatOrder(context));
        }
        dccx F4 = dcdc.F();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == 'L' || charAt == 'M') {
                if (!z) {
                    F4.g(boplVar2);
                    z = true;
                }
            } else if (charAt != 'd') {
                if (charAt == 'y' && !z3) {
                    F4.g(a2);
                    z3 = true;
                }
            } else if (!z2) {
                F4.g(boplVar);
                z2 = true;
            }
        }
        this.j = F4.f();
        this.k = new bopg(this, context, cqrt.l(R.string.OPENING_DATE_CHECKBOX_DESCRIPTION), dtxj.H);
    }

    @Override // defpackage.boqo
    public List<bopl> a() {
        return this.j;
    }

    @Override // defpackage.boqo
    public jae b() {
        return this.k;
    }

    @Override // defpackage.boqo
    public cqkl c() {
        for (bopl boplVar : this.j) {
            boplVar.h();
        }
        bopn bopnVar = (bopn) this.l;
        bnys bnysVar = bopnVar.a.g;
        if (bnysVar != null && bnysVar.isShowing()) {
            bopnVar.a.g.dismiss();
        }
        return cqkl.a;
    }

    @Override // defpackage.boqo
    public cqkl d() {
        for (bopl boplVar : this.j) {
            boplVar.i();
        }
        this.i.a = this.k.b().booleanValue();
        bopn bopnVar = (bopn) this.l;
        bopo.a.set(2, bopnVar.a.b.d.a - 1);
        bopo.a.set(1, bopnVar.a.b.e.a);
        bopo.a.set(5, 1);
        bopo bopoVar = bopnVar.a;
        if (bopoVar.b.a) {
            bopo.a.set(5, bopnVar.a.b.c.a);
            bopo bopoVar2 = bopnVar.a;
            bopoVar2.h = bopoVar2.c.getString(R.string.OPENING_DATE_SUMMARY, new Object[]{bopoVar2.d.format(bopo.a.getTime())});
        } else {
            bopoVar.h = bopoVar.c.getString(R.string.OPENING_DATE_SUMMARY, new Object[]{bopoVar.e.format(bopo.a.getTime())});
        }
        bnys bnysVar = bopnVar.a.g;
        if (bnysVar != null && bnysVar.isShowing()) {
            bopnVar.a.g.dismiss();
        }
        bopo bopoVar3 = bopnVar.a;
        bopoVar3.b.b = true;
        cqkx.p(bopoVar3);
        return cqkl.a;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        c();
    }
}
