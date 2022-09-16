package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import com.google.android.libraries.material.dialog.ButtonPaneLayout;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tpe  reason: default package */
/* loaded from: classes4.dex */
public final class tpe extends TouchDelegate {
    public final Set a;
    public TouchDelegate b;
    final /* synthetic */ ButtonPaneLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpe(ButtonPaneLayout buttonPaneLayout) {
        super(new Rect(), buttonPaneLayout);
        this.c = buttonPaneLayout;
        this.a = new afy();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate = this.b;
        if (touchDelegate == null || !touchDelegate.onTouchEvent(motionEvent)) {
            motionEvent.offsetLocation(-this.c.getLeft(), -this.c.getTop());
            if (this.a.isEmpty()) {
                return false;
            }
            for (TouchDelegate touchDelegate2 : this.a) {
                if (touchDelegate2.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
