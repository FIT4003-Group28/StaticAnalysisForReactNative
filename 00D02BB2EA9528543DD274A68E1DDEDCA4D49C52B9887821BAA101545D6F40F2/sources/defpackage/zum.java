package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: zum  reason: default package */
/* loaded from: classes7.dex */
public final class zum extends GmmRecyclerView {
    private boolean S;
    private int T;
    private int U;

    public zum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = false;
        this.T = -1;
        this.U = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        if (this.S) {
            abg abgVar = this.k;
            if (abgVar == null) {
                this.T = -1;
                this.U = -1;
                return;
            }
            int y = zut.y(this);
            int c = abgVar.c();
            boolean z2 = true;
            if (!z && y == this.T && c == this.U) {
                z2 = false;
            }
            if (y != -1 && z2) {
                int paddingTop = (i4 - i2) - getPaddingTop();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((i3 - i) - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i5 = 0;
                for (int i6 = c - 1; i6 >= y; i6--) {
                    abs absVar = this.l;
                    abg abgVar2 = this.k;
                    if (absVar == null || abgVar2 == null) {
                        measuredHeight = getMeasuredHeight();
                    } else {
                        View aK = absVar.aK(i6);
                        if (aK != null) {
                            aK.measure(makeMeasureSpec, makeMeasureSpec2);
                            measuredHeight = aK.getMeasuredHeight();
                        } else {
                            int i7 = abgVar2.i(i6);
                            acl b = e().b(i7);
                            if (b == null) {
                                try {
                                    b = abgVar2.g(this, i7);
                                } catch (Throwable th) {
                                    if (b != null) {
                                        e().c(b);
                                    }
                                    throw th;
                                }
                            }
                            abgVar2.h(b, i6);
                            b.a.measure(makeMeasureSpec, makeMeasureSpec2);
                            measuredHeight = b.a.getMeasuredHeight();
                            if (b != null) {
                                e().c(b);
                            }
                        }
                    }
                    i5 += measuredHeight;
                    if (i5 >= paddingTop) {
                        break;
                    }
                }
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), Math.max(paddingTop - i5, 0));
            }
            this.T = y;
            this.U = c;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(@dzsi abs absVar) {
        boolean z;
        this.S = false;
        if (!(absVar instanceof aag) || ((aag) absVar).i != 1) {
            z = false;
        } else {
            this.S = true;
            z = true;
        }
        if (absVar != null && !z) {
            aegg aeggVar = zut.a;
            bvoo.h("BottomPaddingRecyclerView given incompatible LayoutManager %s", absVar);
        }
        super.setLayoutManager(absVar);
    }
}
