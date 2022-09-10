package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: bxpq  reason: default package */
/* loaded from: classes4.dex */
final class bxpq implements View.OnTouchListener {
    final /* synthetic */ bxpr a;

    public bxpq(bxpr bxprVar) {
        this.a = bxprVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bxpr bxprVar = this.a;
        if (bxprVar.a.aD) {
            bxprVar.b.a().b();
            return false;
        }
        return false;
    }
}
