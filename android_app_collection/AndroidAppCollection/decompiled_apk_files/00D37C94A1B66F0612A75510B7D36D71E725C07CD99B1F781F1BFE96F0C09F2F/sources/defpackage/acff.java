package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acff  reason: default package */
/* loaded from: classes.dex */
public final class acff implements View.OnTouchListener {
    final /* synthetic */ acfh a;

    public acff(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a.E && motionEvent.getAction() == 4 && motionEvent.getX() == 0.0f && motionEvent.getY() == 0.0f) {
            this.a.c();
            return false;
        }
        return false;
    }
}
