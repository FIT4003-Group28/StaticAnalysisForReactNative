package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: cptm  reason: default package */
/* loaded from: classes5.dex */
final class cptm {
    private final View a;
    private final View b;
    private final int[] c = new int[2];
    private final int[] d = new int[2];
    private final Rect e = new Rect();

    public cptm(View view, View view2) {
        cpwl.h(view, "anchorView can't be null");
        this.a = view;
        cpwl.h(view2, "boundaryView can't be null");
        this.b = view2;
    }

    public final Rect a() {
        this.b.getLocationOnScreen(this.d);
        this.e.set(0, 0, this.b.getWidth(), this.b.getHeight());
        Rect rect = this.e;
        int[] iArr = this.d;
        rect.offset(iArr[0], iArr[1]);
        return this.e;
    }

    public final int[] b() {
        this.a.getLocationOnScreen(this.c);
        return this.c;
    }
}
