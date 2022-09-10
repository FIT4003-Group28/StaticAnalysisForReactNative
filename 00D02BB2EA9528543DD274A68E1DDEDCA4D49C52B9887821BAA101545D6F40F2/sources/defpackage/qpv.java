package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* compiled from: PG */
/* renamed from: qpv  reason: default package */
/* loaded from: classes7.dex */
public final class qpv extends zxc {
    public static final cqkv c = new qpx();
    private static final qpr i = qpp.a;
    public dcdc<View> d;
    public float e;
    @dzsi
    public acnw f;
    public boolean g;
    public cjqy h;
    private final int j;
    private int k;
    private final Paint l;
    private qpr m;
    private int n;

    public qpv(Context context) {
        super(context);
        this.k = 0;
        this.m = i;
        this.d = dcdc.e();
        this.n = -1;
        this.e = -1.0f;
        this.g = false;
        ((qpw) bttc.a(qpw.class, this)).wE(this);
        this.j = cqrp.d(2.0d).e(context);
        Paint paint = new Paint();
        this.l = paint;
        paint.setColor(ibm.x().b(context));
    }

    private static int n(int i2, int i3, float f) {
        return i2 + ((int) ((i3 - i2) * f));
    }

    private final void o(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.d.size()) {
            return;
        }
        this.d.get(i2).setSelected(z);
    }

    @Override // defpackage.zxc, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int n;
        int i2;
        super.dispatchDraw(canvas);
        if (this.d.size() > 1) {
            float f = this.e;
            if (f < 0.0f || f > this.d.size() - 1) {
                return;
            }
            float f2 = this.e;
            int i3 = (int) f2;
            float f3 = f2 - i3;
            if (f3 == 0.0f) {
                View view = this.d.get(i3);
                i2 = view.getLeft();
                n = view.getRight();
            } else {
                View view2 = this.d.get(i3);
                View view3 = this.d.get(i3 + 1);
                int n2 = n(view2.getLeft(), view3.getLeft(), f3);
                n = n(view2.getRight(), view3.getRight(), f3);
                i2 = n2;
            }
            int i4 = this.k;
            canvas.drawRect(i2 + i4, getHeight() - this.j, n - i4, getHeight(), this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgq, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        dccx F = dcdc.F();
        dcdc<View> dcdcVar = this.b;
        int size = dcdcVar.size();
        final int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = dcdcVar.get(i5);
            if (this.m.a(view)) {
                view.setOnClickListener(new View.OnClickListener(this, i4) { // from class: qpo
                    private final qpv a;
                    private final int b;

                    {
                        this.a = this;
                        this.b = i4;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        qpv qpvVar = this.a;
                        int i6 = this.b;
                        View view3 = qpvVar.d.get(i6);
                        cjql e = cjqg.e(view3);
                        cjtd k = cjqg.k(view3);
                        if (e != null && k != null) {
                            qpvVar.h.j(e, k);
                        }
                        acnw acnwVar = qpvVar.f;
                        if (acnwVar != null) {
                            qpvVar.g = true;
                            acnwVar.a((int) qpvVar.e, i6, false, true);
                            qpvVar.g = false;
                        }
                    }
                });
                F.g(view);
                i4++;
            } else {
                view.setOnClickListener(null);
                view.setClickable(false);
            }
        }
        int i6 = (int) this.e;
        o(i6, false);
        this.d = F.f();
        o(i6, true);
    }

    public void setOnTabSelectedListener(@dzsi acnw acnwVar) {
        this.f = acnwVar;
    }

    public void setSelectorInset(cqtv cqtvVar) {
        this.k = cqtvVar.e(getContext());
    }

    public void setTabFilter(@dzsi qpr qprVar) {
        if (qprVar == null) {
            qprVar = i;
        }
        this.m = qprVar;
    }

    public void setSelectedPosition(float f) {
        int i2;
        if (!this.g) {
            int i3 = this.n;
            if (f < i3) {
                i2 = (int) Math.ceil(f);
                this.n = i2;
            } else {
                i2 = (int) f;
                this.n = i2;
            }
            if (i3 != i2) {
                o(i3, false);
                o(this.n, true);
                int i4 = this.n;
                if (i4 >= 0 && i4 < this.d.size()) {
                    View view = this.d.get(this.n);
                    requestChildFocus(view, view);
                }
            }
            this.e = f;
            invalidate();
        }
    }
}
