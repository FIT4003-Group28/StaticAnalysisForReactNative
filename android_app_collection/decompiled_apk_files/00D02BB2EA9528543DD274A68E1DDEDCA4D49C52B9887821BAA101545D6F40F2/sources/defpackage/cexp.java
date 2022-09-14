package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cexp  reason: default package */
/* loaded from: classes4.dex */
public final class cexp implements View.OnTouchListener {
    final /* synthetic */ cexq a;

    public cexp(cexq cexqVar) {
        this.a = cexqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cexq cexqVar = this.a;
        if (cexqVar.k != 5) {
            cexqVar.k = 5;
            cqkx.p(cexqVar);
            return false;
        }
        return false;
    }
}
