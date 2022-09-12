package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aobf  reason: default package */
/* loaded from: classes2.dex */
public final class aobf implements egl {
    private final aobh a;
    private final View b;
    private final View c;

    public aobf(aobh aobhVar, View view, View view2) {
        this.a = aobhVar;
        this.b = view;
        this.c = view2;
    }

    public static aobf d(aobh aobhVar, View view) {
        View d = cqkx.d(view, aobt.a);
        View d2 = cqkx.d(view, aobg.b);
        dbsk.s(d);
        dbsk.s(d2);
        return new aobf(aobhVar, d, d2);
    }

    @Override // defpackage.egl
    public final int a() {
        int height = this.b.getHeight();
        return this.a.d().booleanValue() ? height + this.c.getHeight() : height;
    }

    @Override // defpackage.egl
    public final int b() {
        return 0;
    }

    @Override // defpackage.egl
    public final int c() {
        return 0;
    }
}
