package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chag  reason: default package */
/* loaded from: classes4.dex */
public final class chag implements View.OnTouchListener {
    final /* synthetic */ cjqy a;
    final /* synthetic */ ddho b;

    public chag(cjqy cjqyVar, ddho ddhoVar) {
        this.a = cjqyVar;
        this.b = ddhoVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a.i(cjtd.a(this.b));
            return false;
        }
        return false;
    }
}
