package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class af extends FrameLayout {
    final /* synthetic */ al a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(al alVar, Context context) {
        super(context);
        this.a = alVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.a.G();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = !keyEvent.isSystem() || ahfe.c(i);
        if (z) {
            this.a.pI();
        }
        if (this.a.I.a != ahzb.RECOVERABLE_ERROR || !z || i == 20 || i == 21 || i == 22 || i == 19) {
            return super.onKeyDown(i, keyEvent);
        }
        this.a.b.o();
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getActionMasked() != 1 || this.a.I.a != ahzb.RECOVERABLE_ERROR) {
            al alVar = this.a;
            if (alVar.O) {
                alVar.c.d(alVar.g, motionEvent);
            } else if (motionEvent.getActionMasked() == 1) {
                this.a.f.b(motionEvent);
            }
            return true;
        }
        this.a.b.o();
        return true;
    }
}
