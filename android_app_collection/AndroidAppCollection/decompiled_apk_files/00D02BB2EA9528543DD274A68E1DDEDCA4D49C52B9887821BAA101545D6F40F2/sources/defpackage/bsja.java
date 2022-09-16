package defpackage;

import android.widget.NumberPicker;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsja  reason: default package */
/* loaded from: classes4.dex */
public class bsja implements bsgy {
    public int a;
    private final dcdc<String> b;
    private final cjtd c;
    private final NumberPicker.OnValueChangeListener d = new NumberPicker.OnValueChangeListener(this) { // from class: bsiz
        private final bsja a;

        {
            this.a = this;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
            this.a.a = i2;
        }
    };

    public bsja(int i, boolean z, List<String> list, cjtd cjtdVar) {
        boolean z2 = true;
        if (i < 0 || (i >= list.size() && !list.isEmpty())) {
            z2 = false;
        }
        dbsk.m(z2, "selectedIndex is in invalid range.");
        this.a = i;
        this.b = dcdc.r(list);
        this.c = cjtdVar;
    }

    @Override // defpackage.bsgy
    public Integer a() {
        return 0;
    }

    @Override // defpackage.bsgy
    public Integer b() {
        return Integer.valueOf(this.b.size() - 1);
    }

    @Override // defpackage.bsgy
    public NumberPicker.OnValueChangeListener c() {
        return this.d;
    }

    @Override // defpackage.bsgy
    public Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.bsgy
    public List<String> e() {
        return this.b;
    }

    @Override // defpackage.bsgy
    public Boolean f() {
        return false;
    }

    @Override // defpackage.bsgy
    public cjtd g() {
        return this.c;
    }
}
