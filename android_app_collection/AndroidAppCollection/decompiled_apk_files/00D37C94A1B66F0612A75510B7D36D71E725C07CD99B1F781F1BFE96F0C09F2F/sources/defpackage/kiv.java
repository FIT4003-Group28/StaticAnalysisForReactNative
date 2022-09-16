package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: kiv  reason: default package */
/* loaded from: classes3.dex */
public final class kiv extends aizc implements xge, fgd {
    public final Context a;
    public final ajmy b;
    public ViewGroup c;
    public xgd d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    private TextView j;
    private ViewGroup k;
    private TextView[] l;
    private View m;
    private View n;
    private TextView o;
    private TextView p;
    private Drawable q;
    private Drawable r;
    private xhk s;
    private final kiu t;
    private boolean u;
    private boolean v;

    public kiv(Context context, ajmy ajmyVar) {
        super(context);
        this.i = 2;
        this.a = context;
        this.b = ajmyVar;
        this.t = new kiu(this, context);
        f();
    }

    private final boolean q(int i) {
        if (this.c == null) {
            return false;
        }
        TextView[] textViewArr = this.l;
        int length = textViewArr.length;
        return i < 5 && textViewArr[i].isSelected();
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.xge
    public final void d() {
        this.v = true;
        m();
    }

    public final void e() {
        if (this.d == null) {
            return;
        }
        int[] iArr = new int[this.f];
        int i = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (q(i2)) {
                iArr[i] = i2;
                i++;
            }
        }
        this.d.b(Arrays.copyOf(iArr, i));
    }

    @Override // defpackage.xge
    public final void f() {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.s.a();
            this.m.setVisibility(8);
            this.n.setVisibility(8);
        }
        this.u = false;
        this.v = false;
        this.g = 0;
        this.h = 0;
        setVisibility(8);
    }

    @Override // defpackage.xge
    public final void g(xgd xgdVar) {
        this.d = xgdVar;
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        float dimension;
        float dimension2;
        if (ezxVar.k()) {
            if (this.c == null) {
                return;
            }
            this.j.setVisibility(0);
            this.k.setVisibility(8);
            return;
        }
        if (this.c != null) {
            this.j.setVisibility(8);
            this.k.setVisibility(0);
        }
        kiu kiuVar = this.t;
        if (kiuVar == null) {
            return;
        }
        boolean b = ezxVar.b();
        if (kiuVar.b == null) {
            return;
        }
        if (b) {
            dimension = kiuVar.h.a.getResources().getDimension(R.dimen.large_font_size);
        } else if (zew.y(kiuVar.h.a)) {
            dimension = kiuVar.h.a.getResources().getDimension(R.dimen.medium_font_size);
        } else {
            dimension = kiuVar.h.a.getResources().getDimension(R.dimen.small_font_size);
        }
        if (b) {
            dimension2 = kiuVar.h.a.getResources().getDimension(R.dimen.large_font_size);
        } else {
            dimension2 = kiuVar.h.a.getResources().getDimension(R.dimen.medium_font_size);
        }
        kiuVar.c.setTextSize(0, dimension);
        kiuVar.d.setTextSize(0, dimension2);
    }

    public final void i(int i, boolean z) {
        if (this.c != null) {
            TextView[] textViewArr = this.l;
            int length = textViewArr.length;
            if (i >= 5) {
                return;
            }
            textViewArr[i].setSelected(z);
            if (this.e) {
                kz.u(this.l[i], null, null, z ? this.q : this.r);
            } else {
                this.l[i].setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Override // defpackage.xge
    public final void j(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xge
    public final void k() {
        this.s.b(true, false);
    }

    @Override // defpackage.xge
    public final void l(int i) {
        if (this.c == null) {
            return;
        }
        this.p.setText(this.c.getResources().getString(R.string.survey_attribution, zgh.i((int) Math.ceil(i / 1000.0f))));
    }

    public final void m() {
        int i;
        boolean z;
        int i2 = 0;
        this.u = false;
        int i3 = 0;
        while (true) {
            i = this.f;
            z = true;
            if (i3 >= i) {
                break;
            }
            if (!this.u && !q(i3)) {
                z = false;
            }
            this.u = z;
            i3++;
        }
        if (!this.u && (!this.e || !q(i))) {
            z = false;
        }
        this.u = z;
        if (this.c != null) {
            this.n.setVisibility((!z || !this.e) ? 8 : 0);
            View view = this.m;
            if (!this.v || this.u) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[LOOP:0: B:22:0x0107->B:24:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiv.n(int):void");
    }

    @Override // defpackage.xge
    public final void o(String str, List list, boolean z, int i) {
        n(i);
        f();
        this.e = z;
        this.f = list.size();
        this.j.setText(str);
        this.o.setText(str);
        int size = list.size();
        int i2 = 0;
        while (true) {
            int length = this.l.length;
            if (i2 < 5) {
                if (i2 < list.size()) {
                    this.l[i2].setText((CharSequence) list.get(i2));
                    this.l[i2].setVisibility(0);
                } else if (i2 != size || !z) {
                    this.l[i2].setVisibility(4);
                } else {
                    this.l[i2].setText(R.string.survey_none_of_the_above);
                    this.l[i2].setVisibility(0);
                }
                i(i2, false);
                i2++;
            } else {
                this.c.setVisibility(0);
                return;
            }
        }
    }

    @Override // defpackage.xge
    public final kiu p() {
        return this.t;
    }
}
