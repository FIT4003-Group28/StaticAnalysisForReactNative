package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zww  reason: default package */
/* loaded from: classes7.dex */
public final class zww extends jgq {
    public static final cqkv c = new zwx();
    private int d;
    private int e;
    @dzsi
    private TextView f;

    public zww(Context context) {
        super(context);
    }

    private final int l(int i, int i2, int i3) {
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof zxb) {
                zxb zxbVar = (zxb) childAt;
                if (zxbVar.n()) {
                    if (view == null) {
                        zxbVar.m(i);
                        childAt.setVisibility(0);
                        measureChild(childAt, i2, i3);
                        if (childAt.getMeasuredWidth() > 0) {
                            view = childAt;
                        }
                    }
                    zxbVar.k();
                    childAt.setVisibility(8);
                }
            }
        }
        if (view != null) {
            i4 = view.getMeasuredWidth();
        }
        return i - i4;
    }

    private final int m(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = this.e + i5;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof zxb) {
                zxb zxbVar = (zxb) childAt;
                if (zxbVar.n()) {
                    if (childAt.getMeasuredWidth() + i5 <= i6) {
                        childAt.setVisibility(0);
                    } else {
                        if (i2 > i6) {
                            int i9 = i - 1;
                            zxbVar.m((i2 / Math.min(i, this.e <= 0 ? Integer.MAX_VALUE : i2 / i6)) - i5);
                            childAt.setVisibility(0);
                            measureChild(childAt, i3, i4);
                            int measuredWidth = childAt.getMeasuredWidth();
                            if (measuredWidth > 0) {
                                i2 -= measuredWidth + i5;
                                i = i9;
                            } else {
                                zxbVar.k();
                                i = i9;
                            }
                        }
                        childAt.setVisibility(8);
                        if (i7 == 0) {
                            TextView textView = this.f;
                            if (textView != null && textView.getVisibility() != 0) {
                                this.f.setVisibility(0);
                                i2 -= this.f.getMeasuredWidth() + i5;
                            }
                            i7 = 0;
                        }
                        i7++;
                    }
                }
            }
        }
        n(this.d + i7);
        return i2;
    }

    private final void n(int i) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(getContext().getResources().getQuantityString(R.plurals.TRANSIT_STATION_ADDITIONAL_LINES_COUNT, i, Integer.valueOf(i)));
        }
    }

    @Override // defpackage.jgq
    protected final void g() {
        super.h();
        View d = d();
        this.f = d instanceof TextView ? (TextView) d : null;
        n(999);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof zxb) {
                ((zxb) childAt).k();
            }
        }
    }

    @Override // defpackage.jgq
    protected final int i(int i, int i2, int i3, int i4) {
        int m;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        int i5 = this.a;
        int i6 = this.e + i5;
        int i7 = i3 + i5;
        int i8 = i4 + i5;
        int i9 = i6;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if ((childAt instanceof zxb) && ((zxb) childAt).n()) {
                i10++;
                int measuredWidth = childAt.getMeasuredWidth() + i5;
                i11 += measuredWidth;
                if (measuredWidth <= i6) {
                    i12 += measuredWidth;
                    i9 = Math.min(measuredWidth, i9);
                } else {
                    i13++;
                }
            }
        }
        if (i10 == 0) {
            return i8;
        }
        int i14 = i7 - (i8 - i11);
        TextView textView = this.f;
        boolean z = textView == null || textView.getVisibility() == 0;
        TextView textView2 = this.f;
        int measuredWidth2 = z ? i14 : i14 - (textView2 == null ? 0 : textView2.getMeasuredWidth() + this.a);
        if (!z) {
            if (i10 == 1) {
                int i15 = i7 - i5;
                return i15 - l(i15, makeMeasureSpec, i2);
            } else if ((i13 * i6) + i12 <= i14 && (m = m(i13, i14 - i12, makeMeasureSpec, i2)) >= 0) {
                return (i7 - i5) - m;
            }
        }
        TextView textView3 = this.f;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if (i9 > measuredWidth2) {
            int l = l(measuredWidth2, makeMeasureSpec, i2);
            n((this.d + i10) - 1);
            return (i7 - i5) - l;
        } else if (i6 + i12 > measuredWidth2) {
            int i16 = this.a;
            int i17 = 0;
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                View childAt2 = getChildAt(i18);
                if ((childAt2 instanceof zxb) && ((zxb) childAt2).n()) {
                    int measuredWidth3 = childAt2.getMeasuredWidth() + i16;
                    if (measuredWidth3 > Math.min(measuredWidth2, this.e + i16)) {
                        childAt2.setVisibility(8);
                        i17++;
                    } else {
                        childAt2.setVisibility(0);
                        measuredWidth2 -= measuredWidth3;
                    }
                }
            }
            n(this.d + i17);
            return (i7 - i5) - measuredWidth2;
        } else {
            return (i7 - i5) - m(i13, measuredWidth2 - i12, makeMeasureSpec, i2);
        }
    }

    public void setAdditionalLineCount(int i) {
        this.d = i;
    }

    public void setSoftMinimumLineWidth(cqtv cqtvVar) {
        this.e = cqtvVar.e(getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jgq
    public final int a(int i) {
        TextView textView = this.f;
        if (this.d == 0 || textView == null) {
            return super.a(i);
        }
        int a = super.a(i);
        textView.setVisibility(0);
        int measuredWidth = a + this.a + textView.getMeasuredWidth();
        if (measuredWidth <= i) {
            n(this.d);
        }
        return measuredWidth;
    }
}
