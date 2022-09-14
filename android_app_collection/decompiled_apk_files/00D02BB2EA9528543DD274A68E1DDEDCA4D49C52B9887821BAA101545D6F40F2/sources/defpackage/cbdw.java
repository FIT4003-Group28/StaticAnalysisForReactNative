package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbdw  reason: default package */
/* loaded from: classes4.dex */
public class cbdw implements cbrm {
    public static final dcqe a = dcqe.c("cbdw");
    public final boolean b;
    @dzsi
    public Runnable c;
    @dzsi
    public dpvi d;
    public dpvi e;
    private final Context f;
    private final cbbs g;
    private final cqkj h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private gdf l;

    public cbdw(Context context, @dzsi dpvi dpviVar, cbbs cbbsVar, cqkj cqkjVar, boolean z, boolean z2, boolean z3) {
        this.f = context;
        this.d = dpviVar;
        this.g = cbbsVar;
        this.e = dpviVar == null ? cbbsVar.a() : dpviVar;
        this.h = cqkjVar;
        this.i = z;
        this.k = z2;
        this.b = z3;
        this.j = DateFormat.is24HourFormat(context);
        this.l = new gdf(context, false);
    }

    @Override // defpackage.cbrm
    public String a() {
        return this.f.getResources().getString(true != this.i ? R.string.UGC_EVENTS_END_DATE_TIME_PICKER_TITLE : R.string.UGC_EVENTS_START_DATE_TIME_PICKER_TITLE);
    }

    @Override // defpackage.cbrm
    public Boolean b() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.cbrm
    public TimePicker.OnTimeChangedListener c() {
        return new TimePicker.OnTimeChangedListener(this) { // from class: cbdu
            private final cbdw a;

            {
                this.a = this;
            }

            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
                cbdw cbdwVar = this.a;
                if (i < 0 || i > 23) {
                    bvoo.h("Invalid hour value: %d", Integer.valueOf(i));
                }
                if (i2 < 0 || i2 > 59) {
                    bvoo.h("Invalid minute value: %d", Integer.valueOf(i2));
                }
                dpvh bZ = dpvi.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpvi dpviVar = (dpvi) bZ.b;
                int i3 = dpviVar.a | 8;
                dpviVar.a = i3;
                dpviVar.e = i;
                dpviVar.a = i3 | 16;
                dpviVar.f = i2;
                cbdwVar.e = bZ.bK();
            }
        };
    }

    @Override // defpackage.cbrm
    public Boolean d() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.cbrm
    public cqkl e() {
        this.l.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.cbrm
    public cqkl f() {
        this.d = this.e;
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
        this.l.dismiss();
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.l = new gdf(this.f, false);
        dpvi dpviVar = this.d;
        if (dpviVar == null) {
            dpviVar = this.g.a();
        }
        this.e = dpviVar;
        gdf gdfVar = this.l;
        cqkf c = this.h.c(new cbpg(dpviVar.e, dpviVar.f), null);
        c.e(this);
        this.l.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        gdfVar.setContentView(c.c());
        this.l.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: cbdv
            private final cbdw a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                cbdw cbdwVar = this.a;
                if (!cbdwVar.b || cbdwVar.d != null) {
                    return;
                }
                cbdwVar.d = cbdwVar.e;
                Runnable runnable = cbdwVar.c;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }
        });
        this.l.show();
    }
}
