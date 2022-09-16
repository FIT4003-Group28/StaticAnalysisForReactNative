package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lho  reason: default package */
/* loaded from: classes3.dex */
final class lho extends xo {
    public final xo d;
    final /* synthetic */ lhp e;

    public lho(lhp lhpVar, xo xoVar) {
        this.e = lhpVar;
        this.d = xoVar;
    }

    private final void w(yo yoVar) {
        View view = yoVar.a;
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView == null || this.e.am == null) {
            return;
        }
        if (textView.getText().toString().equals(this.e.am.toString())) {
            Context rb = this.e.rb();
            rb.getClass();
            view.setBackgroundColor(zhn.d(rb, R.attr.yt10PercentLayer));
            return;
        }
        textView.setTextColor(true != this.e.ai.a().equals(gfs.DARK) ? -16777216 : -1);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return this.d.c(i);
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        return ((bjw) this.d).f(viewGroup, i);
    }

    @Override // defpackage.xo
    public final int jT(xo xoVar, yo yoVar, int i) {
        return this.d.jT(xoVar, yoVar, i);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        return this.d.mp(i);
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        this.d.o(yoVar, i);
        w(yoVar);
    }

    @Override // defpackage.xo
    public final void p(yo yoVar) {
    }

    @Override // defpackage.xo
    public final void r() {
    }

    @Override // defpackage.xo
    public final void s(yo yoVar, int i) {
        this.d.o(yoVar, i);
        w(yoVar);
    }

    @Override // defpackage.xo
    public final void t() {
    }

    @Override // defpackage.xo
    public final void u(lg lgVar) {
        this.d.u(lgVar);
    }

    @Override // defpackage.xo
    public final void v(lg lgVar) {
        this.d.v(lgVar);
    }
}
