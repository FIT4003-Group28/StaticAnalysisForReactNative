package defpackage;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: acfy  reason: default package */
/* loaded from: classes.dex */
public final class acfy implements View.OnTouchListener {
    final /* synthetic */ GestureDetector a;
    final /* synthetic */ acgd b;

    public acfy(acgd acgdVar, GestureDetector gestureDetector) {
        this.b = acgdVar;
        this.a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b.u;
        if (i == 1 || i == 4 || i == 7) {
            return false;
        }
        boolean onTouchEvent = this.a.onTouchEvent(motionEvent);
        if (onTouchEvent || motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        acgc acgcVar = this.b.s;
        if (acgcVar.b) {
            if (acgcVar.c) {
                acgcVar.c = false;
            } else {
                acgd acgdVar = acgcVar.d;
                acgb acgbVar = acgdVar.p;
                if (acgbVar != null) {
                    acfs acfsVar = (acfs) acgbVar;
                    if (acgdVar != acfsVar.b) {
                        String valueOf = String.valueOf(acgdVar);
                        String valueOf2 = String.valueOf(acfsVar.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
                        sb.append("Unexpected self view window: ");
                        sb.append(valueOf);
                        sb.append(" != ");
                        sb.append(valueOf2);
                        Log.e("ScreencastControls", sb.toString());
                        acfsVar.f.i();
                    } else {
                        int i2 = acfsVar.i;
                        if (i2 == 4 || i2 == 7 || acfsVar.c.t()) {
                            acfsVar.c.c();
                            acgdVar.c();
                            acfsVar.k();
                        } else {
                            acfsVar.c.r();
                            acgdVar.i();
                            acfsVar.f();
                        }
                        acfsVar.j.a.edit().putBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", true).apply();
                    }
                }
            }
        }
        return false;
    }
}
