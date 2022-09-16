package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kir  reason: default package */
/* loaded from: classes3.dex */
public final class kir implements View.OnTouchListener {
    final /* synthetic */ kiv a;

    public kir(kiv kivVar) {
        this.a = kivVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.g = (int) motionEvent.getRawX();
            this.a.h = (int) motionEvent.getRawY();
            view.performClick();
            return true;
        }
        return false;
    }
}
