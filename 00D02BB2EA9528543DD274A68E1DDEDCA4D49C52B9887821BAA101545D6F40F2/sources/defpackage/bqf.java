package defpackage;

import android.graphics.Rect;
import android.text.format.DateFormat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.maps.R;
import java.util.Calendar;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqf  reason: default package */
/* loaded from: classes4.dex */
public class bqf extends ams {
    final /* synthetic */ bqi f;
    private final Rect g;
    private final Calendar h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqf(bqi bqiVar, View view) {
        super(view);
        this.f = bqiVar;
        this.g = new Rect();
        this.h = Calendar.getInstance();
    }

    protected void B(int i, Rect rect) {
        int i2 = this.f.i();
        int d = this.f.d();
        bqi bqiVar = this.f;
        int i3 = bqiVar.v;
        int i4 = bqiVar.t;
        int i5 = bqiVar.i();
        int j = bqiVar.j();
        bqi bqiVar2 = this.f;
        int i6 = (i4 - (i5 + j)) / bqiVar2.A;
        int h = (i - 1) + bqiVar2.h();
        bqi bqiVar3 = this.f;
        int i7 = bqiVar3.A;
        int i8 = h / i7;
        int i9 = h % i7;
        if (bqiVar3.a()) {
            i9 = (bqiVar3.A - 1) - i9;
        }
        int i10 = i2 + (i9 * i6);
        int i11 = d + (i8 * i3);
        rect.set(i10, i11, i6 + i10, i3 + i11);
    }

    protected CharSequence C(int i) {
        Calendar calendar = this.h;
        bqi bqiVar = this.f;
        calendar.set(bqiVar.s, bqiVar.r, i);
        CharSequence format = DateFormat.format("dd MMMM yyyy", this.h.getTimeInMillis());
        bqi bqiVar2 = this.f;
        return i == bqiVar2.x ? bqiVar2.getContext().getString(R.string.item_is_selected, format) : format;
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        bqa l = this.f.l(f, f2);
        if (l != null) {
            return l.c;
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ams
    protected void v(List<Integer> list) {
        for (int i = 1; i <= this.f.B; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.ams
    protected final void w(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(C(i));
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        B(i, this.g);
        pcVar.G(C(i));
        pcVar.k(this.g);
        pcVar.f(16);
        pcVar.f(32);
        if (i == this.f.x) {
            pcVar.S();
        }
    }

    @Override // defpackage.ams
    protected final boolean z(int i, int i2) {
        if (i2 == 16) {
            bqi bqiVar = this.f;
            bqiVar.m(new bqa(bqiVar.s, bqiVar.r, i));
            return true;
        } else if (i2 != 32) {
            return false;
        } else {
            bqi bqiVar2 = this.f;
            bqiVar2.n(new bqa(bqiVar2.s, bqiVar2.r, i));
            return true;
        }
    }
}
