package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: kzk  reason: default package */
/* loaded from: classes7.dex */
public final class kzk implements View.OnTouchListener {
    final /* synthetic */ kzt a;

    public kzk(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.a.a();
            return false;
        }
        return false;
    }
}
