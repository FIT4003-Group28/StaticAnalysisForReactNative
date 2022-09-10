package defpackage;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import android.widget.TimePicker;
/* compiled from: PG */
/* renamed from: bwak  reason: default package */
/* loaded from: classes4.dex */
public final class bwak extends bvwn<dmgk> {
    public final bvws b;
    private final gga c;

    public bwak(gga ggaVar, bvws bvwsVar) {
        super(dmgk.c);
        this.c = ggaVar;
        this.b = bvwsVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmgk dmgkVar) {
        dqjj dqjjVar = dmgkVar.a;
        if (dqjjVar == null) {
            dqjjVar = dqjj.e;
        }
        new TimePickerDialog(this.c, new TimePickerDialog.OnTimeSetListener(this) { // from class: bwaj
            private final bwak a;

            {
                this.a = this;
            }

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                bvws bvwsVar = this.a.b;
                dmdc bZ = dmdd.c.bZ();
                dqji bZ2 = dqjj.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dqjj dqjjVar2 = (dqjj) bZ2.b;
                int i3 = dqjjVar2.a | 1;
                dqjjVar2.a = i3;
                dqjjVar2.b = i;
                dqjjVar2.a = i3 | 2;
                dqjjVar2.c = i2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmdd dmddVar = (dmdd) bZ.b;
                dqjj bK = bZ2.bK();
                bK.getClass();
                dmddVar.b = bK;
                dmddVar.a |= 1;
                bvwsVar.b(bZ.bK(), dmdd.d);
            }
        }, dqjjVar.b, dqjjVar.c, DateFormat.is24HourFormat(this.c)).show();
    }
}
