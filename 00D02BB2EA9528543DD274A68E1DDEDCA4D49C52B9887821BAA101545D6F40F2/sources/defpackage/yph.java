package defpackage;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import com.google.android.apps.maps.R;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: yph  reason: default package */
/* loaded from: classes7.dex */
public class yph implements Serializable, DatePickerDialog.OnDateSetListener, ynn {
    public static final /* synthetic */ int h = 0;
    public final bvrt<dwao> a;
    public final ypg b;
    public final ype c;
    @dzsi
    public transient DatePickerDialog d;
    public boolean e;
    public transient zrz f;
    public boolean g;
    private final boolean i;
    private transient cqat j;
    private transient cqkj k;
    @dzsi
    private transient Runnable l;

    private yph(dwao dwaoVar, long j, boolean z, boolean z2, dqvj dqvjVar) {
        this.a = bvrt.b(dwaoVar);
        this.b = new ypg(vxr.a(dwaoVar), new ypf(this), dqvjVar);
        this.c = new ype(this, j, z2);
        this.i = z;
    }

    public static int q(vxr vxrVar) {
        vxr vxrVar2 = vxr.DEPARTURE_TIME;
        int ordinal = vxrVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? R.id.departat_button : R.id.lastavailable_button : R.id.arriveby_button;
    }

    public static yph r(dwao dwaoVar, long j, boolean z, boolean z2, dqvj dqvjVar, cqat cqatVar, cqkj cqkjVar, cqhu cqhuVar, zrz zrzVar) {
        yph yphVar = new yph(dwaoVar, j, z, z2, dqvjVar);
        yphVar.s(cqatVar, cqkjVar, cqhuVar, zrzVar);
        return yphVar;
    }

    private final String z() {
        int i;
        if (this.b.k().booleanValue()) {
            i = ddcu.ah.a;
        } else {
            i = ddcu.ai.a;
        }
        return cjrx.a(i);
    }

    @Override // defpackage.ynn
    public zed a() {
        return this.b;
    }

    @Override // defpackage.ynn
    public Integer b() {
        return Integer.valueOf(this.c.e());
    }

    @Override // defpackage.ynn
    public Integer c() {
        return Integer.valueOf(this.c.f());
    }

    @Override // defpackage.ynn
    public jej d() {
        return new jej(this.c.b(), this.c.c(), this.c.d());
    }

    @Override // defpackage.ynn
    public Boolean e() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.ynn
    public Boolean f() {
        return Boolean.valueOf(t() != vxr.LAST_AVAILABLE);
    }

    @Override // defpackage.ynn
    public Boolean g() {
        return Boolean.valueOf(t() != vxr.LAST_AVAILABLE);
    }

    @Override // defpackage.ynn
    public zvr h() {
        final ype ypeVar = this.c;
        ypeVar.getClass();
        return new zvr(ypeVar) { // from class: yoy
            private final ype a;

            {
                this.a = ypeVar;
            }

            @Override // defpackage.zvr
            public final void a(int i, int i2, int i3) {
                this.a.a(i, i2, i3);
            }
        };
    }

    @Override // defpackage.ynn
    public zvs i() {
        return new zvs(this) { // from class: yoz
            private final yph a;

            {
                this.a = this;
            }

            @Override // defpackage.zvs
            public final void a(int i, int i2, int i3) {
                this.a.v(i, i2, i3);
            }
        };
    }

    @Override // defpackage.ynn
    public TimePicker.OnTimeChangedListener j() {
        return new TimePicker.OnTimeChangedListener(this) { // from class: yox
            private final yph a;

            {
                this.a = this;
            }

            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
                ype ypeVar = this.a.c;
                if (ypeVar.c.g) {
                    return;
                }
                if (ypeVar.e() == i && ypeVar.f() == i2) {
                    return;
                }
                ypeVar.a.set(11, i);
                ypeVar.a.set(12, i2);
                ypeVar.b = false;
                ypeVar.c.u();
            }
        };
    }

    @Override // defpackage.ynn
    public cqkl k() {
        this.b.h(q(vxr.DEPARTURE_TIME));
        ype ypeVar = this.c;
        long d = vxb.d(vxb.b(this.j.b()));
        if (ypeVar.a.getTimeInMillis() != d || !ypeVar.b) {
            ypeVar.a.setTimeInMillis(d);
            ypeVar.b = true;
            ypeVar.c.u();
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ynn
    public View.OnClickListener l() {
        return new View.OnClickListener(this) { // from class: ypa
            private final yph a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r13) {
                /*
                    Method dump skipped, instructions count: 481
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ypa.onClick(android.view.View):void");
            }
        };
    }

    @Override // defpackage.ynn
    public View.OnClickListener m() {
        return new View.OnClickListener(this) { // from class: ypb
            private final yph a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f.x();
            }
        };
    }

    @Override // defpackage.ynn
    public cjtd n() {
        cjta b = cjtd.b();
        b.d = dtxn.U;
        b.g(z());
        return b.a();
    }

    @Override // defpackage.ynn
    public cjtd o() {
        cjta b = cjtd.b();
        b.d = dtxn.S;
        b.g(z());
        return b.a();
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.c.a(i, i2, i3);
        this.e = false;
        DatePickerDialog datePickerDialog = this.d;
        if (datePickerDialog != null) {
            datePickerDialog.dismiss();
            this.d = null;
        }
    }

    @Override // defpackage.ynn
    public cjtd p() {
        cjta b = cjtd.b();
        b.d = dtxn.Q;
        b.g(z());
        return b.a();
    }

    public void s(cqat cqatVar, cqkj cqkjVar, cqhu cqhuVar, zrz zrzVar) {
        this.j = cqatVar;
        this.k = cqkjVar;
        this.f = zrzVar;
        this.l = new ypc(this);
    }

    public final vxr t() {
        return this.b.i();
    }

    public final void u() {
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(int i, int i2, int i3) {
        this.e = true;
        jem jemVar = new jem(this.k.d, this, i, i2, i3);
        this.d = jemVar;
        jemVar.setOnCancelListener(new ypd(this));
        this.d.show();
    }

    public void w() {
        DatePickerDialog datePickerDialog = this.d;
        if (datePickerDialog == null || !datePickerDialog.isShowing()) {
            return;
        }
        this.d.dismiss();
        this.d = null;
    }

    public void x() {
        if (!this.e || this.d != null) {
            return;
        }
        v(this.c.b(), this.c.c(), this.c.d());
    }

    public void y(boolean z) {
        this.g = z;
    }
}
