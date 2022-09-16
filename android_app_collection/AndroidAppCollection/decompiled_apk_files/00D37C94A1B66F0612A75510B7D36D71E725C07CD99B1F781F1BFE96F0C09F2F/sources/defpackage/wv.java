package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wv  reason: default package */
/* loaded from: classes4.dex */
public final class wv implements View.OnTouchListener {
    final /* synthetic */ ww a;

    public wv(ww wwVar) {
        this.a = wwVar;
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
            ww wwVar = this.a;
            wwVar.n.removeCallbacks(wwVar.q);
            return false;
        }
        PopupWindow popupWindow = this.a.p;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.p.getWidth() || y < 0 || y >= this.a.p.getHeight()) {
            return false;
        }
        ww wwVar2 = this.a;
        wwVar2.n.postDelayed(wwVar2.q, 250L);
        return false;
    }
}
