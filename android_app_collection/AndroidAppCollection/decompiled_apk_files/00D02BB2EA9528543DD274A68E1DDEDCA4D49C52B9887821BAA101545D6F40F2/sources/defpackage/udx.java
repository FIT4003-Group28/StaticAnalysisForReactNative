package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: udx  reason: default package */
/* loaded from: classes7.dex */
public final class udx extends FrameLayout {
    private final eif a;

    public udx(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(int i, cqmp<T>... cqmpVarArr) {
        double d = i;
        return b(cqrp.d(d), cqrp.d(d), cqrp.d(i >> 1), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqrp cqrpVar, cqrp cqrpVar2, cqrp cqrpVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.ce(cqrpVar), cqgr.bq(cqrpVar2), cqgr.x(cqtt.l(ibm.i(), cqrpVar3)));
        gs.f(cqmpVarArr);
        return gs;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return new cqmh(udx.class, cqmpVarArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b(this);
    }

    public udx(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public udx(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new eif();
    }
}
