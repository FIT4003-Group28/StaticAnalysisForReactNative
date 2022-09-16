package defpackage;

import android.app.ActionBar;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: yzt  reason: default package */
/* loaded from: classes4.dex */
public final class yzt extends yzb {
    public final ActionBar l;
    public final int m;
    private final yzs n;

    public yzt(Window window, ActionBar actionBar, View view) {
        super(window);
        yzs yzsVar = new yzs(this);
        this.n = yzsVar;
        this.l = actionBar;
        h(view, 1);
        this.k = yzsVar;
        if (actionBar == null) {
            this.m = 0;
            return;
        }
        TypedArray obtainStyledAttributes = window.getContext().obtainStyledAttributes(new int[]{16843499});
        this.m = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public final void p(boolean z) {
        yzn yznVar = this.f;
        if (yznVar.f != z) {
            yznVar.f = z;
            yznVar.a();
        }
    }
}
