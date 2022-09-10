package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;
/* compiled from: PG */
/* renamed from: cmph  reason: default package */
/* loaded from: classes5.dex */
public final class cmph {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public cmph(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        int i = this.h.a;
        this.e = false;
    }

    public final void b() {
        int d;
        if (this.e) {
            d = this.h.d.a();
        } else {
            d = this.h.d.d();
        }
        this.c = d;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
