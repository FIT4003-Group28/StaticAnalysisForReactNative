package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
class g {

    /* renamed from: b  reason: collision with root package name */
    int f2109b;

    /* renamed from: c  reason: collision with root package name */
    int f2110c;

    /* renamed from: d  reason: collision with root package name */
    int f2111d;

    /* renamed from: e  reason: collision with root package name */
    int f2112e;

    /* renamed from: h  reason: collision with root package name */
    boolean f2115h;
    boolean i;

    /* renamed from: a  reason: collision with root package name */
    boolean f2108a = true;

    /* renamed from: f  reason: collision with root package name */
    int f2113f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f2114g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(RecyclerView.v vVar) {
        View d2 = vVar.d(this.f2110c);
        this.f2110c += this.f2111d;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i = this.f2110c;
        return i >= 0 && i < a0Var.a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2109b + ", mCurrentPosition=" + this.f2110c + ", mItemDirection=" + this.f2111d + ", mLayoutDirection=" + this.f2112e + ", mStartLine=" + this.f2113f + ", mEndLine=" + this.f2114g + '}';
    }
}
