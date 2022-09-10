package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kzm  reason: default package */
/* loaded from: classes7.dex */
public final class kzm implements View.OnGenericMotionListener {
    final /* synthetic */ kzt a;

    public kzm(kzt kztVar) {
        this.a = kztVar;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.a.i.b != kdc.MAP_INTERACTION_DISABLED && motionEvent.getActionMasked() == 8) {
            if (motionEvent.getAxisValue(9) > 0.0f) {
                this.a.g.c(1.0f);
                return true;
            }
            this.a.g.c(-1.0f);
            return true;
        }
        return false;
    }
}
