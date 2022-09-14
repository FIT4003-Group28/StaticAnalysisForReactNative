package defpackage;

import android.widget.CalendarView;
import android.widget.DatePicker;
/* compiled from: PG */
/* renamed from: aenw  reason: default package */
/* loaded from: classes2.dex */
public class aenw implements aenh {
    private final aenv a;
    private eapg b;
    private eapg c;
    private eapg d;

    public aenw(aenv aenvVar, eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        this.a = aenvVar;
        this.b = eapgVar;
        this.c = eapgVar2;
        this.d = eapgVar3;
    }

    @Override // defpackage.aenh
    public CalendarView.OnDateChangeListener a() {
        return new CalendarView.OnDateChangeListener(this) { // from class: aent
            private final aenw a;

            {
                this.a = this;
            }

            @Override // android.widget.CalendarView.OnDateChangeListener
            public final void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
                this.a.f(i, i2, i3);
            }
        };
    }

    @Override // defpackage.aenh
    public DatePicker.OnDateChangedListener b() {
        return new DatePicker.OnDateChangedListener(this) { // from class: aenu
            private final aenw a;

            {
                this.a = this;
            }

            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
                this.a.f(i, i2, i3);
            }
        };
    }

    @Override // defpackage.aenh
    public Long c() {
        return Long.valueOf(this.b.n().getTime());
    }

    @Override // defpackage.aenh
    public Long d() {
        return Long.valueOf(this.c.n().getTime());
    }

    @Override // defpackage.aenh
    public Long e() {
        return Long.valueOf(this.d.n().getTime());
    }

    public final void f(int i, int i2, int i3) {
        eapg eapgVar = new eapg(i, i2 + 1, i3);
        this.d = eapgVar;
        aeog aeogVar = (aeog) this.a;
        aeok aeokVar = aeogVar.a;
        if (aeokVar.e != 0 || eapgVar.equals(aeokVar.f.c)) {
            aeok aeokVar2 = aeogVar.a;
            if (aeokVar2.e != 1 || eapgVar.equals(aeokVar2.f.d)) {
                return;
            }
            aeogVar.a.m = true;
            aeok aeokVar3 = aeogVar.a;
            aeokVar3.f = new aehu(aeokVar3.f.c, eapgVar);
            aeogVar.a.c.i(eapgVar);
            cqkx.p(aeogVar.a);
            return;
        }
        aeogVar.a.m = true;
        aeok aeokVar4 = aeogVar.a;
        aeokVar4.f = aeokVar4.f.a(eapgVar);
        aeok aeokVar5 = aeogVar.a;
        eapg eapgVar2 = aeokVar5.f.d;
        aeokVar5.b.i(eapgVar);
        aeogVar.a.c.i(eapgVar2);
        if (aeok.a) {
            cqkx.p(aeogVar.a);
        } else {
            aeogVar.a.m(1, aehu.g(eapgVar), aehu.f(eapgVar), eapgVar2);
        }
    }

    public void g(eapg eapgVar, eapg eapgVar2, eapg eapgVar3) {
        dbsk.s(eapgVar3);
        dbsk.s(eapgVar);
        dbsk.s(eapgVar2);
        this.d = eapgVar3;
        this.b = eapgVar;
        this.c = eapgVar2;
    }
}
