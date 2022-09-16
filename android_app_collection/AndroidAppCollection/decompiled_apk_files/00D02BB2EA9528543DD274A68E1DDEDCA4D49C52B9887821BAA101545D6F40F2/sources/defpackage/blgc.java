package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: blgc  reason: default package */
/* loaded from: classes3.dex */
public final class blgc extends ccam {
    static final cqkv d = new blgd();
    public cqrp a;
    public cqrp b;
    public float c;
    private final Context l;

    public blgc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = cqrp.f(16.0d);
        this.b = cqrp.f(24.0d);
        this.c = 0.5f;
        this.l = context;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(blgc.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, Float> cqlcVar) {
        return cqjv.g(blgb.HEIGHT_HINT, cqlcVar, d);
    }

    public static <T extends cqkp> cqnf<T> c(@dzsi cqrp cqrpVar) {
        return cqjv.i(blgb.MIN_TEXT_SIZE, cqrpVar, d);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi cqrp cqrpVar) {
        return cqjv.i(blgb.MAX_TEXT_SIZE, cqrpVar, d);
    }

    private final void e(int i, int i2, int i3) {
        setTextSize(0, i);
        super.onMeasure(i2, i3);
    }

    @Override // defpackage.ccam, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 23) {
            setBreakStrategy(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ccam, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getText().length() == 0 || getLayout().getWidth() <= 0) {
            return;
        }
        int i3 = (int) (this.l.getResources().getDisplayMetrics().heightPixels * this.c);
        int e = this.a.e(this.l);
        int e2 = this.b.e(this.l) + 1;
        int i4 = e2;
        while (e + 1 < e2) {
            i4 = ((e2 - e) / 2) + e;
            e(i4, i, i2);
            if (getLayout().getHeight() >= i3) {
                e2 = i4;
            } else {
                e = i4;
            }
        }
        if (e == i4) {
            return;
        }
        e(e, i, i2);
    }
}
