package defpackage;

import android.widget.NumberPicker;
/* compiled from: PG */
/* renamed from: vxa  reason: default package */
/* loaded from: classes4.dex */
final class vxa implements NumberPicker.OnValueChangeListener {
    final /* synthetic */ vxb a;
    private final /* synthetic */ int b;

    public vxa(vxb vxbVar) {
        this.a = vxbVar;
    }

    public vxa(vxb vxbVar, int i) {
        this.b = i;
        this.a = vxbVar;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            int i4 = 11;
            if (i2 == 0) {
                if (i == 11) {
                    this.a.af.add(2, 1);
                    this.a.aF();
                }
                i2 = 0;
            }
            if (i2 != 11) {
                i4 = i2;
            } else if (i == 0) {
                this.a.af.add(2, -1);
                this.a.aF();
            }
            this.a.af.add(2, i4 - i);
            this.a.aF();
        } else if (i3 == 1) {
            int actualMaximum = this.a.af.getActualMaximum(5);
            int aE = this.a.aE();
            if (i2 == 1) {
                if (i == actualMaximum) {
                    this.a.af.add(5, 1);
                    this.a.aF();
                }
                i2 = 1;
            }
            if (i2 != aE || i != 1) {
                this.a.af.add(5, i2 - i);
            } else {
                this.a.af.add(5, -1);
            }
            this.a.aF();
        } else {
            this.a.af.add(1, i2 - i);
            this.a.aF();
        }
    }
}
