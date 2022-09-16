package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kdj  reason: default package */
/* loaded from: classes3.dex */
public final class kdj extends zbm implements fen {
    public final ahqc a;

    public kdj(ahqc ahqcVar) {
        this.a = ahqcVar;
    }

    @Override // defpackage.zbr
    public final void c() {
    }

    @Override // defpackage.zbr
    public final boolean d(View view, MotionEvent motionEvent) {
        return this.a.onTouch(view, motionEvent);
    }
}
