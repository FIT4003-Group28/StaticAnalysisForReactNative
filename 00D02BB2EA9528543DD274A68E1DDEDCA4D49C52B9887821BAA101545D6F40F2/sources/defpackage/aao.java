package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aao  reason: default package */
/* loaded from: classes2.dex */
public final class aao implements View.OnTouchListener {
    final /* synthetic */ aaq a;

    public aao(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            aaq aaqVar = this.a;
            aaqVar.o.removeCallbacks(aaqVar.n);
            return false;
        }
        PopupWindow popupWindow = this.a.q;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.q.getWidth() || y < 0 || y >= this.a.q.getHeight()) {
            return false;
        }
        aaq aaqVar2 = this.a;
        aaqVar2.o.postDelayed(aaqVar2.n, 250L);
        return false;
    }
}
