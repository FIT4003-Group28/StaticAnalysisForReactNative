package defpackage;

import android.widget.NumberPicker;
import java.util.List;
/* compiled from: PG */
/* renamed from: bopl  reason: default package */
/* loaded from: classes3.dex */
public class bopl implements boqp {
    public int a;
    @dzsi
    public final NumberPicker.OnValueChangeListener b;
    private final bokh c;
    private final int d;
    private int e;
    private final List<String> f;
    private Boolean g;
    private boolean h;
    @dzsi
    private NumberPicker.OnValueChangeListener i;

    public bopl(cqhn cqhnVar, bokh bokhVar, List<String> list, int i, int i2, Boolean bool, boolean z, @dzsi NumberPicker.OnValueChangeListener onValueChangeListener) {
        this.c = bokhVar;
        this.f = list;
        this.d = i;
        this.e = i2;
        this.a = bokhVar.a;
        this.g = bool;
        this.h = z;
        this.b = onValueChangeListener;
    }

    @Override // defpackage.boqp
    public List<String> a() {
        return this.f;
    }

    @Override // defpackage.boqp
    public Integer b() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.boqp
    public Integer c() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.boqp
    public Integer d() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.boqp
    public Boolean e() {
        return this.g;
    }

    @Override // defpackage.boqp
    public Boolean f() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.boqp
    public NumberPicker.OnValueChangeListener g() {
        if (this.i == null) {
            this.i = new NumberPicker.OnValueChangeListener(this) { // from class: bopk
                private final bopl a;

                {
                    this.a = this;
                }

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
                    bopl boplVar = this.a;
                    boplVar.a = i2;
                    NumberPicker.OnValueChangeListener onValueChangeListener = boplVar.b;
                    if (onValueChangeListener != null) {
                        onValueChangeListener.onValueChange(numberPicker, i, i2);
                    }
                }
            };
        }
        return this.i;
    }

    public void h() {
        this.a = this.c.a;
        cqkx.p(this);
    }

    public void i() {
        this.c.a = this.a;
    }

    public void j(boolean z) {
        this.h = z;
        cqkx.p(this);
    }

    public void k(int i) {
        this.a = i;
    }

    public void l(int i) {
        this.e = i;
    }

    public void m(boolean z) {
        this.g = Boolean.valueOf(z);
    }
}
