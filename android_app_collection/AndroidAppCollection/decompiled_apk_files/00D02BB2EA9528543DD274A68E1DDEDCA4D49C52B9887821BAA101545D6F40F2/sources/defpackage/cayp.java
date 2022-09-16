package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.DatePicker;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: cayp  reason: default package */
/* loaded from: classes4.dex */
public abstract class cayp implements cbqm {
    public static final dcqe a = dcqe.c("cayp");
    protected final Context b;
    protected final boolean c;
    protected final ges d;
    protected final cbau e;
    public dpvi f;
    protected gdf g;
    private final cqkj h;
    @dzsi
    private Runnable i;
    @dzsi
    private dpvi j;
    @dzsi
    private dpvi k;
    private cbbs l;

    public cayp(Context context, @dzsi dpvi dpviVar, @dzsi cbau cbauVar, cbbs cbbsVar, cqkj cqkjVar, boolean z, @dzsi dpvi dpviVar2, ges gesVar) {
        this.b = context;
        this.j = dpviVar;
        this.l = cbbsVar;
        this.f = dpviVar == null ? cbbsVar.a() : dpviVar;
        this.h = cqkjVar;
        this.c = z;
        this.k = dpviVar2;
        this.d = gesVar;
        if (cbauVar == null) {
            dpvi dpviVar3 = this.f;
            cbauVar = new cbau(null, null, dpviVar3, dpviVar3, null, null);
        }
        this.e = cbauVar;
        this.g = new gdf(context, false);
    }

    public static void k(Context context, cqkf<cbqm> cqkfVar) {
        TextView textView = (TextView) cqkfVar.c().findViewById(Resources.getSystem().getIdentifier("date_picker_header_year", "id", "android"));
        if (textView != null) {
            textView.setTextAppearance(context, 2132018139);
            textView.setTextColor(context.getResources().getColor(R.color.google_white));
        }
        TextView textView2 = (TextView) cqkfVar.c().findViewById(Resources.getSystem().getIdentifier("date_picker_header_date", "id", "android"));
        if (textView2 != null) {
            textView2.setTextAppearance(context, 2132018128);
            textView2.setTextColor(context.getResources().getColor(R.color.google_white));
        }
    }

    @Override // defpackage.cbqm
    public String a() {
        return this.b.getResources().getString(true != this.c ? R.string.UGC_EVENTS_END_DATE_TIME_PICKER_TITLE : R.string.UGC_EVENTS_START_DATE_TIME_PICKER_TITLE);
    }

    @Override // defpackage.cbqm
    public DatePicker.OnDateChangedListener b() {
        return new DatePicker.OnDateChangedListener(this) { // from class: cayo
            private final cayp a;

            {
                this.a = this;
            }

            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
                cayp caypVar = this.a;
                int i4 = i2 + 1;
                if (i4 <= 0 || i4 > 12) {
                    bvoo.h("Invalid month value: %d", Integer.valueOf(i4));
                    i4 = 1;
                }
                if (i3 <= 0 || i3 > 31) {
                    bvoo.h("Invalid day of month value: %d", Integer.valueOf(i3));
                    i3 = 1;
                }
                dpvh bZ = dpvi.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpvi dpviVar = (dpvi) bZ.b;
                int i5 = 1 | dpviVar.a;
                dpviVar.a = i5;
                dpviVar.b = i;
                int i6 = i5 | 2;
                dpviVar.a = i6;
                dpviVar.c = i4;
                dpviVar.a = i6 | 4;
                dpviVar.d = i3;
                caypVar.f = bZ.bK();
            }
        };
    }

    @Override // defpackage.cbqm
    public cqkl c() {
        this.j = this.f;
        this.g.dismiss();
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    public void d(Runnable runnable) {
        this.i = runnable;
    }

    public void e() {
        Long valueOf;
        long longValue;
        this.g = new gdf(this.b, false);
        dpvi dpviVar = this.j;
        if (dpviVar == null) {
            dpviVar = this.l.a();
        }
        this.f = dpviVar;
        gdf gdfVar = this.g;
        dpvi dpviVar2 = this.k;
        if (dpviVar2 == null) {
            longValue = 0;
        } else {
            Calendar calendar = Calendar.getInstance();
            synchronized (calendar) {
                calendar.set(dpviVar2.b, dpviVar2.c - 1, dpviVar2.d);
                calendar.set(11, dpviVar2.e);
                calendar.set(12, dpviVar2.f);
                calendar.set(13, 0);
                valueOf = Long.valueOf(((calendar.getTimeInMillis() + 30000) / 60000) * 60000);
            }
            longValue = valueOf.longValue();
        }
        cqkf c = this.h.c(new cbfm(dpviVar.b, dpviVar.c - 1, dpviVar.d, Long.valueOf(longValue)), null);
        c.e(this);
        this.g.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        k(this.b, c);
        gdfVar.setContentView(c.c());
        this.g.show();
    }

    public void f() {
        this.j = null;
    }

    @dzsi
    public dpvi g() {
        return this.j;
    }

    public void h(@dzsi dpvi dpviVar) {
        this.k = dpviVar;
    }

    public void i(cbbs cbbsVar) {
        this.l = cbbsVar;
    }

    public dpvi j() {
        return this.f;
    }
}
