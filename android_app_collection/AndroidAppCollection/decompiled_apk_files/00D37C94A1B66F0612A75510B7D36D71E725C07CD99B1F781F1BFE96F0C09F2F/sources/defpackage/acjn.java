package defpackage;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acjn  reason: default package */
/* loaded from: classes.dex */
public final class acjn implements View.OnClickListener, TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {
    public final ViewGroup a;
    private final TextView b;
    private final TextView c;
    private final long d;
    private final int e;
    private final Context f;
    private final eo g;
    private Calendar h;

    public acjn(ashw ashwVar, ViewGroup viewGroup, TextView textView, TextView textView2, Context context, eo eoVar) {
        this.g = eoVar;
        context.getClass();
        this.f = context;
        ashwVar.getClass();
        this.d = ashwVar.c;
        this.e = ashwVar.b;
        viewGroup.getClass();
        this.a = viewGroup;
        textView.getClass();
        this.b = textView;
        textView2.getClass();
        this.c = textView2;
    }

    private final void d() {
        this.b.setText(DateFormat.getMediumDateFormat(this.f).format(this.h.getTime()));
        this.c.setText(DateFormat.getTimeFormat(this.f).format(this.h.getTime()));
    }

    public final Date a() {
        Calendar calendar = this.h;
        if (calendar == null) {
            return null;
        }
        return calendar.getTime();
    }

    public final void b() {
        this.a.setVisibility(0);
        Calendar calendar = this.h;
        if (calendar == null) {
            Calendar calendar2 = Calendar.getInstance();
            if (this.d != 0) {
                calendar2.setTimeInMillis(TimeUnit.SECONDS.toMillis(this.d));
            }
            if (this.e != 0) {
                double d = calendar2.get(12);
                double d2 = this.e;
                Double.isNaN(d);
                Double.isNaN(d2);
                double ceil = Math.ceil(d / d2);
                double d3 = this.e;
                Double.isNaN(d3);
                int i = (int) (ceil * d3);
                calendar2.add(10, i / 60);
                calendar2.set(12, i % 60);
            }
            c(calendar2);
        } else {
            c(calendar);
        }
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    public final void c(Calendar calendar) {
        this.h = calendar;
        d();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.b) {
            acih acihVar = new acih();
            acihVar.af = this.h;
            acihVar.ae = this;
            acihVar.qv(this.g, "datePicker");
        } else if (view != this.c) {
        } else {
            aclt acltVar = new aclt();
            acltVar.af = this.h;
            acltVar.ae = this;
            acltVar.qv(this.g, "timePicker");
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.h.set(1, i);
        this.h.set(2, i2);
        this.h.set(5, i3);
        d();
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.h.set(11, i);
        this.h.set(12, i2);
        d();
    }
}
