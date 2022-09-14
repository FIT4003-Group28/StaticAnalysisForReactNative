package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class i extends o {

    /* renamed from: d  reason: collision with root package name */
    private k f2116d;

    /* renamed from: e  reason: collision with root package name */
    private k f2117e;

    private float a(RecyclerView.o oVar, k kVar) {
        int e2 = oVar.e();
        if (e2 == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < e2; i3++) {
            View d2 = oVar.d(i3);
            int l = oVar.l(d2);
            if (l != -1) {
                if (l < i) {
                    view = d2;
                    i = l;
                }
                if (l > i2) {
                    view2 = d2;
                    i2 = l;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(kVar.a(view), kVar.a(view2)) - Math.min(kVar.d(view), kVar.d(view2));
        if (max != 0) {
            return (max * 1.0f) / ((i2 - i) + 1);
        }
        return 1.0f;
    }

    private int a(RecyclerView.o oVar, View view, k kVar) {
        return (kVar.d(view) + (kVar.b(view) / 2)) - (kVar.f() + (kVar.g() / 2));
    }

    private int a(RecyclerView.o oVar, k kVar, int i, int i2) {
        int[] b2 = b(i, i2);
        float a2 = a(oVar, kVar);
        if (a2 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(b2[0]) > Math.abs(b2[1]) ? b2[0] : b2[1]) / a2);
    }

    private View b(RecyclerView.o oVar, k kVar) {
        int e2 = oVar.e();
        View view = null;
        if (e2 == 0) {
            return null;
        }
        int f2 = kVar.f() + (kVar.g() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = oVar.d(i2);
            int abs = Math.abs((kVar.d(d2) + (kVar.b(d2) / 2)) - f2);
            if (abs < i) {
                view = d2;
                i = abs;
            }
        }
        return view;
    }

    private k d(RecyclerView.o oVar) {
        k kVar = this.f2117e;
        if (kVar == null || kVar.f2119a != oVar) {
            this.f2117e = k.a(oVar);
        }
        return this.f2117e;
    }

    private k e(RecyclerView.o oVar) {
        k kVar = this.f2116d;
        if (kVar == null || kVar.f2119a != oVar) {
            this.f2116d = k.b(oVar);
        }
        return this.f2116d;
    }

    @Override // androidx.recyclerview.widget.o
    public int a(RecyclerView.o oVar, int i, int i2) {
        int j;
        View c2;
        int l;
        int i3;
        PointF a2;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.z.b) || (j = oVar.j()) == 0 || (c2 = c(oVar)) == null || (l = oVar.l(c2)) == -1 || (a2 = ((RecyclerView.z.b) oVar).a(j - 1)) == null) {
            return -1;
        }
        if (oVar.a()) {
            i4 = a(oVar, d(oVar), i, 0);
            if (a2.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.b()) {
            i5 = a(oVar, e(oVar), 0, i2);
            if (a2.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.b()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = l + i4;
        if (i6 < 0) {
            i6 = 0;
        }
        return i6 >= j ? i3 : i6;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] a(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.a()) {
            iArr[0] = a(oVar, view, d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.b()) {
            iArr[1] = a(oVar, view, e(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    public View c(RecyclerView.o oVar) {
        k d2;
        if (oVar.b()) {
            d2 = e(oVar);
        } else if (!oVar.a()) {
            return null;
        } else {
            d2 = d(oVar);
        }
        return b(oVar, d2);
    }
}
