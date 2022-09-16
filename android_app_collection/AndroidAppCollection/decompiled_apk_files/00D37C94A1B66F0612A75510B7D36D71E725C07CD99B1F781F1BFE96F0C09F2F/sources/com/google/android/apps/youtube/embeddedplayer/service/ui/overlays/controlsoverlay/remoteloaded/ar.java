package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import j$.time.Duration;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ar {
    public static final Duration a = Duration.ofSeconds(10);
    public Runnable b;
    public final Handler c;
    public final aifs d;
    public boolean e;
    public aifw f;
    private final ahyo g;

    public ar(Context context, Handler handler, ahyo ahyoVar) {
        this.c = handler;
        this.g = ahyoVar;
        this.d = new aq(context);
    }

    public final void a(MotionEvent motionEvent, View view) {
        aifr aifrVar = new aifr(motionEvent, aifr.a(motionEvent, view.getWidth(), false), false);
        int i = aifrVar.b;
        if (i == 0 || this.f == null) {
            return;
        }
        if (i == 1) {
            this.g.m();
        } else {
            this.g.l();
        }
        this.d.c(aifrVar);
        this.c.removeCallbacks(this.b);
        this.c.postDelayed(this.b, 650L);
        this.e = true;
        this.f.e(this.d.b(), aifrVar, false);
    }

    public final void b() {
        this.e = false;
        this.d.d();
    }
}
