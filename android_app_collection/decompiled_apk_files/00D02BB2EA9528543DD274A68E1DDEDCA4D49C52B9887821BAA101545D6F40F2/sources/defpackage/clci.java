package defpackage;

import android.content.Context;
import android.widget.OverScroller;
/* compiled from: PG */
/* renamed from: clci  reason: default package */
/* loaded from: classes5.dex */
public final class clci extends OverScroller {
    public int a;
    public int b;

    public clci(Context context) {
        super(context);
    }

    private final void a() {
        this.b = 0;
        this.a = 0;
    }

    @Override // android.widget.OverScroller
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a();
        super.fling(0, 0, i3, i4, i5 - i, i6 - i, i7 - i2, i8 - i2);
    }

    @Override // android.widget.OverScroller
    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        a();
        super.fling(0, 0, i3, i4, i5 - i, i6 - i, i7 - i2, i8 - i2, i9, i10);
    }
}
